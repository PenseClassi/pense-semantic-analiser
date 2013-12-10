package controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.Segment;

import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryFactory;

public abstract class AbstractSemanticEngine {

	private String textoBusca;
	private Query query;
	

	public AbstractSemanticEngine() {

	}

	public String getTextoBusca() {
		return textoBusca;
	}

	
	public void setTextoBusca(String textoBusca) {
		this.textoBusca = textoBusca;
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
			
			//Remove as palavras reservadas - as que não entram na pesquisa
			for (String palavra: lstPalavras){
				if (!ehPalavraReservada(palavra)){
					palavrasDaPesquisa.add(palavra);					
				}
			}
			lstPalavras = (String[]) palavrasDaPesquisa.toArray();
			int contador = 0;
			//
			for (String palavra: lstPalavras){
				if (ehPalavraLigacao(palavra)){
					//Ao encontrar a palavra marca a posicao inicial se não existir
					if (posPrimeiraReservada == 0){ posPrimeiraReservada = contador; }
					//Senão 
					else {
						String palavraPesquisa = "";
						for (int i = posPrimeiraReservada; i < posSegundaReservada; i++){
							//Concatenando as palavras do intervalo
							palavraPesquisa += " " + lstPalavras[i];
						}
						//Nova palavra vai pra lista de palavras
						palavrasDaPesquisa.add(palavraPesquisa);
						//Reseta ponteiros 
						posPrimeiraReservada = 0;
						posSegundaReservada = 0;
					}
				}else{
					
				}
				contador++;
			}
			
			
			
			return true;
		}
		return false;
	}
	
	private boolean ehPalavraLigacao(String palavra){
		if ( "em".equals(palavra) || 
				"na".equals(palavra) || 
				"no".equals(palavra) || 
				"de".equals(palavra) || 
				"com".equals(palavra)){
			return true;
		}
		return false;
	}
	
	private boolean ehPalavraReservada(String palavra){
		if ( "bairro".equals(palavra) ||
				"cidade".equals(palavra)){
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

}