/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pense.produto.controller;

import junit.framework.TestCase;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Felipe_Noguez
 */
public class AbstractSemanticEngineTest extends TestCase {

    private static SemanticEngineImoveis engImoveis;
    
    public AbstractSemanticEngineTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        if (engImoveis == null){
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-semantic.xml");
            engImoveis = (SemanticEngineImoveis)context.getBean("engineSemantica");
        }
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    public void testConsultaOntologiaBaseadaEmDadosPenseQuartos() {

        System.out.println(">>>> testConsultaOntologiaBaseadaEmDadosPenseQuartos");
        ////SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();

        System.out.println("-*--------------------------------------------------------------------------");
        engImoveis.preparaConteudoBusca("Apartamento 1 dormitorio Porto Alegre");
        engImoveis.executeQuery();
        engImoveis.getResultsAsString();

        engImoveis.preparaConteudoBusca("apartamento 1 e 2 dormitorios em porto alegre");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Porto Alegre], Dormitórios=[1:2], Tipo de imóvel=[Apartamento]}", engImoveis.getResultsAsString());

        engImoveis.preparaConteudoBusca("apartamento 2 e 3 dormitorios em porto alegre");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Porto Alegre], Dormitórios=[2:3], Tipo de imóvel=[Apartamento]}", engImoveis.getResultsAsString());

        engImoveis.preparaConteudoBusca("apartamento 3 e 2 dormitorios em porto alegre");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Porto Alegre], Dormitórios=[2:3], Tipo de imóvel=[Apartamento]}", engImoveis.getResultsAsString());

        System.out.println("-*--------------------------------------------------------------------------");
        engImoveis.preparaConteudoBusca("apartamento 1, 2 e 3 dormitorios em porto alegre");
        engImoveis.executeQuery();
        engImoveis.getResultsAsString();

        engImoveis.preparaConteudoBusca("casa de madeira 3 e 2 dormitorios em porto alegre");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Porto Alegre], Dormitórios=[2:3], Tipo de imóvel=[Casa de madeira]}", engImoveis.getResultsAsString());

        engImoveis.preparaConteudoBusca("casa de madeira 3d e 2d em porto alegre");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Porto Alegre], Dormitórios=[2:3], Tipo de imóvel=[Casa de madeira]}", engImoveis.getResultsAsString());

        engImoveis.preparaConteudoBusca("apartamento 2 dormitórios em porto alegre");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Porto Alegre], Dormitórios=[2:2], Tipo de imóvel=[Apartamento]}", engImoveis.getResultsAsString());

        System.out.println("-*--------------------------------------------------------------------------");
        engImoveis.preparaConteudoBusca("apartamento 2 dormitorios porto alegre");
        engImoveis.executeQuery();
        engImoveis.getResultsAsString();

        engImoveis.preparaConteudoBusca("1 dormitorio em porto alegre");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Porto Alegre], Dormitórios=[1:1]}", engImoveis.getResultsAsString());

        engImoveis.preparaConteudoBusca("apartamento 3 dormitórios em porto alegre");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Porto Alegre], Dormitórios=[3:3], Tipo de imóvel=[Apartamento]}", engImoveis.getResultsAsString());

        engImoveis.preparaConteudoBusca("apartamento 2 e 3 dormitorios em porto alegre");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Porto Alegre], Dormitórios=[2:3], Tipo de imóvel=[Apartamento]}", engImoveis.getResultsAsString());

        engImoveis.preparaConteudoBusca("Casas 1 e 2 dormitórios em Joinville");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Joinville], Dormitórios=[1:2], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());

        engImoveis.preparaConteudoBusca("2 dormitorios com garagem em porto alegre");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Porto Alegre], Dormitórios=[2:2], Vagas de garagem=[1:]}", engImoveis.getResultsAsString());

        engImoveis.preparaConteudoBusca("apartamento mobiliado em porto alegre 2 dormitorios rs");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Porto Alegre], estado=[rio grande do sul], Características=[Mobiliado], Dormitórios=[2:2], Tipo de imóvel=[Apartamento]}", engImoveis.getResultsAsString());

        engImoveis.preparaConteudoBusca("casa 3 quartos em porto alegre");
        engImoveis.executeQuery();
        assertEquals("{cidade=[Porto Alegre], Dormitórios=[3:3], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());

        engImoveis.preparaConteudoBusca("apartamento 2 quartos");
        engImoveis.executeQuery();
        assertEquals("{Dormitórios=[2:2], Tipo de imóvel=[Apartamento]}", engImoveis.getResultsAsString());

//        System.out.println("-*--------------------------------------------------------------------------");
//        engImoveis.preparaConteudoBusca("apartamento de 01 dormitório em porto alegre");
//        engImoveis.executeQuery();
//        engImoveis.getResultsAsString();
    }

    public void testConsultaSaoFranciscoDePaulaComplexo() {

        System.out.println(">>>> testConsultaSaoFranciscoDePaulaComplexo");
        //SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();

        engImoveis.preparaConteudoBusca("casa em São Francisco de Paula com lareira, churrasqueira e play");
        engImoveis.executeQuery();
        assertEquals("{cidade=[São Francisco de Paula], Infraestrutura=[Playground], Características=[Lareira, Churrasqueira], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());

        engImoveis.preparaConteudoBusca("casa em São Francisco de Paula com 2d, lareira, churrasqueira e play");
        engImoveis.executeQuery();
        assertEquals("{cidade=[São Francisco de Paula], Infraestrutura=[Playground], Características=[Lareira, Churrasqueira], Dormitórios=[2:2], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());

        engImoveis.preparaConteudoBusca("casa em São Francisco de Paula com dois quartos, lareira, churrasqueira e play piscina zelador");
        engImoveis.executeQuery();
        assertEquals("{cidade=[São Francisco de Paula], Infraestrutura=[Zelador, Playground, Piscina], Características=[Lareira, Churrasqueira], Dormitórios=[2:2], Tipo de imóvel=[Casa]}", engImoveis.getResultsAsString());
    }

    public void testConsultaQuarto() {

        System.out.println(">>>>  testConsultaQuarto");
        //SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();

        engImoveis.preparaConteudoBusca("cobertura com 1 a 3 quartos");
        engImoveis.executeQuery();
        assertEquals("{Dormitórios=[1:3], Tipo de imóvel=[Cobertura]}", engImoveis.getResultsAsString());

//        
//        engImoveis.preparaConteudoBusca("cobertura com um a três quartos");
//        engImoveis.executeQuery();
//        //assertEquals("{Dormitórios=[1:3], Tipo de imóvel=[Cobertura]}", engImoveis.getResultsAsString());
//        engImoveis.getResultsAsString();
    }

    public void testBanheiroSuiteQuarto() {

        System.out.println(">>>>  testBanheiroSuiteQuarto");
        //SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();

        engImoveis.preparaConteudoBusca("cobertura com 2 a 3 dormitorios, 2 a 3 suites, 1 banheiro");
        engImoveis.executeQuery();
        assertEquals("{Banheiros=[1:], Dormitórios=[2:3], Suítes=[2:3], Tipo de imóvel=[Cobertura]}", engImoveis.getResultsAsString());
    }

    

    public void testComplexo() {
        System.out.println(">>>>  testComplexo");
        //SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();

        engImoveis.preparaConteudoBusca("cobertura com 2 a 3 dormitorios, 2 a 3 suites, banheiro com garagem piscina churrasqueira");
        engImoveis.executeQuery();
        assertEquals("{Banheiros=[1:], Infraestrutura=[Piscina], Características=[Churrasqueira], Dormitórios=[2:3], Suítes=[2:3], Vagas de garagem=[1:], Tipo de imóvel=[Cobertura]}", engImoveis.getResultsAsString());

        engImoveis.preparaConteudoBusca("cobertura com dormitorios, suites, banheiros com garagem piscina churrasqueira");
        engImoveis.executeQuery();
        assertEquals("{Banheiros=[1:], Infraestrutura=[Piscina], Características=[Churrasqueira], Dormitórios=[1:5], Suítes=[1:5], Vagas de garagem=[1:], Tipo de imóvel=[Cobertura]}", engImoveis.getResultsAsString());

        engImoveis.preparaConteudoBusca("2 a 3 dormitorios, 2 a 3 suites, banheiro com garagem piscina churrasqueira");
        engImoveis.executeQuery();
        assertEquals("{Banheiros=[1:], Infraestrutura=[Piscina], Características=[Churrasqueira], Dormitórios=[2:3], Suítes=[2:3], Vagas de garagem=[1:]}", engImoveis.getResultsAsString());

    }

    public void testMetragemExtenso() {
        System.out.println(">>>> testMetragemExtenso");
        //SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();

        engImoveis.preparaConteudoBusca("apartamento com 2mil metros quadrados ou 3mil metros quadrados");
        engImoveis.executeQuery();
        assertEquals("{Área total=[2000:3000M2], Tipo de imóvel=[Apartamento]}", engImoveis.getResultsAsString());

        engImoveis.preparaConteudoBusca("cobertura de R$ 300 mil");
        engImoveis.executeQuery();
        assertEquals("{Preço=[300000:300000], Tipo de imóvel=[Cobertura]}", engImoveis.getResultsAsString());

        engImoveis.preparaConteudoBusca("cobertura a partir de R$ 3mil com piscina");
        engImoveis.executeQuery();
        assertEquals("{Preço=[3000:], Infraestrutura=[Piscina], Tipo de imóvel=[Cobertura]}", engImoveis.getResultsAsString());

        engImoveis.preparaConteudoBusca("cobertura a partir de R$ 3 mil com piscina");
        engImoveis.executeQuery();
        assertEquals("{Preço=[3000:], Infraestrutura=[Piscina], Tipo de imóvel=[Cobertura]}", engImoveis.getResultsAsString());

        engImoveis.preparaConteudoBusca("cobertura entre 3 milhões e 4 milhões, com sacada");
        engImoveis.executeQuery();
        assertEquals("{Preço=[3000000:4000000], Características=[Sacada], Tipo de imóvel=[Cobertura]}", engImoveis.getResultsAsString());

        engImoveis.preparaConteudoBusca("cobertura entre 3 milhões e 4 milhões com sacada");
        engImoveis.executeQuery();
        assertEquals("{Preço=[3000000:4000000], Características=[Sacada], Tipo de imóvel=[Cobertura]}", engImoveis.getResultsAsString());

        engImoveis.preparaConteudoBusca("cobertura de R$ 3 mil até 4 milhões com sacada");
        engImoveis.executeQuery();
        assertEquals("{Preço=[3000:4000000], Características=[Sacada], Tipo de imóvel=[Cobertura]}", engImoveis.getResultsAsString());

        engImoveis.preparaConteudoBusca("cobertura de R$ 3 mil até R$ 4 milhões com sacada");
        engImoveis.executeQuery();
        assertEquals("{Preço=[3000:4000000], Características=[Sacada], Tipo de imóvel=[Cobertura]}", engImoveis.getResultsAsString());

        engImoveis.preparaConteudoBusca("apartamento com 2mil metros quadrados");
        engImoveis.executeQuery();
        assertEquals("{Área total=[2000:2000M2], Tipo de imóvel=[Apartamento]}", engImoveis.getResultsAsString());

        engImoveis.preparaConteudoBusca("apartamento com 2mil metros quadrados a partir de R$ 3 mil");
        engImoveis.executeQuery();
        assertEquals("{Preço=[3000:], Área total=[2000:2000M2], Tipo de imóvel=[Apartamento]}", engImoveis.getResultsAsString());

        engImoveis.preparaConteudoBusca("cobertura apartir de R$ 3mil até R$ 5mil");
        engImoveis.executeQuery();
        assertEquals("{Preço=[3000:5000], Tipo de imóvel=[Cobertura]}", engImoveis.getResultsAsString());

        engImoveis.preparaConteudoBusca("apartamento de R$300.000 a R$ 400.000,00");
        engImoveis.executeQuery();
        assertEquals("{Preço=[300000:400000], Tipo de imóvel=[Apartamento]}", engImoveis.getResultsAsString());
        

        String ret = "{Banheiros=[1:], cidade=[Porto Alegre], Preço=[:1000000], Infraestrutura=[Piscina], Características=[Churrasqueira], Vagas de garagem=[1:], Tipo de imóvel=[Casa]}";
        assertEquals(ret, engImoveis.obtemParametrosAsString("casa com piscina, churrasqueira, banheiro e garagem em poa, abaixo de R$1.000.000,00"));
        assertEquals(ret, engImoveis.obtemParametrosAsString("casa com piscina, churrasqueira, banheiro e garagem em poa, abaixo de R$ 1.000.000,00"));
        assertEquals(ret, engImoveis.obtemParametrosAsString("casa com piscina, churrasqueira, banheiro e garagem em poa, abaixo de 1.000.000,00"));

        ret = "{estado=[rio grande do sul], Tipo de imóvel=[Casa]}";
        assertEquals(ret, engImoveis.obtemParametrosAsString("casa no rio grande do sul"));
        assertEquals(ret, engImoveis.obtemParametrosAsString("casa em rio grande do sul"));  
    }
    
    public void testCidadeBairros(){
        System.out.println(">>>> testCidadeBairros");
        assertEquals("{cidade=[Porto Alegre], bairroCodigo=[3919], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casa em porto alegre na azenha")); 
        assertEquals("{cidade=[Canoas], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casa em canoas na azenha"));
    }
    
    public void testMaisDeMenosDe(){
        System.out.println(">>>> testMaisDeMenosDe");
        assertEquals("{Dormitórios=[2:5], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casa com mais de 2 quartos"));
        assertEquals("{Dormitórios=[1:4], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casa com menos de 4 quartos"));
        assertEquals("{Dormitórios=[2:5], Suítes=[2:3], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casa com mais de 2 quartos, de 2 a 3 suites"));
        assertEquals("{Dormitórios=[2:5], Suítes=[1:3], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casa com mais de 2 quartos, com menos de 3 suites"));
        assertEquals("{Dormitórios=[2:5], Suítes=[2:5], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casa com mais de 2 quartos, 2 ou mais suites"));
        assertEquals("{Dormitórios=[2:5], Suítes=[1:3], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casa com mais de 2 quartos, 3 ou menos suites"));
    }
    
    public void testBairros(){
        System.out.println(">>>> testBairros");
        assertEquals("{Tipo de imóvel=[Casa]}",engImoveis.obtemParametrosAsString("casa na azenha"));       
    }
    
    public void testInfra(){
        System.out.println(">>>> testInfra");
        assertEquals("{Infraestrutura=[Churrasqueira coletiva], Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("apartamento com churrasqueira coletiva"));
        assertEquals("{Infraestrutura=[Área de serviço], Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("apartamento com area de serviço"));
        assertEquals("{Infraestrutura=[Acesso para deficientes], Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("apartamento com acesso deficientes"));
        assertEquals("{Infraestrutura=[Acesso para deficientes], Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("apartamento com acesso para deficientes"));
        assertEquals("{Infraestrutura=[Acesso para deficientes], Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("apartamento com acesso de deficientes"));
        assertEquals("{Infraestrutura=[Academia / espaço fitness], Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("apartamento com espaço fitness"));
        assertEquals("{Infraestrutura=[Quadra esportiva], Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("apartamento com quadra esportiva"));
        assertEquals("{Infraestrutura=[Salão de festas], Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("apartamento com salão de festas"));
        assertEquals("{Infraestrutura=[Salão de festas], Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("apartamento com salao de festas"));
    }

    public void testMetrosQuadrados() {

        System.out.println(">>>> testMetrosQuadrados");
        //SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();

        engImoveis.preparaConteudoBusca("apartamento com 25m2 a partir de R$ 3 mil");
        engImoveis.executeQuery();
        assertEquals("{Preço=[3000:], Área total=[25:25M2], Tipo de imóvel=[Apartamento]}", engImoveis.getResultsAsString());

        engImoveis.preparaConteudoBusca("apartamento com 25 m2 a partir de R$ 3 mil");
        engImoveis.executeQuery();
        assertEquals("{Preço=[3000:], Área total=[25:25M2], Tipo de imóvel=[Apartamento]}", engImoveis.getResultsAsString());

        engImoveis.preparaConteudoBusca("apartamento com 25 m² a partir de R$ 3 mil");
        engImoveis.executeQuery();
        assertEquals("{Preço=[3000:], Área total=[25:25M2], Tipo de imóvel=[Apartamento]}", engImoveis.getResultsAsString());

        engImoveis.preparaConteudoBusca("apartamento com 25m² a partir de R$ 3 mil");
        engImoveis.executeQuery();
        assertEquals("{Preço=[3000:], Área total=[25:25M2], Tipo de imóvel=[Apartamento]}", engImoveis.getResultsAsString());

        engImoveis.geraParametros("apartamento com 25m² a partir de R$ 3 mil");
        assertEquals("{Preço=[3000:], Área total=[25:25M2], Tipo de imóvel=[Apartamento]}", engImoveis.getResultsAsString());

    }
    
    public void testFree(){
        System.out.println(">>>>  testFree");
        assertEquals("{Características=[Sacada], Vagas de garagem=[1:], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("Casa com sacada grande e garagem"));
    }

    public void testIntervalosValores() {

        System.out.println(">>>>  testIntervalosValores");
        //SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();
        engImoveis.preparaConteudoBusca("cobertura com 2 ou mais dormitorios");
        engImoveis.executeQuery();
        assertEquals("{Dormitórios=[2:5], Tipo de imóvel=[Cobertura]}", engImoveis.getResultsAsString());

        engImoveis.preparaConteudoBusca("cobertura com 2 ou menos dormitorios");
        engImoveis.executeQuery();
        assertEquals("{Dormitórios=[1:2], Tipo de imóvel=[Cobertura]}", engImoveis.getResultsAsString());

        engImoveis.preparaConteudoBusca("cobertura a partir de R$ 300 mil");
        engImoveis.executeQuery();
        assertEquals("{Preço=[300000:], Tipo de imóvel=[Cobertura]}", engImoveis.getResultsAsString());

        engImoveis.preparaConteudoBusca("cobertura acima de R$ 300 mil");
        engImoveis.executeQuery();
        assertEquals("{Preço=[300000:], Tipo de imóvel=[Cobertura]}", engImoveis.getResultsAsString());

        engImoveis.preparaConteudoBusca("cobertura acima de 300.000,00");
        engImoveis.executeQuery();
        assertEquals("{Preço=[300000:], Tipo de imóvel=[Cobertura]}", engImoveis.getResultsAsString());

        engImoveis.preparaConteudoBusca("cobertura abaixo de R$ 300 mil");
        engImoveis.executeQuery();
        assertEquals("{Preço=[:300000], Tipo de imóvel=[Cobertura]}", engImoveis.getResultsAsString());

        engImoveis.preparaConteudoBusca("cobertura até R$ 300 mil");
        engImoveis.executeQuery();
        assertEquals("{Preço=[:300000], Tipo de imóvel=[Cobertura]}", engImoveis.getResultsAsString());

        engImoveis.preparaConteudoBusca("apartamento até 200m2 e acima de R$ 1milhão");
        engImoveis.executeQuery();
        assertEquals("{Preço=[1000000:], Área total=[10:200M2], Tipo de imóvel=[Apartamento]}", engImoveis.getResultsAsString());

        engImoveis.preparaConteudoBusca("apartamento até 200m2 e acima de R$ 1.000.000,00");
        engImoveis.executeQuery();
        assertEquals("{Preço=[1000000:], Área total=[10:200M2], Tipo de imóvel=[Apartamento]}", engImoveis.getResultsAsString());

        engImoveis.preparaConteudoBusca("apartamento até 200 m2 e acima de R$ 1milhão");
        engImoveis.executeQuery();
        assertEquals("{Preço=[1000000:], Área total=[10:200M2], Tipo de imóvel=[Apartamento]}", engImoveis.getResultsAsString());
        
        assertEquals("{Características=[Churrasqueira], Dormitórios=[1:2], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casa com churrasqueira com até 2 quartos"));   
    }
    
    public void testIntervalosValores_01() {
        System.out.println(">>>>  testIntervalosValores_01");
        assertEquals("{Dormitórios=[1:2]}", engImoveis.obtemParametrosAsString("até 2 dormitórios"));  
    }
 
    public void testIntervalosValores_02() {
        System.out.println(">>>>  testIntervalosValores_02");
        assertEquals("{Dormitórios=[3:5]}", engImoveis.obtemParametrosAsString("com mais de 3 dormitórios"));  
    }
 
    public void testIntervalosValores_03() {
        System.out.println(">>>>  testIntervalosValores_03");
        assertEquals("{Dormitórios=[1:4]}", engImoveis.obtemParametrosAsString("com menos de 4 dormitórios"));  
    }
 
    public void testIntervalosValores_04() {
        System.out.println(">>>>  testIntervalosValores_04");
        assertEquals("{Dormitórios=[1:3]}", engImoveis.obtemParametrosAsString("de 1 a 3 dormitórios"));  
    }
 
    public void testIntervalosValores_05() {
        System.out.println(">>>>  testIntervalosValores_05");
        assertEquals("{Dormitórios=[2:4]}", engImoveis.obtemParametrosAsString("de 2 até 4 dormitórios"));  
    }
 
    public void testIntervalosValores_06() {
        System.out.println(">>>>  testIntervalosValores_06");
        assertEquals("{Dormitórios=[1:3]}", engImoveis.obtemParametrosAsString("com 1 e 3 dormitórios"));  
    }
 
    public void testIntervalosValores_07() {
        System.out.println(">>>>  testIntervalosValores_07");
        assertEquals("{Dormitórios=[2:4]}", engImoveis.obtemParametrosAsString("com 2 ou 4 dormitórios"));  
    }
 
    public void testIntervalosValores_08() {
        System.out.println(">>>>  testIntervalosValores_08");
        assertEquals("{Dormitórios=[1:3]}", engImoveis.obtemParametrosAsString("com 3 ou menos quartos"));  
    }
 
    public void testIntervalosValores_09() {
        System.out.println(">>>>  testIntervalosValores_09");
        assertEquals("{Dormitórios=[2:5]}", engImoveis.obtemParametrosAsString("com 2 ou mais quartos"));  
    }
 
    public void testIntervalosValores_10() {
        System.out.println(">>>>  testIntervalosValores_10");
        assertEquals("{Área total=[13:1000M2], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casa a partir de 13m²"));  
    }
 
    public void testIntervalosValores_11() {
        System.out.println(">>>>  testIntervalosValores_11");
assertEquals("{Área total=[13:1000M2], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casa acima de 13m²"));  
    }
 
    public void testIntervalosValores_12() {
        System.out.println(">>>>  testIntervalosValores_12");
assertEquals("{Área total=[10:30M2], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casa abaixo de 30m²"));  
    }
 
    public void testIntervalosValores_13() {
        System.out.println(">>>>  testIntervalosValores_13");
assertEquals("{Área total=[10:40M2], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casa até 40m²"));  
    }
 
    public void testIntervalosValores_14() {
        System.out.println(">>>>  testIntervalosValores_14");
assertEquals("{Área total=[50:50M2], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casa de 50m²"));  
    }
 
    public void testIntervalosValores_15() {
        System.out.println(">>>>  testIntervalosValores_15");
assertEquals("{Preço=[300000:], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casa a partir de R$ 300mil"));  
    }
 
    public void testIntervalosValores_16() {
        System.out.println(">>>>  testIntervalosValores_16");
        assertEquals("{Preço=[1000000:], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casa acima de R$ 1milhão"));  
    }
 
    public void testIntervalosValores_17() {
        System.out.println(">>>>  testIntervalosValores_17");
        assertEquals("{Preço=[1000000:], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casa acima de R$ 1milhao"));  
    }
 
    public void testIntervalosValores_18() {
        System.out.println(">>>>  testIntervalosValores_18");
        assertEquals("{Preço=[:1000000], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casa abaixo de R$ 1milhao"));  
    }
 
    public void testIntervalosValores_19() {
        System.out.println(">>>>  testIntervalosValores_19");
        assertEquals("{Preço=[:2000000], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casa até R$ 2milhao")); 
    }
}
