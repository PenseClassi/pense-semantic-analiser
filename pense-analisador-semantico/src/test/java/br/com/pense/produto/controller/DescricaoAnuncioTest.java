/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.pense.produto.controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Felipe_Noguez
 */
public class DescricaoAnuncioTest {
    
    private static SemanticEngineImoveis engImoveis;
    
    public DescricaoAnuncioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
     
    @Test
    public void CarregamentoOntologia() {
        System.out.println(">>> CarregamentoOntologia");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-semantic.xml");
        engImoveis = (SemanticEngineImoveis) context.getBean("engineSemantica");
    }
    
    @Test
    public void descricao_01(){
        System.out.println(">>>>  descricao_01");
        String descricao = "Venda de casa, outros, casa em condomínio, casa pré fabricada, casa de madeira, casa padrão, sobrado, casa pré moldada, chalé no bairro Moradas da Hípica em Porto Alegre RS";
        String resultado = "{Tipo de imóvel=[chalé, casa pré fabricada, Sobrado, Casa em condomínio, Casa de madeira, Casa]}";
        assertEquals(resultado, engImoveis.obtemParametrosAsString(descricao));  
    }
    
    @Test
    public void descricao_02(){
        System.out.println(">>>>  descricao_02");
        String descricao = "Linda casa mobiliada em condomínio fechado com 3 dormitórios sendo 3 suítes com linda vista para o mar, á 300 metros do mar. A casa possui Piscina, Hidromassagem, Sauna ,Churrasqueira, Lavanderia, Escritório e Hall de Entrada. ( confira mais imóveis em nosso site www.imobiliariaINVISTA.com.br ) Também possui: Armário embutido, Copa/cozinha, Despensa, Escritório/gabinete, Hidromassagem, Piscina, Portão eletrônico, Quintal, Sauna, Sistema de alarme, Sistema de segurança, Vigilância 24h, circuito de tv, depósito individual, guarita, hall, onibus próximo, portaria 24h, porteiro eletrônico, tv a cabo, varanda, área de convivência, área verde.";
        String resultado = "";
        assertEquals(resultado, engImoveis.obtemParametrosAsString(descricao));  
    }
}
