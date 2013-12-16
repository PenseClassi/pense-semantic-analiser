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
	@Ignore
	public void testConsultaOntologia() {
		System.out.println("testConsultaOntologia");
		SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
		
		engImoveis.setTextoBusca("Casa em Porto Alegre com 2 quartos");
		engImoveis.preparaConteudoBusca();
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
		
		engImoveis.setTextoBusca("Porto Alegre");
		engImoveis.preparaConteudoBusca();
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
//		assertEquals("cidade=Porto+Alegre", engImoveis.getResultsAsString());
		
		engImoveis.setTextoBusca("Apartamento com lareira elevador portaria");
		engImoveis.preparaConteudoBusca();
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
//		
		engImoveis.setTextoBusca("Apartamento com lareira, elevador e portaria");
		engImoveis.preparaConteudoBusca();
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
//		assertEquals("infraestrutura=elevador&tipo+de+imóvel=apartamento&infraestrutura=portaria", engImoveis.getResultsAsString());
		
		engImoveis.setTextoBusca("Rio Grande do Sul");
		engImoveis.preparaConteudoBusca();
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
		
		engImoveis.setTextoBusca("no Rio Grande do Sul");
		engImoveis.preparaConteudoBusca();
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
		
		engImoveis.setTextoBusca("RS");
		engImoveis.preparaConteudoBusca();
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
		
		engImoveis.setTextoBusca("poa");
		engImoveis.preparaConteudoBusca();
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
		
		engImoveis.setTextoBusca("porto");
		engImoveis.preparaConteudoBusca();
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
		
		engImoveis.setTextoBusca("casa de madeira");
		engImoveis.preparaConteudoBusca();
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
	}

	@Test
	public void testConsultaOntologia2(){
		System.out.println("----------------------------------------------------------------------------");
		System.out.println(">>>> testConsultaOntologia2");
		SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
		System.out.println("----------------------------------------------------------------------------");
		engImoveis.preparaConteudoBusca("Casa em Porto Alegre com 2 quartos");
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
		System.out.println("----------------------------------------------------------------------------");
		engImoveis.preparaConteudoBusca("Porto Alegre");
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
		System.out.println("----------------------------------------------------------------------------");
		engImoveis.preparaConteudoBusca("Apartamento com lareira elevador portaria");
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
		System.out.println("----------------------------------------------------------------------------");
		engImoveis.preparaConteudoBusca("Apartamento com lareira, elevador e portaria");
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
		System.out.println("----------------------------------------------------------------------------");
		engImoveis.preparaConteudoBusca("Rio Grande do Sul");
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
		System.out.println("----------------------------------------------------------------------------");
		engImoveis.preparaConteudoBusca("no Rio Grande do Sul");
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
		System.out.println("----------------------------------------------------------------------------");
		engImoveis.preparaConteudoBusca("RS");
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
		System.out.println("----------------------------------------------------------------------------");
		engImoveis.preparaConteudoBusca("poa");
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
		System.out.println("----------------------------------------------------------------------------");
		engImoveis.preparaConteudoBusca("porto");
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
		System.out.println("----------------------------------------------------------------------------");
		engImoveis.preparaConteudoBusca("casa de madeira");
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
	}

	@Test
	public void testConsultaOntologia3(){
/*
 * - Casa de madeira na praia para alugar
 * - Casa de madeira para comprar na praia
 * - Apartamento com dois quartos, churrasqueira no centro de Porto Alegre
 * - Apartamento com 3 quartos no bairro medianeira em poa
 */
		System.out.println("----------------------------------------------------------------------------");
		System.out.println(">>>> testConsultaOntologia3");
		SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
		
		System.out.println("----------------------------------------------------------------------------");
		engImoveis.preparaConteudoBusca("Casa de madeira na praia para alugar");
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
		
		System.out.println("----------------------------------------------------------------------------");
		//----------------------------------------------------------------------------
		engImoveis.preparaConteudoBusca("Casa de madeira para comprar na praia");
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
		
		System.out.println("----------------------------------------------------------------------------");
		//----------------------------------------------------------------------------
		engImoveis.preparaConteudoBusca("Apartamento com dois quartos, churrasqueira no centro de Porto Alegre");
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
		
		System.out.println("----------------------------------------------------------------------------");
		//----------------------------------------------------------------------------
		engImoveis.preparaConteudoBusca("Apartamento com 3 quartos no bairro medianeira em poa");
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
		
		System.out.println("----------------------------------------------------------------------------");
		//----------------------------------------------------------------------------
		engImoveis.preparaConteudoBusca("Apartamento duplex com 3 quartos no litoral do RS");
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
		
		System.out.println("----------------------------------------------------------------------------");
		//----------------------------------------------------------------------------
		engImoveis.preparaConteudoBusca("Chalé com suíte na serra de Santa Catarina");
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
		
		System.out.println("----------------------------------------------------------------------------");
		//----------------------------------------------------------------------------
		

		engImoveis.preparaConteudoBusca("Apartamento em condomínio em poa com zelador, play e piscina");
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
		System.out.println("----------------------------------------------------------------------------");
		//----------------------------------------------------------------------------

		engImoveis.preparaConteudoBusca("churrasqueira em casa de madeira no centro");
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
		System.out.println("----------------------------------------------------------------------------");
		//----------------------------------------------------------------------------
		

		engImoveis.preparaConteudoBusca("churrasqueira em casa de madeira no centro de poa");
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
		System.out.println("----------------------------------------------------------------------------");
		//----------------------------------------------------------------------------
	}

	@Test
	public void testConsultaOntologiaBaseadaEmDadosPense(){
		System.out.println("----------------------------------------------------------------------------");
		System.out.println(">>>> testConsultaOntologiaBaseadaEmDadosPense");
		SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
		
		/*
		 * Imoveis em Porto Alegre
Casas em Porto Alegre
Casas em Torres
Casas em Florianópolis
Casas em Florianópolis
capao da canoa
Casas em Porto Alegre
JK em Porto Alegre
Apartamento 1 e 2 dormitorios em Porto Alegre
Apartamentos Florianópolis

		 */
		
		System.out.println("----------------------------------------------------------------------------");
		engImoveis.preparaConteudoBusca("Imoveis em Porto Alegre");
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
		
		System.out.println("----------------------------------------------------------------------------");
		engImoveis.preparaConteudoBusca("Casas em Porto Alegre");
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
		
		System.out.println("----------------------------------------------------------------------------");
		engImoveis.preparaConteudoBusca("Casas em Torres");
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
		
		System.out.println("----------------------------------------------------------------------------");
		engImoveis.preparaConteudoBusca("Casas em Florianópolis");
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
		
		System.out.println("----------------------------------------------------------------------------");
		engImoveis.preparaConteudoBusca("capao da canoa");
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
		
		System.out.println("----------------------------------------------------------------------------");
		engImoveis.preparaConteudoBusca("Casas em Porto Alegre");
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
		
		System.out.println("----------------------------------------------------------------------------");
		engImoveis.preparaConteudoBusca("JK em Porto Alegre");
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
		
		System.out.println("----------------------------------------------------------------------------");
		engImoveis.preparaConteudoBusca("Apartamento 1 e 2 dormitorios em Porto Alegre");
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
		
		System.out.println("----------------------------------------------------------------------------");
		engImoveis.preparaConteudoBusca("Apartamentos Florianópolis");
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
		
		/*
		 * kitinete em Florianópolis
apartamento florianópolis
Casas em Itapema
Casas em Xangri la
Imoveis em Pelotas
Apartamento Sete de Setembro
Casas em Tramandai
Casas em Bombinhas
Aluguel Temporada em SC
Apartamentos em Camboriu
Casas em Garopaba
Apartamento 1 e 2 dormitorios em Porto Alegre
Loja Comercial em Porto Alegre
casas em porto alegre
Casas no litoral Norte
cobertura porto alegre
Casas em Blumenau
casas em porto alegre
Imoveis em Porto Alegre
Apartamentos em Joinville

		 */
		
		System.out.println("----------------------------------------------------------------------------");
		engImoveis.preparaConteudoBusca("kitinete em Florianópolis");
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
		
		
		System.out.println("----------------------------------------------------------------------------");
		engImoveis.preparaConteudoBusca("apartamento florianópolis");
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
		
		
		System.out.println("----------------------------------------------------------------------------");
		engImoveis.preparaConteudoBusca("Casas em Itapema");
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
		
		
		System.out.println("----------------------------------------------------------------------------");
		engImoveis.preparaConteudoBusca("Casas em Xangri la");
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
		
		
		System.out.println("----------------------------------------------------------------------------");
		engImoveis.preparaConteudoBusca("Apartamento Sete de Setembro");
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();
		
		
		System.out.println("----------------------------------------------------------------------------");
		engImoveis.preparaConteudoBusca("Casas em Tramandai");
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();		
		
		
		System.out.println("----------------------------------------------------------------------------");
		engImoveis.preparaConteudoBusca("Loja Comercial em Porto Alegre");
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();	
		
		
		System.out.println("----------------------------------------------------------------------------");
		engImoveis.preparaConteudoBusca("cobertura porto alegre");
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();	
		
		
		System.out.println("----------------------------------------------------------------------------");
		engImoveis.preparaConteudoBusca("apartamento em caxias do sul");
		engImoveis.executeQuery();
		engImoveis.getResultsAsString();	
	}
}
