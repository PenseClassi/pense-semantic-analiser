package br.com.pense.produto.controller;

import java.util.List;

import com.hp.hpl.jena.query.Query;
import java.util.Map;

public class SemanticEngineCarros extends AbstractSemanticEngine {

	@Override
	protected Query geraConsultaSPARQL(List<String> lstPalavras) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected boolean ehPalavraDeExcessao(String palavra) {
		// TODO Auto-generated method stub
		return false;
	}
        
        @Override
        protected Map<String, List<String>> executaPosProcessamento(Map<String, List<String>> mapParametros) {
            return null;
        }
        
        @Override
        protected String executaPreProcessamento(String texto){
            return null;
        }
}
