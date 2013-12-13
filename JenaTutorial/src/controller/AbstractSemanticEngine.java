package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.text.Segment;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.query.ResultSetFormatter;

public abstract class AbstractSemanticEngine {

	private String textoBusca;
	private Query query;
	private List<String> listaDeParametros;
	private List<String> listaDePalavrasParaPesquisa;
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
	 * Trata o conteudo informado no campo de busca para posterior pesquisa 
	 * @return	Verdadeiro se procedimento terminou corretamente
	 */
	public boolean preparaConteudoBusca() {
		if (!this.textoBusca.isEmpty()){
			
			String[] lstPalavras =  this.textoBusca.split(" ");
			int posPrimeiraReservada = 0;
			int posSegundaReservada = 0;
			List<String> palavrasDaPesquisa = new ArrayList<String>();
			List<String> listaAuxiliarDePalavras = new ArrayList<String>();
			int contador = 0;
			String palavraPesquisa = "";
			
			
			//Remove as palavras reservadas - as que não entram na pesquisa
			for (String palavra: lstPalavras){
				if (!ehPalavraReservada(palavra)){
					listaAuxiliarDePalavras.add(palavra);
				}
			}
			
			for (String palavra: listaAuxiliarDePalavras){
				if (ehPalavraLigacao(palavra)){
					//Ao encontrar a palavra marca a posicao inicial se não existir
					if (posPrimeiraReservada == 0){ posPrimeiraReservada = contador; }
					//Senão pega o intervalo entre a primeira e a segunda marcação como uma unica palavra
					else {
						palavraPesquisa = "";
						posSegundaReservada = contador;
						for (int i = posPrimeiraReservada+1; i < posSegundaReservada; i++){
							//Concatenando as palavras do intervalo
							palavraPesquisa += " " + lstPalavras[i];
						}
						//Nova palavra vai pra lista de palavras
						palavrasDaPesquisa.add(palavraPesquisa.trim());
						//Reseta ponteiros 
						posPrimeiraReservada = posSegundaReservada;
						posSegundaReservada = 0;
					}
				}else{
					//Virgula representa o mesmo que uma palavra de ligação
					if (posPrimeiraReservada == 0){ 
						palavrasDaPesquisa.add(palavra.replace(",", "").trim());
						if (palavra.contains(",")){
							posPrimeiraReservada = contador;
						}
					}else{
						if (palavra.contains(",")){
							palavrasDaPesquisa.add(palavra.replace(",", "").trim());
							posPrimeiraReservada = contador;
						}
					}
				}
				contador++;
			}
			//Uma palavra reservada foi encontrada mas a lista acabou, pega o intervalo
			if (posPrimeiraReservada > posSegundaReservada){
				palavraPesquisa = "";
				posSegundaReservada = lstPalavras.length;
				for (int i = posPrimeiraReservada+1; i < posSegundaReservada; i++){
					//Concatenando as palavras do intervalo
					palavraPesquisa += " " + lstPalavras[i];
				}
				//Nova palavra vai pra lista de palavras
				palavrasDaPesquisa.add(palavraPesquisa.trim());
			}
			System.out.println(palavrasDaPesquisa.toString() + " - " + palavrasDaPesquisa.size());
			this.listaDePalavrasParaPesquisa = palavrasDaPesquisa;
			return true;
		}
		return false;
	}
	
	/*
	 * Avalia se a palavra informada é um verbo de ligação
	 * @param palavra Palavra a ser avaliada
	 * @return Verdadeiro se a palavra for de ligação
	 */
	private boolean ehPalavraLigacao(String palavra){
		if (palavra != null){
			palavra = palavra.toLowerCase();
		
			if ( "em".equals(palavra) || 
					"na".equals(palavra) || 
					"no".equals(palavra) || 
					"de".equals(palavra) || 
					"com".equals(palavra) ||
					"e".equals(palavra) ||
					"para".equals(palavra)){
				return true;
			}
		}
		return false;
	}
	
	/*
	 * Informa se a palavra informada é reservada
	 * @param palavra Palavra para avaliação
	 * @result Verdadeiro se a palavra informada for reservada 
	 */
	private boolean ehPalavraReservada(String palavra){
		if ( "bairro".equals(palavra) ||
				"cidade".equals(palavra) ||
				"estado".equals(palavra)){
			return true;
		}
		return false;
	}

	/*
	 * Gera a query de consulta SPARQL baseado em uma lista de palavras informadas
	 * @param lstPalavras Lista de palavras que deverão estar presentes na consulta
	 * @return Query para aplicação em uma consulta
	 */
	protected abstract Query geraConsultaSPARQL(List<String> lstPalavras);
	
	public String getResultsAsString(){
		String parametos ="";
		for(QuerySolution item: this.lstResultados){
			if (parametos.isEmpty()){
				parametos = item.getLiteral("parametro").toString();
			}else{
				parametos += "&" + item.getLiteral("parametro").toString();
			}
		}
		System.out.println(parametos);
		return parametos;
	}
	
	public Map<String, String> getResultAsParameter(){
		return null;
	}
	
	
	/*
	 * Executa a consulta junto a ontologia
	 */
	public void executeQuery(){
		Query query = this.geraConsultaSPARQL(this.listaDePalavrasParaPesquisa);
		
		QueryExecution qe = QueryExecutionFactory.create(query, this.getOntologia());
		ResultSet results = qe.execSelect();

		this.lstResultados = ResultSetFormatter.toList(results);
		
		qe.close();

		
	}

}