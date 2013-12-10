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
			List<String> listaAuxiliarDePalavras = new ArrayList<String>();
			
			//Remove as palavras reservadas - as que não entram na pesquisa
			for (String palavra: lstPalavras){
				if (!ehPalavraReservada(palavra)){
					listaAuxiliarDePalavras.add(palavra);					
				}
			}
			int contador = 0;
			String palavraPesquisa = "";
			for (String palavra: listaAuxiliarDePalavras){
				if (ehPalavraLigacao(palavra)){
					//Ao encontrar a palavra marca a posicao inicial se não existir
					if (posPrimeiraReservada == 0){ posPrimeiraReservada = contador; }
					//Senão 
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
					if (posPrimeiraReservada == 0){ palavrasDaPesquisa.add(palavra.replace(",", "").trim());}
					else{
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
			return true;
		}
		return false;
	}
	
	private boolean ehPalavraLigacao(String palavra){
		if (palavra != null){
			palavra = palavra.toLowerCase();
		
			if ( "em".equals(palavra) || 
					"na".equals(palavra) || 
					"no".equals(palavra) || 
					"de".equals(palavra) || 
					"com".equals(palavra) ||
					"para".equals(palavra)){
				return true;
			}
		}
		return false;
	}
	
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

}