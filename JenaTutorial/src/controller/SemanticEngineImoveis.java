package controller;

import java.util.List;

import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.rdf.model.ModelFactory;


public class SemanticEngineImoveis extends AbstractSemanticEngine {
	
	private static final String PREFIX_IMOVEIS = "PREFIX ont: <http://www.semanticweb.org/felipe/ontologies/2013/11/untitled-ontology-131#>";

	@Override
	protected Query geraConsultaSPARQL(List<String> lstPalavras) {
		if (lstPalavras.size() >0){
			//Configura o prefixo da ontologia de imoveis
			String queryString= PREFIX_IMOVEIS;
			
			//Monta a querystring com as palavras informadas
			queryString += "SELECT distinct ?parametro WHERE { ?x ?c ?y. ?x ont:Nome_Parametro ?parametro FILTER(";
			boolean primeiraPalavra = true;
			for(String palavra: lstPalavras){
				if (!primeiraPalavra) queryString += "||";
				queryString += "regex(?y, \"^ " + palavra + " $\", \"i\")";
				primeiraPalavra = false;
			}
			queryString += ")}";
			
			//Cria a query
			Query query = null;
			try{
				query = QueryFactory.create(queryString);
			}catch(Exception e){
				query = null;
			}
			return query;
		}
		return null;
	}

	
}
