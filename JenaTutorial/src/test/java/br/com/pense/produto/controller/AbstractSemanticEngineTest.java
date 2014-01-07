/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pense.produto.controller;

import junit.framework.TestCase;

/**
 *
 * @author Felipe_Noguez
 */
public class AbstractSemanticEngineTest extends TestCase {

    public AbstractSemanticEngineTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /*public void testConsultaOntologia() {

     System.out.println("----------------------------------------------------------------------------");
     System.out.println(">>>> testConsultaOntologia");
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
     }*/

    /*
     public void testConsultaOntologiaBaseadaEmDadosPense() {
     System.out.println("----------------------------------------------------------------------------");
     System.out.println(">>>> testConsultaOntologiaBaseadaEmDadosPense");
     SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();

     System.out.println("----------------------------------------------------------------------------");
     engImoveis.preparaConteudoBusca("Imoveis em Porto Alegre");
     engImoveis.executeQuery();
     assertEquals("cidade=Porto Alegre", engImoveis.getResultsAsString());

     System.out.println("----------------------------------------------------------------------------");
     engImoveis.preparaConteudoBusca("Casas em Porto Alegre");
     engImoveis.executeQuery();
     assertEquals("cidade=Porto Alegre&Tipo de imóvel=Casa", engImoveis.getResultsAsString());

     System.out.println("----------------------------------------------------------------------------");
     engImoveis.preparaConteudoBusca("Casas em Torres");
     engImoveis.executeQuery();
     assertEquals("cidade=Torres&Tipo de imóvel=Casa", engImoveis.getResultsAsString());

     System.out.println("----------------------------------------------------------------------------");
     engImoveis.preparaConteudoBusca("Casas em Florianópolis");
     engImoveis.executeQuery();
     assertEquals("cidade=Florianópolis&Tipo de imóvel=Casa", engImoveis.getResultsAsString());

     System.out.println("----------------------------------------------------------------------------");
     engImoveis.preparaConteudoBusca("JK em Porto Alegre");
     engImoveis.executeQuery();
     assertEquals("cidade=Porto Alegre&Tipo de imóvel=Jk / kitnet", engImoveis.getResultsAsString());

     System.out.println("----------------------------------------------------------------------------");
     engImoveis.preparaConteudoBusca("Apartamentos Florianópolis");
     engImoveis.executeQuery();
     assertEquals("cidade=Florianópolis&Tipo de imóvel=Apartamento", engImoveis.getResultsAsString());

     System.out.println("----------------------------------------------------------------------------");
     engImoveis.preparaConteudoBusca("kitinete em Florianópolis");
     engImoveis.executeQuery();
     assertEquals("cidade=Florianópolis&Tipo de imóvel=Jk / kitnet", engImoveis.getResultsAsString());

     System.out.println("----------------------------------------------------------------------------");
     engImoveis.preparaConteudoBusca("apartamento florianópolis");
     engImoveis.executeQuery();
     assertEquals("cidade=Florianópolis&Tipo de imóvel=Apartamento", engImoveis.getResultsAsString());

     System.out.println("----------------------------------------------------------------------------");
     engImoveis.preparaConteudoBusca("Casas em Itapema");
     engImoveis.executeQuery();
     assertEquals("Tipo de imóvel=Casa&cidade=Itapema", engImoveis.getResultsAsString());

     System.out.println("----------------------------------------------------------------------------");
     engImoveis.preparaConteudoBusca("Casas em Xangri la");
     engImoveis.executeQuery();
     assertEquals("Tipo de imóvel=Casa&cidade=Xangri-Lá", engImoveis.getResultsAsString());

     System.out.println("----------------------------------------------------------------------------");
     engImoveis.preparaConteudoBusca("Casas em Tramandai");
     engImoveis.executeQuery();
     assertEquals("Tipo de imóvel=Casa&cidade=Tramandaí", engImoveis.getResultsAsString());

     System.out.println("----------------------------------------------------------------------------");
     engImoveis.preparaConteudoBusca("cobertura porto alegre");
     engImoveis.executeQuery();
     assertEquals("Tipo de imóvel=Cobertura&cidade=Porto Alegre", engImoveis.getResultsAsString());

     System.out.println("----------------------------------------------------------------------------");
     engImoveis.preparaConteudoBusca("apartamento em caxias do sul");
     engImoveis.executeQuery();
     assertEquals("Tipo de imóvel=Apartamento&cidade=Caxias do Sul", engImoveis.getResultsAsString());
     }*/
    public void testConsultaOntologiaBaseadaEmDadosPenseHard() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>> testConsultaOntologiaBaseadaEmDadosPenseHard");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();

        System.out.println("----------------------------------------------------------------------------");
        engImoveis.preparaConteudoBusca("Loja Comercial em Porto Alegre");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Porto Alegre]}", engImoveis.getResultsAsString());

        System.out.println("----------------------------------------------------------------------------");
        engImoveis.preparaConteudoBusca("Apartamento Sete de Setembro");
        engImoveis.executeQuery();
        assertEquals("{Tipo de imóvel=[Apartamento]}", engImoveis.getResultsAsString());
        
        System.out.println("----------------------------------------------------------------------------");
        engImoveis.preparaConteudoBusca("Apartamento em Sete de Setembro");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Sete de Setembro], Tipo de imóvel=[Apartamento]}", engImoveis.getResultsAsString());

        System.out.println("----------------------------------------------------------------------------");
        engImoveis.preparaConteudoBusca("Apartamento 1 e 2 dormitorios em Porto Alegre");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Porto Alegre], Dormitórios=[1:2], Tipo de imóvel=[Apartamento]}", engImoveis.getResultsAsString());

        System.out.println("----------------------------------------------------------------------------");
        engImoveis.preparaConteudoBusca("capao da canoa");
        engImoveis.executeQuery();
        engImoveis.getResultsAsString();
        assertEquals("{}", engImoveis.getResultsAsString());
        
        System.out.println("----------------------------------------------------------------------------");
        engImoveis.preparaConteudoBusca("em capao da canoa");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Capão da Canoa]}", engImoveis.getResultsAsString());
        
        System.out.println("----------------------------------------------------------------------------");
        engImoveis.preparaConteudoBusca("Porto Alegre");
        engImoveis.executeQuery();
        assertEquals("{}", engImoveis.getResultsAsString());
        
        System.out.println("----------------------------------------------------------------------------");
        engImoveis.preparaConteudoBusca("em Porto Alegre");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Porto Alegre]}", engImoveis.getResultsAsString());
    }

    public void testConsultaOntologiaBaseadaEmDadosPenseHardQuartos() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>> testConsultaOntologiaBaseadaEmDadosPenseHardQuartos");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();

        System.out.println("----------------------------------------------------------------------------");
        engImoveis.preparaConteudoBusca("Apartamento 1 dormitorio Porto Alegre");
        engImoveis.executeQuery();
        engImoveis.getResultsAsString();

        System.out.println("----------------------------------------------------------------------------");
        engImoveis.preparaConteudoBusca("apartamento 1 e 2 dormitorios em porto alegre");
        engImoveis.executeQuery();
        engImoveis.getResultsAsString();

        System.out.println("----------------------------------------------------------------------------");
        engImoveis.preparaConteudoBusca("apartamento 2 e 3 dormitorios em porto alegre");
        engImoveis.executeQuery();
        engImoveis.getResultsAsString();

        System.out.println("----------------------------------------------------------------------------");
        engImoveis.preparaConteudoBusca("apartamento 3 e 2 dormitorios em porto alegre");
        engImoveis.executeQuery();
        engImoveis.getResultsAsString();

        System.out.println("----------------------------------------------------------------------------");
        engImoveis.preparaConteudoBusca("apartamento 1, 2 e 3 dormitorios em porto alegre");
        engImoveis.executeQuery();
        engImoveis.getResultsAsString();

        System.out.println("----------------------------------------------------------------------------");
        engImoveis.preparaConteudoBusca("casa de madeira 3 e 2 dormitorios em porto alegre");
        engImoveis.executeQuery();
        engImoveis.getResultsAsString();

        System.out.println("----------------------------------------------------------------------------");
        engImoveis.preparaConteudoBusca("casa de madeira 3d e 2d em porto alegre");
        engImoveis.executeQuery();
        engImoveis.getResultsAsString();

        System.out.println("----------------------------------------------------------------------------");
        engImoveis.preparaConteudoBusca("apartamento 2 dormitórios em porto alegre");
        engImoveis.executeQuery();
        engImoveis.getResultsAsString();
        
        System.out.println("----------------------------------------------------------------------------");
        engImoveis.preparaConteudoBusca("apartamento 2 dormitorios porto alegre");
        engImoveis.executeQuery();
        engImoveis.getResultsAsString();
        
        System.out.println("----------------------------------------------------------------------------");
        engImoveis.preparaConteudoBusca("1 dormitorio em porto alegre");
        engImoveis.executeQuery();
        engImoveis.getResultsAsString();
        
        System.out.println("----------------------------------------------------------------------------");
        engImoveis.preparaConteudoBusca("apartamento 3 dormitórios em porto alegre");
        engImoveis.executeQuery();
        engImoveis.getResultsAsString();
        
        System.out.println("----------------------------------------------------------------------------");
        engImoveis.preparaConteudoBusca("apartamento 2 e 3 dormitorios em porto alegre");
        engImoveis.executeQuery();
        engImoveis.getResultsAsString();
        
        System.out.println("----------------------------------------------------------------------------");
        engImoveis.preparaConteudoBusca("Casas 1 e 2 dormitórios em Joinville");
        engImoveis.executeQuery();
        engImoveis.getResultsAsString();
        
        System.out.println("----------------------------------------------------------------------------");
        engImoveis.preparaConteudoBusca("2 dormitorios com garagem em porto alegre");
        engImoveis.executeQuery();
        engImoveis.getResultsAsString();
        
        System.out.println("----------------------------------------------------------------------------");
        engImoveis.preparaConteudoBusca("apartamento mobiliado em porto alegre 2 dormitorios rs");
        engImoveis.executeQuery();
        engImoveis.getResultsAsString();
        
        System.out.println("----------------------------------------------------------------------------");
        engImoveis.preparaConteudoBusca("casa 3 quartos em porto alegre");
        engImoveis.executeQuery();
        engImoveis.getResultsAsString();
        
        System.out.println("----------------------------------------------------------------------------");
        engImoveis.preparaConteudoBusca("apartamento 2 quartos");
        engImoveis.executeQuery();
        engImoveis.getResultsAsString();
        
        System.out.println("----------------------------------------------------------------------------");
        engImoveis.preparaConteudoBusca("apartamento de 01 dormitório em porto alegre");
        engImoveis.executeQuery();
        engImoveis.getResultsAsString();
    }

    
     public void testConsultaSaoFranciscoDePaulaComplexo() {
     System.out.println("----------------------------------------------------------------------------");
     System.out.println(">>>> testConsultaSaoFranciscoDePaulaComplexo");
     SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
     System.out.println("----------------------------------------------------------------------------");
     engImoveis.preparaConteudoBusca("casa em São Francisco de Paula com lareira, churrasqueira e play");
     engImoveis.executeQuery();
     //assertEquals("Infraestrutura=Playground&Tipo de imóvel=Casa&Características=Churrasqueira&cidade=São Francisco de Paula&Características=Lareira", engImoveis.getResultsAsString());
     engImoveis.getResultsAsString();
        
     System.out.println("----------------------------------------------------------------------------");
     engImoveis.preparaConteudoBusca("casa em São Francisco de Paula com 2d, lareira, churrasqueira e play");
     engImoveis.executeQuery();
//     assertEquals("Infraestrutura=Playground&Dormitórios=2:2&Tipo de imóvel=Casa&Características=Churrasqueira&cidade=São Francisco de Paula&Características=Lareira", engImoveis.getResultsAsString());
     engImoveis.getResultsAsString();
     

     System.out.println("----------------------------------------------------------------------------");
     engImoveis.preparaConteudoBusca("casa em São Francisco de Paula com dois quartos, lareira, churrasqueira e play piscina zelador");
     engImoveis.executeQuery();
//     assertEquals("Infraestrutura=Playground&Dormitórios=2:2&Tipo de imóvel=Casa&Características=Churrasqueira&cidade=São Francisco de Paula&Características=Lareira", engImoveis.getResultsAsString());
     engImoveis.getResultsAsString();
     }
    
    
    
    /*
    
    Consultas individuais para cidades do RS
    
    */

/*     
     
    public void testConsultaAcegua() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaAcegua");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Aceguá");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Aceguá], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaBage() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaBage");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Bagé");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Bagé], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCandiota() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCandiota");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Candiota");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Candiota], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaDomPedrito() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaDomPedrito");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Dom Pedrito");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Dom Pedrito], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaHulhaNegra() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaHulhaNegra");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Hulha Negra");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Hulha Negra], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaPedrasAltas() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaPedrasAltas");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Pedras Altas");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Pedras Altas], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaPinheiroMachado() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaPinheiroMachado");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Pinheiro Machado");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Pinheiro Machado], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSantaRita() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSantaRita");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Santa Rita");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Santa Rita], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaAratiba() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaAratiba");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Aratiba");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Aratiba], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaaurea() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaaurea");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Áurea");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Áurea], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaBaraodeCotegipe() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaBaraodeCotegipe");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Barão de Cotegipe");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Barão de Cotegipe], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaBarradoRioAzul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaBarradoRioAzul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Barra do Rio Azul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Barra do Rio Azul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaBarracao() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaBarracao");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Barracão");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Barracão], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaBenjaminConstantdoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaBenjaminConstantdoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Benjamin Constant do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Benjamin Constant do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCaciqueDoble() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCaciqueDoble");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Cacique Doble");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Cacique Doble], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCampinasdoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCampinasdoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Campinas do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Campinas do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCarlosGomes() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCarlosGomes");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Carlos Gomes");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Carlos Gomes], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCentenario() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCentenario");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Centenário");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Centenário], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCruzaltense() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCruzaltense");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Cruzaltense");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Cruzaltense], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaEntreRiosdoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaEntreRiosdoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Entre Rios do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Entre Rios do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaErebango() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaErebango");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Erebango");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Erebango], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaErechim() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaErechim");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Erechim");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Erechim], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaErvalGrande() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaErvalGrande");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Erval Grande");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Erval Grande], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaEstacao() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaEstacao");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Estação");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Estação], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaFaxinalzinho() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaFaxinalzinho");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Faxinalzinho");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Faxinalzinho], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaFlorianoPeixoto() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaFlorianoPeixoto");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Floriano Peixoto");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Floriano Peixoto], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaGaurama() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaGaurama");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Gaurama");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Gaurama], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaGetulioVargas() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaGetulioVargas");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Getúlio Vargas");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Getúlio Vargas], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaGramadodosLoureiros() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaGramadodosLoureiros");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Gramado dos Loureiros");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Gramado dos Loureiros], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaIpirangadoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaIpirangadoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Ipiranga do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Ipiranga do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaItatibadoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaItatibadoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Itatiba do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Itatiba do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaJacutinga() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaJacutinga");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Jacutinga");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Jacutinga], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaMachadinho() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaMachadinho");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Machadinho");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Machadinho], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaMarcelinoRamos() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaMarcelinoRamos");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Marcelino Ramos");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Marcelino Ramos], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaMarianoMoro() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaMarianoMoro");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Mariano Moro");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Mariano Moro], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaMaximilianodeAlmeida() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaMaximilianodeAlmeida");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Maximiliano de Almeida");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Maximiliano de Almeida], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaNonoai() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaNonoai");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Nonoai");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Nonoai], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaPaimFilho() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaPaimFilho");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Paim Filho");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Paim Filho], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaPauloBento() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaPauloBento");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Paulo Bento");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Paulo Bento], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaPontePreta() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaPontePreta");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Ponte Preta");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Ponte Preta], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaQuatroIrmaos() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaQuatroIrmaos");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Quatro Irmãos");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Quatro Irmãos], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaRiodosindios() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaRiodosindios");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Rio dos Índios");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Rio dos Índios], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSantoExpeditodoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSantoExpeditodoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Santo Expedito do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Santo Expedito do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSaoJoaodaUrtiga() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSaoJoaodaUrtiga");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em São João da Urtiga");
        engImoveis.executeQuery();
        assertEquals("{cidade=[São João da Urtiga], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSaoJosedoOuro() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSaoJosedoOuro");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em São José do Ouro");
        engImoveis.executeQuery();
        assertEquals("{cidade=[São José do Ouro], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSaoValentim() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSaoValentim");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em São Valentim");
        engImoveis.executeQuery();
        assertEquals("{cidade=[São Valentim], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSeverianodeAlmeida() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSeverianodeAlmeida");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Severiano de Almeida");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Severiano de Almeida], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaTresArroios() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaTresArroios");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Três Arroios");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Três Arroios], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaTresPalmeiras() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaTresPalmeiras");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Três Palmeiras");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Três Palmeiras], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaTrindadedoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaTrindadedoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Trindade do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Trindade do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaTupancidoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaTupancidoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Tupanci do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Tupanci do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaViadutos() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaViadutos");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Viadutos");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Viadutos], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaAlvorada() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaAlvorada");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Alvorada");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Alvorada], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaArroiodosRatos() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaArroiodosRatos");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Arroio dos Ratos");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Arroio dos Ratos], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCachoeirinha() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCachoeirinha");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Cachoeirinha");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Cachoeirinha], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCanoas() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCanoas");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Canoas");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Canoas], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCharqueadas() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCharqueadas");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Charqueadas");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Charqueadas], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaEldoradodoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaEldoradodoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Eldorado do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Eldorado do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaEsteio() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaEsteio");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Esteio");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Esteio], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaGlorinha() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaGlorinha");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Glorinha");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Glorinha], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaGravatai() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaGravatai");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Gravataí");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Gravataí], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaGuaiba() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaGuaiba");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Guaíba");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Guaíba], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaMontenegro() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaMontenegro");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Montenegro");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Montenegro], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaNovaSantaRita() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaNovaSantaRita");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Nova Santa Rita");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Nova Santa Rita], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaPortoAlegre() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaPortoAlegre");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Porto Alegre");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Porto Alegre], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSaoJeronimo() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSaoJeronimo");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em São Jerônimo");
        engImoveis.executeQuery();
        assertEquals("{cidade=[São Jerônimo], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSapucaiadoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSapucaiadoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Sapucaia do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Sapucaia do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaTriunfo() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaTriunfo");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Triunfo");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Triunfo], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaViamao() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaViamao");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Viamão");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Viamão], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaAugustoPestana() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaAugustoPestana");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Augusto Pestana");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Augusto Pestana], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaBoaVistadoCadeado() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaBoaVistadoCadeado");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Boa Vista do Cadeado");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Boa Vista do Cadeado], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaBoaVistadoIncra() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaBoaVistadoIncra");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Boa Vista do Incra");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Boa Vista do Incra], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaBozano() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaBozano");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Bozano");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Bozano], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCapaodoCipo() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCapaodoCipo");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Capão do Cipó");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Capão do Cipó], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCatuipe() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCatuipe");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Catuipe");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Catuipe], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCondor() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCondor");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Condor");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Condor], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCoronelBarros() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCoronelBarros");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Coronel Barros");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Coronel Barros], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCruzAlta() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCruzAlta");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Cruz Alta");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Cruz Alta], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaEntreIjuis() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaEntre-Ijuis");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Entre-Ijuís");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Entre-Ijuís], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaFortalezadosValos() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaFortalezadosValos");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Fortaleza dos Valos");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Fortaleza dos Valos], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaIbiruba() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaIbiruba");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Ibirubá");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Ibirubá], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaIjui() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaIjui");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Ijuí");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Ijuí], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaItacurubi() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaItacurubi");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Itacurubi");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Itacurubi], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaJacuizinho() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaJacuizinho");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Jacuizinho");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Jacuizinho], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaJari() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaJari");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Jari");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Jari], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaJoia() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaJoia");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Jóia");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Jóia], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaNovaRamada() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaNovaRamada");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Nova Ramada");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Nova Ramada], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaPanambi() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaPanambi");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Panambi");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Panambi], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaPejucara() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaPejucara");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Pejuçara");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Pejuçara], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaQuinzedeNovembro() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaQuinzedeNovembro");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Quinze de Novembro");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Quinze de Novembro], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSaldanhaMarinho() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSaldanhaMarinho");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Saldanha Marinho");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Saldanha Marinho], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSaltodoJacui() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSaltodoJacui");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Salto do Jacuí");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Salto do Jacuí], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSantaBarbaradoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSantaBarbaradoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Santa Bárbara do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Santa Bárbara do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSaoBorja() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSaoBorja");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em São Borja");
        engImoveis.executeQuery();
        assertEquals("{cidade=[São Borja], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaTupancireta() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaTupancireta");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Tupanciretã");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Tupanciretã], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaUnistalda() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaUnistalda");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Unistalda");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Unistalda], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaAraca() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaAraca");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Araçá");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Araçá], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaAreiasBrancas() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaAreiasBrancas");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Areias Brancas");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Areias Brancas], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaArroiodoSal() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaArroiodoSal");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Arroio do Sal");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Arroio do Sal], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaAtlantida() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaAtlantida");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Atlântida");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Atlântida], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaAtlantidaSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaAtlantidaSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Atlântida Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Atlântida Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaBalnearioPinhal() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaBalnearioPinhal");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Balneário Pinhal");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Balneário Pinhal], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCapaodaCanoa() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCapaodaCanoa");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Capão da Canoa");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Capão da Canoa], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCapaoNovo() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCapaoNovo");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Capão Novo");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Capão Novo], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCapivaridoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCapivaridoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Capivari do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Capivari do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCaraa() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCaraa");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Caraá");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Caraá], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCidreira() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCidreira");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Cidreira");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Cidreira], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCurumim() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCurumim");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Curumim");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Curumim], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaDomPedrodeAlcantara() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaDomPedrodeAlcantara");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Dom Pedro de Alcantara");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Dom Pedro de Alcantara], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaImbe() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaImbe");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Imbé");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Imbé], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaItati() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaItati");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Itati");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Itati], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaMagisterio() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaMagisterio");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Magistério");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Magistério], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaMampituba() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaMampituba");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Mampituba");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Mampituba], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaMaquine() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaMaquine");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Maquiné");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Maquiné], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaMariapolis() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaMariapolis");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Mariápolis");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Mariápolis], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaMariluz() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaMariluz");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Mariluz");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Mariluz], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaMorrinhosdoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaMorrinhosdoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Morrinhos do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Morrinhos do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaNoivadoMar() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaNoivadoMar");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Noiva do Mar");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Noiva do Mar], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaNovaTramandai() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaNovaTramandai");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Nova Tramandaí");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Nova Tramandaí], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaOasis() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaOasis");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Oásis");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Oásis], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaOsorio() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaOsorio");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Osório");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Osório], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaPalmaresdoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaPalmaresdoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Palmares do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Palmares do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaPraiadoBarco() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaPraiadoBarco");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Praia do Barco");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Praia do Barco], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaQuintao() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaQuintao");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Quintão");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Quintão], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaRainhadoMar() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaRainhadoMar");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Rainha do Mar");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Rainha do Mar], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaRemanso() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaRemanso");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Remanso");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Remanso], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaRolante() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaRolante");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Rolante");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Rolante], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSalinas() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSalinas");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Salinas");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Salinas], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSantoAntoniodaPatrulha() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSantoAntoniodaPatrulha");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Santo Antônio da Patrulha");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Santo Antônio da Patrulha], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaTavares() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaTavares");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Tavares");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Tavares], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaTerradeAreia() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaTerradeAreia");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Terra de Areia");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Terra de Areia], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaTorres() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaTorres");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Torres");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Torres], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaTramandai() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaTramandai");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Tramandaí");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Tramandaí], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaTresCachoeiras() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaTresCachoeiras");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Três Cachoeiras");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Três Cachoeiras], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaTresForquilhas() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaTresForquilhas");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Três Forquilhas");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Três Forquilhas], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaXangriLa() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaXangri-La");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Xangri-Lá");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Xangri-Lá], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaaguaSanta() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaaguaSanta");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Água Santa");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Água Santa], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaAlmiranteTamandaredoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaAlmiranteTamandaredoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Almirante Tamandaré do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Almirante Tamandaré do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaAlpestre() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaAlpestre");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Alpestre");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Alpestre], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaAltoAlegre() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaAltoAlegre");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Alto Alegre");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Alto Alegre], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaAmetistadoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaAmetistadoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Ametista do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Ametista do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaBarraFunda() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaBarraFunda");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Barra Funda");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Barra Funda], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaBoaVistadasMissoes() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaBoaVistadasMissoes");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Boa Vista das Missões");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Boa Vista das Missões], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCaicara() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCaicara");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Caicara");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Caicara], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCamargo() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCamargo");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Camargo");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Camargo], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCamposBorges() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCamposBorges");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Campos Borges");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Campos Borges], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCapaoBonitodoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCapaoBonitodoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Capão Bonito do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Capão Bonito do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCarazinho() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCarazinho");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Carazinho");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Carazinho], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCasca() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCasca");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Casca");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Casca], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCaseiros() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCaseiros");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Caseiros");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Caseiros], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaChapada() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaChapada");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Chapada");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Chapada], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCharrua() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCharrua");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Charrua");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Charrua], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCiriaco() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCiriaco");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Ciríaco");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Ciríaco], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaColorado() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaColorado");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Colorado");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Colorado], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaConstantina() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaConstantina");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Constantina");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Constantina], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCoqueirosdoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCoqueirosdoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Coqueiros do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Coqueiros do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCoxilha() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCoxilha");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Coxilha");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Coxilha], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCristaldoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCristaldoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Cristal do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Cristal do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaDavidCanabarro() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaDavidCanabarro");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em David Canabarro");
        engImoveis.executeQuery();
        assertEquals("{cidade=[David Canabarro], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaEngenhoVelho() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaEngenhoVelho");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Engenho Velho");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Engenho Velho], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaErnestina() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaErnestina");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Ernestina");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Ernestina], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaEsmeralda() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaEsmeralda");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Esmeralda");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Esmeralda], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaEspumoso() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaEspumoso");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Espumoso");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Espumoso], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaFontouraXavier() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaFontouraXavier");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Fontoura Xavier");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Fontoura Xavier], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaFredericoWestphalen() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaFredericoWestphalen");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Frederico Westphalen");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Frederico Westphalen], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaGentil() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaGentil");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Gentil");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Gentil], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaGuabiju() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaGuabiju");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Guabiju");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Guabiju], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaGuapore() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaGuapore");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Guaporé");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Guaporé], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaIbiaca() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaIbiaca");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Ibiaça");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Ibiaça], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaIbiraiaras() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaIbiraiaras");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Ibiraiaras");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Ibiraiaras], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaIbirapuita() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaIbirapuita");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Ibirapuita");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Ibirapuita], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaIrai() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaIrai");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Iraí");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Iraí], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaJaboticaba() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaJaboticaba");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Jaboticaba");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Jaboticaba], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaLagoadosTresCantos() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaLagoadosTresCantos");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Lagoa dos Três Cantos");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Lagoa dos Três Cantos], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaLagoaVermelha() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaLagoaVermelha");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Lagoa Vermelha");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Lagoa Vermelha], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaLajeadodoBugre() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaLajeadodoBugre");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Lajeado do Bugre");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Lajeado do Bugre], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaLiberatoSalzano() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaLiberatoSalzano");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Liberato Salzano");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Liberato Salzano], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaMarau() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaMarau");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Marau");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Marau], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaMatoCastelhano() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaMatoCastelhano");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Mato Castelhano");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Mato Castelhano], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaMontauri() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaMontauri");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Montauri");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Montauri], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaMormaco() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaMormaco");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Mormaço");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Mormaço], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaMuitosCapoes() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaMuitosCapoes");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Muitos Capões");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Muitos Capões], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaMuliterno() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaMuliterno");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Muliterno");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Muliterno], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaNaoMeToque() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaNao-Me-Toque");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Não-Me-Toque");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Não-Me-Toque], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaNicolauVergueiro() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaNicolauVergueiro");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Nicolau Vergueiro");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Nicolau Vergueiro], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaNovaAlvorada() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaNovaAlvorada");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Nova Alvorada");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Nova Alvorada], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaNovaBoaVista() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaNovaBoaVista");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Nova Boa Vista");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Nova Boa Vista], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaNovoBarreiro() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaNovoBarreiro");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Novo Barreiro");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Novo Barreiro], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaNovoTiradentes() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaNovoTiradentes");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Novo Tiradentes");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Novo Tiradentes], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaNovoXingu() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaNovoXingu");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Novo Xingu");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Novo Xingu], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaPalmeiradasMissoes() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaPalmeiradasMissoes");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Palmeira das Missões");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Palmeira das Missões], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaPalmitinho() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaPalmitinho");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Palmitinho");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Palmitinho], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaPassoFundo() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaPassoFundo");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Passo Fundo");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Passo Fundo], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaPinhal() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaPinhal");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Pinhal");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Pinhal], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaPinhaldaSerra() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaPinhaldaSerra");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Pinhal da Serra");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Pinhal da Serra], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaPlanalto() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaPlanalto");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Planalto");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Planalto], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaPontao() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaPontao");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Pontão");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Pontão], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaRodeioBonito() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaRodeioBonito");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Rodeio Bonito");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Rodeio Bonito], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaRondaAlta() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaRondaAlta");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Ronda Alta");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Ronda Alta], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaRondinha() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaRondinha");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Rondinha");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Rondinha], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSagradaFamilia() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSagradaFamilia");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Sagrada Familia");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Sagrada Familia], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSananduva() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSananduva");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Sananduva");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Sananduva], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSantaCeciliadoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSantaCeciliadoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Santa Cecília do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Santa Cecília do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSantaTerezinha() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSantaTerezinha");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Santa Terezinha");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Santa Terezinha], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSantoAntoniodoPalma() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSantoAntoniodoPalma");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Santo Antônio do Palma");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Santo Antônio do Palma], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSantoAntoniodoPlanalto() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSantoAntoniodoPlanalto");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Santo Antônio do Planalto");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Santo Antônio do Planalto], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSaoDomingosdoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSaoDomingosdoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em São Domingos do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[São Domingos do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSaoJorge() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSaoJorge");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em São Jorge");
        engImoveis.executeQuery();
        assertEquals("{cidade=[São Jorge], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSaoJosedasMissoes() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSaoJosedasMissoes");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em São José das Missões");
        engImoveis.executeQuery();
        assertEquals("{cidade=[São José das Missões], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSaoJosedoHerval() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSaoJosedoHerval");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em São José do Herval");
        engImoveis.executeQuery();
        assertEquals("{cidade=[São José do Herval], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSaoPedrodasMissoes() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSaoPedrodasMissoes");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em São Pedro das Missões");
        engImoveis.executeQuery();
        assertEquals("{cidade=[São Pedro das Missões], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSaoValentimdoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSaoValentimdoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em São Valentim do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[São Valentim do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSarandi() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSarandi");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Sarandi");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Sarandi], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSeberi() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSeberi");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Seberi");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Seberi], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSelbach() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSelbach");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Selbach");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Selbach], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSertao() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSertao");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Sertão");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Sertão], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSoledade() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSoledade");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Soledade");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Soledade], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaTapejara() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaTapejara");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Tapejara");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Tapejara], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaTapera() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaTapera");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Tapera");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Tapera], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaTaquarucudoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaTaquarucudoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Taquarucu do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Taquarucu do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaTioHugo() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaTioHugo");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Tio Hugo");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Tio Hugo], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaUniaodaSerra() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaUniaodaSerra");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em União da Serra");
        engImoveis.executeQuery();
        assertEquals("{cidade=[União da Serra], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaVanini() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaVanini");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Vanini");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Vanini], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaVicenteDutra() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaVicenteDutra");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Vicente Dutra");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Vicente Dutra], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaVictorGraeff() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaVictorGraeff");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Victor Graeff");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Victor Graeff], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaVilaLangaro() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaVilaLangaro");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Vila Langaro");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Vila Langaro], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaVilaMaria() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaVilaMaria");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Vila Maria");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Vila Maria], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaVistaAlegre() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaVistaAlegre");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Vista Alegre");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Vista Alegre], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaVistaAlegredoPrata() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaVistaAlegredoPrata");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Vista Alegre do Prata");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Vista Alegre do Prata], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaAmaralFerrador() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaAmaralFerrador");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Amaral Ferrador");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Amaral Ferrador], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaArambare() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaArambare");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Arambare");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Arambare], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaArroiodoPadre() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaArroiodoPadre");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Arroio do Padre");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Arroio do Padre], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaArroioGrande() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaArroioGrande");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Arroio Grande");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Arroio Grande], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaBaraodoTriunfo() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaBaraodoTriunfo");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Barão do Triunfo");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Barão do Triunfo], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCamaqua() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCamaqua");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Camaquã");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Camaquã], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCangucu() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCangucu");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Canguçu");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Canguçu], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCapaodoLeao() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCapaodoLeao");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Capão do Leão");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Capão do Leão], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCassino() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCassino");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Cassino");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Cassino], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCerrito() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCerrito");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Cerrito");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Cerrito], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCerroGrande() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCerroGrande");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Cerro Grande");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Cerro Grande], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCerroGrandedoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCerroGrandedoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Cerro Grande do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Cerro Grande do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaChui() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaChui");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Chuí");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Chuí], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaChuvisca() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaChuvisca");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Chuvisca");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Chuvisca], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCristal() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCristal");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Cristal");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Cristal], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaDomFeliciano() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaDomFeliciano");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Dom Feliciano");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Dom Feliciano], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaHerval() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaHerval");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Herval");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Herval], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaJaguarao() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaJaguarao");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Jaguarão");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Jaguarão], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaMorroRedondo() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaMorroRedondo");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Morro Redondo");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Morro Redondo], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaMostardas() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaMostardas");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Mostardas");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Mostardas], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaPedroOsorio() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaPedroOsorio");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Pedro Osório");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Pedro Osório], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaPelotas() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaPelotas");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Pelotas");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Pelotas], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaPiratini() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaPiratini");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Piratini");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Piratini], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaRioGrande() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaRioGrande");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Rio Grande");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Rio Grande], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSantaVitoriadoPalmar() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSantaVitoriadoPalmar");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Santa Vitória do Palmar");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Santa Vitória do Palmar], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSantanadaBoaVista() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSantanadaBoaVista");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Santana da Boa Vista");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Santana da Boa Vista], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSaoJosedoNorte() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSaoJosedoNorte");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em São José do Norte");
        engImoveis.executeQuery();
        assertEquals("{cidade=[São José do Norte], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSaoLourencodoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSaoLourencodoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em São Lourenço do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[São Lourenço do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSentineladoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSentineladoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Sentinela do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Sentinela do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSertaoSantana() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSertaoSantana");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Sertão Santana");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Sertão Santana], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaTapes() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaTapes");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Tapes");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Tapes], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaTurucu() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaTurucu");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Turuçu");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Turuçu], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaAntaGorda() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaAntaGorda");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Anta Gorda");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Anta Gorda], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaArroiodoMeio() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaArroiodoMeio");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Arroio do Meio");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Arroio do Meio], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaArroiodoTigre() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaArroiodoTigre");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Arroio do Tigre");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Arroio do Tigre], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaArvorezinha() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaArvorezinha");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Arvorezinha");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Arvorezinha], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaBarrosCassal() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaBarrosCassal");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Barros Cassal");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Barros Cassal], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaBomRetirodoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaBomRetirodoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Bom Retiro do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Bom Retiro do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaBoqueiraodoLeao() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaBoqueiraodoLeao");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Boqueirão do Leão");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Boqueirão do Leão], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCachoeiradoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCachoeiradoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Cachoeira do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Cachoeira do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCandelaria() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCandelaria");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Candelária");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Candelária], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCanudosdoVale() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCanudosdoVale");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Canudos do Vale");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Canudos do Vale], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCerroBranco() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCerroBranco");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Cerro Branco");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Cerro Branco], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaColinas() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaColinas");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Colinas");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Colinas], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCoqueiroBaixo() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCoqueiroBaixo");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Coqueiro Baixo");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Coqueiro Baixo], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCruzeirodoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCruzeirodoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Cruzeiro do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Cruzeiro do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaDoisLajeados() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaDoisLajeados");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Dois Lajeados");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Dois Lajeados], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaDoutorRicardo() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaDoutorRicardo");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Doutor Ricardo");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Doutor Ricardo], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaEncantado() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaEncantado");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Encantado");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Encantado], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaEncruzilhadadoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaEncruzilhadadoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Encruzilhada do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Encruzilhada do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaEstrela() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaEstrela");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Estrela");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Estrela], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaEstrelaVelha() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaEstrelaVelha");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Estrela Velha");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Estrela Velha], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaFazendaVilanova() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaFazendaVilanova");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Fazenda Vilanova");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Fazenda Vilanova], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaForquetinha() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaForquetinha");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Forquetinha");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Forquetinha], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaGramadoXavier() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaGramadoXavier");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Gramado Xavier");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Gramado Xavier], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaGuaranidasMissoes() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaGuaranidasMissoes");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Guarani das Missões");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Guarani das Missões], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaHerveiras() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaHerveiras");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Herveiras");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Herveiras], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaIbarama() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaIbarama");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Ibarama");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Ibarama], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaIlopolis() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaIlopolis");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Ilópolis");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Ilópolis], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaImigrante() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaImigrante");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Imigrante");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Imigrante], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaItapuca() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaItapuca");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Itapuca");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Itapuca], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaLagoaBonitadoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaLagoaBonitadoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Lagoa Bonita do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Lagoa Bonita do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaLagoao() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaLagoao");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Lagoão");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Lagoão], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaLajeado() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaLajeado");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Lajeado");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Lajeado], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaMarquesdeSouza() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaMarquesdeSouza");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Marquês de Souza");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Marquês de Souza], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaMatoLeitao() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaMatoLeitao");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Mato Leitão");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Mato Leitão], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaMucum() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaMucum");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Muçum");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Muçum], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaPantanoGrande() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaPantanoGrande");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Pantano Grande");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Pantano Grande], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaPassaSete() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaPassaSete");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Passa Sete");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Passa Sete], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaPassodoSobrado() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaPassodoSobrado");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Passo do Sobrado");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Passo do Sobrado], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaPaverama() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaPaverama");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Paverama");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Paverama], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaPocodasAntas() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaPocodasAntas");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Poço das Antas");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Poço das Antas], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaPousoNovo() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaPousoNovo");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Pouso Novo");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Pouso Novo], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaProgresso() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaProgresso");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Progresso");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Progresso], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaPutinga() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaPutinga");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Putinga");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Putinga], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaRelvado() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaRelvado");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Relvado");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Relvado], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaRioPardo() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaRioPardo");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Rio Pardo");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Rio Pardo], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaRocaSales() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaRocaSales");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Roca Sales");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Roca Sales], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSantaClaradoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSantaClaradoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Santa Clara do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Santa Clara do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSantaCruzdoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSantaCruzdoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Santa Cruz do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Santa Cruz do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSegredo() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSegredo");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Segredo");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Segredo], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSerio() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSerio");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Serio");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Serio], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSinimbu() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSinimbu");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Sinimbu");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Sinimbu], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSobradinho() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSobradinho");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Sobradinho");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Sobradinho], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaTabai() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaTabai");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Tabaí");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Tabaí], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaTaquari() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaTaquari");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Taquari");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Taquari], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaTeutonia() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaTeutonia");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Teutônia");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Teutônia], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaTravesseiro() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaTravesseiro");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Travesseiro");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Travesseiro], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaTunas() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaTunas");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Tunas");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Tunas], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaValedoSol() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaValedoSol");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Vale do Sol");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Vale do Sol], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaValeVerde() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaValeVerde");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Vale Verde");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Vale Verde], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaVenancioAires() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaVenancioAires");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Venâncio Aires");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Venâncio Aires], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaVeraCruz() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaVeraCruz");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Vera Cruz");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Vera Cruz], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaVespasianoCorrea() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaVespasianoCorrea");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Vespasiano Correa");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Vespasiano Correa], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaWestfalia() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaWestfalia");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Westfalia");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Westfalia], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaAgudo() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaAgudo");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Agudo");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Agudo], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCacapavadoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCacapavadoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Caçapava do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Caçapava do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCacequi() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCacequi");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Cacequi");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Cacequi], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaDilermandodeAguiar() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaDilermandodeAguiar");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Dilermando de Aguiar");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Dilermando de Aguiar], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaDonaFrancisca() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaDonaFrancisca");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Dona Francisca");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Dona Francisca], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaFaxinaldoSoturno() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaFaxinaldoSoturno");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Faxinal do Soturno");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Faxinal do Soturno], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaFormigueiro() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaFormigueiro");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Formigueiro");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Formigueiro], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaItaara() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaItaara");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Itaara");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Itaara], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaIvora() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaIvora");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Ivora");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Ivora], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaJaguari() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaJaguari");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Jaguari");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Jaguari], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaJuliodeCastilhos() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaJuliodeCastilhos");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Júlio de Castilhos");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Júlio de Castilhos], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaMata() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaMata");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Mata");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Mata], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaNovaEsperancadoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaNovaEsperancadoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Nova Esperança do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Nova Esperança do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaNovaPalma() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaNovaPalma");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Nova Palma");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Nova Palma], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaParaisodoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaParaisodoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Paraíso do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Paraíso do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaPinhalGrande() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaPinhalGrande");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Pinhal Grande");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Pinhal Grande], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaQuevedos() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaQuevedos");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Quevedos");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Quevedos], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaRestingaSeca() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaRestingaSeca");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Restinga Seca");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Restinga Seca], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaRosariodoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaRosariodoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Rosário do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Rosário do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSantaMargaridadoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSantaMargaridadoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Santa Margarida do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Santa Margarida do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSantaMaria() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSantaMaria");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Santa Maria");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Santa Maria], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSantiago() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSantiago");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Santiago");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Santiago], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSaoFranciscodeAssis() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSaoFranciscodeAssis");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em São Francisco de Assis");
        engImoveis.executeQuery();
        assertEquals("{cidade=[São Francisco de Assis], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSaoGabriel() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSaoGabriel");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em São Gabriel");
        engImoveis.executeQuery();
        assertEquals("{cidade=[São Gabriel], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSaoJoaodoPolesine() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSaoJoaodoPolesine");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em São João do Polesine");
        engImoveis.executeQuery();
        assertEquals("{cidade=[São João do Polesine], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSaoMartinhodaSerra() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSaoMartinhodaSerra");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em São Martinho da Serra");
        engImoveis.executeQuery();
        assertEquals("{cidade=[São Martinho da Serra], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSaoPedrodoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSaoPedrodoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em São Pedro do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[São Pedro do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSaoSepe() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSaoSepe");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em São Sepé");
        engImoveis.executeQuery();
        assertEquals("{cidade=[São Sepé], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSaoVicentedoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSaoVicentedoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em São Vicente do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[São Vicente do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSilveiraMartins() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSilveiraMartins");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Silveira Martins");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Silveira Martins], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaToropi() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaToropi");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Toropi");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Toropi], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaVilaNovadoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaVilaNovadoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Vila Nova do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Vila Nova do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaAlecrim() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaAlecrim");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Alecrim");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Alecrim], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaAlegria() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaAlegria");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Alegria");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Alegria], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaBarradoGuarita() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaBarradoGuarita");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Barra do Guarita");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Barra do Guarita], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaBoaVistadoBurica() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaBoaVistadoBurica");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Boa Vista do Buricá");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Boa Vista do Buricá], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaBomProgresso() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaBomProgresso");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Bom Progresso");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Bom Progresso], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaBossoroca() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaBossoroca");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Bossoroca");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Bossoroca], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaBraga() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaBraga");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Braga");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Braga], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCaibate() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCaibate");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Caibate");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Caibate], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCampinadasMissoes() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCampinadasMissoes");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Campina das Missões");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Campina das Missões], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCampoNovo() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCampoNovo");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Campo Novo");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Campo Novo], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCandidoGodoi() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCandidoGodoi");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Candido Godói");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Candido Godói], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCapitao() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCapitao");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Capitão");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Capitão], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCerroLargo() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCerroLargo");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Cerro Largo");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Cerro Largo], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaChiapeta() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaChiapeta");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Chiapeta");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Chiapeta], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCoronelBicaco() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCoronelBicaco");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Coronel Bicaco");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Coronel Bicaco], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCrissiumal() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCrissiumal");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Crissiumal");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Crissiumal], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaDerrubadas() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaDerrubadas");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Derrubadas");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Derrubadas], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaDezesseisdeNovembro() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaDezesseisdeNovembro");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Dezesseis de Novembro");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Dezesseis de Novembro], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaDoisIrmaosdasMissoes() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaDoisIrmaosdasMissoes");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Dois Irmãos das Missões");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Dois Irmãos das Missões], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaDoutorMauricioCardoso() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaDoutorMauricioCardoso");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Doutor Maurício Cardoso");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Doutor Maurício Cardoso], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaErvalSeco() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaErvalSeco");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Erval Seco");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Erval Seco], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaEsperancadoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaEsperancadoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Esperança do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Esperança do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaEugeniodeCastro() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaEugeniodeCastro");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Eugênio de Castro");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Eugênio de Castro], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaGarruchos() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaGarruchos");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Garruchos");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Garruchos], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaGirua() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaGirua");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Giruá");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Giruá], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaHorizontina() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaHorizontina");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Horizontina");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Horizontina], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaHumaita() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaHumaita");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Humaitá");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Humaitá], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaIndependencia() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaIndependencia");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Independência");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Independência], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaInhacora() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaInhacora");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Inhacorã");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Inhacorã], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaMatoQueimado() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaMatoQueimado");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Mato Queimado");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Mato Queimado], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaMiraguai() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaMiraguai");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Miraguai");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Miraguai], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaNovaBrescia() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaNovaBrescia");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Nova Brescia");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Nova Brescia], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaNovaCandelaria() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaNovaCandelaria");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Nova Candelaria");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Nova Candelaria], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaNovoCabrais() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaNovoCabrais");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Novo Cabrais");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Novo Cabrais], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaNovoMachado() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaNovoMachado");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Novo Machado");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Novo Machado], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaPinheirinhodoVale() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaPinheirinhodoVale");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Pinheirinho do Vale");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Pinheirinho do Vale], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaPirapo() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaPirapo");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Pirapo");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Pirapo], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaPortoLucena() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaPortoLucena");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Porto Lucena");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Porto Lucena], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaPortoMaua() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaPortoMaua");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Porto Mauá");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Porto Mauá], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaPortoVeraCruz() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaPortoVeraCruz");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Porto Vera Cruz");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Porto Vera Cruz], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaPortoXavier() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaPortoXavier");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Porto Xavier");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Porto Xavier], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaRedentora() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaRedentora");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Redentora");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Redentora], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaRolador() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaRolador");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Rolador");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Rolador], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaRoqueGonzales() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaRoqueGonzales");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Roque Gonzales");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Roque Gonzales], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSalvadordasMissoes() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSalvadordasMissoes");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Salvador das Missões");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Salvador das Missões], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSantaRosa() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSantaRosa");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Santa Rosa");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Santa Rosa], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSantoangelo() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSantoangelo");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Santo Ângelo");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Santo Ângelo], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSantoAntoniodasMissoes() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSantoAntoniodasMissoes");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Santo Antônio das Missões");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Santo Antônio das Missões], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSantoAugusto() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSantoAugusto");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Santo Augusto");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Santo Augusto], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSantoCristo() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSantoCristo");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Santo Cristo");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Santo Cristo], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSaoJosedoInhacora() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSaoJosedoInhacora");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em São José do Inhacorã");
        engImoveis.executeQuery();
        assertEquals("{cidade=[São José do Inhacorã], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSaoLuizGonzaga() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSaoLuizGonzaga");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em São Luiz Gonzaga");
        engImoveis.executeQuery();
        assertEquals("{cidade=[São Luiz Gonzaga], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSaoMartinho() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSaoMartinho");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em São Martinho");
        engImoveis.executeQuery();
        assertEquals("{cidade=[São Martinho], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSaoMigueldasMissoes() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSaoMigueldasMissoes");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em São Miguel das Missões");
        engImoveis.executeQuery();
        assertEquals("{cidade=[São Miguel das Missões], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSaoNicolau() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSaoNicolau");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em São Nicolau");
        engImoveis.executeQuery();
        assertEquals("{cidade=[São Nicolau], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSaoPaulodasMissoes() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSaoPaulodasMissoes");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em São Paulo das Missões");
        engImoveis.executeQuery();
        assertEquals("{cidade=[São Paulo das Missões], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSaoPedrodoButia() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSaoPedrodoButia");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em São Pedro do Butia");
        engImoveis.executeQuery();
        assertEquals("{cidade=[São Pedro do Butia], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSaoValeriodoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSaoValeriodoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em São Valerio do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[São Valerio do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSedeNova() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSedeNova");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Sede Nova");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Sede Nova], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSenadorSalgadoFilho() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSenadorSalgadoFilho");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Senador Salgado Filho");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Senador Salgado Filho], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSetedeSetembro() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSetedeSetembro");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Sete de Setembro");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Sete de Setembro], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaTenentePortela() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaTenentePortela");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Tenente Portela");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Tenente Portela], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaTiradentesdoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaTiradentesdoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Tiradentes do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Tiradentes do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaTresdeMaio() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaTresdeMaio");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Três de Maio");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Três de Maio], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaTresPassos() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaTresPassos");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Três Passos");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Três Passos], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaTucunduva() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaTucunduva");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Tucunduva");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Tucunduva], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaTuparendi() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaTuparendi");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Tuparendi");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Tuparendi], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaUbiretama() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaUbiretama");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Ubiretama");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Ubiretama], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaVistaGaucha() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaVistaGaucha");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Vista Gaúcha");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Vista Gaúcha], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaVitoriadasMissoes() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaVitoriadasMissoes");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Vitória das Missões");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Vitória das Missões], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaAltoFeliz() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaAltoFeliz");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Alto Feliz");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Alto Feliz], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaAndredaRocha() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaAndredaRocha");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em André da Rocha");
        engImoveis.executeQuery();
        assertEquals("{cidade=[André da Rocha], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaAntonioPrado() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaAntonioPrado");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Antônio Prado");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Antônio Prado], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaBarao() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaBarao");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Barão");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Barão], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaBentoGoncalves() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaBentoGoncalves");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Bento Gonçalves");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Bento Gonçalves], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaBoaVistadoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaBoaVistadoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Boa Vista do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Boa Vista do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaBomJesus() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaBomJesus");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Bom Jesus");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Bom Jesus], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaBomPrincipio() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaBomPrincipio");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Bom Princípio");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Bom Princípio], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCambaradoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCambaradoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Cambará do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Cambará do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCampestredaSerra() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCampestredaSerra");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Campestre da Serra");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Campestre da Serra], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCanela() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCanela");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Canela");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Canela], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCarlosBarbosa() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCarlosBarbosa");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Carlos Barbosa");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Carlos Barbosa], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCaxiasdoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCaxiasdoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Caxias do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Caxias do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCoronelPilar() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCoronelPilar");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Coronel Pilar");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Coronel Pilar], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCotipora() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCotipora");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Cotipora");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Cotipora], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaFagundesVarela() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaFagundesVarela");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Fagundes Varela");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Fagundes Varela], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaFarroupilha() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaFarroupilha");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Farroupilha");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Farroupilha], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaFeliz() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaFeliz");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Feliz");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Feliz], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaFloresdaCunha() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaFloresdaCunha");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Flores da Cunha");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Flores da Cunha], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaGaribaldi() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaGaribaldi");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Garibaldi");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Garibaldi], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaGramado() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaGramado");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Gramado");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Gramado], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaIgrejinha() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaIgrejinha");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Igrejinha");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Igrejinha], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaIpe() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaIpe");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Ipe");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Ipe], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaJaquirana() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaJaquirana");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Jaquirana");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Jaquirana], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaLinhaNova() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaLinhaNova");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Linha Nova");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Linha Nova], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaMonteAlegredosCampos() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaMonteAlegredosCampos");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Monte Alegre dos Campos");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Monte Alegre dos Campos], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaMonteBelodoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaMonteBelodoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Monte Belo do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Monte Belo do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaMorroReuter() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaMorroReuter");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Morro Reuter");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Morro Reuter], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaNovaAraca() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaNovaAraca");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Nova Araça");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Nova Araça], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaNovaBassano() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaNovaBassano");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Nova Bassano");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Nova Bassano], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaNovaPadua() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaNovaPadua");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Nova Pádua");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Nova Pádua], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaNovaPetropolis() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaNovaPetropolis");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Nova Petrópolis");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Nova Petrópolis], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaNovaPrata() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaNovaPrata");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Nova Prata");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Nova Prata], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaNovaRomadoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaNovaRomadoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Nova Roma do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Nova Roma do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaParai() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaParai");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Parai");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Parai], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaPicadaCafe() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaPicadaCafe");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Picada Café");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Picada Café], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaPintoBandeira() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaPintoBandeira");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Pinto Bandeira");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Pinto Bandeira], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaProtasioAlves() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaProtasioAlves");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Protásio Alves");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Protásio Alves], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaRiozinho() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaRiozinho");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Riozinho");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Riozinho], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSalvadordoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSalvadordoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Salvador do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Salvador do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSantaMariadoHerval() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSantaMariadoHerval");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Santa Maria do Herval");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Santa Maria do Herval], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSantaTereza() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSantaTereza");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Santa Tereza");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Santa Tereza], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSaoFranciscodePaula() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSaoFranciscodePaula");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em São Francisco de Paula");
        engImoveis.executeQuery();
        assertEquals("{cidade=[São Francisco de Paula], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSaoJosedosAusentes() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSaoJosedosAusentes");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em São José dos Ausentes");
        engImoveis.executeQuery();
        assertEquals("{cidade=[São José dos Ausentes], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSaoMarcos() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSaoMarcos");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em São Marcos");
        engImoveis.executeQuery();
        assertEquals("{cidade=[São Marcos], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSaoPedrodaSerra() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSaoPedrodaSerra");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em São Pedro da Serra");
        engImoveis.executeQuery();
        assertEquals("{cidade=[São Pedro da Serra], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSaoVendelino() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSaoVendelino");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em São Vendelino");
        engImoveis.executeQuery();
        assertEquals("{cidade=[São Vendelino], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSerafinaCorrea() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSerafinaCorrea");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Serafina Correa");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Serafina Correa], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaVacaria() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaVacaria");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Vacaria");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Vacaria], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaValeReal() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaValeReal");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Vale Real");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Vale Real], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaVeranopolis() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaVeranopolis");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Veranópolis");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Veranópolis], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaVilaFlores() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaVilaFlores");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Vila Flores");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Vila Flores], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaAlegrete() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaAlegrete");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Alegrete");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Alegrete], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaBarradoQuarai() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaBarradoQuarai");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Barra do Quaraí");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Barra do Quaraí], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaItaqui() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaItaqui");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Itaqui");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Itaqui], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaLavrasdoSul() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaLavrasdoSul");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Lavras do Sul");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Lavras do Sul], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaMacambara() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaMacambara");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Macambara");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Macambara], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaManoelViana() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaManoelViana");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Manoel Viana");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Manoel Viana], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaQuarai() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaQuarai");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Quaraí");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Quaraí], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSantanadoLivramento() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSantanadoLivramento");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Santana do Livramento");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Santana do Livramento], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaUruguaiana() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaUruguaiana");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Uruguaiana");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Uruguaiana], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaArarica() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaArarica");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Araricá");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Araricá], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaBarradoRibeiro() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaBarradoRibeiro");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Barra do Ribeiro");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Barra do Ribeiro], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaButia() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaButia");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Butiá");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Butiá], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCampoBom() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCampoBom");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Campo Bom");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Campo Bom], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCapaodaPorteira() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCapaodaPorteira");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Capão da Porteira");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Capão da Porteira], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaCapeladeSantana() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaCapeladeSantana");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Capela de Santana");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Capela de Santana], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaDoisIrmaos() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaDoisIrmaos");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Dois Irmãos");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Dois Irmãos], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaEstanciaVelha() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaEstanciaVelha");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Estância Velha");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Estância Velha], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaIvoti() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaIvoti");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Ivoti");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Ivoti], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaMorungava() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaMorungava");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Morungava");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Morungava], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaNovaHartz() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaNovaHartz");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Nova Hartz");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Nova Hartz], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaNovoHamburgo() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaNovoHamburgo");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Novo Hamburgo");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Novo Hamburgo], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaParobe() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaParobe");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Parobé");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Parobé], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaPortao() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaPortao");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Portão");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Portão], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSaoLeopoldo() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSaoLeopoldo");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em São Leopoldo");
        engImoveis.executeQuery();
        assertEquals("{cidade=[São Leopoldo], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaSapiranga() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaSapiranga");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Sapiranga");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Sapiranga], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaTaquara() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaTaquara");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Taquara");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Taquara], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaTresCoroas() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>>  testConsultaTresCoroas");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("casa em Três Coroas");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Três Coroas], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

*/     
     
}
