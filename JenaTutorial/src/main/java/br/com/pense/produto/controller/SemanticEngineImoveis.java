package br.com.pense.produto.controller;

import java.util.List;

import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.shared.JenaException;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SemanticEngineImoveis extends AbstractSemanticEngine {

    private static final String PREFIX_IMOVEIS = "PREFIX ont: <http://www.semanticweb.org/felipe/ontologies/2013/11/untitled-ontology-131#>";
    private static boolean ontologiaCarregada;
    
    
    public SemanticEngineImoveis() {
        if (!ontologiaCarregada){
            setOntologia(ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM, null));
            try {
                getOntologia().read("file:////C://Desenvolvimento//Workspace//trunk//produtos//imoveis//pense-imoveis//src//main//webapp//WEB-INF//Imoveis.owl", "RDF/XML");
                ontologiaCarregada = true;
    //            getOntologia().read("file:./src/main/java/br/com/pense/produto/owl/Imoveis.owl", "RDF/XML");
                System.out.println("Ontologia de imoveis carregada.");
            } catch (JenaException je) {
                System.out.println(je.getMessage());
                ontologiaCarregada = false;
            }
        }
    }
    
    public void start(){
        System.out.println("Iniciando carregamento da ontologia.");
        new SemanticEngineImoveis();
    }

    @Override
    protected Query geraConsultaSPARQL(List<String> lstPalavras) {
        if (lstPalavras.size() > 0) {
            //Configura o prefixo da ontologia de imoveis
            String queryString = PREFIX_IMOVEIS;

            //Monta a querystring com as palavras informadas
            queryString += "SELECT distinct ?parametro WHERE { ?x ont:termo_pesquisa ?y. ?x ont:Nome_Parametro ?parametro FILTER(";
            boolean primeiraPalavra = true;
            for (String palavra : lstPalavras) {
                if(!palavra.startsWith("R$") && !palavra.endsWith("m2") && !palavra.endsWith("m²")){
                    if (!primeiraPalavra) {
                        queryString += "||";
                    }                
                    queryString += "regex(?y, \"^" + palavra.toLowerCase() + "$\", \"i\")";
                    primeiraPalavra = false;
                }
            }
            queryString += ")}";

            //Cria a query
            Query query = null;
            try {
                query = QueryFactory.create(queryString);
            } catch (Exception e) {
                query = null;
            }
            return query;
        }
        return null;
    }

    @Override
    protected boolean ehPalavraDeExcessao(String palavra) {
        palavra = palavra.toLowerCase();
        if ("casa".equals(palavra) || "salão".equals(palavra)) {
            return true;
        }
        return false;
    }
    
    @Override
    protected Map<String, List<String>> executaPosProcessamento(Map<String, List<String>> mapParametros){
        String[] lstNomesParametros = {"Dormitórios", "Suítes","Área total","Preço"};
        String sufixo="";
        Boolean somentePrimeiroParametro = false;
        Boolean ignoraPrimeiroParametro = false;
        
        List<String> lstParametros = new ArrayList<String>();
        for (String s:this.listaDePalavrasParaPesquisa){
//            if(!palavra.startsWith("R$") && !palavra.endsWith("m2") && !palavra.endsWith("m²")){
            if(s.startsWith("R$")){
                if (s.equals("R$ 0,01")){ 
                    somentePrimeiroParametro = true;
                }else if ("R$ 0,00".equals(s)){
                    ignoraPrimeiroParametro = true;
                }else{
                    lstParametros = mapParametros.get("Preço");
                    if (lstParametros == null) lstParametros = new ArrayList<String>();

                    lstParametros.add(s.substring(3,s.length()-3).replace(".", "").trim());
                    mapParametros.put("Preço", lstParametros);
                }
            }else if(s.toLowerCase().matches("[\\d\\.]+(m2|ha)")){    
//            }else if(s.toLowerCase().endsWith(" m2") || s.endsWith(" m²") || s.toLowerCase().endsWith(" ha")){
                sufixo= (s.toLowerCase().endsWith("ha"))? "HA":"M2";
                lstParametros = mapParametros.get("Área total");
                if (lstParametros == null) lstParametros = new ArrayList<String>();
                
                lstParametros.add(s.substring(0, s.length()-2).replace(".", "").trim());
                mapParametros.put("Área total", lstParametros);
            }
        }
        
        //Se houver apenas uma indicação de preço, pega o intervalo de 0 até ele
        lstParametros = mapParametros.get("Preço");
        if (lstParametros!= null && lstParametros.size() == 1){
            if (somentePrimeiroParametro){
                String param = lstParametros.get(0);
                lstParametros.clear();
                lstParametros.add(param+":");
            }else if (ignoraPrimeiroParametro){
                String param = lstParametros.get(0);
                lstParametros.clear();
                lstParametros.add(":"+param);
            }else{
                lstParametros.add("0");
                
            }
            mapParametros.put("Preço", lstParametros);            
        }
        
        //Se houver apenas uma indicação de área, duplica o valor para trazer um resultado "preciso"
        lstParametros = mapParametros.get("Área total");
        if (lstParametros!= null && lstParametros.size() == 1){
            lstParametros.add(lstParametros.get(0));
            mapParametros.put("Área total", lstParametros);
        }
        
        String valor1, valor2 = "";
                
        for(String s:lstNomesParametros){
            lstParametros = mapParametros.get(s);
            if (lstParametros!= null && lstParametros.size() > 1){
                if ("Dormitórios".equals(s) || "Suítes".equals(s)){
                    valor1 = lstParametros.get(0).substring(0,1);
                    valor2 = lstParametros.get(lstParametros.size()-1).substring(0,1);
                }else{
                    valor1 = lstParametros.get(0);
                    valor2 = lstParametros.get(lstParametros.size()-1);
                }
                lstParametros = new ArrayList<String>();
                if (Integer.parseInt(valor1)<=Integer.parseInt(valor2)){
                    if ("Área total".equals(s)){
                        lstParametros.add(valor1 + ":" + valor2+sufixo);
                    }else{
                        lstParametros.add(valor1 + ":" + valor2);
                    }
                }else{
                    if ("Área total".equals(s)){
                        lstParametros.add(valor2 + ":" + valor1+sufixo);
                    }else{
                        lstParametros.add(valor2 + ":" + valor1);
                    }
                }
                mapParametros.put(s, lstParametros);
            }
        }
        System.out.println(mapParametros.toString());
        return mapParametros;
    }
    
    @Override
    protected String executaPreProcessamento(String texto) {
        //Valores descritos como "milhão" ou "milhões" são substituidos pelos números
        Pattern pattern = Pattern.compile("\\s?milh[ões|ão]+");
        Matcher matcher = pattern.matcher(texto);

        texto = matcher.replaceAll(".000.000,00");

        //o mesmo é feito com "mil (valores)"
        pattern = Pattern.compile("(R\\$)\\s?\\d+\\s?(mil)");
        matcher = pattern.matcher(texto);
        while (matcher.find()){
            //Recria-se o texto original com o "mil" do texto identificado substituida
            texto = texto.substring(0, matcher.start()) + matcher.group().replaceAll("\\s?mil", ".000,00") + texto.substring(matcher.end());
            matcher = pattern.matcher(texto);
        }
        
        //o mesmo é feito com "mil"
        pattern = Pattern.compile("\\s?mil\\s");
        matcher = pattern.matcher(texto);
        texto = matcher.replaceAll(".000 ");


        //área em metros quadrados
        pattern = Pattern.compile("\\s?(metros quadrados|m²)");
        matcher = pattern.matcher(texto);
        texto = matcher.replaceAll("m2");
        
        //Quando tem "a partir de"
        pattern = Pattern.compile("\\s((a partir de)|(acima de)|(abaixo de)|(até)|(de))\\s(R\\$\\s)?([\\d\\.\\,]+)\\s?(m2)?");
        matcher = pattern.matcher(texto);
        
        String auxString = "";
        StringBuffer sb = new StringBuffer();
        Boolean found = false;

        String val1, dinheiro, valor, metragem = "";
        while (matcher.find()) {
            auxString = "";
            val1 = matcher.group(1);
            if (val1 != null){ //um termo foi encontrado
                dinheiro = matcher.group(7);
                valor = matcher.group(8);
                metragem = matcher.group(9);
                
                if ("até".equals(val1) || "abaixo de".equals(val1)){
                    if (dinheiro != null){
                        auxString = " R\\$ 0,00, R\\$ " + valor + " ";
                    }else if (metragem != null){
                        auxString = " 10" + metragem + ", " + valor + metragem + " ";
                    }else{
                        auxString = " 0,00, " + valor + " ";
                    }
                }else if("a partir de".equals(val1) || "acima de".equals(val1)){
                    if (dinheiro != null){
                        auxString = " R\\$ 0,01,  R\\$ " + valor + " ";
                    }else if (metragem != null){
                        auxString = " 1000" + metragem + ", " + valor + metragem + " ";
                    }else{
                        auxString = " 0,01, " + valor + " ";
                    }
                }else if("de".equals(val1)){
                    if (dinheiro != null){
                        auxString = " R\\$ " + valor + ",  R\\$ " + valor + " ";
                    }else if (metragem != null){
                        auxString = " "+ valor + metragem + ", " + valor + metragem + " ";
                    }
                }
                
                if (!auxString.isEmpty()){
                    matcher.appendReplacement(sb, auxString);
                    found = true;
                }
            }
        }
        if (found){
            matcher.appendTail(sb);
            texto = sb.toString();
        }
        
        return defineConjuntoExpressoes(texto.trim());
    }
    
    /*
    Normaliza a informação do texto para facilitar o processo de consulta na ontologia
    */
    private String defineConjuntoExpressoes(String texto){
//        Pattern pattern;
//        Matcher matcher;
//        
        StringBuffer sb = new StringBuffer();
        boolean found = false;
        String auxString = "";
//        
//        // {Área m2}        
//        pattern = Pattern.compile("[\\d\\.]+\\s?(m2|m²)");
//        matcher = pattern.matcher(texto);
//
//        while (matcher.find()) {
//            auxString = matcher.group();
//            int tamAuxString = auxString.length();
//            if (!auxString.substring(tamAuxString-3, tamAuxString-2).equals(" ")){ 
//                auxString = auxString.substring(0, tamAuxString-2)+" m2";
//            }
//           
//            matcher.appendReplacement(sb, "\"" + auxString + "\"");
//            found = true;
//        }
//        if (found){
//            matcher.appendTail(sb);
//            texto = sb.toString();
//        }
//        sb = new StringBuffer();
//        found = false;
//        auxString = "";
        
        String[] lstExpressoes = {"[\\d\\.]+\\s?(m2|m²)"};
        Pattern pattern;
        Matcher matcher;
        
        for (String expressao: lstExpressoes){
            //Marca definições de área
            pattern = Pattern.compile(expressao);
            matcher = pattern.matcher(texto);
            
            sb = new StringBuffer();
            while (matcher.find()) {
//                matcher.appendReplacement(sb, "\"" + matcher.group().replace(" ", "") + "\"");
                matcher.appendReplacement(sb, matcher.group().replace(" ", "") );
            }
            matcher.appendTail(sb);
            texto = sb.toString();
        }
        
        //Dinheiro tem tratamento diferenciado - Normalização utiliza R$ e ,
        pattern = Pattern.compile("(R\\$)\\s?(\\d{1,3}[\\.\\d{3}]*\\,\\d{2})|(R\\$)\\s?(\\d{1,3}[\\.\\d{3}]*)|(\\d{1,3}[\\.\\d{3}]*\\,\\d{2})");
        matcher = pattern.matcher(texto);
        
        sb = new StringBuffer();
        auxString = "";
        
        while (matcher.find()) {
            auxString = texto.substring(matcher.start(), matcher.end());
            if (!auxString.startsWith("R$")) auxString = "R$ " + auxString;
            if (!auxString.contains(",")) auxString += ",00";
            
            if (auxString.substring(2, 3).equals(" ")){ 
                auxString = auxString.replace("R$", "R\\$"); //$ Tem de ser escapado
            }else{
                auxString = auxString.replace("R$", "R\\$ "); //$ Tem de ser escapado
            }
            matcher.appendReplacement(sb, "\"" + auxString + "\"");
            found = true;
        }
        if (found){
            matcher.appendTail(sb);
            texto = sb.toString();
        }
        
        //Tratamento para termos: n [e|a|ou|ate] m xxxxxxx
        pattern = Pattern.compile("((\\d)\\s(e|a|(ou)|(até))\\s)?(\\d|(mais)|(menos))\\s((vagas de garagem)|[\\wÀ-ú]+)");
//        pattern = Pattern.compile("(\\s(\\d)\\s(e|a|(ou)|(até)))?\\s(\\d)\\s((vagas de garagem)|[\\wÀ-ú]+)");
        matcher = pattern.matcher(texto);
        
        sb = new StringBuffer();
        found = false;
        auxString = "";
        while (matcher.find()) {
            String val1 = matcher.group(2);
            String val2 = matcher.group(6);
            if("mais".equals(val2)) val2 = "5"; //Se o parâmtro for "mais" troca por 5
            if("menos".equals(val2)) val2 = "1"; //Se o parâmtro for "menos" troca por 1
            String elemento = matcher.group(9);
            if (!ehPalavraLigacao(elemento)){
                if (val1 != null){
                    auxString = "\"" + val1 + " " + elemento + "\", \"" + val2 + " " + elemento + "\"";
                }else{
                    auxString = "\"" + val2 + " " + elemento + "\"";
                }
                matcher.appendReplacement(sb, auxString);
                found = true;
            }
        }
        if (found){
            matcher.appendTail(sb);
            texto = sb.toString();
        }
        
        
        return texto.trim();
    }

}
