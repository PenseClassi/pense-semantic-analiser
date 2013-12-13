package controller;

import java.util.List;

import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryFactory;


public class SemanticEngineImoveis extends AbstractSemanticEngine {
	
	private static final String PREFIX_IMOVEIS = "PREFIX ont: <http://www.semanticweb.org/felipe/ontologies/2013/11/untitled-ontology-131#>";

	@Override
	protected Query geraConsultaSPARQL(List<String> lstPalavras) {
		if (lstPalavras.size() >0){
			//Configura o prefixo da ontologia de imoveis
			String queryString= PREFIX_IMOVEIS;
			
			//Monta a querystring com as palavras informadas
			queryString += "SELECT distinct ?parametro WHERE { ?x ont:termo_pesquisa ?y. ?x ont:Nome_Parametro ?parametro FILTER(";
			boolean primeiraPalavra = true;
			for(String palavra: lstPalavras){
				if (!primeiraPalavra) queryString += "||";
				queryString += "regex(?y, \"^ " + palavra + " $\", \"i\")";
			}
			queryString += ")}";
			
			//Cria a query
			return QueryFactory.create(queryString);
		}
		return null;
	}

	
}
