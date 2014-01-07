package br.com.pense.produto.controller;

import java.util.List;

import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.shared.JenaException;
import java.util.ArrayList;
import java.util.Map;

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
            } catch (JenaException je) {
                System.out.println(je.getMessage());
                ontologiaCarregada = false;
            }
        }
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
                if (!primeiraPalavra) {
                    queryString += "||";
                }
                queryString += "regex(?y, \"^" + palavra.toLowerCase() + "$\", \"i\")";
//                queryString += "regex(?y, \"" + palavra + "\", \"i\")";
                primeiraPalavra = false;
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

        List<String> lstParametros = mapParametros.get("Dormitórios");
        if (lstParametros!= null && lstParametros.size() > 1){
            String valor1 = lstParametros.get(0).substring(lstParametros.get(0).length()-1);
            String valor2 = lstParametros.get(1).substring(lstParametros.get(1).length()-1);
            lstParametros = new ArrayList<String>();
            lstParametros.add(valor1 + ":" + valor2);
            mapParametros.put("Dormitórios", lstParametros);
        }
        //TODO: Banheiros - Suites - Garagem - Area Total - Area Privativa
        
        return mapParametros;
    }
}
