/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.pense.produto.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
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
public class MultiThreadsTest {
    
    private static final int NRO_THREADS = 1000;
    
    private static SemanticEngineImoveis engImoveis;
    
    public MultiThreadsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
//        if (engImoveis == null){
//            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-semantic.xml");
//            engImoveis = (SemanticEngineImoveis)context.getBean("engineSemantica");
//        }
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
        engImoveis = (SemanticEngineImoveis)context.getBean("engineSemantica");
    }
    
    @Test
    public void MultiThreads() {
        System.out.println(">>> MultiThreads: "+ NRO_THREADS);
        System.out.println("- Disparando threads!");
        SemanticEngineThread s;
        Thread t;
        List<Thread> lst = new ArrayList<Thread>();
        for (int i = 0; i< NRO_THREADS; i++){
            s = new SemanticEngineThread();
            s.setId(i);
            t = new Thread(s);
            lst.add(t);
            t.start();
        }  

        System.out.println("- Monitorando " + NRO_THREADS +" threads!");
        List<Thread> auxList = new ArrayList<Thread>();
        while (!lst.isEmpty()){
//            auxList.clear();
            auxList = new ArrayList<Thread>();
            for (Thread x: lst){
                if (x.isAlive()){
                    auxList.add(x);
                }
            }
            lst = auxList;
//            System.out.println("- "+ lst.size() +" ainda vivas.");
        }
        System.out.println("- Finalizado!");
    }
    
    private static class SemanticEngineThread implements Runnable {

        private int id;
        
        public void setId(int i){
            id = i;
        }
        
        @Override
        public void run() {
            Random gerador = new Random();
            int numero = gerador.nextInt(6);
            String texto = "", resultado = "";
            switch(numero){
                case 0: 
                    texto = "cobertura abaixo de R$ 300 mil";
                    resultado = "{Preço=[:300000], Tipo de imóvel=[Cobertura]}";
                    break;
                case 1: 
                    texto = "cobertura com 2 a 3 dormitorios, 2 a 3 suites, banheiro com garagem piscina churrasqueira";
                    resultado = "{Banheiros=[1:], Infraestrutura=[Piscina], Características=[Churrasqueira], Dormitórios=[2:3], Suítes=[2:3], Vagas de garagem=[1:], Tipo de imóvel=[Cobertura]}";
                    break;
                case 2: 
                    texto = "cobertura com dormitorios, suites, banheiros com garagem piscina churrasqueira";
                    resultado = "{Banheiros=[1:], Infraestrutura=[Piscina], Características=[Churrasqueira], Dormitórios=[1:5], Suítes=[1:5], Vagas de garagem=[1:], Tipo de imóvel=[Cobertura]}";
                    break;
                case 3: 
                    texto = "cobertura a partir de R$ 3mil com piscina";
                    resultado = "{Preço=[3000:], Infraestrutura=[Piscina], Tipo de imóvel=[Cobertura]}";
                    break;
                case 4: 
                    texto = "apartamento mobiliado em porto alegre 2 dormitorios rs";
                    resultado = "{cidade=[Porto Alegre], estado=[rio grande do sul], Características=[Mobiliado], Dormitórios=[2:2], Tipo de imóvel=[Apartamento]}";
                    break;  
                case 5: 
                    texto = "poa";
                    resultado = "{cidade=[Porto Alegre]}";
                    break; 
            }
//            System.out.println("-- Thread: " + id + " numero: "+ numero + " : " + engImoveis.obtemParametros(texto) + ": " + texto);
//            System.out.println("-- Thread: " + id + " numero: "+ numero + " : " + texto);
            try { 
//                assertEquals(resultado, engImoveis.getResultsAsString());
                assertEquals(resultado, engImoveis.obtemParametrosAsString(texto));
//                System.out.println("-- Thread: " + id + " OK");
            }catch (Exception e){
//                System.out.println("-- Thread: " + id + " Erro: obtido: " + engImoveis.getResultsAsString() + "aguardado: " + resultado);
            }
        }
        
    }
}
