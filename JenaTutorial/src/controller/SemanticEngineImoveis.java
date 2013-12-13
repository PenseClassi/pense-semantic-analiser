package controller;

import java.util.List;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.shared.JenaException;


public class SemanticEngineImoveis extends AbstractSemanticEngine {
	
	private static final String PREFIX_IMOVEIS = "PREFIX ont: <http://www.semanticweb.org/felipe/ontologies/2013/11/untitled-ontology-131#>";

	public SemanticEngineImoveis(){
		setOntologia(ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM, null));
		try {
		    getOntologia().read("file:./src/owl/Imoveis.owl", "RDF/XML");
	    }catch (JenaException je) {        

        }
	}
	
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
				queryString += "regex(?y, \"" + palavra + "\", \"i\")";
//				queryString += "regex(?y, \"" + palavra + "\", \"i\")";
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
