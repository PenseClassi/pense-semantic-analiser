/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pense.produto.controller;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.query.Query;
import java.util.List;
import java.util.Map;
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

    public void testConsultaOntologia() {

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

    public void testConsultaOntologiaBaseadaEmDadosPense() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(">>>> testConsultaOntologiaBaseadaEmDadosPense");
        SemanticEngineImoveis engImoveis = new SemanticEngineImoveis();

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
