package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import controller.SemanticEngineImoveis;

public class AbstractSemanticEngineTest {

	@Test
	public void test() {
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
		
		engImoveis.setTextoBusca("Apartamento COM churrasqueira, sacada, sal�o DE festas NO Moinho de ventos, porto alegre");
		assertEquals(true, engImoveis.preparaConteudoBusca());

	}

}
