package controller;

import java.util.List;

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
	public Boolean preparaConteudoBusca() {
		if (!this.textoBusca.isEmpty()){
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