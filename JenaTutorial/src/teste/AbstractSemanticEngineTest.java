package teste;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import controller.SemanticEngineImoveis;

public class AbstractSemanticEngineTest {

	@Test
	@Ignore
	public void testPreparadorConteudoBusca() {
		SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
		
		engImoveis.setTextoBusca("Porto Alegre");
		assertEquals(true, engImoveis.preparaConteudoBusca());
		
		engImoveis.setTextoBusca("Casa em Porto Alegre");
		assertEquals(true, engImoveis.preparaConteudoBusca());
		
		engImoveis.setTextoBusca("Casa em Porto Alegre na praia no rio grande do sul");
		assertEquals(true, engImoveis.preparaConteudoBusca());
		
		engImoveis.setTextoBusca("Casa DE dois quartos EM Cidreira");
		assertEquals(true, engImoveis.preparaConteudoBusca());
		
		engImoveis.setTextoBusca("Casa para alugar");
		assertEquals(true, engImoveis.preparaConteudoBusca());
		
		engImoveis.setTextoBusca("Casa em cachoeirinha com lareira, sacada, garagem");
		assertEquals(true, engImoveis.preparaConteudoBusca());
		
		engImoveis.setTextoBusca("lareira, sacada, garagem");
		assertEquals(true, engImoveis.preparaConteudoBusca());
		
		engImoveis.setTextoBusca("lareira sacada garagem");
		assertEquals(true, engImoveis.preparaConteudoBusca());
		
		engImoveis.setTextoBusca("Apartamento COM churrasqueira, sacada, salão DE festas NO Moinho de ventos, porto alegre");
		assertEquals(true, engImoveis.preparaConteudoBusca());
		
		engImoveis.setTextoBusca("porto alegre, rio grande do sul");
		assertEquals(true, engImoveis.preparaConteudoBusca());
		
		engImoveis.setTextoBusca("porto alegre rio grande do sul");
		assertEquals(true, engImoveis.preparaConteudoBusca());

	}
	
	@Test
	public void testConsultaOntologia() {
		SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
		
		engImoveis.setTextoBusca("Casa em Porto Alegre com 2 quartos");
		engImoveis.preparaConteudoBusca();
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
		
		engImoveis.setTextoBusca("Porto Alegre");
		engImoveis.preparaConteudoBusca();
		engImoveis.executeQuery();
		assertEquals("cidade=porto+alegre", engImoveis.getResultsAsString());
		
		engImoveis.setTextoBusca("Apartamento com lareira elevador portaria");
		engImoveis.preparaConteudoBusca();
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
		
		engImoveis.setTextoBusca("Apartamento com lareira, elevador e portaria");
		engImoveis.preparaConteudoBusca();
		engImoveis.executeQuery();
		assertEquals("infraestrutura=portaria&tipo+de+imóvel=apartamento&infraestrutura=elevador", engImoveis.getResultsAsString());
	}

}
