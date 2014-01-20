package br.com.pense.produto.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.query.ResultSetFormatter;
import com.hp.hpl.jena.rdf.model.Literal;
import java.util.HashMap;
import org.springframework.util.StringUtils;

public abstract class AbstractSemanticEngine {

    private String textoBusca;
    private Query query;
    protected List<String> listaDePalavrasParaPesquisa;
    private OntModel ontologia;
    List<QuerySolution> lstResultados;

    public AbstractSemanticEngine() {

    }

    public String getTextoBusca() {
        return textoBusca;
    }

    public void setTextoBusca(String textoBusca) {
        this.textoBusca = textoBusca;
    }

    public OntModel getOntologia() {
        return ontologia;
    }

    public void setOntologia(OntModel ontologia) {
        this.ontologia = ontologia;
    }

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }

    /*
     Aplica a etapa de preprocessamento no texto informado, remove palavras reservadas e invoca a 
    etapa de processamento da lista de termos de pesquisa
    @param textoBusca String que contém o texto a ser processado
    @result Verdadeiro para processamento sem problemas, Falso para erro no processo
    */
    public boolean preparaConteudoBusca(String textoBusca) {
//        System.out.println("Texto: " + textoBusca);
        textoBusca = this.executaPreProcessamento(textoBusca);
        this.setTextoBusca(textoBusca);
        List<String> listaAuxiliarDePalavras = new ArrayList<String>();

        if (!this.textoBusca.isEmpty()) {

            String[] lstPalavras = this.textoBusca.split(" ");

            //Remove as palavras reservadas - as que não entram na pesquisa
            for (String palavra : lstPalavras) {
                if (!ehPalavraReservada(palavra) && !palavra.trim().isEmpty()) {
                    listaAuxiliarDePalavras.add(palavra.trim());
                }
            }
            this.listaDePalavrasParaPesquisa = preparaListaParaPesquisa(listaAuxiliarDePalavras);
//            System.out.println(this.listaDePalavrasParaPesquisa.toString() + " - " + this.listaDePalavrasParaPesquisa.size());
            return true;
        }
        return false;
    }

    protected List<String> preparaListaParaPesquisa(List<String> preLista) {
        int posPrimeiraReservada = -1;
        int posSegundaReservada = -1;
        String palavraPesquisa = "";
        int contador = 0;
        List<String> palavrasDaPesquisa = new ArrayList<String>();
        boolean jumpToNextWord = false;
        boolean indicacaoLugar = false;

        boolean aspasDetectadas = false;
        int posPrimeiraAspa = -1;

        for (String palavra : preLista) {
            if (jumpToNextWord) {
                jumpToNextWord = false;
                posSegundaReservada = posPrimeiraReservada;
                contador++;
                continue;
            }

            //Verifica a existência de aspas nas palavras
            if (!aspasDetectadas && palavra.startsWith("\"")) {
                //Marca a primeira aspas detectada
                aspasDetectadas = true;
                posPrimeiraAspa = contador;
                //Precisa pegar as palavras entre posPrimeiraReservada e posPrimeiraAspa
                if (posPrimeiraReservada > -1){
                    String novaPalavra = "";
                    for (int i = posPrimeiraReservada+1; i < posPrimeiraAspa; i++) {
                        //Concatenando as palavras do intervalo
                        novaPalavra += " " + preLista.get(i);
                    }
                    if (!novaPalavra.isEmpty()){
                        palavrasDaPesquisa.add(novaPalavra.trim());
                    }
                    indicacaoLugar = false; //Se havia indicação de lugar reseta
                }
                
            } else if (aspasDetectadas && (palavra.endsWith("\"")|| palavra.endsWith("\","))) {
                //Na segunda obtem o texto entre as aspas
                String novaPalavra = "";
                for (int i = posPrimeiraAspa; i <= contador; i++) {
                    //Concatenando as palavras do intervalo
                    novaPalavra += " " + preLista.get(i);
                }
                
                if (novaPalavra.endsWith("\",")){
                    posPrimeiraReservada = contador;
                }else{
                    posPrimeiraReservada = 1+ contador;
                }
                //Insere na lista de palavras
                if (!novaPalavra.isEmpty()) {
                    palavrasDaPesquisa.add(novaPalavra.replace("\",", "").replace("\"", "").trim());
                }
                posPrimeiraAspa = -1;                
                aspasDetectadas = false;
                
            } else {

                if (ehPalavraLigacao(palavra)) {

                    if (indicacaoLugar && !"com".equals(palavra) && !"no".equals(palavra) && !"na".equals(palavra)) {
                        contador++;
                        continue;
                    }

                    //Ao encontrar a palavra marca a posicao inicial se não existir
                    if (posPrimeiraReservada == -1) {
                        posPrimeiraReservada = contador;
                        //Adiciona o trecho até a primeira reservada como uma única palavra
                        if (posPrimeiraReservada >= 2 && posPrimeiraReservada < 5){
                            //Trata todo o vetor como uma única palavra
                            palavraPesquisa = "";
                            for (int i = 0; i < posPrimeiraReservada; i++) {
                                //Concatenando as palavras do intervalo
                                palavraPesquisa += " " + preLista.get(i);
                            }
                            //Nova palavra vai pra lista de palavras
                            palavrasDaPesquisa.add(palavraPesquisa.trim());
                        }

                    } //Senão pega o intervalo entre a primeira e a segunda marcação como uma unica palavra
                    else {
                        palavraPesquisa = "";
                        posSegundaReservada = contador;
                        if (indicacaoLugar){
                            for (int i = posPrimeiraReservada + 1; i < posSegundaReservada; i++) {
                                //Concatenando as palavras do intervalo
                                palavraPesquisa += " " + preLista.get(i);
                            }
                            //Nova palavra vai pra lista de palavras
                            if (!palavraPesquisa.isEmpty()) {
                                palavrasDaPesquisa.add(palavraPesquisa.trim());
                            }
                        }else if (posPrimeiraReservada < posSegundaReservada) {
                            palavrasDaPesquisa.addAll(preparaListaParaPesquisa(preLista.subList(posPrimeiraReservada + 1, posSegundaReservada)));
                        }
                        //Reseta ponteiros 
                        posPrimeiraReservada = posSegundaReservada;
                        posSegundaReservada = -1;
                    }

                    if ("de".equals(palavra) && contador - 1 >= 0) {
                        if (ehPalavraDeExcessao(preLista.get(contador - 1))) {
                            if (palavrasDaPesquisa.size() > 0) {
                                //String novaPalavra = palavrasDaPesquisa.get(palavrasDaPesquisa.size()-1);
                                String novaPalavra = "";
                                if (contador - 1 >= 0) {
                                    novaPalavra += preLista.get(contador - 1);
                                }
                                novaPalavra += " " + palavra;
                                novaPalavra += " " + preLista.get(contador + 1);
                                if (ehPalavraDeExcessao(palavrasDaPesquisa.get(palavrasDaPesquisa.size() - 1))){
                                    palavrasDaPesquisa.remove(palavrasDaPesquisa.size() - 1);
                                }
                                palavrasDaPesquisa.add(novaPalavra.replace(",", "").trim());
                                posPrimeiraReservada++;
                                jumpToNextWord = true;
                            }
                        }
                    } else if ("em".equals(palavra) | "no".equals(palavra) | "na".equals(palavra)) {
                        //Quando indicação de um lugar "em" pegar como palavra o intervalo até "com", "," ou fim da lista
                        indicacaoLugar = true;
                    }
                } else {
                    //Virgula representa o mesmo que uma palavra de ligação
                    if (posPrimeiraReservada == -1) {
                        palavrasDaPesquisa.add(palavra.replace(",", "").trim());
                        if (palavra.contains(",")) {
                            posPrimeiraReservada = contador;
                        }
                    } else {
                        if (palavra.contains(",")) {
                            if (indicacaoLugar) {
                            //Indicação de lugar pega o intervalo como uma unica palvra

                                palavraPesquisa = "";
                                posSegundaReservada = contador;
                                for (int i = posPrimeiraReservada + 1; i <= posSegundaReservada; i++) {
                                    //Concatenando as palavras do intervalo
                                    palavraPesquisa += " " + preLista.get(i).replace(",", "").trim();
                                }
                                //Nova palavra vai pra lista de palavras
                                palavrasDaPesquisa.add(palavraPesquisa.trim());
                                //Reseta ponteiros 
                                posSegundaReservada = -1;

                                indicacaoLugar = false;

                            } else {
                                //Reprocessa as palavras entre a primeira reservada e a palavra com virgula
                                palavrasDaPesquisa.addAll(preparaListaParaPesquisa(preLista.subList(posPrimeiraReservada + 1, contador)));
                                //Insere a palavra com vírgula na lista tb
                                palavrasDaPesquisa.add(palavra.replace(",", "").trim());
                            }
                            posPrimeiraReservada = contador;
                        }
                    }
                }
            }
            contador++;
        }
        //Uma palavra reservada foi encontrada mas a lista acabou, reprocessa o restante
        if (posPrimeiraReservada > posSegundaReservada && posPrimeiraReservada < preLista.size()) {
            //Se a lista acabou com uma referencia a lugar "em" toma o restante como nome de cidade/lugar
            if ("em".equals(preLista.get(posPrimeiraReservada).toLowerCase()) 
                    | "no".equals(preLista.get(posPrimeiraReservada).toLowerCase()) 
                    | "na".equals(preLista.get(posPrimeiraReservada).toLowerCase())) {
                //Trata o restante como uma unica palavra
                palavraPesquisa = "";
                posSegundaReservada = preLista.size();
                for (int i = posPrimeiraReservada + 1; i < posSegundaReservada; i++) {
                    //Concatenando as palavras do intervalo
                    palavraPesquisa += " " + preLista.get(i);
                }
                //Nova palavra vai pra lista de palavras
                palavrasDaPesquisa.add(palavraPesquisa.trim());
            } else {
                //Reprocessa o restante
                if (preLista.get(posPrimeiraReservada).contains(",") || posPrimeiraReservada == 0) {
                    palavrasDaPesquisa.addAll(preparaListaParaPesquisa(preLista.subList(posPrimeiraReservada + 1, preLista.size())));
                } else {
                    palavrasDaPesquisa.addAll(preparaListaParaPesquisa(preLista.subList(posPrimeiraReservada, preLista.size())));
                }
            }
        }else if (posPrimeiraReservada == -1 && posSegundaReservada == -1 && (preLista.size() >= 2 && preLista.size() <= 5)){
            //Trata todo o vetor como uma única palavra
            palavraPesquisa = "";
            for (int i = 0; i < preLista.size(); i++) {
                //Concatenando as palavras do intervalo
                palavraPesquisa += " " + preLista.get(i);
            }
            //Nova palavra vai pra lista de palavras
            palavrasDaPesquisa.add(palavraPesquisa.trim());
        }
        return palavrasDaPesquisa;
    }

    /*
      Avalia se a palavra informada é uma palavra de ligação
      @param palavra Palavra a ser avaliada
      @return Verdadeiro se a palavra for de ligação
     */

    protected boolean ehPalavraLigacao(String palavra) {
        if (palavra != null) {
            palavra = palavra.toLowerCase();

            if ("em".equals(palavra)
                    || "na".equals(palavra)
                    || "ou".equals(palavra)
                    || "até".equals(palavra)
                    || "no".equals(palavra)
                    || "de".equals(palavra)
                    || "com".equals(palavra)
                    || "e".equals(palavra)
                    || "apartir".equals(palavra)
                    || "para".equals(palavra)) {
                return true;
            }
        }
        return false;
    }

    /*
      Verifica se a palavra define uma quantidade
      @param Palavra a ser avaliada
      @return Verdadeiro se for uma quantidade
     */
    private boolean defineQuantidade(String palavra) {
        if (palavra != null) {
            palavra = palavra.toLowerCase();
            if ("1".equals(palavra) || "01".equals(palavra)
                    || "2".equals(palavra) || "02".equals(palavra)
                    || "3".equals(palavra) || "03".equals(palavra)
                    || "4".equals(palavra) || "04".equals(palavra)
                    || "5".equals(palavra) || "05".equals(palavra)) {
                return true;
            }
        }
        return false;
    }

    /*
      Verifica se a palavra define um valor no formato de moeda
      @param Palavra a ser avaliada
      @return Verdadeiro se for um valor dentro do padrão: "1,00","1.000,00","1000,00"
     */
    private boolean defineValorMoeda(String palavra) {
        if (palavra != null) {
            if (palavra.endsWith(",")) {
                palavra = palavra.substring(0, palavra.length() - 1);
            }

            return palavra.matches("^\\d{1,3}[\\.\\d{3}]*\\,\\d{2}$");
        }
        return false;
    }

    /*
      Informa se a palavra informada é reservada
      @param palavra Palavra para avaliação
      @result Verdadeiro se a palavra informada for reservada 
     */
    private boolean ehPalavraReservada(String palavra) {
        palavra = palavra.toLowerCase();
        if ("bairro".equals(palavra)
                || "região".equals(palavra)
                || "estado".equals(palavra)) {
            return true;
        }
        return false;
    }

    /*
      Gera a query de consulta SPARQL baseado em uma lista de palavras informadas
      @param lstPalavras Lista de palavras que deverão estar presentes na consulta
      @return Query para aplicação em uma consulta
     */
    protected abstract Query geraConsultaSPARQL(List<String> lstPalavras);

    protected abstract boolean ehPalavraDeExcessao(String palavra);

    /*
      Obtém o resultado da consulta à ontologia em uma string
      @return Resultados em uma string
     */
    public String getResultsAsString() {
        Map<String, List<String>> lstParameters = getResultAsParameter();

        if (lstParameters != null) {
            return lstParameters.toString();
        }
        return "";
    }

    /*
      Obtém o resultado da consulta à ontologia na forma de parâmetros
      @return Listagem dos resultados da consulta à ontologia na forma de parâmetros
     */
    public Map<String, List<String>> getResultAsParameter() {
        Map<String, List<String>> lstParametros = new HashMap<String, List<String>>();
        String auxString;
        String[] lstPalavras;
        List<String> param;

        for (QuerySolution item : this.lstResultados) {
            auxString = item.getLiteral("parametro").toString();
            if (auxString != null && !auxString.isEmpty()) {
                
                lstPalavras = auxString.split("=");
                
                //Encontrando uma referencia a bairro verifica se a cidade correspondete está na lista
                if ("bairroCodigo".equals(lstPalavras[0])){
                    List<String> cidades = lstParametros.get("cidade");
                    if (cidades != null && !cidades.isEmpty()){
                        Literal l = item.getLiteral("parametroCidade");
                        if (l != null){
                            String cidadeRef = l.toString(); 
                            String[] lstAux = cidadeRef.split("=");
                            if (cidades.contains(lstAux[1])){
                                if (lstParametros.containsKey(lstPalavras[0])) {
                                    param = lstParametros.get(lstPalavras[0]);
                                } else {
                                    param = new ArrayList<String>();
                                }
                                param.add(lstPalavras[1]);
                                lstParametros.put(lstPalavras[0], param);
                            }
                        }
                    }
                }else{
                    //Verifica se já não há registros do tipo do parâmetro
                    if (lstParametros.containsKey(lstPalavras[0])) {
                        param = lstParametros.get(lstPalavras[0]);
                    } else {
                        param = new ArrayList<String>();
                    }
                    param.add(lstPalavras[1]);
                    lstParametros.put(lstPalavras[0], param);
                }
            }
        }

        return executaPosProcessamento(lstParametros);
    }

    /*
      Executa a consulta junto a ontologia armazenando o resultado em uma lista de resultados
     */
    public void executeQuery() {
        Query query = this.geraConsultaSPARQL(this.listaDePalavrasParaPesquisa);

        QueryExecution qe = QueryExecutionFactory.create(query, this.getOntologia());
        ResultSet results = qe.execSelect();

        this.lstResultados = ResultSetFormatter.toList(results);

        qe.close();
    }

    /*
      Processa o texto informado procurando parametrizar o seu conteúdo para aplicar à consulta do site,
      objetivando melhorar a precisão do resultado.
      @param texto Conteúdo a ser parametrizado
      @return Verdadeiro para execução da consulta e geraçao de resultados, Falso para erro no procedimento
     */
    public synchronized boolean geraParametros(String texto) {
        if (!StringUtils.isEmpty(texto)) {
            try {
                this.preparaConteudoBusca(texto);                
                this.executeQuery();
                return true;
            } catch (Exception e) {

            }
        }
        return false;
    }
    
    /*
      Processa o texto informado procurando parametrizar o seu conteúdo para aplicar à consulta do site,
      objetivando melhorar a precisão do resultado, tras no resultado o resultado do processamento
      @param texto Conteúdo a ser parametrizado
      @return String com os parâmetros gerados no processo.
     */    
    public synchronized String obtemParametrosAsString(String texto) {
        if (!StringUtils.isEmpty(texto)) {
            try {
                this.preparaConteudoBusca(texto);                
                this.executeQuery();
                return this.getResultsAsString();
            } catch (Exception e) {

            }
        }
        return "";
    }
    
    /*
      Processa o texto informado procurando parametrizar o seu conteúdo para aplicar à consulta do site,
      objetivando melhorar a precisão do resultado, tras no resultado o resultado do processamento
      @param texto Conteúdo a ser parametrizado
      @return Map com os parâmetros gerados no processo.
     */    
    public Map<String, List<String>> obtemParametros(String texto) {
        if (!StringUtils.isEmpty(texto)) {
            try {
                this.preparaConteudoBusca(texto);                
                this.executeQuery();
                return this.getResultAsParameter();
            } catch (Exception e) {

            }
        }
        return new HashMap<String, List<String>>();
    }

    protected abstract Map<String, List<String>> executaPosProcessamento(Map<String, List<String>> mapParametros);

    protected abstract String executaPreProcessamento(String texto);
}
