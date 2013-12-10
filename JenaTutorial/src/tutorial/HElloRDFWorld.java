package tutorial;

import java.util.List;

import com.hp.hpl.jena.datatypes.xsd.XSDDatatype;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.query.ResultSetFormatter;
import com.hp.hpl.jena.rdf.arp.impl.QNameLexer;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.shared.JenaException;
import com.hp.hpl.jena.util.FileManager;

public class HElloRDFWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Model m = ModelFactory.createDefaultModel();
//		String NS = "http://example.com/test/";
//		
//		Resource r = m.createResource( NS + "r");
//		Property p = m.createProperty(NS + "p");
//		
//		r.addProperty(p, "hello world", XSDDatatype.XSDstring);
//		
//		m.write(System.out, "Turtle");
		
		//"/owl/Imoveis.owl"
		OntModel onto = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM, null);
		try {
		    onto.read("file:./src/owl/Imoveis.owl", "RDF/XML");
//		    onto.write(System.out, "TURTLE");
	    }catch (JenaException je) {        

	           System.out.println("ERROR");

	           je.printStackTrace();

	           

	           System.exit(0);
        }
		
//		String queryString = 
//				"PREFIX ont: <http://www.semanticweb.org/felipe/ontologies/2013/11/untitled-ontology-131#>"+
//				"SELECT distinct ?n"+
//				"WHERE { "+
//					"?x ?c ?y."+
//					"?x ont:Nome_Parametro ?n"+
//					"FILTER (regex(?y, \"porto\", \"i\")||regex(?y, \"alegre\", \"i\"))"+	
//				"}";
		
		String queryString = "PREFIX ont: <http://www.semanticweb.org/felipe/ontologies/2013/11/untitled-ontology-131#> SELECT distinct ?parametro WHERE { ?x ?c ?y. ?x ont:Nome_Parametro ?parametro FILTER (regex(?y, \"rs\", \"i\")||regex(?y, \"poa\", \"i\")||regex(?y, \"Gravatai\", \"i\")||regex(?y, \"jk\", \"i\"))}";
		Query query = QueryFactory.create(queryString);
		// Execute the query and obtain results
		QueryExecution qe = QueryExecutionFactory.create(query, onto);
		ResultSet results = qe.execSelect();
		
		// Output query results
		List<QuerySolution> lstResultados = ResultSetFormatter.toList(results);
		String parametos ="";
		for(QuerySolution item: lstResultados){
			if (parametos.isEmpty()){
				parametos = item.getLiteral("parametro").toString();
			}else{
				parametos += "&" + item.getLiteral("parametro").toString();
			}
		}
		
		qe.close();
		System.out.println(parametos);
	}
}
