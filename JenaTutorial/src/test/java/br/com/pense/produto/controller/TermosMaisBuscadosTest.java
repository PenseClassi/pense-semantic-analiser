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
public class TermosMaisBuscadosTest {

    private static SemanticEngineImoveis engImoveis;

    public TermosMaisBuscadosTest() {
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
    public void test_termo_01() {
        System.out.println(">>>>  test_termo_01");
        assertEquals("{cidade=[Porto Alegre]}", engImoveis.obtemParametrosAsString("Imoveis em Porto Alegre"));
        //assertEquals("", );
    }

    @Test
    public void test_termo_02() {
        System.out.println(">>>>  test_termo_02");
        assertEquals("{cidade=[Torres], Tipo de imóvel=[Casa]}",engImoveis.obtemParametrosAsString("Casas em Torres"));
    }

    @Test
    public void test_termo_03() {
        System.out.println(">>>>  test_termo_03");
        assertEquals("{cidade=[Capão da Canoa]}", engImoveis.obtemParametrosAsString("capao da canoa"));
    }

    @Test
    public void test_termo_04() {
        System.out.println(">>>>  test_termo_04");
        assertEquals("{cidade=[Tramandaí], Tipo de imóvel=[Casa]}",engImoveis.obtemParametrosAsString("Casas em Tramandai"));
    }

    @Test
    public void test_termo_05() {
        System.out.println(">>>>  test_termo_05");
        assertEquals("{cidade=[Itapema], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("Casas em Itapema"));
    }

    @Test
    public void test_termo_06() {
        System.out.println(">>>>  test_termo_06");
        assertEquals("{cidade=[Florianópolis], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("Casas em Florianópolis"));
    }

    @Test
    public void test_termo_07() {
        System.out.println(">>>>  test_termo_07");
        assertEquals("{cidade=[Porto Alegre], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("Casas em Porto Alegre"));
    }

    @Test
    public void test_termo_08() {
        System.out.println(">>>>  test_termo_08");
        assertEquals("{cidade=[Porto Alegre], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("Casas em Porto Alegre"));
    }

    @Test
    public void test_termo_09() {
        System.out.println(">>>>  test_termo_09");
        assertEquals("{cidade=[Xangri-Lá], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("Casas em Xangri la"));
    }

    @Test
    public void test_termo_10() {
        System.out.println(">>>>  test_termo_10");
        assertEquals("{cidade=[Bombinhas], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("Casas em Bombinhas"));
    }

    @Test
    public void test_termo_11() {
        System.out.println(">>>>  test_termo_11");
        assertEquals("{cidade=[Camboriú], Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("Apartamentos em Camboriu"));
    }

    @Test
    public void test_termo_12() {
        System.out.println(">>>>  test_termo_12");
        assertEquals("{cidade=[Garopaba], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("Casas em Garopaba"));
    }

    @Test
    public void test_termo_13() {
        System.out.println(">>>>  test_termo_13");
        assertEquals("{estado=[santa catarina]}", engImoveis.obtemParametrosAsString("Aluguel Temporada em SC"));
    }

    @Test
    public void test_termo_14() {
        System.out.println(">>>>  test_termo_14");
        assertEquals("{cidade=[Pelotas]}", engImoveis.obtemParametrosAsString("Imoveis em Pelotas"));
    }

    @Test
    public void test_termo_15() {
        System.out.println(">>>>  test_termo_15");
        assertEquals("{cidade=[Florianópolis], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("Casas em Florianópolis"));
    }

    @Test
    public void test_termo_16() {
        System.out.println(">>>>  test_termo_16");
        assertEquals("{cidade=[Torres]}", engImoveis.obtemParametrosAsString("torres"));
    }

    @Test
    public void test_termo_17() {
        System.out.println(">>>>  test_termo_17");
        assertEquals("{cidade=[Porto Alegre], Tipo de imóvel=[Jk / kitnet]}", engImoveis.obtemParametrosAsString("JK em Porto Alegre"));
    }

    @Test
    public void test_termo_18() {
        System.out.println(">>>>  test_termo_18");
        assertEquals("{cidade=[Porto Alegre], Dormitórios=[1:2], Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("Apartamento 1 e 2 dormitorios em Porto Alegre"));
    }

    @Test
    public void test_termo_19() {
        System.out.println(">>>>  test_termo_19");
        assertEquals("{cidade=[Porto Alegre], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casas em porto alegre"));
    }

    @Test
    public void test_termo_20() {
        System.out.println(">>>>  test_termo_20");
        assertEquals("{cidade=[Florianópolis], Tipo de imóvel=[Jk / kitnet]}", engImoveis.obtemParametrosAsString("kitinete em Florianópolis"));
    }

    @Test
    public void test_termo_21() {
        System.out.println(">>>>  test_termo_21");
        assertEquals("{cidade=[Florianópolis], Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("apartamento florianópolis"));
    }

    @Test
    public void test_termo_22() {
        System.out.println(">>>>  test_termo_22");
        assertEquals("{Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("Casas no litoral Norte"));
    }

    @Test
    public void test_termo_23() {
        System.out.println(">>>>  test_termo_23");
        assertEquals("{cidade=[Atlântida], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("Casas em Atlantida"));
    }

    @Test
    public void test_termo_24() {
        System.out.println(">>>>  test_termo_24");
        assertEquals("{Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("apartamento"));
    }

    @Test
    public void test_termo_25() {
        System.out.println(">>>>  test_termo_25");
        assertEquals("{cidade=[Capão Novo]}", engImoveis.obtemParametrosAsString("capão novo"));
    }

    @Test
    public void test_termo_26() {
        System.out.println(">>>>  test_termo_26");
        assertEquals("{}", engImoveis.obtemParametrosAsString("canasvieiras"));
    }

    @Test
    public void test_termo_27() {
        System.out.println(">>>>  test_termo_27");
        assertEquals("{estado=[rio grande do sul]}", engImoveis.obtemParametrosAsString("Aluguel Temporada no RS"));
    }

    @Test
    public void test_termo_28() {
        System.out.println(">>>>  test_termo_28");
        assertEquals("{cidade=[Florianópolis], Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("Apartamentos Florianópolis"));
    }

    @Test
    public void test_termo_29() {
        System.out.println(">>>>  test_termo_29");
        assertEquals("{Tipo de imóvel=[Cobertura]}", engImoveis.obtemParametrosAsString("cobertura porto alegre"));
    }

    @Test
    public void test_termo_30() {
        System.out.println(">>>>  test_termo_30");
        assertEquals("{cidade=[Joinville], Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("Apartamentos em Joinville"));
    }

    @Test
    public void test_termo_31() {
        System.out.println(">>>>  test_termo_31");
        assertEquals("{cidade=[Florianópolis], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("Casas em Florianopolis"));
    }

    @Test
    public void test_termo_32() {
        System.out.println(">>>>  test_termo_32");
        assertEquals("{cidade=[Blumenau], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("Casas em Blumenau"));
    }

    @Test
    public void test_termo_33() {
        System.out.println(">>>>  test_termo_33");
        assertEquals("{cidade=[Porto Alegre], Dormitórios=[1:2], Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("Apartamento 1 e 2 dormitorios em Porto Alegre"));
    }

    @Test
    public void test_termo_34() {
        System.out.println(">>>>  test_termo_34");
        assertEquals("{cidade=[Torres], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casas em torres"));
    }

    @Test
    public void test_termo_35() {
        System.out.println(">>>>  test_termo_35");
        assertEquals("{Tipo de imóvel=[Terreno]}", engImoveis.obtemParametrosAsString("terreno porto alegre"));
    }

    @Test
    public void test_termo_36() {
        System.out.println(">>>>  test_termo_36");
        assertEquals("{cidade=[Imbé], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("Casas em Imbe"));
    }

    @Test
    public void test_termo_37() {
        System.out.println(">>>>  test_termo_37");
        assertEquals("{cidade=[Florianópolis], Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("Apartamentos em Florianópolis"));
    }

    @Test
    public void test_termo_38() {
        System.out.println(">>>>  test_termo_38");
        assertEquals("{cidade=[Tramandaí], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casas em tramandai"));
    }

    @Test
    public void test_termo_39() {
        System.out.println(">>>>  test_termo_39");
        assertEquals("{cidade=[Joinville], Tipo de imóvel=[Terreno]}", engImoveis.obtemParametrosAsString("Terrenos em Joinville"));
    }

    @Test
    public void test_termo_40() {
        System.out.println(">>>>  test_termo_40");
        assertEquals("{Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casa"));
    }

    @Test
    public void test_termo_41() {
        System.out.println(">>>>  test_termo_41");
        assertEquals("{cidade=[Porto Alegre], Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("apartamento em porto alegre"));
    }

    @Test
    public void test_termo_42() {
        System.out.println(">>>>  test_termo_42");
        assertEquals("{cidade=[Palhoça], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("Casas em Palhoça"));
    }

    @Test
    public void test_termo_43() {
        System.out.println(">>>>  test_termo_43");
        assertEquals("{cidade=[Porto Alegre], Tipo de imóvel=[Jk / kitnet]}", engImoveis.obtemParametrosAsString("JK em Porto Alegre"));
    }

    @Test
    public void test_termo_44() {
        System.out.println(">>>>  test_termo_44");
        assertEquals("{cidade=[Porto Alegre], Dormitórios=[1:2], Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("apartamento 1 e 2 dormitorios em porto alegre"));
    }

    @Test
    public void test_termo_45() {
        System.out.println(">>>>  test_termo_45");
        assertEquals("{cidade=[Porto Alegre]}", engImoveis.obtemParametrosAsString("Imoveis em Porto Alegre"));
    }

    @Test
    public void test_termo_46() {
        System.out.println(">>>>  test_termo_46");
        assertEquals("{cidade=[Florianópolis], Tipo de imóvel=[Terreno]}", engImoveis.obtemParametrosAsString("Terrenos em Florianópolis"));
    }

    @Test
    public void test_termo_47() {
        System.out.println(">>>>  test_termo_47");
        assertEquals("{cidade=[Porto Alegre], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casa em porto alegre"));
    }

    @Test
    public void test_termo_48() {
        System.out.println(">>>>  test_termo_48");
        assertEquals("{Tipo de imóvel=[Sítio]}", engImoveis.obtemParametrosAsString("propriedade+rural sitio"));
    }

    @Test
    public void test_termo_49() {
        System.out.println(">>>>  test_termo_49");
        assertEquals("{cidade=[Florianópolis], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casa em florianopolis"));
    }

    @Test
    public void test_termo_50() {
        System.out.println(">>>>  test_termo_50");
        assertEquals("{cidade=[Bombinhas]}", engImoveis.obtemParametrosAsString("bombinhas"));
    }

    @Test
    public void test_termo_51() {
        System.out.println(">>>>  test_termo_51");
        assertEquals("{cidade=[Porto Alegre], Dormitórios=[1:2], Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("apartamento 1 e 2 dormitorios em porto alegre"));
    }

    @Test
    public void test_termo_52() {
        System.out.println(">>>>  test_termo_52");
        assertEquals("{cidade=[Joinville], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("Casas em Joinville"));
    }

    @Test
    public void test_termo_53() {
        System.out.println(">>>>  test_termo_53");
        assertEquals("{cidade=[Porto Alegre], Tipo de imóvel=[Loja]}", engImoveis.obtemParametrosAsString("Loja Comercial em Porto Alegre"));
    }

    @Test
    public void test_termo_54() {
        System.out.println(">>>>  test_termo_54");
        assertEquals("{cidade=[Atlântida Sul], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("Casas em Atlantida Sul"));
    }

    @Test
    public void test_termo_55() {
        System.out.println(">>>>  test_termo_55");
        assertEquals("{cidade=[Bombinhas]}", engImoveis.obtemParametrosAsString("bombinhas"));
    }

    @Test
    public void test_termo_56() {
        System.out.println(">>>>  test_termo_56");
        assertEquals("{cidade=[Porto Alegre], Tipo de imóvel=[Sobrado]}", engImoveis.obtemParametrosAsString("sobrado em porto alegre"));
    }

    @Test
    public void test_termo_57() {
        System.out.println(">>>>  test_termo_57");
        assertEquals("{cidade=[Florianópolis]}", engImoveis.obtemParametrosAsString("imoveis em florianopolis"));
    }

    @Test
    public void test_termo_58() {
        System.out.println(">>>>  test_termo_58");
        assertEquals("{cidade=[Tramandaí]}", engImoveis.obtemParametrosAsString("tramandai"));
    }

    @Test
    public void test_termo_59() {
        System.out.println(">>>>  test_termo_59");
        assertEquals("{cidade=[Criciúma]}", engImoveis.obtemParametrosAsString("Imóveis Criciuma"));
    }

    @Test
    public void test_termo_60() {
        System.out.println(">>>>  test_termo_60");
        assertEquals("{cidade=[Porto Alegre], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casas em porto alegre"));
    }

    @Test
    public void test_termo_61() {
        System.out.println(">>>>  test_termo_61");
        assertEquals("{}", engImoveis.obtemParametrosAsString("imoveis"));
    }

    @Test
    public void test_termo_62() {
        System.out.println(">>>>  test_termo_62");
        assertEquals("{cidade=[São Gabriel], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("Casas em Sao Gabriel"));
    }

    @Test
    public void test_termo_63() {
        System.out.println(">>>>  test_termo_63");
        assertEquals("{Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("Apartamentos no centro de Florianópolis"));
    }

    @Test
    public void test_termo_64() {
        System.out.println(">>>>  test_termo_64");
        assertEquals("{cidade=[Florianópolis], Tipo de imóvel=[Cobertura]}", engImoveis.obtemParametrosAsString("cobertura florianópolis"));
    }

    @Test
    public void test_termo_65() {
        System.out.println(">>>>  test_termo_65");
        assertEquals("{cidade=[Palhoça]}", engImoveis.obtemParametrosAsString("palhoça"));
    }

    @Test
    public void test_termo_66() {
        System.out.println(">>>>  test_termo_66");
        assertEquals("{cidade=[Florianópolis], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casas em florianópolis"));
    }

    @Test
    public void test_termo_67() {
        System.out.println(">>>>  test_termo_67");
        assertEquals("{Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("alugar casa"));
    }

    @Test
    public void test_termo_68() {
        System.out.println(">>>>  test_termo_68");
        assertEquals("{cidade=[Gramado]}", engImoveis.obtemParametrosAsString("gramado"));
    }

    @Test
    public void test_termo_69() {
        System.out.println(">>>>  test_termo_69");
        assertEquals("{}", engImoveis.obtemParametrosAsString("ingleses"));
    }

    @Test
    public void test_termo_70() {
        System.out.println(">>>>  test_termo_70");
        assertEquals("{}", engImoveis.obtemParametrosAsString("bombas"));
    }

    @Test
    public void test_termo_71() {
        System.out.println(">>>>  test_termo_71");
        assertEquals("{cidade=[Porto Alegre], Dormitórios=[1:1], Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("Apartamento 1 dormitorio Porto Alegre"));
    }

    @Test
    public void test_termo_72() {
        System.out.println(">>>>  test_termo_72");
        assertEquals("{Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("apartamento"));
    }

    @Test
    public void test_termo_73() {
        System.out.println(">>>>  test_termo_73");
        assertEquals("{cidade=[Garopaba]}", engImoveis.obtemParametrosAsString("garopaba"));
    }

    @Test
    public void test_termo_74() {
        System.out.println(">>>>  test_termo_74");
        assertEquals("{Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("Casas nos Ingleses"));
    }

    @Test
    public void test_termo_75() {
        System.out.println(">>>>  test_termo_75");
        assertEquals("{}", engImoveis.obtemParametrosAsString("Zona Norte Porto Alegre"));
    }

    @Test
    public void test_termo_76() {
        System.out.println(">>>>  test_termo_76");
        assertEquals("{}", engImoveis.obtemParametrosAsString("imóvel na planta porto alegre"));
    }

    @Test
    public void test_termo_77() {
        System.out.println(">>>>  test_termo_77");
        assertEquals("{cidade=[Cidreira]}", engImoveis.obtemParametrosAsString("cidreira"));
    }

    @Test
    public void test_termo_78() {
        System.out.println(">>>>  test_termo_78");
        assertEquals("{cidade=[Porto Alegre], Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("apartamento em porto alegre"));
    }

    @Test
    public void test_termo_79() {
        System.out.println(">>>>  test_termo_79");
        assertEquals("{estado=[rio grande do sul], Tipo de imóvel=[Terreno]}", engImoveis.obtemParametrosAsString("terreno rs"));
    }

    @Test
    public void test_termo_80() {
        System.out.println(">>>>  test_termo_80");
        assertEquals("{cidade=[Camboriú]}", engImoveis.obtemParametrosAsString("imóveis Balneário Camboriú"));
    }

    @Test
    public void test_termo_81() {
        System.out.println(">>>>  test_termo_81");
        assertEquals("{cidade=[Porto Alegre], Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("Apartamento em Porto Alegre"));
    }

    @Test
    public void test_termo_82() {
        System.out.println(">>>>  test_termo_82");
        assertEquals("{}", engImoveis.obtemParametrosAsString("propriedade+rural caxias+do sul"));
    }

    @Test
    public void test_termo_83() {
        System.out.println(">>>>  test_termo_83");
        assertEquals("{cidade=[Florianópolis], Dormitórios=[2:3], Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("Apartamentos 2 e 3 dormitórios em Florianópolis"));
    }

    @Test
    public void test_termo_84() {
        System.out.println(">>>>  test_termo_84");
        assertEquals("{cidade=[Porto Alegre], Dormitórios=[2:2], Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("apartamento 2 dormitórios em porto alegre"));
    }

    @Test
    public void test_termo_85() {
        System.out.println(">>>>  test_termo_85");
        assertEquals("{Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casa em santa maria rs"));
    }

    @Test
    public void test_termo_86() {
        System.out.println(">>>>  test_termo_86");
        assertEquals("{regiao=[Litoral]}", engImoveis.obtemParametrosAsString("imóvel litoral santa catarina"));
    }

    @Test
    public void test_termo_87() {
        System.out.println(">>>>  test_termo_87");
        assertEquals("{cidade=[Bagé]}", engImoveis.obtemParametrosAsString("Imóveis em Bage"));
    }

    @Test
    public void test_termo_88() {
        System.out.println(">>>>  test_termo_88");
        assertEquals("{cidade=[Capão da Canoa], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casas em capao da canoa"));
    }

    @Test
    public void test_termo_89() {
        System.out.println(">>>>  test_termo_89");
        assertEquals("{Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("apartamento porto alegre"));
    }

    @Test
    public void test_termo_90() {
        System.out.println(">>>>  test_termo_90");
        assertEquals("{cidade=[Porto Alegre], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casa em porto alegre"));
    }

    @Test
    public void test_termo_91() {
        System.out.println(">>>>  test_termo_91");
        assertEquals("{Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casa"));
    }

    @Test
    public void test_termo_92() {
        System.out.println(">>>>  test_termo_92");
        assertEquals("{Tipo de imóvel=[Terreno]}", engImoveis.obtemParametrosAsString("terreno a venda"));
    }

    @Test
    public void test_termo_93() {
        System.out.println(">>>>  test_termo_93");
        assertEquals("{cidade=[Tramandaí]}", engImoveis.obtemParametrosAsString("tramandaí"));
    }

    @Test
    public void test_termo_94() {
        System.out.println(">>>>  test_termo_94");
        assertEquals("{Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("Casas em Jurere Internacional"));
    }

    @Test
    public void test_termo_95() {
        System.out.println(">>>>  test_termo_95");
        assertEquals("{cidade=[São Leopoldo]}", engImoveis.obtemParametrosAsString("Imoveis em Sao Leopoldo"));
    }

    @Test
    public void test_termo_96() {
        System.out.println(">>>>  test_termo_96");
        assertEquals("{Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("Apartamento"));
    }

    @Test
    public void test_termo_97() {
        System.out.println(">>>>  test_termo_97");
        assertEquals("{Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("Apartamentos em Jurere"));
    }

    @Test
    public void test_termo_98() {
        System.out.println(">>>>  test_termo_98");
        assertEquals("{Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("Apartamento N"));
    }

    @Test
    public void test_termo_99() {
        System.out.println(">>>>  test_termo_99");
        assertEquals("{cidade=[Porto Alegre], Dormitórios=[1:1], Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("apartamento 1 dormitorio porto alegre"));
    }

    @Test
    public void test_termo_100() {
        System.out.println(">>>>  test_termo_100");
        assertEquals("{cidade=[Florianópolis], Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("apartamentos em florianópolis"));
    }

    @Test
    public void test_termo_101() {
        System.out.println(">>>>  test_termo_101");
        assertEquals("{Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("Casa N"));
    }

    @Test
    public void test_termo_102() {
        System.out.println(">>>>  test_termo_102");
        assertEquals("{cidade=[Xangri-Lá]}", engImoveis.obtemParametrosAsString("xangri la"));
    }

    @Test
    public void test_termo_103() {
        System.out.println(">>>>  test_termo_103");
        assertEquals("{Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casa a venda"));
    }

    @Test
    public void test_termo_104() {
        System.out.println(">>>>  test_termo_104");
        assertEquals("{cidade=[Arroio do Sal]}", engImoveis.obtemParametrosAsString("arroio do sal"));
    }

    @Test
    public void test_termo_105() {
        System.out.println(">>>>  test_termo_105");
        assertEquals("{Tipo de imóvel=[Terreno]}", engImoveis.obtemParametrosAsString("Terreno N"));
    }

    @Test
    public void test_termo_106() {
        System.out.println(">>>>  test_termo_106");
        assertEquals("{cidade=[Porto Alegre], Dormitórios=[3:3], Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("apartamento 3 dormitorios em porto alegre"));
    }

    @Test
    public void test_termo_107() {
        System.out.println(">>>>  test_termo_107");
        assertEquals("{}", engImoveis.obtemParametrosAsString("zona sul porto alegre"));
    }

    @Test
    public void test_termo_108() {
        System.out.println(">>>>  test_termo_108");
        assertEquals("{cidade=[Porto Alegre], Tipo de imóvel=[Sala Comercial]}", engImoveis.obtemParametrosAsString("sala comercial em porto alegre"));
    }

    @Test
    public void test_termo_109() {
        System.out.println(">>>>  test_termo_109");
        assertEquals("{Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("Casas na Ferrugem"));
    }

    @Test
    public void test_termo_110() {
        System.out.println(">>>>  test_termo_110");
        assertEquals("{cidade=[Porto Alegre], Dormitórios=[2:2], Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("apartamento 2 dormitorios porto alegre"));
    }

    @Test
    public void test_termo_111() {
        System.out.println(">>>>  test_termo_111");
        assertEquals("{cidade=[Xangri-Lá], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casas em xangri la"));
    }

    @Test
    public void test_termo_112() {
        System.out.println(">>>>  test_termo_112");
        assertEquals("{cidade=[Torres], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("Casas em Torres"));
    }

    @Test
    public void test_termo_113() {
        System.out.println(">>>>  test_termo_113");
        assertEquals("{Tipo de imóvel=[Terreno]}", engImoveis.obtemParametrosAsString("terreno"));
    }

    @Test
    public void test_termo_114() {
        System.out.println(">>>>  test_termo_114");
        assertEquals("{cidade=[Florianópolis]}", engImoveis.obtemParametrosAsString("Imoveis em Florianopolis"));
    }

    @Test
    public void test_termo_115() {
        System.out.println(">>>>  test_termo_115");
        assertEquals("{Tipo de imóvel=[Sobrado]}", engImoveis.obtemParametrosAsString("caxias do sul sobrado"));
    }

    @Test
    public void test_termo_116() {
        System.out.println(">>>>  test_termo_116");
        assertEquals("{cidade=[Porto Alegre], Tipo de imóvel=[Cobertura]}", engImoveis.obtemParametrosAsString("cobertura em porto alegre"));
    }

    @Test
    public void test_termo_117() {
        System.out.println(">>>>  test_termo_117");
        assertEquals("{cidade=[Florianópolis], Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("Apartamentos em Florianópolis"));
    }

    @Test
    public void test_termo_118() {
        System.out.println(">>>>  test_termo_118");
        assertEquals("{estado=[rio grande do sul], Tipo de imóvel=[Sítio, Chácara]}", engImoveis.obtemParametrosAsString("sitios e chacaras no rs"));
    }

    @Test
    public void test_termo_119() {
        System.out.println(">>>>  test_termo_119");
        assertEquals("{}", engImoveis.obtemParametrosAsString("imoveis N"));
    }

    @Test
    public void test_termo_120() {
        System.out.println(">>>>  test_termo_120");
        assertEquals("{Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casa porto alegre"));
    }

    @Test
    public void test_termo_121() {
        System.out.println(">>>>  test_termo_121");
        assertEquals("{Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casa na zona sul"));
    }

    @Test
    public void test_termo_122() {
        System.out.println(">>>>  test_termo_122");
        assertEquals("{cidade=[Florianópolis], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("Casas em Florianopolis"));
    }

    @Test
    public void test_termo_123() {
        System.out.println(">>>>  test_termo_123");
        assertEquals("{cidade=[Porto Alegre]}", engImoveis.obtemParametrosAsString("porto alegre"));
    }

    @Test
    public void test_termo_124() {
        System.out.println(">>>>  test_termo_124");
        assertEquals("{Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casa"));
    }

    @Test
    public void test_termo_125() {
        System.out.println(">>>>  test_termo_125");
        assertEquals("{cidade=[Itapema]}", engImoveis.obtemParametrosAsString("itapema"));
    }

    @Test
    public void test_termo_126() {
        System.out.println(">>>>  test_termo_126");
        assertEquals("{cidade=[Blumenau], Tipo de imóvel=[Sobrado]}", engImoveis.obtemParametrosAsString("sobrado em blumenau"));
    }

    @Test
    public void test_termo_127() {
        System.out.println(">>>>  test_termo_127");
        assertEquals("{cidade=[Caxias do Sul], Tipo de imóvel=[Sobrado]}", engImoveis.obtemParametrosAsString("sobrado em caxias do sul"));
    }

    @Test
    public void test_termo_128() {
        System.out.println(">>>>  test_termo_128");
        assertEquals("{cidade=[Florianópolis], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casas em florianópolis"));
    }

    @Test
    public void test_termo_129() {
        System.out.println(">>>>  test_termo_129");
        assertEquals("{cidade=[Itapema]}", engImoveis.obtemParametrosAsString("itapema"));
    }

    @Test
    public void test_termo_130() {
        System.out.println(">>>>  test_termo_130");
        assertEquals("{cidade=[Porto Alegre], Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("apartamento,,,,,,, porto alegre"));
    }

    @Test
    public void test_termo_131() {
        System.out.println(">>>>  test_termo_131");
        assertEquals("{cidade=[Gramado]}", engImoveis.obtemParametrosAsString("gramado"));
    }

    @Test
    public void test_termo_132() {
        System.out.println(">>>>  test_termo_132");
        assertEquals("{cidade=[Viamão]}", engImoveis.obtemParametrosAsString("Viamão"));
    }

    @Test
    public void test_termo_133() {
        System.out.println(">>>>  test_termo_133");
        assertEquals("{cidade=[Gravataí]}", engImoveis.obtemParametrosAsString("gravataí"));
    }

    @Test
    public void test_termo_134() {
        System.out.println(">>>>  test_termo_134");
        assertEquals("{Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("Casa S"));
    }

    @Test
    public void test_termo_135() {
        System.out.println(">>>>  test_termo_135");
        assertEquals("{cidade=[Tramandaí], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("Casas em Tramandai"));
    }

    @Test
    public void test_termo_136() {
        System.out.println(">>>>  test_termo_136");
        assertEquals("{cidade=[Nova Santa Rita]}", engImoveis.obtemParametrosAsString("Imoveis em nova santa rita"));
    }

    @Test
    public void test_termo_137() {
        System.out.println(">>>>  test_termo_137");
        assertEquals("{Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("locar casa"));
    }

    @Test
    public void test_termo_138() {
        System.out.println(">>>>  test_termo_138");
        assertEquals("{cidade=[Porto Alegre], Tipo de imóvel=[Sobrado]}", engImoveis.obtemParametrosAsString("sobrado em porto alegre"));
    }

    @Test
    public void test_termo_139() {
        System.out.println(">>>>  test_termo_139");
        assertEquals("{cidade=[Capão da Canoa]}", engImoveis.obtemParametrosAsString("capao da canoa"));
    }

    @Test
    public void test_termo_140() {
        System.out.println(">>>>  test_termo_140");
        assertEquals("{Tipo de imóvel=[Loft]}", engImoveis.obtemParametrosAsString("loft porto alegre"));
    }

    @Test
    public void test_termo_141() {
        System.out.println(">>>>  test_termo_141");
        assertEquals("{cidade=[Florianópolis], Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("apartamento em florianopolis"));
    }

    @Test
    public void test_termo_142() {
        System.out.println(">>>>  test_termo_142");
        assertEquals("{cidade=[Joinville]}", engImoveis.obtemParametrosAsString("Comercial em Joinville"));
    }

    @Test
    public void test_termo_143() {
        System.out.println(">>>>  test_termo_143");
        assertEquals("{cidade=[Porto Alegre], Tipo de imóvel=[Terreno]}", engImoveis.obtemParametrosAsString("terreno em porto alegre"));
    }

    @Test
    public void test_termo_144() {
        System.out.println(">>>>  test_termo_144");
        assertEquals("{estado=[rio grande do sul], regiao=[Litoral]}", engImoveis.obtemParametrosAsString("litoral rs"));
    }

    @Test
    public void test_termo_145() {
        System.out.println(">>>>  test_termo_145");
        assertEquals("{Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("Casa"));
    }

    @Test
    public void test_termo_146() {
        System.out.println(">>>>  test_termo_146");
        assertEquals("{Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("Apartamento S"));
    }

    @Test
    public void test_termo_147() {
        System.out.println(">>>>  test_termo_147");
        assertEquals("{cidade=[Florianópolis], Tipo de imóvel=[Terreno]}", engImoveis.obtemParametrosAsString("terrenos em florianópolis"));
    }

    @Test
    public void test_termo_148() {
        System.out.println(">>>>  test_termo_148");
        assertEquals("{cidade=[Atlântida]}", engImoveis.obtemParametrosAsString("atlantida"));
    }

    @Test
    public void test_termo_149() {
        System.out.println(">>>>  test_termo_149");
        assertEquals("{Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("Apartamento"));
    }

    @Test
    public void test_termo_150() {
        System.out.println(">>>>  test_termo_150");
        assertEquals("{}", engImoveis.obtemParametrosAsString("zona norte porto alegre"));
    }

    @Test
    public void test_termo_151() {
        System.out.println(">>>>  test_termo_151");
        assertEquals("{}", engImoveis.obtemParametrosAsString("imoveis N"));
    }

    @Test
    public void test_termo_152() {
        System.out.println(">>>>  test_termo_152");
        assertEquals("{Tipo de imóvel=[Terreno]}", engImoveis.obtemParametrosAsString("Terreno S"));
    }

    @Test
    public void test_termo_153() {
        System.out.println(">>>>  test_termo_153");
        assertEquals("{Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("Apartamento N"));
    }

    @Test
    public void test_termo_154() {
        System.out.println(">>>>  test_termo_154");
        assertEquals("{cidade=[Canoas], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casa em canoas"));
    }

    @Test
    public void test_termo_155() {
        System.out.println(">>>>  test_termo_155");
        assertEquals("{Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("Casa N"));
    }

    @Test
    public void test_termo_156() {
        System.out.println(">>>>  test_termo_156");
        assertEquals("{}", engImoveis.obtemParametrosAsString("xangrilá"));
    }

    @Test
    public void test_termo_157() {
        System.out.println(">>>>  test_termo_157");
        assertEquals("{Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("apartamento porto alegre"));
    }

    @Test
    public void test_termo_158() {
        System.out.println(">>>>  test_termo_158");
        assertEquals("{Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("locar apartamento"));
    }

    @Test
    public void test_termo_159() {
        System.out.println(">>>>  test_termo_159");
        assertEquals("{cidade=[Porto Alegre], Tipo de imóvel=[Casa em condomínio]}", engImoveis.obtemParametrosAsString("casa em condominio fechado em porto alegre"));
    }

    @Test
    public void test_termo_160() {
        System.out.println(">>>>  test_termo_160");
        assertEquals("{}", engImoveis.obtemParametrosAsString("mansão"));
    }

    @Test
    public void test_termo_161() {
        System.out.println(">>>>  test_termo_161");
        assertEquals("{cidade=[Torres], estado=[rio grande do sul]}", engImoveis.obtemParametrosAsString("torres rs"));
    }

    @Test
    public void test_termo_162() {
        System.out.println(">>>>  test_termo_162");
        assertEquals("{}", engImoveis.obtemParametrosAsString("imoveis em punta del este"));
    }

    @Test
    public void test_termo_163() {
        System.out.println(">>>>  test_termo_163");
        assertEquals("{}", engImoveis.obtemParametrosAsString("imoveis S"));
    }

    @Test
    public void test_termo_164() {
        System.out.println(">>>>  test_termo_164");
        assertEquals("{cidade=[Florianópolis], Infraestrutura=[Piscina], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("Casas com piscina em Florianópolis"));
    }

    @Test
    public void test_termo_165() {
        System.out.println(">>>>  test_termo_165");
        assertEquals("{cidade=[Florianópolis], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casa florianopolis"));
    }

    @Test
    public void test_termo_166() {
        System.out.println(">>>>  test_termo_166");
        assertEquals("{cidade=[Porto Alegre], Tipo de imóvel=[Jk / kitnet]}", engImoveis.obtemParametrosAsString("jk em porto alegre"));
    }

    @Test
    public void test_termo_167() {
        System.out.println(">>>>  test_termo_167");
        assertEquals("{cidade=[Balneário Camboriú], estado=[santa catarina]}", engImoveis.obtemParametrosAsString("balneario camboriu sc"));
    }

    @Test
    public void test_termo_168() {
        System.out.println(">>>>  test_termo_168");
        assertEquals("{cidade=[Porto Alegre]}", engImoveis.obtemParametrosAsString("porto alegre"));
    }

    @Test
    public void test_termo_169() {
        System.out.println(">>>>  test_termo_169");
        assertEquals("{cidade=[Capão Novo]}", engImoveis.obtemParametrosAsString("capao novo"));
    }

    @Test
    public void test_termo_170() {
        System.out.println(">>>>  test_termo_170");
        assertEquals("{cidade=[Joinville]}", engImoveis.obtemParametrosAsString("joinville geminados"));
    }

    @Test
    public void test_termo_171() {
        System.out.println(">>>>  test_termo_171");
        assertEquals("{cidade=[Cidreira], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casas em cidreira"));
    }

    @Test
    public void test_termo_172() {
        System.out.println(">>>>  test_termo_172");
        assertEquals("{cidade=[Capão da Canoa]}", engImoveis.obtemParametrosAsString("capão da canoa"));
    }

    @Test
    public void test_termo_173() {
        System.out.println(">>>>  test_termo_173");
        assertEquals("{cidade=[Torres]}", engImoveis.obtemParametrosAsString("torres"));
    }

    @Test
    public void test_termo_174() {
        System.out.println(">>>>  test_termo_174");
        assertEquals("{cidade=[Xangri-Lá], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("Casas em Xangri la"));
    }

    @Test
    public void test_termo_175() {
        System.out.println(">>>>  test_termo_175");
        assertEquals("{cidade=[Bento Gonçalves]}", engImoveis.obtemParametrosAsString("bento gonçalves"));
    }

    @Test
    public void test_termo_176() {
        System.out.println(">>>>  test_termo_176");
        assertEquals("{}", engImoveis.obtemParametrosAsString("lançamentos porto alegre"));
    }

    @Test
    public void test_termo_177() {
        System.out.println(">>>>  test_termo_177");
        assertEquals("{cidade=[Torres], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casa em torres"));
    }

    @Test
    public void test_termo_178() {
        System.out.println(">>>>  test_termo_178");
        assertEquals("{cidade=[Arambare], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("Casa Arambare"));
    }

    @Test
    public void test_termo_179() {
        System.out.println(">>>>  test_termo_179");
        assertEquals("{cidade=[Porto Alegre], Tipo de imóvel=[Sala Comercial]}", engImoveis.obtemParametrosAsString("sala comercial em porto alegre"));
    }

    @Test
    public void test_termo_180() {
        System.out.println(">>>>  test_termo_180");
        assertEquals("{cidade=[Porto Alegre], Tipo de imóvel=[Jk / kitnet]}", engImoveis.obtemParametrosAsString("jk em porto alegre"));
    }

    @Test
    public void test_termo_181() {
        System.out.println(">>>>  test_termo_181");
        assertEquals("{}", engImoveis.obtemParametrosAsString("duque de caxias porto alegre"));
    }

    @Test
    public void test_termo_182() {
        System.out.println(">>>>  test_termo_182");
        assertEquals("{cidade=[Passo Fundo], Tipo de imóvel=[Terreno]}", engImoveis.obtemParametrosAsString("terreno em passo fundo"));
    }

    @Test
    public void test_termo_183() {
        System.out.println(">>>>  test_termo_183");
        assertEquals("{cidade=[Florianópolis], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("Casas em Florianópolis"));
    }

    @Test
    public void test_termo_184() {
        System.out.println(">>>>  test_termo_184");
        assertEquals("{cidade=[Cidreira]}", engImoveis.obtemParametrosAsString("cidreira"));
    }

    @Test
    public void test_termo_185() {
        System.out.println(">>>>  test_termo_185");
        assertEquals("{cidade=[Florianópolis], Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("apartamento florianopolis"));
    }

    @Test
    public void test_termo_186() {
        System.out.println(">>>>  test_termo_186");
        assertEquals("{cidade=[Florianópolis]}", engImoveis.obtemParametrosAsString("sul ilha floripa"));
    }

    @Test
    public void test_termo_187() {
        System.out.println(">>>>  test_termo_187");
        assertEquals("{cidade=[Florianópolis], Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("apartamento florianópolis"));
    }

    @Test
    public void test_termo_188() {
        System.out.println(">>>>  test_termo_188");
        assertEquals("{cidade=[Balneário Camboriú]}", engImoveis.obtemParametrosAsString("balneario camboriu"));
    }

    @Test
    public void test_termo_189() {
        System.out.println(">>>>  test_termo_189");
        assertEquals("{}", engImoveis.obtemParametrosAsString("imoveis"));
    }

    @Test
    public void test_termo_190() {
        System.out.println(">>>>  test_termo_190");
        assertEquals("{cidade=[Florianópolis], Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("apartamento florianopolis"));
    }

    @Test
    public void test_termo_191() {
        System.out.println(">>>>  test_termo_191");
        assertEquals("{cidade=[Cachoeirinha], Tipo de imóvel=[Sobrado]}", engImoveis.obtemParametrosAsString("sobrado em cachoeirinha"));
    }

    @Test
    public void test_termo_192() {
        System.out.println(">>>>  test_termo_192");
        assertEquals("{estado=[rio grande do sul]}", engImoveis.obtemParametrosAsString("capao da canoa rs"));
    }

    @Test
    public void test_termo_193() {
        System.out.println(">>>>  test_termo_193");
        assertEquals("{cidade=[Florianópolis]}", engImoveis.obtemParametrosAsString("Imoveis em Florianopolis"));
    }

    @Test
    public void test_termo_194() {
        System.out.println(">>>>  test_termo_194");
        assertEquals("{cidade=[Florianópolis], Tipo de imóvel=[Sobrado]}", engImoveis.obtemParametrosAsString("sobrado em florianopolis"));
    }

    @Test
    public void test_termo_195() {
        System.out.println(">>>>  test_termo_195");
        assertEquals("{cidade=[Florianópolis], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("Casas em Florianopolis"));
    }

    @Test
    public void test_termo_196() {
        System.out.println(">>>>  test_termo_196");
        assertEquals("{Tipo de imóvel=[Cobertura]}", engImoveis.obtemParametrosAsString("cobertura"));
    }

    @Test
    public void test_termo_197() {
        System.out.println(">>>>  test_termo_197");
        assertEquals("{Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("apartamento"));
    }

    @Test
    public void test_termo_198() {
        System.out.println(">>>>  test_termo_198");
        assertEquals("{cidade=[Florianópolis], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casa em florianopolis"));
    }

    @Test
    public void test_termo_199() {
        System.out.println(">>>>  test_termo_199");
        assertEquals("{cidade=[Porto Alegre], Características=[Mobiliado], Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("apartamento mobiliado em porto alegre"));
    }

    @Test
    public void test_termo_200() {
        System.out.println(">>>>  test_termo_200");
        assertEquals("{cidade=[Torres]}", engImoveis.obtemParametrosAsString("torres aluguel por temporada"));
    }

    @Test
    public void test_termo_201() {
        System.out.println(">>>>  test_termo_201");
        assertEquals("{cidade=[Porto Alegre], Tipo de imóvel=[Loja]}", engImoveis.obtemParametrosAsString("loja comercial em porto alegre"));
    }

    @Test
    public void test_termo_202() {
        System.out.println(">>>>  test_termo_202");
        assertEquals("{cidade=[Jaraguá do Sul]}", engImoveis.obtemParametrosAsString("jaraguá do sul"));
    }

    @Test
    public void test_termo_203() {
        System.out.println(">>>>  test_termo_203");
        assertEquals("{cidade=[Joinville], Tipo de imóvel=[Sobrado]}", engImoveis.obtemParametrosAsString("sobrado em joinville"));
    }

    @Test
    public void test_termo_204() {
        System.out.println(">>>>  test_termo_204");
        assertEquals("{cidade=[Blumenau], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casas em blumenau"));
    }

    @Test
    public void test_termo_205() {
        System.out.println(">>>>  test_termo_205");
        assertEquals("{cidade=[Torres], Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("apartamento em torres"));
    }

    @Test
    public void test_termo_206() {
        System.out.println(">>>>  test_termo_206");
        assertEquals("{cidade=[Caxias do Sul], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casa em caxias do sul"));
    }

    @Test
    public void test_termo_207() {
        System.out.println(">>>>  test_termo_207");
        assertEquals("{Tipo de imóvel=[Sala Comercial]}", engImoveis.obtemParametrosAsString("sala comercial"));
    }

    @Test
    public void test_termo_208() {
        System.out.println(">>>>  test_termo_208");
        assertEquals("{cidade=[Camboriú]}", engImoveis.obtemParametrosAsString("Camboriú avenida atlântica"));
    }

    @Test
    public void test_termo_209() {
        System.out.println(">>>>  test_termo_209");
        assertEquals("{cidade=[Gravataí]}", engImoveis.obtemParametrosAsString("gravataí"));
    }

    @Test
    public void test_termo_210() {
        System.out.println(">>>>  test_termo_210");
        assertEquals("{cidade=[Caxias do Sul]}", engImoveis.obtemParametrosAsString("caxias do sul"));
    }

    @Test
    public void test_termo_211() {
        System.out.println(">>>>  test_termo_211");
        assertEquals("{cidade=[Blumenau], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casa em blumenau"));
    }

    @Test
    public void test_termo_212() {
        System.out.println(">>>>  test_termo_212");
        assertEquals("{Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("Casa"));
    }

    @Test
    public void test_termo_213() {
        System.out.println(">>>>  test_termo_213");
        assertEquals("{cidade=[Flores da Cunha]}", engImoveis.obtemParametrosAsString("flores da cunha"));
    }

    @Test
    public void test_termo_214() {
        System.out.println(">>>>  test_termo_214");
        assertEquals("{cidade=[Canoas], Tipo de imóvel=[Sobrado]}", engImoveis.obtemParametrosAsString("sobrado em canoas"));
    }

    @Test
    public void test_termo_215() {
        System.out.println(">>>>  test_termo_215");
        assertEquals("{Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casa em criciuma sc"));
    }

    @Test
    public void test_termo_216() {
        System.out.println(">>>>  test_termo_216");
        assertEquals("{cidade=[Florianópolis], Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("apartamentos florianópolis"));
    }

    @Test
    public void test_termo_217() {
        System.out.println(">>>>  test_termo_217");
        assertEquals("{cidade=[Tramandaí], estado=[rio grande do sul]}", engImoveis.obtemParametrosAsString("tramandai rs"));
    }

    @Test
    public void test_termo_218() {
        System.out.println(">>>>  test_termo_218");
        assertEquals("{}", engImoveis.obtemParametrosAsString("venda de imovel"));
    }

    @Test
    public void test_termo_219() {
        System.out.println(">>>>  test_termo_219");
        assertEquals("{cidade=[Florianópolis], Tipo de imóvel=[Loft]}", engImoveis.obtemParametrosAsString("loft florianopolis"));
    }

    @Test
    public void test_termo_220() {
        System.out.println(">>>>  test_termo_220");
        assertEquals("{cidade=[Capão da Canoa], Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("apartamento em capão da canoa"));
    }

    @Test
    public void test_termo_221() {
        System.out.println(">>>>  test_termo_221");
        assertEquals("{cidade=[Porto Alegre], Tipo de imóvel=[Loja]}", engImoveis.obtemParametrosAsString("loja comercial em porto alegre"));
    }

    @Test
    public void test_termo_222() {
        System.out.println(">>>>  test_termo_222");
        assertEquals("{cidade=[Garopaba], estado=[santa catarina]}", engImoveis.obtemParametrosAsString("garopaba sc"));
    }

    @Test
    public void test_termo_223() {
        System.out.println(">>>>  test_termo_223");
        assertEquals("{cidade=[Florianópolis], Tipo de imóvel=[Jk / kitnet]}", engImoveis.obtemParametrosAsString("kitinete em Florianopolis"));
    }

    @Test
    public void test_termo_224() {
        System.out.println(">>>>  test_termo_224");
        assertEquals("{cidade=[Tramandaí], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casa em tramandai"));
    }

    @Test
    public void test_termo_225() {
        System.out.println(">>>>  test_termo_225");
        assertEquals("{cidade=[Porto Alegre]}", engImoveis.obtemParametrosAsString("imoveis em porto alegre"));
    }

    @Test
    public void test_termo_226() {
        System.out.println(">>>>  test_termo_226");
        assertEquals("{}", engImoveis.obtemParametrosAsString("vale dos sinos"));
    }

    @Test
    public void test_termo_227() {
        System.out.println(">>>>  test_termo_227");
        assertEquals("{cidade=[Atlântida], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casas em atlantida"));
    }

    @Test
    public void test_termo_228() {
        System.out.println(">>>>  test_termo_228");
        assertEquals("{cidade=[Florianópolis], estado=[santa catarina]}", engImoveis.obtemParametrosAsString("florianopolis sc"));
    }

    @Test
    public void test_termo_229() {
        System.out.println(">>>>  test_termo_229");
        assertEquals("{Tipo de imóvel=[Sítio]}", engImoveis.obtemParametrosAsString("sitio"));
    }

    @Test
    public void test_termo_230() {
        System.out.println(">>>>  test_termo_230");
        assertEquals("{cidade=[Porto Alegre], Dormitórios=[1:1], Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("apartamento 1 dormitório porto alegre"));
    }

    @Test
    public void test_termo_231() {
        System.out.println(">>>>  test_termo_231");
        assertEquals("{Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casas"));
    }

    @Test
    public void test_termo_232() {
        System.out.println(">>>>  test_termo_232");
        assertEquals("{cidade=[Florianópolis], Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("apartamento centro Florianopolis"));
    }

    @Test
    public void test_termo_233() {
        System.out.println(">>>>  test_termo_233");
        assertEquals("{Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("Apartamento S"));
    }

    @Test
    public void test_termo_234() {
        System.out.println(">>>>  test_termo_234");
        assertEquals("{cidade=[Guaíba]}", engImoveis.obtemParametrosAsString("guaíba"));
    }

    @Test
    public void test_termo_235() {
        System.out.println(">>>>  test_termo_235");
        assertEquals("{cidade=[Imbé]}", engImoveis.obtemParametrosAsString("imbé"));
    }

    @Test
    public void test_termo_236() {
        System.out.println(">>>>  test_termo_236");
        assertEquals("{cidade=[Capão Novo]}", engImoveis.obtemParametrosAsString("capao novo"));
    }

    @Test
    public void test_termo_237() {
        System.out.println(">>>>  test_termo_237");
        assertEquals("{estado=[santa catarina]}", engImoveis.obtemParametrosAsString("santa catarina"));
    }

    @Test
    public void test_termo_238() {
        System.out.println(">>>>  test_termo_238");
        assertEquals("{cidade=[Torres], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("Casas em Torres"));
    }

    @Test
    public void test_termo_239() {
        System.out.println(">>>>  test_termo_239");
        assertEquals("{}", engImoveis.obtemParametrosAsString("imoveis S"));
    }

    @Test
    public void test_termo_240() {
        System.out.println(">>>>  test_termo_240");
        assertEquals("{cidade=[Florianópolis]}", engImoveis.obtemParametrosAsString("financiamento florianopolis"));
    }

    @Test
    public void test_termo_241() {
        System.out.println(">>>>  test_termo_241");
        assertEquals("{cidade=[Noiva do Mar]}", engImoveis.obtemParametrosAsString("noiva do mar"));
    }

    @Test
    public void test_termo_242() {
        System.out.println(">>>>  test_termo_242");
        assertEquals("{Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casa em porto alegre rs"));
    }

    @Test
    public void test_termo_243() {
        System.out.println(">>>>  test_termo_243");
        assertEquals("{cidade=[Criciúma], Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casa criciuma"));
    }

    @Test
    public void test_termo_244() {
        System.out.println(">>>>  test_termo_244");
        assertEquals("{cidade=[Porto Alegre], Dormitórios=[2:2], Vagas de garagem=[1:], Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("apartamento de 2 dormitorios em porto alegre com garagem"));
    }

    @Test
    public void test_termo_245() {
        System.out.println(">>>>  test_termo_245");
        assertEquals("{cidade=[Imbé]}", engImoveis.obtemParametrosAsString("imbe"));
    }

    @Test
    public void test_termo_246() {
        System.out.println(">>>>  test_termo_246");
        assertEquals("{Tipo de imóvel=[Casa]}", engImoveis.obtemParametrosAsString("casa porto alegre"));
    }

    @Test
    public void test_termo_247() {
        System.out.println(">>>>  test_termo_247");
        assertEquals("{cidade=[Florianópolis], Tipo de imóvel=[Terreno]}", engImoveis.obtemParametrosAsString("Terrenos em Florianopolis"));
    }

    @Test
    public void test_termo_248() {
        System.out.println(">>>>  test_termo_248");
        assertEquals("{}", engImoveis.obtemParametrosAsString("serra gaúcha"));
    }

    @Test
    public void test_termo_249() {
        System.out.println(">>>>  test_termo_249");
        assertEquals("{}", engImoveis.obtemParametrosAsString("Que imóvel lomba do pinheiro"));
    }

    @Test
    public void test_termo_250() {
        System.out.println(">>>>  test_termo_250");
        assertEquals("{Tipo de imóvel=[Apartamento]}", engImoveis.obtemParametrosAsString("apartamento em porto alegre rs"));
    }

//    @Test
//    public void test_termo_251() {
//        System.out.println(">>>>  test_termo_251");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em pelotas"));
//    }
//
//    @Test
//    public void test_termo_252() {
//        System.out.println(">>>>  test_termo_252");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em torres"));
//    }
//
//    @Test
//    public void test_termo_253() {
//        System.out.println(">>>>  test_termo_253");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado em capao da canoa"));
//    }
//
//    @Test
//    public void test_termo_254() {
//        System.out.println(">>>>  test_termo_254");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa na zona sul de porto alegre"));
//    }
//
//    @Test
//    public void test_termo_255() {
//        System.out.println(">>>>  test_termo_255");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em canoas rs"));
//    }
//
//    @Test
//    public void test_termo_256() {
//        System.out.println(">>>>  test_termo_256");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento em caxias do sul"));
//    }
//
//    @Test
//    public void test_termo_257() {
//        System.out.println(">>>>  test_termo_257");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamentos em joinville"));
//    }
//
//    @Test
//    public void test_termo_258() {
//        System.out.println(">>>>  test_termo_258");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Casa S"));
//    }
//
//    @Test
//    public void test_termo_259() {
//        System.out.println(">>>>  test_termo_259");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sala comercial"));
//    }
//
//    @Test
//    public void test_termo_260() {
//        System.out.println(">>>>  test_termo_260");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado em pelotas"));
//    }
//
//    @Test
//    public void test_termo_261() {
//        System.out.println(">>>>  test_termo_261");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imoveis são josé sc"));
//    }
//
//    @Test
//    public void test_termo_262() {
//        System.out.println(">>>>  test_termo_262");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em torres rs"));
//    }
//
//    @Test
//    public void test_termo_263() {
//        System.out.println(">>>>  test_termo_263");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("praia brava"));
//    }
//
//    @Test
//    public void test_termo_264() {
//        System.out.println(">>>>  test_termo_264");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("A"));
//    }
//
//    @Test
//    public void test_termo_265() {
//        System.out.println(">>>>  test_termo_265");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("jurere"));
//    }
//
//    @Test
//    public void test_termo_266() {
//        System.out.println(">>>>  test_termo_266");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("praia da pinheira"));
//    }
//
//    @Test
//    public void test_termo_267() {
//        System.out.println(">>>>  test_termo_267");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado em sao jose"));
//    }
//
//    @Test
//    public void test_termo_268() {
//        System.out.println(">>>>  test_termo_268");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado em florianopolis"));
//    }
//
//    @Test
//    public void test_termo_269() {
//        System.out.println(">>>>  test_termo_269");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em passo fundo"));
//    }
//
//    @Test
//    public void test_termo_270() {
//        System.out.println(">>>>  test_termo_270");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em tramandai"));
//    }
//
//    @Test
//    public void test_termo_271() {
//        System.out.println(">>>>  test_termo_271");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em blumenau"));
//    }
//
//    @Test
//    public void test_termo_272() {
//        System.out.println(">>>>  test_termo_272");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("chacaras e sitios rs"));
//    }
//
//    @Test
//    public void test_termo_273() {
//        System.out.println(">>>>  test_termo_273");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("florianopolis"));
//    }
//
//    @Test
//    public void test_termo_274() {
//        System.out.println(">>>>  test_termo_274");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em sao jose sc"));
//    }
//
//    @Test
//    public void test_termo_275() {
//        System.out.println(">>>>  test_termo_275");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("alugar casa"));
//    }
//
//    @Test
//    public void test_termo_276() {
//        System.out.println(">>>>  test_termo_276");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Apartamentos em Camboriu"));
//    }
//
//    @Test
//    public void test_termo_277() {
//        System.out.println(">>>>  test_termo_277");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("meia praia"));
//    }
//
//    @Test
//    public void test_termo_278() {
//        System.out.println(">>>>  test_termo_278");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imbituba"));
//    }
//
//    @Test
//    public void test_termo_279() {
//        System.out.println(">>>>  test_termo_279");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Imoveis em eldorado do sul"));
//    }
//
//    @Test
//    public void test_termo_280() {
//        System.out.println(">>>>  test_termo_280");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento mobiliado porto alegre"));
//    }
//
//    @Test
//    public void test_termo_281() {
//        System.out.println(">>>>  test_termo_281");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado em itapema"));
//    }
//
//    @Test
//    public void test_termo_282() {
//        System.out.println(">>>>  test_termo_282");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento 2 dormitorios em porto alegre"));
//    }
//
//    @Test
//    public void test_termo_283() {
//        System.out.println(">>>>  test_termo_283");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado em itajai"));
//    }
//
//    @Test
//    public void test_termo_284() {
//        System.out.println(">>>>  test_termo_284");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado em xangri la"));
//    }
//
//    @Test
//    public void test_termo_285() {
//        System.out.println(">>>>  test_termo_285");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imoveis em florianopolis"));
//    }
//
//    @Test
//    public void test_termo_286() {
//        System.out.println(">>>>  test_termo_286");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Torres"));
//    }
//
//    @Test
//    public void test_termo_287() {
//        System.out.println(">>>>  test_termo_287");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento florianópolis"));
//    }
//
//    @Test
//    public void test_termo_288() {
//        System.out.println(">>>>  test_termo_288");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("grande florianopolis"));
//    }
//
//    @Test
//    public void test_termo_289() {
//        System.out.println(">>>>  test_termo_289");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado em torres"));
//    }
//
//    @Test
//    public void test_termo_290() {
//        System.out.println(">>>>  test_termo_290");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Auxiliadora Predial"));
//    }
//
//    @Test
//    public void test_termo_291() {
//        System.out.println(">>>>  test_termo_291");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("ingleses"));
//    }
//
//    @Test
//    public void test_termo_292() {
//        System.out.println(">>>>  test_termo_292");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em tramandai rs"));
//    }
//
//    @Test
//    public void test_termo_293() {
//        System.out.println(">>>>  test_termo_293");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Casas na Praia Mole"));
//    }
//
//    @Test
//    public void test_termo_294() {
//        System.out.println(">>>>  test_termo_294");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imoveis no bairro ingleses florianopolis"));
//    }
//
//    @Test
//    public void test_termo_295() {
//        System.out.println(">>>>  test_termo_295");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("xangrila"));
//    }
//
//    @Test
//    public void test_termo_296() {
//        System.out.println(">>>>  test_termo_296");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("capão da canoa rs"));
//    }
//
//    @Test
//    public void test_termo_297() {
//        System.out.println(">>>>  test_termo_297");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Casas em Atlantida"));
//    }
//
//    @Test
//    public void test_termo_298() {
//        System.out.println(">>>>  test_termo_298");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casas no litoral norte"));
//    }
//
//    @Test
//    public void test_termo_299() {
//        System.out.println(">>>>  test_termo_299");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento em capao da canoa"));
//    }
//
//    @Test
//    public void test_termo_300() {
//        System.out.println(">>>>  test_termo_300");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("joinville"));
//    }
//
//    @Test
//    public void test_termo_301() {
//        System.out.println(">>>>  test_termo_301");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("tramandai"));
//    }
//
//    @Test
//    public void test_termo_302() {
//        System.out.println(">>>>  test_termo_302");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa torres rs"));
//    }
//
//    @Test
//    public void test_termo_303() {
//        System.out.println(">>>>  test_termo_303");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("florianópolis ilha norte"));
//    }
//
//    @Test
//    public void test_termo_304() {
//        System.out.println(">>>>  test_termo_304");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em capão da canoa"));
//    }
//
//    @Test
//    public void test_termo_305() {
//        System.out.println(">>>>  test_termo_305");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("porto belo"));
//    }
//
//    @Test
//    public void test_termo_306() {
//        System.out.println(">>>>  test_termo_306");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa condominio fechado porto alegre"));
//    }
//
//    @Test
//    public void test_termo_307() {
//        System.out.println(">>>>  test_termo_307");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("torres rs"));
//    }
//
//    @Test
//    public void test_termo_308() {
//        System.out.println(">>>>  test_termo_308");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("verdes campos"));
//    }
//
//    @Test
//    public void test_termo_309() {
//        System.out.println(">>>>  test_termo_309");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Imoveis em alvorada"));
//    }
//
//    @Test
//    public void test_termo_310() {
//        System.out.println(">>>>  test_termo_310");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("florianopolis"));
//    }
//
//    @Test
//    public void test_termo_311() {
//        System.out.println(">>>>  test_termo_311");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("loja"));
//    }
//
//    @Test
//    public void test_termo_312() {
//        System.out.println(">>>>  test_termo_312");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado em atlantida sul"));
//    }
//
//    @Test
//    public void test_termo_313() {
//        System.out.println(">>>>  test_termo_313");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa na praia rs"));
//    }
//
//    @Test
//    public void test_termo_314() {
//        System.out.println(">>>>  test_termo_314");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento capão da canoa"));
//    }
//
//    @Test
//    public void test_termo_315() {
//        System.out.println(">>>>  test_termo_315");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Terreno"));
//    }
//
//    @Test
//    public void test_termo_316() {
//        System.out.println(">>>>  test_termo_316");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("canasvieiras sc"));
//    }
//
//    @Test
//    public void test_termo_317() {
//        System.out.println(">>>>  test_termo_317");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("garopaba"));
//    }
//
//    @Test
//    public void test_termo_318() {
//        System.out.println(">>>>  test_termo_318");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento em joinville"));
//    }
//
//    @Test
//    public void test_termo_319() {
//        System.out.println(">>>>  test_termo_319");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em cachoeirinha"));
//    }
//
//    @Test
//    public void test_termo_320() {
//        System.out.println(">>>>  test_termo_320");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("terrenos em porto alegre rs"));
//    }
//
//    @Test
//    public void test_termo_321() {
//        System.out.println(">>>>  test_termo_321");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa canoas"));
//    }
//
//    @Test
//    public void test_termo_322() {
//        System.out.println(">>>>  test_termo_322");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Casas em Capao da Canoa"));
//    }
//
//    @Test
//    public void test_termo_323() {
//        System.out.println(">>>>  test_termo_323");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Avenida Beira Mar Norte florianópolis"));
//    }
//
//    @Test
//    public void test_termo_324() {
//        System.out.println(">>>>  test_termo_324");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado em palhoca"));
//    }
//
//    @Test
//    public void test_termo_325() {
//        System.out.println(">>>>  test_termo_325");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Apartamentos no centro de Florianopolis"));
//    }
//
//    @Test
//    public void test_termo_326() {
//        System.out.println(">>>>  test_termo_326");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em pelotas rs"));
//    }
//
//    @Test
//    public void test_termo_327() {
//        System.out.println(">>>>  test_termo_327");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casas"));
//    }
//
//    @Test
//    public void test_termo_328() {
//        System.out.println(">>>>  test_termo_328");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("novo campeche"));
//    }
//
//    @Test
//    public void test_termo_329() {
//        System.out.println(">>>>  test_termo_329");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sitio em gravatai"));
//    }
//
//    @Test
//    public void test_termo_330() {
//        System.out.println(">>>>  test_termo_330");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("campeche"));
//    }
//
//    @Test
//    public void test_termo_331() {
//        System.out.println(">>>>  test_termo_331");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Casa"));
//    }
//
//    @Test
//    public void test_termo_332() {
//        System.out.println(">>>>  test_termo_332");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado em imbe"));
//    }
//
//    @Test
//    public void test_termo_333() {
//        System.out.println(">>>>  test_termo_333");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sala comercial itajai"));
//    }
//
//    @Test
//    public void test_termo_334() {
//        System.out.println(">>>>  test_termo_334");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Apartamentos em Florianópolis"));
//    }
//
//    @Test
//    public void test_termo_335() {
//        System.out.println(">>>>  test_termo_335");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento menino deus"));
//    }
//
//    @Test
//    public void test_termo_336() {
//        System.out.println(">>>>  test_termo_336");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("arroio do sal"));
//    }
//
//    @Test
//    public void test_termo_337() {
//        System.out.println(">>>>  test_termo_337");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("ponta das canas"));
//    }
//
//    @Test
//    public void test_termo_338() {
//        System.out.println(">>>>  test_termo_338");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("kitnet em porto alegre"));
//    }
//
//    @Test
//    public void test_termo_339() {
//        System.out.println(">>>>  test_termo_339");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Casas em Itapema"));
//    }
//
//    @Test
//    public void test_termo_340() {
//        System.out.println(">>>>  test_termo_340");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imbituba"));
//    }
//
//    @Test
//    public void test_termo_341() {
//        System.out.println(">>>>  test_termo_341");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Casas em Palhoca"));
//    }
//
//    @Test
//    public void test_termo_342() {
//        System.out.println(">>>>  test_termo_342");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em garopaba sc"));
//    }
//
//    @Test
//    public void test_termo_343() {
//        System.out.println(">>>>  test_termo_343");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em atlantida rs"));
//    }
//
//    @Test
//    public void test_termo_344() {
//        System.out.println(">>>>  test_termo_344");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("São Francisco do Sul"));
//    }
//
//    @Test
//    public void test_termo_345() {
//        System.out.println(">>>>  test_termo_345");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("kitinete em Florianopolis"));
//    }
//
//    @Test
//    public void test_termo_346() {
//        System.out.println(">>>>  test_termo_346");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("comprar casa"));
//    }
//
//    @Test
//    public void test_termo_347() {
//        System.out.println(">>>>  test_termo_347");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Apartamentos Florianopolis"));
//    }
//
//    @Test
//    public void test_termo_348() {
//        System.out.println(">>>>  test_termo_348");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("canoas"));
//    }
//
//    @Test
//    public void test_termo_349() {
//        System.out.println(">>>>  test_termo_349");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("assis brasil porto alegre"));
//    }
//
//    @Test
//    public void test_termo_350() {
//        System.out.println(">>>>  test_termo_350");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Apartamento 1 dormitorio Porto Alegre"));
//    }
//
//    @Test
//    public void test_termo_351() {
//        System.out.println(">>>>  test_termo_351");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("torres"));
//    }
//
//    @Test
//    public void test_termo_352() {
//        System.out.println(">>>>  test_termo_352");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sitios rs"));
//    }
//
//    @Test
//    public void test_termo_353() {
//        System.out.println(">>>>  test_termo_353");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa florianópolis"));
//    }
//
//    @Test
//    public void test_termo_354() {
//        System.out.println(">>>>  test_termo_354");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("campeche"));
//    }
//
//    @Test
//    public void test_termo_355() {
//        System.out.println(">>>>  test_termo_355");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado em garopaba"));
//    }
//
//    @Test
//    public void test_termo_356() {
//        System.out.println(">>>>  test_termo_356");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa 2 dormitorios em porto alegre"));
//    }
//
//    @Test
//    public void test_termo_357() {
//        System.out.println(">>>>  test_termo_357");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em capão da canoa rs"));
//    }
//
//    @Test
//    public void test_termo_358() {
//        System.out.println(">>>>  test_termo_358");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("terrenos em caxias do sul"));
//    }
//
//    @Test
//    public void test_termo_359() {
//        System.out.println(">>>>  test_termo_359");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento com pátio em porto alegre"));
//    }
//
//    @Test
//    public void test_termo_360() {
//        System.out.println(">>>>  test_termo_360");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Imoveis em dois irmãos"));
//    }
//
//    @Test
//    public void test_termo_361() {
//        System.out.println(">>>>  test_termo_361");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("loft"));
//    }
//
//    @Test
//    public void test_termo_362() {
//        System.out.println(">>>>  test_termo_362");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("blumenau casa"));
//    }
//
//    @Test
//    public void test_termo_363() {
//        System.out.println(">>>>  test_termo_363");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento 3 dormitórios em porto alegre"));
//    }
//
//    @Test
//    public void test_termo_364() {
//        System.out.println(">>>>  test_termo_364");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Casas em Bombinhas"));
//    }
//
//    @Test
//    public void test_termo_365() {
//        System.out.println(">>>>  test_termo_365");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("terrenos em joinville"));
//    }
//
//    @Test
//    public void test_termo_366() {
//        System.out.println(">>>>  test_termo_366");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento 3 dormitórios"));
//    }
//
//    @Test
//    public void test_termo_367() {
//        System.out.println(">>>>  test_termo_367");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento centro porto alegre"));
//    }
//
//    @Test
//    public void test_termo_368() {
//        System.out.println(">>>>  test_termo_368");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Imoveis em canoas"));
//    }
//
//    @Test
//    public void test_termo_369() {
//        System.out.println(">>>>  test_termo_369");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("jk"));
//    }
//
//    @Test
//    public void test_termo_370() {
//        System.out.println(">>>>  test_termo_370");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("palhoca"));
//    }
//
//    @Test
//    public void test_termo_371() {
//        System.out.println(">>>>  test_termo_371");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em balneario camboriu sc"));
//    }
//
//    @Test
//    public void test_termo_372() {
//        System.out.println(">>>>  test_termo_372");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Casas em Garopaba"));
//    }
//
//    @Test
//    public void test_termo_373() {
//        System.out.println(">>>>  test_termo_373");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento na planta em joinville"));
//    }
//
//    @Test
//    public void test_termo_374() {
//        System.out.println(">>>>  test_termo_374");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa caxias do sul"));
//    }
//
//    @Test
//    public void test_termo_375() {
//        System.out.println(">>>>  test_termo_375");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imbé"));
//    }
//
//    @Test
//    public void test_termo_376() {
//        System.out.println(">>>>  test_termo_376");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento em florianópolis"));
//    }
//
//    @Test
//    public void test_termo_377() {
//        System.out.println(">>>>  test_termo_377");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa zona sul porto alegre"));
//    }
//
//    @Test
//    public void test_termo_378() {
//        System.out.println(">>>>  test_termo_378");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento 1 dormitorio porto alegre"));
//    }
//
//    @Test
//    public void test_termo_379() {
//        System.out.println(">>>>  test_termo_379");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Cobertura"));
//    }
//
//    @Test
//    public void test_termo_380() {
//        System.out.println(">>>>  test_termo_380");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("\"Ventura Clube de Morar\""));
//    }
//
//    @Test
//    public void test_termo_381() {
//        System.out.println(">>>>  test_termo_381");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em joinville"));
//    }
//
//    @Test
//    public void test_termo_382() {
//        System.out.println(">>>>  test_termo_382");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("ufsc"));
//    }
//
//    @Test
//    public void test_termo_383() {
//        System.out.println(">>>>  test_termo_383");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("canela"));
//    }
//
//    @Test
//    public void test_termo_384() {
//        System.out.println(">>>>  test_termo_384");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("rainha do mar"));
//    }
//
//    @Test
//    public void test_termo_385() {
//        System.out.println(">>>>  test_termo_385");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa 3 dormitorios em porto alegre"));
//    }
//
//    @Test
//    public void test_termo_386() {
//        System.out.println(">>>>  test_termo_386");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa pelotas"));
//    }
//
//    @Test
//    public void test_termo_387() {
//        System.out.println(">>>>  test_termo_387");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa viamao"));
//    }
//
//    @Test
//    public void test_termo_388() {
//        System.out.println(">>>>  test_termo_388");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("cachoeira do bom jesus"));
//    }
//
//    @Test
//    public void test_termo_389() {
//        System.out.println(">>>>  test_termo_389");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa de 4 dormitorios em florianopolis"));
//    }
//
//    @Test
//    public void test_termo_390() {
//        System.out.println(">>>>  test_termo_390");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Apartamento Tr"));
//    }
//
//    @Test
//    public void test_termo_391() {
//        System.out.println(">>>>  test_termo_391");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa santa maria rs"));
//    }
//
//    @Test
//    public void test_termo_392() {
//        System.out.println(">>>>  test_termo_392");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("borges de medeiros porto alegre"));
//    }
//
//    @Test
//    public void test_termo_393() {
//        System.out.println(">>>>  test_termo_393");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em blumenau sc"));
//    }
//
//    @Test
//    public void test_termo_394() {
//        System.out.println(">>>>  test_termo_394");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("mariluz"));
//    }
//
//    @Test
//    public void test_termo_395() {
//        System.out.println(">>>>  test_termo_395");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Terreno Porto Verde Alvorada"));
//    }
//
//    @Test
//    public void test_termo_396() {
//        System.out.println(">>>>  test_termo_396");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento em capão da canoa"));
//    }
//
//    @Test
//    public void test_termo_397() {
//        System.out.println(">>>>  test_termo_397");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado em balneario camboriu"));
//    }
//
//    @Test
//    public void test_termo_398() {
//        System.out.println(">>>>  test_termo_398");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("xangri lá"));
//    }
//
//    @Test
//    public void test_termo_399() {
//        System.out.println(">>>>  test_termo_399");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("rosa"));
//    }
//
//    @Test
//    public void test_termo_400() {
//        System.out.println(">>>>  test_termo_400");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa comercial em porto alegre"));
//    }
//
//    @Test
//    public void test_termo_401() {
//        System.out.println(">>>>  test_termo_401");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Imóveis em Bage"));
//    }
//
//    @Test
//    public void test_termo_402() {
//        System.out.println(">>>>  test_termo_402");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("atlântida"));
//    }
//
//    @Test
//    public void test_termo_403() {
//        System.out.println(">>>>  test_termo_403");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("bombinhas sc"));
//    }
//
//    @Test
//    public void test_termo_404() {
//        System.out.println(">>>>  test_termo_404");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Cachoeirinha"));
//    }
//
//    @Test
//    public void test_termo_405() {
//        System.out.println(">>>>  test_termo_405");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("canoas"));
//    }
//
//    @Test
//    public void test_termo_406() {
//        System.out.println(">>>>  test_termo_406");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imóvel residencial"));
//    }
//
//    @Test
//    public void test_termo_407() {
//        System.out.println(">>>>  test_termo_407");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("terreno em blumenau"));
//    }
//
//    @Test
//    public void test_termo_408() {
//        System.out.println(">>>>  test_termo_408");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("curumim"));
//    }
//
//    @Test
//    public void test_termo_409() {
//        System.out.println(">>>>  test_termo_409");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Casas em Imbe"));
//    }
//
//    @Test
//    public void test_termo_410() {
//        System.out.println(">>>>  test_termo_410");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casas em alvorada rs"));
//    }
//
//    @Test
//    public void test_termo_411() {
//        System.out.println(">>>>  test_termo_411");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em florianopolis sc"));
//    }
//
//    @Test
//    public void test_termo_412() {
//        System.out.println(">>>>  test_termo_412");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa na praia"));
//    }
//
//    @Test
//    public void test_termo_413() {
//        System.out.println(">>>>  test_termo_413");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado em bombinhas"));
//    }
//
//    @Test
//    public void test_termo_414() {
//        System.out.println(">>>>  test_termo_414");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Casas em Tramandai"));
//    }
//
//    @Test
//    public void test_termo_415() {
//        System.out.println(">>>>  test_termo_415");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("santa maria"));
//    }
//
//    @Test
//    public void test_termo_416() {
//        System.out.println(">>>>  test_termo_416");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Imoveis em Sao Leopoldo"));
//    }
//
//    @Test
//    public void test_termo_417() {
//        System.out.println(">>>>  test_termo_417");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa na praia"));
//    }
//
//    @Test
//    public void test_termo_418() {
//        System.out.println(">>>>  test_termo_418");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em florianópolis"));
//    }
//
//    @Test
//    public void test_termo_419() {
//        System.out.println(">>>>  test_termo_419");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em alvorada rs"));
//    }
//
//    @Test
//    public void test_termo_420() {
//        System.out.println(">>>>  test_termo_420");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("laguna"));
//    }
//
//    @Test
//    public void test_termo_421() {
//        System.out.println(">>>>  test_termo_421");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado em farroupilha"));
//    }
//
//    @Test
//    public void test_termo_422() {
//        System.out.println(">>>>  test_termo_422");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa porto alegre rs"));
//    }
//
//    @Test
//    public void test_termo_423() {
//        System.out.println(">>>>  test_termo_423");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("magistério"));
//    }
//
//    @Test
//    public void test_termo_424() {
//        System.out.println(">>>>  test_termo_424");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento de 3 dormitorios em porto alegre"));
//    }
//
//    @Test
//    public void test_termo_425() {
//        System.out.println(">>>>  test_termo_425");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Casa P"));
//    }
//
//    @Test
//    public void test_termo_426() {
//        System.out.println(">>>>  test_termo_426");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casas em palhoça"));
//    }
//
//    @Test
//    public void test_termo_427() {
//        System.out.println(">>>>  test_termo_427");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa bairro partenon"));
//    }
//
//    @Test
//    public void test_termo_428() {
//        System.out.println(">>>>  test_termo_428");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em cachoeirinha rs"));
//    }
//
//    @Test
//    public void test_termo_429() {
//        System.out.println(">>>>  test_termo_429");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado em santa maria"));
//    }
//
//    @Test
//    public void test_termo_430() {
//        System.out.println(">>>>  test_termo_430");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("jk porto alegre"));
//    }
//
//    @Test
//    public void test_termo_431() {
//        System.out.println(">>>>  test_termo_431");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Terreno Tr"));
//    }
//
//    @Test
//    public void test_termo_432() {
//        System.out.println(">>>>  test_termo_432");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em nova tramandai rs"));
//    }
//
//    @Test
//    public void test_termo_433() {
//        System.out.println(">>>>  test_termo_433");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("zona leste porto alegre"));
//    }
//
//    @Test
//    public void test_termo_434() {
//        System.out.println(">>>>  test_termo_434");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("canasvieiras"));
//    }
//
//    @Test
//    public void test_termo_435() {
//        System.out.println(">>>>  test_termo_435");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em nova tramandai"));
//    }
//
//    @Test
//    public void test_termo_436() {
//        System.out.println(">>>>  test_termo_436");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imóvel"));
//    }
//
//    @Test
//    public void test_termo_437() {
//        System.out.println(">>>>  test_termo_437");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Terreno P"));
//    }
//
//    @Test
//    public void test_termo_438() {
//        System.out.println(">>>>  test_termo_438");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento em balneario camboriu sc"));
//    }
//
//    @Test
//    public void test_termo_439() {
//        System.out.println(">>>>  test_termo_439");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamentos"));
//    }
//
//    @Test
//    public void test_termo_440() {
//        System.out.println(">>>>  test_termo_440");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sitios sc"));
//    }
//
//    @Test
//    public void test_termo_441() {
//        System.out.println(">>>>  test_termo_441");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em condominio fechado em porto alegre, 3 dormitórios"));
//    }
//
//    @Test
//    public void test_termo_442() {
//        System.out.println(">>>>  test_termo_442");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado em torres"));
//    }
//
//    @Test
//    public void test_termo_443() {
//        System.out.println(">>>>  test_termo_443");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Imoveis Criciuma"));
//    }
//
//    @Test
//    public void test_termo_444() {
//        System.out.println(">>>>  test_termo_444");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("palhoca"));
//    }
//
//    @Test
//    public void test_termo_445() {
//        System.out.println(">>>>  test_termo_445");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("florianopolis"));
//    }
//
//    @Test
//    public void test_termo_446() {
//        System.out.println(">>>>  test_termo_446");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento em santa maria rs"));
//    }
//
//    @Test
//    public void test_termo_447() {
//        System.out.println(">>>>  test_termo_447");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("jk porto alegre"));
//    }
//
//    @Test
//    public void test_termo_448() {
//        System.out.println(">>>>  test_termo_448");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em criciuma"));
//    }
//
//    @Test
//    public void test_termo_449() {
//        System.out.println(">>>>  test_termo_449");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Apartamento em Porto Alegre"));
//    }
//
//    @Test
//    public void test_termo_450() {
//        System.out.println(">>>>  test_termo_450");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa sapucaia do sul"));
//    }
//
//    @Test
//    public void test_termo_451() {
//        System.out.println(">>>>  test_termo_451");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("\"Punto Riserva Lindoia\""));
//    }
//
//    @Test
//    public void test_termo_452() {
//        System.out.println(">>>>  test_termo_452");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Casas em Joinville"));
//    }
//
//    @Test
//    public void test_termo_453() {
//        System.out.println(">>>>  test_termo_453");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em cidreira"));
//    }
//
//    @Test
//    public void test_termo_454() {
//        System.out.println(">>>>  test_termo_454");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa vale dos sinos"));
//    }
//
//    @Test
//    public void test_termo_455() {
//        System.out.println(">>>>  test_termo_455");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sala comercial centro porto alegre"));
//    }
//
//    @Test
//    public void test_termo_456() {
//        System.out.println(">>>>  test_termo_456");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("erechim"));
//    }
//
//    @Test
//    public void test_termo_457() {
//        System.out.println(">>>>  test_termo_457");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("capao da canoa"));
//    }
//
//    @Test
//    public void test_termo_458() {
//        System.out.println(">>>>  test_termo_458");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("criciuma"));
//    }
//
//    @Test
//    public void test_termo_459() {
//        System.out.println(">>>>  test_termo_459");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento em tramandai"));
//    }
//
//    @Test
//    public void test_termo_460() {
//        System.out.println(">>>>  test_termo_460");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento zona sul porto alegre"));
//    }
//
//    @Test
//    public void test_termo_461() {
//        System.out.println(">>>>  test_termo_461");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("jk"));
//    }
//
//    @Test
//    public void test_termo_462() {
//        System.out.println(">>>>  test_termo_462");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em joinville sc"));
//    }
//
//    @Test
//    public void test_termo_463() {
//        System.out.println(">>>>  test_termo_463");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("governador celso ramos"));
//    }
//
//    @Test
//    public void test_termo_464() {
//        System.out.println(">>>>  test_termo_464");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("campo bom"));
//    }
//
//    @Test
//    public void test_termo_465() {
//        System.out.println(">>>>  test_termo_465");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("itapema sc"));
//    }
//
//    @Test
//    public void test_termo_466() {
//        System.out.println(">>>>  test_termo_466");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imoveis Lot"));
//    }
//
//    @Test
//    public void test_termo_467() {
//        System.out.println(">>>>  test_termo_467");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("direto com o proprietario em porto alegre"));
//    }
//
//    @Test
//    public void test_termo_468() {
//        System.out.println(">>>>  test_termo_468");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("alugar apartamento"));
//    }
//
//    @Test
//    public void test_termo_469() {
//        System.out.println(">>>>  test_termo_469");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("jurere"));
//    }
//
//    @Test
//    public void test_termo_470() {
//        System.out.println(">>>>  test_termo_470");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("\"Lindoia Square\""));
//    }
//
//    @Test
//    public void test_termo_471() {
//        System.out.println(">>>>  test_termo_471");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("cachoeirinha rs"));
//    }
//
//    @Test
//    public void test_termo_472() {
//        System.out.println(">>>>  test_termo_472");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em passo fundo rs"));
//    }
//
//    @Test
//    public void test_termo_473() {
//        System.out.println(">>>>  test_termo_473");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado em xangri la"));
//    }
//
//    @Test
//    public void test_termo_474() {
//        System.out.println(">>>>  test_termo_474");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em são leopoldo"));
//    }
//
//    @Test
//    public void test_termo_475() {
//        System.out.println(">>>>  test_termo_475");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casas em joinville"));
//    }
//
//    @Test
//    public void test_termo_476() {
//        System.out.println(">>>>  test_termo_476");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("balneário camboriú"));
//    }
//
//    @Test
//    public void test_termo_477() {
//        System.out.println(">>>>  test_termo_477");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("chacara"));
//    }
//
//    @Test
//    public void test_termo_478() {
//        System.out.println(">>>>  test_termo_478");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Loja Comercial em Porto Alegre"));
//    }
//
//    @Test
//    public void test_termo_479() {
//        System.out.println(">>>>  test_termo_479");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sitio gravatai"));
//    }
//
//    @Test
//    public void test_termo_480() {
//        System.out.println(">>>>  test_termo_480");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imovel no litoral rs"));
//    }
//
//    @Test
//    public void test_termo_481() {
//        System.out.println(">>>>  test_termo_481");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento em joinville"));
//    }
//
//    @Test
//    public void test_termo_482() {
//        System.out.println(">>>>  test_termo_482");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Imoveis em esteio"));
//    }
//
//    @Test
//    public void test_termo_483() {
//        System.out.println(">>>>  test_termo_483");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imoveis Tr"));
//    }
//
//    @Test
//    public void test_termo_484() {
//        System.out.println(">>>>  test_termo_484");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamentos em capão da canoa"));
//    }
//
//    @Test
//    public void test_termo_485() {
//        System.out.println(">>>>  test_termo_485");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa praia"));
//    }
//
//    @Test
//    public void test_termo_486() {
//        System.out.println(">>>>  test_termo_486");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apto 2 quartos  são josé sc"));
//    }
//
//    @Test
//    public void test_termo_487() {
//        System.out.println(">>>>  test_termo_487");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento de 3 dormitorios em porto alegre"));
//    }
//
//    @Test
//    public void test_termo_488() {
//        System.out.println(">>>>  test_termo_488");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento em santa maria rs"));
//    }
//
//    @Test
//    public void test_termo_489() {
//        System.out.println(">>>>  test_termo_489");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em sao leopoldo"));
//    }
//
//    @Test
//    public void test_termo_490() {
//        System.out.println(">>>>  test_termo_490");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em ipanema porto alegre"));
//    }
//
//    @Test
//    public void test_termo_491() {
//        System.out.println(">>>>  test_termo_491");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casas na zona sul de porto alegre"));
//    }
//
//    @Test
//    public void test_termo_492() {
//        System.out.println(">>>>  test_termo_492");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imóvel lucas de oliveira"));
//    }
//
//    @Test
//    public void test_termo_493() {
//        System.out.println(">>>>  test_termo_493");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento bom fim porto alegre"));
//    }
//
//    @Test
//    public void test_termo_494() {
//        System.out.println(">>>>  test_termo_494");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casas em caxias do sul"));
//    }
//
//    @Test
//    public void test_termo_495() {
//        System.out.println(">>>>  test_termo_495");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa torres"));
//    }
//
//    @Test
//    public void test_termo_496() {
//        System.out.println(">>>>  test_termo_496");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Urban Concept"));
//    }
//
//    @Test
//    public void test_termo_497() {
//        System.out.println(">>>>  test_termo_497");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento centro florianopolis"));
//    }
//
//    @Test
//    public void test_termo_498() {
//        System.out.println(">>>>  test_termo_498");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("camboriu"));
//    }
//
//    @Test
//    public void test_termo_499() {
//        System.out.println(">>>>  test_termo_499");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em condominio"));
//    }
//
//    @Test
//    public void test_termo_500() {
//        System.out.println(">>>>  test_termo_500");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado em viamao"));
//    }
//
//    @Test
//    public void test_termo_501() {
//        System.out.println(">>>>  test_termo_501");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento em pelotas"));
//    }
//
//    @Test
//    public void test_termo_502() {
//        System.out.println(">>>>  test_termo_502");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento em capão da canoa rs"));
//    }
//
//    @Test
//    public void test_termo_503() {
//        System.out.println(">>>>  test_termo_503");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento em santa maria"));
//    }
//
//    @Test
//    public void test_termo_504() {
//        System.out.println(">>>>  test_termo_504");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa capao novo"));
//    }
//
//    @Test
//    public void test_termo_505() {
//        System.out.println(">>>>  test_termo_505");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento em florianopolis"));
//    }
//
//    @Test
//    public void test_termo_506() {
//        System.out.println(">>>>  test_termo_506");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Apartamentos em Florianopolis"));
//    }
//
//    @Test
//    public void test_termo_507() {
//        System.out.println(">>>>  test_termo_507");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Avenida Ipiranga porto alegre"));
//    }
//
//    @Test
//    public void test_termo_508() {
//        System.out.println(">>>>  test_termo_508");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("A"));
//    }
//
//    @Test
//    public void test_termo_509() {
//        System.out.println(">>>>  test_termo_509");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sala comercial no centro de porto alegre"));
//    }
//
//    @Test
//    public void test_termo_510() {
//        System.out.println(">>>>  test_termo_510");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casas em canoas rs"));
//    }
//
//    @Test
//    public void test_termo_511() {
//        System.out.println(">>>>  test_termo_511");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imóveis laguna"));
//    }
//
//    @Test
//    public void test_termo_512() {
//        System.out.println(">>>>  test_termo_512");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casas em santa maria rs"));
//    }
//
//    @Test
//    public void test_termo_513() {
//        System.out.println(">>>>  test_termo_513");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("santinho"));
//    }
//
//    @Test
//    public void test_termo_514() {
//        System.out.println(">>>>  test_termo_514");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em porto alegre rs"));
//    }
//
//    @Test
//    public void test_termo_515() {
//        System.out.println(">>>>  test_termo_515");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em gravatai rs"));
//    }
//
//    @Test
//    public void test_termo_516() {
//        System.out.println(">>>>  test_termo_516");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em jurere"));
//    }
//
//    @Test
//    public void test_termo_517() {
//        System.out.println(">>>>  test_termo_517");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa nos ingleses"));
//    }
//
//    @Test
//    public void test_termo_518() {
//        System.out.println(">>>>  test_termo_518");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("terreno na zona sul de porto alegre"));
//    }
//
//    @Test
//    public void test_termo_519() {
//        System.out.println(">>>>  test_termo_519");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa joinville"));
//    }
//
//    @Test
//    public void test_termo_520() {
//        System.out.println(">>>>  test_termo_520");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa cachoeirinha"));
//    }
//
//    @Test
//    public void test_termo_521() {
//        System.out.println(">>>>  test_termo_521");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em santa maria"));
//    }
//
//    @Test
//    public void test_termo_522() {
//        System.out.println(">>>>  test_termo_522");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casas em criciuma sc"));
//    }
//
//    @Test
//    public void test_termo_523() {
//        System.out.println(">>>>  test_termo_523");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa na lagoa da conceição"));
//    }
//
//    @Test
//    public void test_termo_524() {
//        System.out.println(">>>>  test_termo_524");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casas em itapema"));
//    }
//
//    @Test
//    public void test_termo_525() {
//        System.out.println(">>>>  test_termo_525");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("são borja"));
//    }
//
//    @Test
//    public void test_termo_526() {
//        System.out.println(">>>>  test_termo_526");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("terreno florianopolis"));
//    }
//
//    @Test
//    public void test_termo_527() {
//        System.out.println(">>>>  test_termo_527");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa na praia rs"));
//    }
//
//    @Test
//    public void test_termo_528() {
//        System.out.println(">>>>  test_termo_528");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("terreno blumenau"));
//    }
//
//    @Test
//    public void test_termo_529() {
//        System.out.println(">>>>  test_termo_529");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("itapema meia praia sc"));
//    }
//
//    @Test
//    public void test_termo_530() {
//        System.out.println(">>>>  test_termo_530");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("ingleses"));
//    }
//
//    @Test
//    public void test_termo_531() {
//        System.out.println(">>>>  test_termo_531");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casas em garopaba"));
//    }
//
//    @Test
//    public void test_termo_532() {
//        System.out.println(">>>>  test_termo_532");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("osorio"));
//    }
//
//    @Test
//    public void test_termo_533() {
//        System.out.println(">>>>  test_termo_533");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa na zona sul"));
//    }
//
//    @Test
//    public void test_termo_534() {
//        System.out.println(">>>>  test_termo_534");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em imbe rs"));
//    }
//
//    @Test
//    public void test_termo_535() {
//        System.out.println(">>>>  test_termo_535");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Apartamentos no centro de Florianopolis"));
//    }
//
//    @Test
//    public void test_termo_536() {
//        System.out.println(">>>>  test_termo_536");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("ferrugem"));
//    }
//
//    @Test
//    public void test_termo_537() {
//        System.out.println(">>>>  test_termo_537");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento cidade baixa porto alegre"));
//    }
//
//    @Test
//    public void test_termo_538() {
//        System.out.println(">>>>  test_termo_538");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("terrenos"));
//    }
//
//    @Test
//    public void test_termo_539() {
//        System.out.println(">>>>  test_termo_539");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento partenon"));
//    }
//
//    @Test
//    public void test_termo_540() {
//        System.out.println(">>>>  test_termo_540");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("cobertura balneario camboriu"));
//    }
//
//    @Test
//    public void test_termo_541() {
//        System.out.println(">>>>  test_termo_541");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa santa maria"));
//    }
//
//    @Test
//    public void test_termo_542() {
//        System.out.println(">>>>  test_termo_542");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casas em cachoeirinha rs"));
//    }
//
//    @Test
//    public void test_termo_543() {
//        System.out.println(">>>>  test_termo_543");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("\"Terrabela Planalto\""));
//    }
//
//    @Test
//    public void test_termo_544() {
//        System.out.println(">>>>  test_termo_544");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("\"Marina Beach Towers\""));
//    }
//
//    @Test
//    public void test_termo_545() {
//        System.out.println(">>>>  test_termo_545");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("barra da lagoa"));
//    }
//
//    @Test
//    public void test_termo_546() {
//        System.out.println(">>>>  test_termo_546");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento sao jose sc"));
//    }
//
//    @Test
//    public void test_termo_547() {
//        System.out.println(">>>>  test_termo_547");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamentos 2 e 3 dormitórios em florianópolis"));
//    }
//
//    @Test
//    public void test_termo_548() {
//        System.out.println(">>>>  test_termo_548");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("propriedade+rural fazenda"));
//    }
//
//    @Test
//    public void test_termo_549() {
//        System.out.println(">>>>  test_termo_549");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento floresta porto alegre"));
//    }
//
//    @Test
//    public void test_termo_550() {
//        System.out.println(">>>>  test_termo_550");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("jurere internacional"));
//    }
//
//    @Test
//    public void test_termo_551() {
//        System.out.println(">>>>  test_termo_551");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("restinga"));
//    }
//
//    @Test
//    public void test_termo_552() {
//        System.out.println(">>>>  test_termo_552");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("brava"));
//    }
//
//    @Test
//    public void test_termo_553() {
//        System.out.println(">>>>  test_termo_553");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em capao da canoa rs"));
//    }
//
//    @Test
//    public void test_termo_554() {
//        System.out.println(">>>>  test_termo_554");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Terreno Arambare"));
//    }
//
//    @Test
//    public void test_termo_555() {
//        System.out.println(">>>>  test_termo_555");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamentos em camboriu"));
//    }
//
//    @Test
//    public void test_termo_556() {
//        System.out.println(">>>>  test_termo_556");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Casa Tr"));
//    }
//
//    @Test
//    public void test_termo_557() {
//        System.out.println(">>>>  test_termo_557");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("arroio do sal rs"));
//    }
//
//    @Test
//    public void test_termo_558() {
//        System.out.println(">>>>  test_termo_558");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamentos em porto alegre"));
//    }
//
//    @Test
//    public void test_termo_559() {
//        System.out.println(">>>>  test_termo_559");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imóvel itajaí"));
//    }
//
//    @Test
//    public void test_termo_560() {
//        System.out.println(">>>>  test_termo_560");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento em canoas"));
//    }
//
//    @Test
//    public void test_termo_561() {
//        System.out.println(">>>>  test_termo_561");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imbe"));
//    }
//
//    @Test
//    public void test_termo_562() {
//        System.out.println(">>>>  test_termo_562");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa na tristeza em porto alegre rs"));
//    }
//
//    @Test
//    public void test_termo_563() {
//        System.out.println(">>>>  test_termo_563");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em viamão"));
//    }
//
//    @Test
//    public void test_termo_564() {
//        System.out.println(">>>>  test_termo_564");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("joinville bairro Espinheiros"));
//    }
//
//    @Test
//    public void test_termo_565() {
//        System.out.println(">>>>  test_termo_565");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("santa catarina"));
//    }
//
//    @Test
//    public void test_termo_566() {
//        System.out.println(">>>>  test_termo_566");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("cidreira rs"));
//    }
//
//    @Test
//    public void test_termo_567() {
//        System.out.println(">>>>  test_termo_567");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("garopaba"));
//    }
//
//    @Test
//    public void test_termo_568() {
//        System.out.println(">>>>  test_termo_568");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento em torres rs"));
//    }
//
//    @Test
//    public void test_termo_569() {
//        System.out.println(">>>>  test_termo_569");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento 2 dormitórios em porto alegre"));
//    }
//
//    @Test
//    public void test_termo_570() {
//        System.out.println(">>>>  test_termo_570");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em caxias do sul"));
//    }
//
//    @Test
//    public void test_termo_571() {
//        System.out.println(">>>>  test_termo_571");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento 2 dormitorios"));
//    }
//
//    @Test
//    public void test_termo_572() {
//        System.out.println(">>>>  test_termo_572");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imoveis P"));
//    }
//
//    @Test
//    public void test_termo_573() {
//        System.out.println(">>>>  test_termo_573");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Imoveis em viamão"));
//    }
//
//    @Test
//    public void test_termo_574() {
//        System.out.println(">>>>  test_termo_574");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("flat porto alegre"));
//    }
//
//    @Test
//    public void test_termo_575() {
//        System.out.println(">>>>  test_termo_575");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Casas em tramandai"));
//    }
//
//    @Test
//    public void test_termo_576() {
//        System.out.println(">>>>  test_termo_576");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("cobertura em porto alegre"));
//    }
//
//    @Test
//    public void test_termo_577() {
//        System.out.println(">>>>  test_termo_577");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa 2 dormitorios"));
//    }
//
//    @Test
//    public void test_termo_578() {
//        System.out.println(">>>>  test_termo_578");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em condominio na tristeza"));
//    }
//
//    @Test
//    public void test_termo_579() {
//        System.out.println(">>>>  test_termo_579");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("terreno em florianopolis"));
//    }
//
//    @Test
//    public void test_termo_580() {
//        System.out.println(">>>>  test_termo_580");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("praias rs"));
//    }
//
//    @Test
//    public void test_termo_581() {
//        System.out.println(">>>>  test_termo_581");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("ucs"));
//    }
//
//    @Test
//    public void test_termo_582() {
//        System.out.println(">>>>  test_termo_582");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento em Porto Alegre"));
//    }
//
//    @Test
//    public void test_termo_583() {
//        System.out.println(">>>>  test_termo_583");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("região metropolitana porto alegre"));
//    }
//
//    @Test
//    public void test_termo_584() {
//        System.out.println(">>>>  test_termo_584");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa 02 dormitórios em porto alegre"));
//    }
//
//    @Test
//    public void test_termo_585() {
//        System.out.println(">>>>  test_termo_585");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casas em tramandai"));
//    }
//
//    @Test
//    public void test_termo_586() {
//        System.out.println(">>>>  test_termo_586");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("terreno em canoas"));
//    }
//
//    @Test
//    public void test_termo_587() {
//        System.out.println(">>>>  test_termo_587");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Apartamentos Florianopolis"));
//    }
//
//    @Test
//    public void test_termo_588() {
//        System.out.println(">>>>  test_termo_588");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento em blumenau"));
//    }
//
//    @Test
//    public void test_termo_589() {
//        System.out.println(">>>>  test_termo_589");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Casas em Porto Alegre no bairro guarujá"));
//    }
//
//    @Test
//    public void test_termo_590() {
//        System.out.println(">>>>  test_termo_590");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("palhoça"));
//    }
//
//    @Test
//    public void test_termo_591() {
//        System.out.println(">>>>  test_termo_591");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("comerciais"));
//    }
//
//    @Test
//    public void test_termo_592() {
//        System.out.println(">>>>  test_termo_592");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento centro florianopolis"));
//    }
//
//    @Test
//    public void test_termo_593() {
//        System.out.println(">>>>  test_termo_593");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado no n"));
//    }
//
//    @Test
//    public void test_termo_594() {
//        System.out.println(">>>>  test_termo_594");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("bom fim porto alegre"));
//    }
//
//    @Test
//    public void test_termo_595() {
//        System.out.println(">>>>  test_termo_595");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("bombinhas aluguel por temporada"));
//    }
//
//    @Test
//    public void test_termo_596() {
//        System.out.println(">>>>  test_termo_596");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa tramandai"));
//    }
//
//    @Test
//    public void test_termo_597() {
//        System.out.println(">>>>  test_termo_597");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("praia rs"));
//    }
//
//    @Test
//    public void test_termo_598() {
//        System.out.println(">>>>  test_termo_598");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("são leopoldo"));
//    }
//
//    @Test
//    public void test_termo_599() {
//        System.out.println(">>>>  test_termo_599");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa no litoral do rs"));
//    }
//
//    @Test
//    public void test_termo_600() {
//        System.out.println(">>>>  test_termo_600");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("magisterio"));
//    }
//
//    @Test
//    public void test_termo_601() {
//        System.out.println(">>>>  test_termo_601");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento mobiliado em porto alegre"));
//    }
//
//    @Test
//    public void test_termo_602() {
//        System.out.println(">>>>  test_termo_602");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento mobiliado"));
//    }
//
//    @Test
//    public void test_termo_603() {
//        System.out.println(">>>>  test_termo_603");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento em porto alegre bairro menino deus"));
//    }
//
//    @Test
//    public void test_termo_604() {
//        System.out.println(">>>>  test_termo_604");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento caxias do sul"));
//    }
//
//    @Test
//    public void test_termo_605() {
//        System.out.println(">>>>  test_termo_605");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("1 dormitorio mobiliado"));
//    }
//
//    @Test
//    public void test_termo_606() {
//        System.out.println(">>>>  test_termo_606");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casas em capao da canoa"));
//    }
//
//    @Test
//    public void test_termo_607() {
//        System.out.println(">>>>  test_termo_607");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Garopaba"));
//    }
//
//    @Test
//    public void test_termo_608() {
//        System.out.println(">>>>  test_termo_608");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa hipica"));
//    }
//
//    @Test
//    public void test_termo_609() {
//        System.out.println(">>>>  test_termo_609");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("kitinete em florianópolis"));
//    }
//
//    @Test
//    public void test_termo_610() {
//        System.out.println(">>>>  test_termo_610");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento cidade baixa"));
//    }
//
//    @Test
//    public void test_termo_611() {
//        System.out.println(">>>>  test_termo_611");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("cachoeira do bom jesus"));
//    }
//
//    @Test
//    public void test_termo_612() {
//        System.out.println(">>>>  test_termo_612");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento em são leopoldo"));
//    }
//
//    @Test
//    public void test_termo_613() {
//        System.out.println(">>>>  test_termo_613");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa garopaba"));
//    }
//
//    @Test
//    public void test_termo_614() {
//        System.out.println(">>>>  test_termo_614");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento cidade baixa"));
//    }
//
//    @Test
//    public void test_termo_615() {
//        System.out.println(">>>>  test_termo_615");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento de 3 dormitorios em porto alegre rs"));
//    }
//
//    @Test
//    public void test_termo_616() {
//        System.out.println(">>>>  test_termo_616");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento menino deus porto alegre"));
//    }
//
//    @Test
//    public void test_termo_617() {
//        System.out.println(">>>>  test_termo_617");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em capão da canoa"));
//    }
//
//    @Test
//    public void test_termo_618() {
//        System.out.println(">>>>  test_termo_618");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("tramandai aluguel casa"));
//    }
//
//    @Test
//    public void test_termo_619() {
//        System.out.println(">>>>  test_termo_619");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("lojas comercial em porto alegre"));
//    }
//
//    @Test
//    public void test_termo_620() {
//        System.out.println(">>>>  test_termo_620");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa de 04 dormitorios"));
//    }
//
//    @Test
//    public void test_termo_621() {
//        System.out.println(">>>>  test_termo_621");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento de 3 dormitórios em porto alegre"));
//    }
//
//    @Test
//    public void test_termo_622() {
//        System.out.println(">>>>  test_termo_622");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casas em florianopolis"));
//    }
//
//    @Test
//    public void test_termo_623() {
//        System.out.println(">>>>  test_termo_623");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Apartamentos Florianópolis"));
//    }
//
//    @Test
//    public void test_termo_624() {
//        System.out.println(">>>>  test_termo_624");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casas em porto alegre bairro partenon"));
//    }
//
//    @Test
//    public void test_termo_625() {
//        System.out.println(">>>>  test_termo_625");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado em tramandai"));
//    }
//
//    @Test
//    public void test_termo_626() {
//        System.out.println(">>>>  test_termo_626");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamentos de 03 dormitórios em Torres RS"));
//    }
//
//    @Test
//    public void test_termo_627() {
//        System.out.println(">>>>  test_termo_627");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casas em xangri la"));
//    }
//
//    @Test
//    public void test_termo_628() {
//        System.out.println(">>>>  test_termo_628");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Casas em Xangri la"));
//    }
//
//    @Test
//    public void test_termo_629() {
//        System.out.println(">>>>  test_termo_629");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa sao jose sc"));
//    }
//
//    @Test
//    public void test_termo_630() {
//        System.out.println(">>>>  test_termo_630");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa com piscina em florianopolis"));
//    }
//
//    @Test
//    public void test_termo_631() {
//        System.out.println(">>>>  test_termo_631");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("blumenau"));
//    }
//
//    @Test
//    public void test_termo_632() {
//        System.out.println(">>>>  test_termo_632");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casas"));
//    }
//
//    @Test
//    public void test_termo_633() {
//        System.out.println(">>>>  test_termo_633");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em xangrila rs"));
//    }
//
//    @Test
//    public void test_termo_634() {
//        System.out.println(">>>>  test_termo_634");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sala comercial porto alegre"));
//    }
//
//    @Test
//    public void test_termo_635() {
//        System.out.println(">>>>  test_termo_635");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("salas comerciais em porto alegre"));
//    }
//
//    @Test
//    public void test_termo_636() {
//        System.out.println(">>>>  test_termo_636");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Apartamento Para"));
//    }
//
//    @Test
//    public void test_termo_637() {
//        System.out.println(">>>>  test_termo_637");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Florianopolis"));
//    }
//
//    @Test
//    public void test_termo_638() {
//        System.out.println(">>>>  test_termo_638");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa comercial"));
//    }
//
//    @Test
//    public void test_termo_639() {
//        System.out.println(">>>>  test_termo_639");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento 02 dormitorios em porto alegre"));
//    }
//
//    @Test
//    public void test_termo_640() {
//        System.out.println(">>>>  test_termo_640");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("departamento em florianopolis"));
//    }
//
//    @Test
//    public void test_termo_641() {
//        System.out.println(">>>>  test_termo_641");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa gravatai"));
//    }
//
//    @Test
//    public void test_termo_642() {
//        System.out.println(">>>>  test_termo_642");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento em florianopolis sc"));
//    }
//
//    @Test
//    public void test_termo_643() {
//        System.out.println(">>>>  test_termo_643");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("noblesse"));
//    }
//
//    @Test
//    public void test_termo_644() {
//        System.out.println(">>>>  test_termo_644");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Apartamentos no centro de Florianópolis"));
//    }
//
//    @Test
//    public void test_termo_645() {
//        System.out.println(">>>>  test_termo_645");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("deposito em porto alegre"));
//    }
//
//    @Test
//    public void test_termo_646() {
//        System.out.println(">>>>  test_termo_646");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento em florianópolis sc"));
//    }
//
//    @Test
//    public void test_termo_647() {
//        System.out.println(">>>>  test_termo_647");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento itapema"));
//    }
//
//    @Test
//    public void test_termo_648() {
//        System.out.println(">>>>  test_termo_648");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("mobiliado porto alegre"));
//    }
//
//    @Test
//    public void test_termo_649() {
//        System.out.println(">>>>  test_termo_649");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("terreno caxias do sul"));
//    }
//
//    @Test
//    public void test_termo_650() {
//        System.out.println(">>>>  test_termo_650");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casas em tramandai rs"));
//    }
//
//    @Test
//    public void test_termo_651() {
//        System.out.println(">>>>  test_termo_651");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado em florianopolis"));
//    }
//
//    @Test
//    public void test_termo_652() {
//        System.out.println(">>>>  test_termo_652");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado no meia praia em itapema"));
//    }
//
//    @Test
//    public void test_termo_653() {
//        System.out.println(">>>>  test_termo_653");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa no bairro partenon em Porto Alegre"));
//    }
//
//    @Test
//    public void test_termo_654() {
//        System.out.println(">>>>  test_termo_654");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado em criciuma"));
//    }
//
//    @Test
//    public void test_termo_655() {
//        System.out.println(">>>>  test_termo_655");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento de 1 dormitorio em porto alegre"));
//    }
//
//    @Test
//    public void test_termo_656() {
//        System.out.println(">>>>  test_termo_656");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento de 1 dormitorio em porto alegre"));
//    }
//
//    @Test
//    public void test_termo_657() {
//        System.out.println(">>>>  test_termo_657");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Apartamento Esta"));
//    }
//
//    @Test
//    public void test_termo_658() {
//        System.out.println(">>>>  test_termo_658");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("ingleses florianopolis"));
//    }
//
//    @Test
//    public void test_termo_659() {
//        System.out.println(">>>>  test_termo_659");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado em caxias do sul"));
//    }
//
//    @Test
//    public void test_termo_660() {
//        System.out.println(">>>>  test_termo_660");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imóveis imbituba"));
//    }
//
//    @Test
//    public void test_termo_661() {
//        System.out.println(">>>>  test_termo_661");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("daniela"));
//    }
//
//    @Test
//    public void test_termo_662() {
//        System.out.println(">>>>  test_termo_662");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamentos em florianópolis"));
//    }
//
//    @Test
//    public void test_termo_663() {
//        System.out.println(">>>>  test_termo_663");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("andradas porto alegre"));
//    }
//
//    @Test
//    public void test_termo_664() {
//        System.out.println(">>>>  test_termo_664");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Porto alegre"));
//    }
//
//    @Test
//    public void test_termo_665() {
//        System.out.println(">>>>  test_termo_665");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento 2 dormitórios porto alegre"));
//    }
//
//    @Test
//    public void test_termo_666() {
//        System.out.println(">>>>  test_termo_666");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("cobertura em florianopolis"));
//    }
//
//    @Test
//    public void test_termo_667() {
//        System.out.println(">>>>  test_termo_667");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento 2 e 3 dormitórios vaga garagem porto alegre"));
//    }
//
//    @Test
//    public void test_termo_668() {
//        System.out.println(">>>>  test_termo_668");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em florianópolis"));
//    }
//
//    @Test
//    public void test_termo_669() {
//        System.out.println(">>>>  test_termo_669");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("biguaçu"));
//    }
//
//    @Test
//    public void test_termo_670() {
//        System.out.println(">>>>  test_termo_670");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casas em bombinhas"));
//    }
//
//    @Test
//    public void test_termo_671() {
//        System.out.println(">>>>  test_termo_671");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("pinhal"));
//    }
//
//    @Test
//    public void test_termo_672() {
//        System.out.println(">>>>  test_termo_672");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casas em blumenau"));
//    }
//
//    @Test
//    public void test_termo_673() {
//        System.out.println(">>>>  test_termo_673");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento em balneario camboriu"));
//    }
//
//    @Test
//    public void test_termo_674() {
//        System.out.println(">>>>  test_termo_674");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imóvel anita garibaldi porto alegre"));
//    }
//
//    @Test
//    public void test_termo_675() {
//        System.out.println(">>>>  test_termo_675");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Apartamento P"));
//    }
//
//    @Test
//    public void test_termo_676() {
//        System.out.println(">>>>  test_termo_676");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa campeche"));
//    }
//
//    @Test
//    public void test_termo_677() {
//        System.out.println(">>>>  test_termo_677");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado em gravatai"));
//    }
//
//    @Test
//    public void test_termo_678() {
//        System.out.println(">>>>  test_termo_678");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("terrenos porto alegre"));
//    }
//
//    @Test
//    public void test_termo_679() {
//        System.out.println(">>>>  test_termo_679");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("trindade florianópolis"));
//    }
//
//    @Test
//    public void test_termo_680() {
//        System.out.println(">>>>  test_termo_680");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento 2 dormitorios porto alegre"));
//    }
//
//    @Test
//    public void test_termo_681() {
//        System.out.println(">>>>  test_termo_681");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("terreno em blumenau sc"));
//    }
//
//    @Test
//    public void test_termo_682() {
//        System.out.println(">>>>  test_termo_682");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento em floripa"));
//    }
//
//    @Test
//    public void test_termo_683() {
//        System.out.println(">>>>  test_termo_683");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casas em capão da canoa rs"));
//    }
//
//    @Test
//    public void test_termo_684() {
//        System.out.println(">>>>  test_termo_684");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("loja porto alegre"));
//    }
//
//    @Test
//    public void test_termo_685() {
//        System.out.println(">>>>  test_termo_685");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("nova tramandai"));
//    }
//
//    @Test
//    public void test_termo_686() {
//        System.out.println(">>>>  test_termo_686");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento torres rs"));
//    }
//
//    @Test
//    public void test_termo_687() {
//        System.out.println(">>>>  test_termo_687");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa viamão"));
//    }
//
//    @Test
//    public void test_termo_688() {
//        System.out.println(">>>>  test_termo_688");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("punta del este"));
//    }
//
    @Test
    public void test_termo_689() {
        System.out.println(">>>>  test_termo_689");
        assertEquals("{cidade=[Porto Alegre], Tipo de imóvel=[Sala Comercial]}", engImoveis.obtemParametrosAsString("salas comerciais em porto alegre"));
    }
//
//    @Test
//    public void test_termo_690() {
//        System.out.println(">>>>  test_termo_690");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento auxiliadora porto alegre"));
//    }
//
//    @Test
//    public void test_termo_691() {
//        System.out.println(">>>>  test_termo_691");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sitios em gravatai"));
//    }
//
//    @Test
//    public void test_termo_692() {
//        System.out.println(">>>>  test_termo_692");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("cidade baixa porto alegre"));
//    }
//
//    @Test
//    public void test_termo_693() {
//        System.out.println(">>>>  test_termo_693");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("porto alegre Gonçalo de Carvalho"));
//    }
//
//    @Test
//    public void test_termo_694() {
//        System.out.println(">>>>  test_termo_694");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado em capao da canoa"));
//    }
//
//    @Test
//    public void test_termo_695() {
//        System.out.println(">>>>  test_termo_695");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Casas 3 dormitórios em Joinville"));
//    }
//
//    @Test
//    public void test_termo_696() {
//        System.out.println(">>>>  test_termo_696");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa ecoville porto alegre"));
//    }
//
//    @Test
//    public void test_termo_697() {
//        System.out.println(">>>>  test_termo_697");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("terreno em caxias do sul"));
//    }
//
//    @Test
//    public void test_termo_698() {
//        System.out.println(">>>>  test_termo_698");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casas em torres"));
//    }
//
//    @Test
//    public void test_termo_699() {
//        System.out.println(">>>>  test_termo_699");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casas em imbe"));
//    }
//
//    @Test
//    public void test_termo_700() {
//        System.out.println(">>>>  test_termo_700");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("costa esmeralda"));
//    }
//
//    @Test
//    public void test_termo_701() {
//        System.out.println(">>>>  test_termo_701");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa com piscina"));
//    }
//
//    @Test
//    public void test_termo_702() {
//        System.out.println(">>>>  test_termo_702");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("blumenau"));
//    }
//
//    @Test
//    public void test_termo_703() {
//        System.out.println(">>>>  test_termo_703");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento no centro de porto alegre"));
//    }
//
//    @Test
//    public void test_termo_704() {
//        System.out.println(">>>>  test_termo_704");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imovel na planta porto alegre"));
//    }
//
//    @Test
//    public void test_termo_705() {
//        System.out.println(">>>>  test_termo_705");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Avenida Bento Gonçalves"));
//    }
//
//    @Test
//    public void test_termo_706() {
//        System.out.println(">>>>  test_termo_706");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("terreno em alvorada rs"));
//    }
//
//    @Test
//    public void test_termo_707() {
//        System.out.println(">>>>  test_termo_707");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("mansão porto alegre"));
//    }
//
//    @Test
//    public void test_termo_708() {
//        System.out.println(">>>>  test_termo_708");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento blumenau"));
//    }
//
//    @Test
//    public void test_termo_709() {
//        System.out.println(">>>>  test_termo_709");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento jardim itu sabara"));
//    }
//
//    @Test
//    public void test_termo_710() {
//        System.out.println(">>>>  test_termo_710");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("itajai"));
//    }
//
//    @Test
//    public void test_termo_711() {
//        System.out.println(">>>>  test_termo_711");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento 2 dormitorios com garagem no jardim ipiranga porto alegre"));
//    }
//
//    @Test
//    public void test_termo_712() {
//        System.out.println(">>>>  test_termo_712");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("aluguel temporada no rs"));
//    }
//
//    @Test
//    public void test_termo_713() {
//        System.out.println(">>>>  test_termo_713");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento na cidade baixa"));
//    }
//
//    @Test
//    public void test_termo_714() {
//        System.out.println(">>>>  test_termo_714");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento ingleses"));
//    }
//
//    @Test
//    public void test_termo_715() {
//        System.out.println(">>>>  test_termo_715");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Porto alegre"));
//    }
//
//    @Test
//    public void test_termo_716() {
//        System.out.println(">>>>  test_termo_716");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("santa rosa"));
//    }
//
//    @Test
//    public void test_termo_717() {
//        System.out.println(">>>>  test_termo_717");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Florianopolis"));
//    }
//
//    @Test
//    public void test_termo_718() {
//        System.out.println(">>>>  test_termo_718");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento 1 dormitorio mobiliado porto alegre"));
//    }
//
//    @Test
//    public void test_termo_719() {
//        System.out.println(">>>>  test_termo_719");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em condominio porto alegre"));
//    }
//
//    @Test
//    public void test_termo_720() {
//        System.out.println(">>>>  test_termo_720");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento porto alegre centro"));
//    }
//
//    @Test
//    public void test_termo_721() {
//        System.out.println(">>>>  test_termo_721");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Casa no bairro petropolis"));
//    }
//
//    @Test
//    public void test_termo_722() {
//        System.out.println(">>>>  test_termo_722");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Terreno Ca"));
//    }
//
//    @Test
//    public void test_termo_723() {
//        System.out.println(">>>>  test_termo_723");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sitios"));
//    }
//
//    @Test
//    public void test_termo_724() {
//        System.out.println(">>>>  test_termo_724");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado"));
//    }
//
//    @Test
//    public void test_termo_725() {
//        System.out.println(">>>>  test_termo_725");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado no jardim planalto em porto alegre"));
//    }
//
//    @Test
//    public void test_termo_726() {
//        System.out.println(">>>>  test_termo_726");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imoveis F"));
//    }
//
//    @Test
//    public void test_termo_727() {
//        System.out.println(">>>>  test_termo_727");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imovel em garopaba"));
//    }
//
//    @Test
//    public void test_termo_728() {
//        System.out.println(">>>>  test_termo_728");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("propriedade+rural chacara"));
//    }
//
//    @Test
//    public void test_termo_729() {
//        System.out.println(">>>>  test_termo_729");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("litoral rs"));
//    }
//
//    @Test
//    public void test_termo_730() {
//        System.out.println(">>>>  test_termo_730");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("jardim do salso"));
//    }
//
//    @Test
//    public void test_termo_731() {
//        System.out.println(">>>>  test_termo_731");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Casas em Porto Alegre"));
//    }
//
//    @Test
//    public void test_termo_732() {
//        System.out.println(">>>>  test_termo_732");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa florianópolis"));
//    }
//
//    @Test
//    public void test_termo_733() {
//        System.out.println(">>>>  test_termo_733");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Araquari"));
//    }
//
//    @Test
//    public void test_termo_734() {
//        System.out.println(">>>>  test_termo_734");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("centro histórico porto alegre"));
//    }
//
//    @Test
//    public void test_termo_735() {
//        System.out.println(">>>>  test_termo_735");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Apartamentos em Joinville"));
//    }
//
//    @Test
//    public void test_termo_736() {
//        System.out.println(">>>>  test_termo_736");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("varanda porto alegre"));
//    }
//
//    @Test
//    public void test_termo_737() {
//        System.out.println(">>>>  test_termo_737");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("churrasqueira apartamento porto alegre"));
//    }
//
//    @Test
//    public void test_termo_738() {
//        System.out.println(">>>>  test_termo_738");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sitio em viamao"));
//    }
//
//    @Test
//    public void test_termo_739() {
//        System.out.println(">>>>  test_termo_739");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento em florianópolis"));
//    }
//
//    @Test
//    public void test_termo_740() {
//        System.out.println(">>>>  test_termo_740");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em Florianópolis"));
//    }
//
//    @Test
//    public void test_termo_741() {
//        System.out.println(">>>>  test_termo_741");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imóvel casemiro de abreu"));
//    }
//
//    @Test
//    public void test_termo_742() {
//        System.out.println(">>>>  test_termo_742");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Casas em Atlantida"));
//    }
//
//    @Test
//    public void test_termo_743() {
//        System.out.println(">>>>  test_termo_743");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento em sao jose sc"));
//    }
//
//    @Test
//    public void test_termo_744() {
//        System.out.println(">>>>  test_termo_744");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("hotel porto alegre"));
//    }
//
//    @Test
//    public void test_termo_745() {
//        System.out.println(">>>>  test_termo_745");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em jurere internacional florianopolis"));
//    }
//
//    @Test
//    public void test_termo_746() {
//        System.out.println(">>>>  test_termo_746");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa  3 dormitorios em viamao"));
//    }
//
//    @Test
//    public void test_termo_747() {
//        System.out.println(">>>>  test_termo_747");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em imbé rs"));
//    }
//
//    @Test
//    public void test_termo_748() {
//        System.out.println(">>>>  test_termo_748");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("gravatai"));
//    }
//
//    @Test
//    public void test_termo_749() {
//        System.out.println(">>>>  test_termo_749");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Imoveis em cachoeirinha"));
//    }
//
//    @Test
//    public void test_termo_750() {
//        System.out.println(">>>>  test_termo_750");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sala comercial florianopolis"));
//    }
//
//    @Test
//    public void test_termo_751() {
//        System.out.println(">>>>  test_termo_751");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("atlantida sul"));
//    }
//
//    @Test
//    public void test_termo_752() {
//        System.out.println(">>>>  test_termo_752");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("kitinete em Florianópolis"));
//    }
//
//    @Test
//    public void test_termo_753() {
//        System.out.println(">>>>  test_termo_753");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento centro porto alegre"));
//    }
//
//    @Test
//    public void test_termo_754() {
//        System.out.println(">>>>  test_termo_754");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imoveis Balneario Camboriu"));
//    }
//
//    @Test
//    public void test_termo_755() {
//        System.out.println(">>>>  test_termo_755");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento 1 dormitório em porto alegre"));
//    }
//
//    @Test
//    public void test_termo_756() {
//        System.out.println(">>>>  test_termo_756");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Casa Morada Além do Horizonte Passo Fundo"));
//    }
//
//    @Test
//    public void test_termo_757() {
//        System.out.println(">>>>  test_termo_757");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado em alvorada"));
//    }
//
//    @Test
//    public void test_termo_758() {
//        System.out.println(">>>>  test_termo_758");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em santa catarina"));
//    }
//
//    @Test
//    public void test_termo_759() {
//        System.out.println(">>>>  test_termo_759");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em viamão rs"));
//    }
//
//    @Test
//    public void test_termo_760() {
//        System.out.println(">>>>  test_termo_760");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imoveis Ca"));
//    }
//
//    @Test
//    public void test_termo_761() {
//        System.out.println(">>>>  test_termo_761");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Terreno Esta"));
//    }
//
//    @Test
//    public void test_termo_762() {
//        System.out.println(">>>>  test_termo_762");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento torres"));
//    }
//
//    @Test
//    public void test_termo_763() {
//        System.out.println(">>>>  test_termo_763");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casas e sobrados em poa rs"));
//    }
//
//    @Test
//    public void test_termo_764() {
//        System.out.println(">>>>  test_termo_764");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento capão da canoa"));
//    }
//
//    @Test
//    public void test_termo_765() {
//        System.out.println(">>>>  test_termo_765");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Casas na Zona Norte de Porto Alegre"));
//    }
//
//    @Test
//    public void test_termo_766() {
//        System.out.println(">>>>  test_termo_766");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento 3 dormitorios em higienopolis"));
//    }
//
//    @Test
//    public void test_termo_767() {
//        System.out.println(">>>>  test_termo_767");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imóveis palhoça"));
//    }
//
//    @Test
//    public void test_termo_768() {
//        System.out.println(">>>>  test_termo_768");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Casa Alphaville Porto Alegre"));
//    }
//
//    @Test
//    public void test_termo_769() {
//        System.out.println(">>>>  test_termo_769");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("porto alegre Cristiano Kraemer"));
//    }
//
//    @Test
//    public void test_termo_770() {
//        System.out.println(">>>>  test_termo_770");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("alugar imovel"));
//    }
//
//    @Test
//    public void test_termo_771() {
//        System.out.println(">>>>  test_termo_771");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em canoas"));
//    }
//
    @Test
    public void test_termo_772() {
        System.out.println(">>>>  test_termo_772");
        assertEquals("{cidade=[Porto Alegre]}", engImoveis.obtemParametrosAsString("imóvel \"rua dos andradas\" porto alegre"));
    }
//
//    @Test
//    public void test_termo_773() {
//        System.out.println(">>>>  test_termo_773");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("kitinete em Florianópolis"));
//    }
//
//    @Test
//    public void test_termo_774() {
//        System.out.println(">>>>  test_termo_774");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em condominio em porto alegre"));
//    }
//
//    @Test
//    public void test_termo_775() {
//        System.out.println(">>>>  test_termo_775");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("chacaras caxias do sul"));
//    }
//
//    @Test
//    public void test_termo_776() {
//        System.out.println(">>>>  test_termo_776");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("kitnet"));
//    }
//
//    @Test
//    public void test_termo_777() {
//        System.out.println(">>>>  test_termo_777");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Casa Três de Maio"));
//    }
//
//    @Test
//    public void test_termo_778() {
//        System.out.println(">>>>  test_termo_778");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento em capao da canoa"));
//    }
//
//    @Test
//    public void test_termo_779() {
//        System.out.println(">>>>  test_termo_779");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento de 3 dormitorios no bairro menino deus em porto alegre"));
//    }
//
//    @Test
//    public void test_termo_780() {
//        System.out.println(">>>>  test_termo_780");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Capao da canoa"));
//    }
//
//    @Test
//    public void test_termo_781() {
//        System.out.println(">>>>  test_termo_781");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casas em porto alegre no bairro partenon"));
//    }
//
//    @Test
//    public void test_termo_782() {
//        System.out.println(">>>>  test_termo_782");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento coqueiros"));
//    }
//
//    @Test
//    public void test_termo_783() {
//        System.out.println(">>>>  test_termo_783");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Casa Esta"));
//    }
//
//    @Test
//    public void test_termo_784() {
//        System.out.println(">>>>  test_termo_784");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado em sao leopoldo"));
//    }
//
//    @Test
//    public void test_termo_785() {
//        System.out.println(">>>>  test_termo_785");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado no ingleses em florianopolis"));
//    }
//
//    @Test
//    public void test_termo_786() {
//        System.out.println(">>>>  test_termo_786");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("bosque das mansões"));
//    }
//
//    @Test
//    public void test_termo_787() {
//        System.out.println(">>>>  test_termo_787");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento 1 dormitório porto alegre centro"));
//    }
//
//    @Test
//    public void test_termo_788() {
//        System.out.println(">>>>  test_termo_788");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("garopaba sc"));
//    }
//
//    @Test
//    public void test_termo_789() {
//        System.out.println(">>>>  test_termo_789");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("joaquina"));
//    }
//
//    @Test
//    public void test_termo_790() {
//        System.out.println(">>>>  test_termo_790");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("porto alegre Osvaldo Aranha"));
//    }
//
//    @Test
//    public void test_termo_791() {
//        System.out.println(">>>>  test_termo_791");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em porto alegre zona norte"));
//    }
//
//    @Test
//    public void test_termo_792() {
//        System.out.println(">>>>  test_termo_792");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apto em porto alegre"));
//    }
//
//    @Test
//    public void test_termo_793() {
//        System.out.println(">>>>  test_termo_793");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa blumenau"));
//    }
//
//    @Test
//    public void test_termo_794() {
//        System.out.println(">>>>  test_termo_794");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Casa em pelotas"));
//    }
//
//    @Test
//    public void test_termo_795() {
//        System.out.println(">>>>  test_termo_795");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa condominio porto alegre zona sul"));
//    }
//
//    @Test
//    public void test_termo_796() {
//        System.out.println(">>>>  test_termo_796");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("atlantida rs"));
//    }
//
//    @Test
//    public void test_termo_797() {
//        System.out.println(">>>>  test_termo_797");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa torres"));
//    }
//
//    @Test
//    public void test_termo_798() {
//        System.out.println(">>>>  test_termo_798");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa alvorada rs"));
//    }
//
//    @Test
//    public void test_termo_799() {
//        System.out.println(">>>>  test_termo_799");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Résidence du Lac"));
//    }
//
//    @Test
//    public void test_termo_800() {
//        System.out.println(">>>>  test_termo_800");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("mansão florianopolis"));
//    }
//
//    @Test
//    public void test_termo_801() {
//        System.out.println(">>>>  test_termo_801");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento 1 dormitorio em porto alegre"));
//    }
//
//    @Test
//    public void test_termo_802() {
//        System.out.println(">>>>  test_termo_802");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em imbe"));
//    }
//
//    @Test
//    public void test_termo_803() {
//        System.out.println(">>>>  test_termo_803");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casas em florianopolis"));
//    }
//
//    @Test
//    public void test_termo_804() {
//        System.out.println(">>>>  test_termo_804");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imóvel canela"));
//    }
//
//    @Test
//    public void test_termo_805() {
//        System.out.println(">>>>  test_termo_805");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("chacaras caxias e regiao"));
//    }
//
//    @Test
//    public void test_termo_806() {
//        System.out.println(">>>>  test_termo_806");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa sao leopoldo"));
//    }
//
//    @Test
//    public void test_termo_807() {
//        System.out.println(">>>>  test_termo_807");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Imoveis em Bage"));
//    }
//
//    @Test
//    public void test_termo_808() {
//        System.out.println(">>>>  test_termo_808");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado em camboriu"));
//    }
//
//    @Test
//    public void test_termo_809() {
//        System.out.println(">>>>  test_termo_809");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento de 2 dormitórios sem garagem"));
//    }
//
//    @Test
//    public void test_termo_810() {
//        System.out.println(">>>>  test_termo_810");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em viamao rs"));
//    }
//
//    @Test
//    public void test_termo_811() {
//        System.out.println(">>>>  test_termo_811");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento 1 dormitorio"));
//    }
//
//    @Test
//    public void test_termo_812() {
//        System.out.println(">>>>  test_termo_812");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casas em florianopolis"));
//    }
//
//    @Test
//    public void test_termo_813() {
//        System.out.println(">>>>  test_termo_813");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casas em imbe"));
//    }
//
//    @Test
//    public void test_termo_814() {
//        System.out.println(">>>>  test_termo_814");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("loft em florianopolis"));
//    }
//
//    @Test
//    public void test_termo_815() {
//        System.out.println(">>>>  test_termo_815");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Rio do Sul sc"));
//    }
//
//    @Test
//    public void test_termo_816() {
//        System.out.println(">>>>  test_termo_816");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa florianopolis"));
//    }
//
//    @Test
//    public void test_termo_817() {
//        System.out.println(">>>>  test_termo_817");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("laguna"));
//    }
//
//    @Test
//    public void test_termo_818() {
//        System.out.println(">>>>  test_termo_818");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa bento goncalves"));
//    }
//
//    @Test
//    public void test_termo_819() {
//        System.out.println(">>>>  test_termo_819");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("comprar imovel"));
//    }
//
//    @Test
//    public void test_termo_820() {
//        System.out.println(">>>>  test_termo_820");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em porto alegre zona sul"));
//    }
//
//    @Test
//    public void test_termo_821() {
//        System.out.println(">>>>  test_termo_821");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa joinville venda"));
//    }
//
//    @Test
//    public void test_termo_822() {
//        System.out.println(">>>>  test_termo_822");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apto em tramandai"));
//    }
//
//    @Test
//    public void test_termo_823() {
//        System.out.println(">>>>  test_termo_823");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("praias do rs"));
//    }
//
//    @Test
//    public void test_termo_824() {
//        System.out.println(">>>>  test_termo_824");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("cobertura 3 dormitórios com 2 vagas de garagem em porto alegre"));
//    }
//
//    @Test
//    public void test_termo_825() {
//        System.out.println(">>>>  test_termo_825");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento balneario camboriu"));
//    }
//
//    @Test
//    public void test_termo_826() {
//        System.out.println(">>>>  test_termo_826");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imoveis santa catarina"));
//    }
//
//    @Test
//    public void test_termo_827() {
//        System.out.println(">>>>  test_termo_827");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("praia dos ingleses"));
//    }
//
//    @Test
//    public void test_termo_828() {
//        System.out.println(">>>>  test_termo_828");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("AP 1 PORTO ALEGRE"));
//    }
//
//    @Test
//    public void test_termo_829() {
//        System.out.println(">>>>  test_termo_829");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa e caxias do sul"));
//    }
//
//    @Test
//    public void test_termo_830() {
//        System.out.println(">>>>  test_termo_830");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa no bairro santana em porto alegre"));
//    }
//
//    @Test
//    public void test_termo_831() {
//        System.out.println(">>>>  test_termo_831");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("atlantida"));
//    }
//
//    @Test
//    public void test_termo_832() {
//        System.out.println(">>>>  test_termo_832");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("lojas comerciais em porto alegre"));
//    }
//
//    @Test
//    public void test_termo_833() {
//        System.out.println(">>>>  test_termo_833");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("em torres"));
//    }
//
//    @Test
//    public void test_termo_834() {
//        System.out.println(">>>>  test_termo_834");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("nova tramandai, rs"));
//    }
//
//    @Test
//    public void test_termo_835() {
//        System.out.println(">>>>  test_termo_835");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Imoveis em Porto Alegre"));
//    }
//
//    @Test
//    public void test_termo_836() {
//        System.out.println(">>>>  test_termo_836");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Imóveis Criciuma"));
//    }
//
//    @Test
//    public void test_termo_837() {
//        System.out.println(">>>>  test_termo_837");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imóvel \"padre chagas\""));
//    }
//
//    @Test
//    public void test_termo_838() {
//        System.out.println(">>>>  test_termo_838");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imoveis Para"));
//    }
//
//    @Test
//    public void test_termo_839() {
//        System.out.println(">>>>  test_termo_839");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento 1 dormitorio centro de porto alegre"));
//    }
//
//    @Test
//    public void test_termo_840() {
//        System.out.println(">>>>  test_termo_840");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa com piscina em porto alegre"));
//    }
//
//    @Test
//    public void test_termo_841() {
//        System.out.println(">>>>  test_termo_841");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em gravatai"));
//    }
//
//    @Test
//    public void test_termo_842() {
//        System.out.println(">>>>  test_termo_842");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento jardim europa porto alegre"));
//    }
//
//    @Test
//    public void test_termo_843() {
//        System.out.println(">>>>  test_termo_843");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imoveis em punta del este"));
//    }
//
//    @Test
//    public void test_termo_844() {
//        System.out.println(">>>>  test_termo_844");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("renato silva imoveis"));
//    }
//
//    @Test
//    public void test_termo_845() {
//        System.out.println(">>>>  test_termo_845");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em garopaba"));
//    }
//
//    @Test
//    public void test_termo_846() {
//        System.out.println(">>>>  test_termo_846");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa no bairro centro em tramandai"));
//    }
//
//    @Test
//    public void test_termo_847() {
//        System.out.println(">>>>  test_termo_847");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("aluguel temporada no rs tramandaí"));
//    }
//
//    @Test
//    public void test_termo_848() {
//        System.out.println(">>>>  test_termo_848");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("tramandai"));
//    }
//
//    @Test
//    public void test_termo_849() {
//        System.out.println(">>>>  test_termo_849");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento de 4 quartos em florianopolis"));
//    }
//
//    @Test
//    public void test_termo_850() {
//        System.out.println(">>>>  test_termo_850");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imoveis Arroio dos Ratos"));
//    }
//
//    @Test
//    public void test_termo_851() {
//        System.out.println(">>>>  test_termo_851");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Casa Ca"));
//    }
//
//    @Test
//    public void test_termo_852() {
//        System.out.println(">>>>  test_termo_852");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento 1  dormitorios em porto alegre"));
//    }
//
//    @Test
//    public void test_termo_853() {
//        System.out.println(">>>>  test_termo_853");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("litoral do rio grande do sul"));
//    }
//
//    @Test
//    public void test_termo_854() {
//        System.out.println(">>>>  test_termo_854");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamentos temporada capao da canoa"));
//    }
//
//    @Test
//    public void test_termo_855() {
//        System.out.println(">>>>  test_termo_855");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("loja comercial no centro de porto alegre"));
//    }
//
//    @Test
//    public void test_termo_856() {
//        System.out.println(">>>>  test_termo_856");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("rossi passeio"));
//    }
//
//    @Test
//    public void test_termo_857() {
//        System.out.println(">>>>  test_termo_857");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("campeche florianópolis"));
//    }
//
//    @Test
//    public void test_termo_858() {
//        System.out.println(">>>>  test_termo_858");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("esteio"));
//    }
//
//    @Test
//    public void test_termo_859() {
//        System.out.println(">>>>  test_termo_859");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("terreno em porto alegre"));
//    }
//
//    @Test
//    public void test_termo_860() {
//        System.out.println(">>>>  test_termo_860");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("xangrila"));
//    }
//
//    @Test
//    public void test_termo_861() {
//        System.out.println(">>>>  test_termo_861");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento lavanderia"));
//    }
//
//    @Test
//    public void test_termo_862() {
//        System.out.println(">>>>  test_termo_862");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento dois dormitorios porto alegre com box"));
//    }
//
//    @Test
//    public void test_termo_863() {
//        System.out.println(">>>>  test_termo_863");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento blumenau sc"));
//    }
//
//    @Test
//    public void test_termo_864() {
//        System.out.println(">>>>  test_termo_864");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("rs"));
//    }
//
//    @Test
//    public void test_termo_865() {
//        System.out.println(">>>>  test_termo_865");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Apartamento Tr"));
//    }
//
//    @Test
//    public void test_termo_866() {
//        System.out.println(">>>>  test_termo_866");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imóvel vale do sinos"));
//    }
//
//    @Test
//    public void test_termo_867() {
//        System.out.println(">>>>  test_termo_867");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa ipanema porto alegre"));
//    }
//
//    @Test
//    public void test_termo_868() {
//        System.out.println(">>>>  test_termo_868");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Casa Centro Rio do Sul"));
//    }
//
//    @Test
//    public void test_termo_869() {
//        System.out.println(">>>>  test_termo_869");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apto"));
//    }
//
//    @Test
//    public void test_termo_870() {
//        System.out.println(">>>>  test_termo_870");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Apartamento Ca"));
//    }
//
//    @Test
//    public void test_termo_871() {
//        System.out.println(">>>>  test_termo_871");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("capão da canoa"));
//    }
//
//    @Test
//    public void test_termo_872() {
//        System.out.println(">>>>  test_termo_872");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("pinhal"));
//    }
//
//    @Test
//    public void test_termo_873() {
//        System.out.println(">>>>  test_termo_873");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento 1 dormitorio porto alegre centro"));
//    }
//
//    @Test
//    public void test_termo_874() {
//        System.out.println(">>>>  test_termo_874");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em imbé"));
//    }
//
//    @Test
//    public void test_termo_875() {
//        System.out.println(">>>>  test_termo_875");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casas no litoral rs"));
//    }
//
//    @Test
//    public void test_termo_876() {
//        System.out.println(">>>>  test_termo_876");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em itajai"));
//    }
//
//    @Test
//    public void test_termo_877() {
//        System.out.println(">>>>  test_termo_877");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado em passo fundo"));
//    }
//
//    @Test
//    public void test_termo_878() {
//        System.out.println(">>>>  test_termo_878");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("chacar OR sitio"));
//    }
//
//    @Test
//    public void test_termo_879() {
//        System.out.println(">>>>  test_termo_879");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("residencial porto alegre"));
//    }
//
//    @Test
//    public void test_termo_880() {
//        System.out.println(">>>>  test_termo_880");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Imoveis em novo hamburgo"));
//    }
//
//    @Test
//    public void test_termo_881() {
//        System.out.println(">>>>  test_termo_881");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em são josé sc"));
//    }
//
//    @Test
//    public void test_termo_882() {
//        System.out.println(">>>>  test_termo_882");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imoveis Esta"));
//    }
//
//    @Test
//    public void test_termo_883() {
//        System.out.println(">>>>  test_termo_883");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Apartamento"));
//    }
//
//    @Test
//    public void test_termo_884() {
//        System.out.println(">>>>  test_termo_884");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("ufsc"));
//    }
//
//    @Test
//    public void test_termo_885() {
//        System.out.println(">>>>  test_termo_885");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Imoveis em Pelotas"));
//    }
//
//    @Test
//    public void test_termo_886() {
//        System.out.println(">>>>  test_termo_886");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento cachoeirinha"));
//    }
//
//    @Test
//    public void test_termo_887() {
//        System.out.println(">>>>  test_termo_887");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento Florianopolis"));
//    }
//
//    @Test
//    public void test_termo_888() {
//        System.out.println(">>>>  test_termo_888");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em capao da canoa rs"));
//    }
//
//    @Test
//    public void test_termo_889() {
//        System.out.println(">>>>  test_termo_889");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("terreno alphaville gravataí"));
//    }
//
//    @Test
//    public void test_termo_890() {
//        System.out.println(">>>>  test_termo_890");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casas em capão da canoa"));
//    }
//
//    @Test
//    public void test_termo_891() {
//        System.out.println(">>>>  test_termo_891");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Rio Grande do Sul Porto Alegre"));
//    }
//
//    @Test
//    public void test_termo_892() {
//        System.out.println(">>>>  test_termo_892");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento em sao jose"));
//    }
//
//    @Test
//    public void test_termo_893() {
//        System.out.println(">>>>  test_termo_893");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imoveis cachoeirinha"));
//    }
//
//    @Test
//    public void test_termo_894() {
//        System.out.println(">>>>  test_termo_894");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Imoveis em são sebastião do caí"));
//    }
//
//    @Test
//    public void test_termo_895() {
//        System.out.println(">>>>  test_termo_895");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento de 2 dormitórios em porto alegre"));
//    }
//
//    @Test
//    public void test_termo_896() {
//        System.out.println(">>>>  test_termo_896");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa novo hamburgo"));
//    }
//
//    @Test
//    public void test_termo_897() {
//        System.out.println(">>>>  test_termo_897");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Torres"));
//    }
//
//    @Test
//    public void test_termo_898() {
//        System.out.println(">>>>  test_termo_898");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("terreno porto alegre zona sul"));
//    }
//
//    @Test
//    public void test_termo_899() {
//        System.out.println(">>>>  test_termo_899");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa de praia em sc"));
//    }
//
//    @Test
//    public void test_termo_900() {
//        System.out.println(">>>>  test_termo_900");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Marinas do campeche"));
//    }
//
//    @Test
//    public void test_termo_901() {
//        System.out.println(">>>>  test_termo_901");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento torres rs"));
//    }
//
//    @Test
//    public void test_termo_902() {
//        System.out.println(">>>>  test_termo_902");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em gravataí"));
//    }
//
//    @Test
//    public void test_termo_903() {
//        System.out.println(">>>>  test_termo_903");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("terreno em joinville"));
//    }
//
//    @Test
//    public void test_termo_904() {
//        System.out.println(">>>>  test_termo_904");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa no joinville"));
//    }
//
//    @Test
//    public void test_termo_905() {
//        System.out.println(">>>>  test_termo_905");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado em tramandai"));
//    }
//
//    @Test
//    public void test_termo_906() {
//        System.out.println(">>>>  test_termo_906");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("SC 401"));
//    }
//
//    @Test
//    public void test_termo_907() {
//        System.out.println(">>>>  test_termo_907");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento em itapema"));
//    }
//
//    @Test
//    public void test_termo_908() {
//        System.out.println(">>>>  test_termo_908");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento no centro de caxias do sul"));
//    }
//
//    @Test
//    public void test_termo_909() {
//        System.out.println(">>>>  test_termo_909");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apt 3 quartos no moinhos de vento poa"));
//    }
//
//    @Test
//    public void test_termo_910() {
//        System.out.println(">>>>  test_termo_910");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa caxias do sul rs"));
//    }
//
//    @Test
//    public void test_termo_911() {
//        System.out.println(">>>>  test_termo_911");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("gravatai"));
//    }
//
//    @Test
//    public void test_termo_912() {
//        System.out.println(">>>>  test_termo_912");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Terreno Loteamento Jardins Bela Vista Palhoça"));
//    }
//
//    @Test
//    public void test_termo_913() {
//        System.out.println(">>>>  test_termo_913");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("terra nova nature"));
//    }
//
//    @Test
//    public void test_termo_914() {
//        System.out.println(">>>>  test_termo_914");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento novo hamburgo"));
//    }
//
//    @Test
//    public void test_termo_915() {
//        System.out.println(">>>>  test_termo_915");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("resort em florianopolis"));
//    }
//
//    @Test
//    public void test_termo_916() {
//        System.out.println(">>>>  test_termo_916");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("meia praia em itapema"));
//    }
//
//    @Test
//    public void test_termo_917() {
//        System.out.println(">>>>  test_termo_917");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamentos"));
//    }
//
//    @Test
//    public void test_termo_918() {
//        System.out.println(">>>>  test_termo_918");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imoveis"));
//    }
//
//    @Test
//    public void test_termo_919() {
//        System.out.println(">>>>  test_termo_919");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Apartamento Parque"));
//    }
//
//    @Test
//    public void test_termo_920() {
//        System.out.println(">>>>  test_termo_920");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento 1 dormitório Porto Alegre"));
//    }
//
//    @Test
//    public void test_termo_921() {
//        System.out.println(">>>>  test_termo_921");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imoveis Centro Porto Alegre"));
//    }
//
//    @Test
//    public void test_termo_922() {
//        System.out.println(">>>>  test_termo_922");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa aberta dos morros"));
//    }
//
//    @Test
//    public void test_termo_923() {
//        System.out.println(">>>>  test_termo_923");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento em criciuma"));
//    }
//
//    @Test
//    public void test_termo_924() {
//        System.out.println(">>>>  test_termo_924");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa canoas rs"));
//    }
//
//    @Test
//    public void test_termo_925() {
//        System.out.println(">>>>  test_termo_925");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado em itapema"));
//    }
//
//    @Test
//    public void test_termo_926() {
//        System.out.println(">>>>  test_termo_926");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado em novo hamburgo"));
//    }
//
//    @Test
//    public void test_termo_927() {
//        System.out.println(">>>>  test_termo_927");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("governador celso ramos"));
//    }
//
//    @Test
//    public void test_termo_928() {
//        System.out.println(">>>>  test_termo_928");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em garopaba"));
//    }
//
//    @Test
//    public void test_termo_929() {
//        System.out.println(">>>>  test_termo_929");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento decorado sc"));
//    }
//
//    @Test
//    public void test_termo_930() {
//        System.out.println(">>>>  test_termo_930");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sítio"));
//    }
//
//    @Test
//    public void test_termo_931() {
//        System.out.println(">>>>  test_termo_931");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento 3 dormitorios"));
//    }
//
//    @Test
//    public void test_termo_932() {
//        System.out.println(">>>>  test_termo_932");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imoveis no bairro campeche florianopolis"));
//    }
//
//    @Test
//    public void test_termo_933() {
//        System.out.println(">>>>  test_termo_933");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("locar imovel"));
//    }
//
//    @Test
//    public void test_termo_934() {
//        System.out.println(">>>>  test_termo_934");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento no centro de blumenau"));
//    }
//
//    @Test
//    public void test_termo_935() {
//        System.out.println(">>>>  test_termo_935");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("terra de areia"));
//    }
//
//    @Test
//    public void test_termo_936() {
//        System.out.println(">>>>  test_termo_936");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("fazendas no rio grande do sul"));
//    }
//
//    @Test
//    public void test_termo_937() {
//        System.out.println(">>>>  test_termo_937");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento em poa"));
//    }
//
//    @Test
//    public void test_termo_938() {
//        System.out.println(">>>>  test_termo_938");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamentos de 3 dormitorios na cavalhada em porto alegre"));
//    }
//
//    @Test
//    public void test_termo_939() {
//        System.out.println(">>>>  test_termo_939");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa no partenon"));
//    }
//
//    @Test
//    public void test_termo_940() {
//        System.out.println(">>>>  test_termo_940");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("propriedade rural"));
//    }
//
//    @Test
//    public void test_termo_941() {
//        System.out.println(">>>>  test_termo_941");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado em guaiba"));
//    }
//
//    @Test
//    public void test_termo_942() {
//        System.out.println(">>>>  test_termo_942");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado em canela"));
//    }
//
//    @Test
//    public void test_termo_943() {
//        System.out.println(">>>>  test_termo_943");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("jk mobiliado em porto alegre"));
//    }
//
//    @Test
//    public void test_termo_944() {
//        System.out.println(">>>>  test_termo_944");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imoveis Tr"));
//    }
//
//    @Test
//    public void test_termo_945() {
//        System.out.println(">>>>  test_termo_945");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento higienopolis porto alegre"));
//    }
//
//    @Test
//    public void test_termo_946() {
//        System.out.println(">>>>  test_termo_946");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casas em sao jose sc"));
//    }
//
//    @Test
//    public void test_termo_947() {
//        System.out.println(">>>>  test_termo_947");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("balneario camboriu"));
//    }
//
//    @Test
//    public void test_termo_948() {
//        System.out.println(">>>>  test_termo_948");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("spot"));
//    }
//
//    @Test
//    public void test_termo_949() {
//        System.out.println(">>>>  test_termo_949");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento em cachoeirinha"));
//    }
//
//    @Test
//    public void test_termo_950() {
//        System.out.println(">>>>  test_termo_950");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Arroio Teixeira"));
//    }
//
//    @Test
//    public void test_termo_951() {
//        System.out.println(">>>>  test_termo_951");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imoveis no bairro ponta das canas florianopolis"));
//    }
//
//    @Test
//    public void test_termo_952() {
//        System.out.println(">>>>  test_termo_952");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em eldorado do sul"));
//    }
//
//    @Test
//    public void test_termo_953() {
//        System.out.println(">>>>  test_termo_953");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa tramandaí"));
//    }
//
//    @Test
//    public void test_termo_954() {
//        System.out.println(">>>>  test_termo_954");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em canela"));
//    }
//
//    @Test
//    public void test_termo_955() {
//        System.out.println(">>>>  test_termo_955");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Terreno Para"));
//    }
//
//    @Test
//    public void test_termo_956() {
//        System.out.println(">>>>  test_termo_956");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Terreno Lot"));
//    }
//
//    @Test
//    public void test_termo_957() {
//        System.out.println(">>>>  test_termo_957");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa OR apartamento nas praias rs"));
//    }
//
//    @Test
//    public void test_termo_958() {
//        System.out.println(">>>>  test_termo_958");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado em balneario camboriu"));
//    }
//
//    @Test
//    public void test_termo_959() {
//        System.out.println(">>>>  test_termo_959");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em joinville bairro floresta"));
//    }
//
//    @Test
//    public void test_termo_960() {
//        System.out.println(">>>>  test_termo_960");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em campeche"));
//    }
//
//    @Test
//    public void test_termo_961() {
//        System.out.println(">>>>  test_termo_961");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado no hípica em porto alegre"));
//    }
//
//    @Test
//    public void test_termo_962() {
//        System.out.println(">>>>  test_termo_962");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imóvel porto alegre Av"));
//    }
//
//    @Test
//    public void test_termo_963() {
//        System.out.println(">>>>  test_termo_963");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casas em caxias do sul rs"));
//    }
//
//    @Test
//    public void test_termo_964() {
//        System.out.println(">>>>  test_termo_964");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apto para aluguel em capão da canoa"));
//    }
//
//    @Test
//    public void test_termo_965() {
//        System.out.println(">>>>  test_termo_965");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("meia praia sc"));
//    }
//
//    @Test
//    public void test_termo_966() {
//        System.out.println(">>>>  test_termo_966");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em xangri la"));
//    }
//
//    @Test
//    public void test_termo_967() {
//        System.out.println(">>>>  test_termo_967");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado em joinville"));
//    }
//
//    @Test
//    public void test_termo_968() {
//        System.out.println(">>>>  test_termo_968");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em camobi santa maria rs"));
//    }
//
//    @Test
//    public void test_termo_969() {
//        System.out.println(">>>>  test_termo_969");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("porto alegre Dr"));
//    }
//
//    @Test
//    public void test_termo_970() {
//        System.out.println(">>>>  test_termo_970");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apto em florianópolis"));
//    }
//
//    @Test
//    public void test_termo_971() {
//        System.out.println(">>>>  test_termo_971");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("terreno na praia rs"));
//    }
//
//    @Test
//    public void test_termo_972() {
//        System.out.println(">>>>  test_termo_972");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casas caxias do sul"));
//    }
//
//    @Test
//    public void test_termo_973() {
//        System.out.println(">>>>  test_termo_973");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento em tramandai"));
//    }
//
//    @Test
//    public void test_termo_974() {
//        System.out.println(">>>>  test_termo_974");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em xangri lá"));
//    }
//
//    @Test
//    public void test_termo_975() {
//        System.out.println(">>>>  test_termo_975");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sítio santa catarina"));
//    }
//
//    @Test
//    public void test_termo_976() {
//        System.out.println(">>>>  test_termo_976");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa capão da canoa"));
//    }
//
//    @Test
//    public void test_termo_977() {
//        System.out.println(">>>>  test_termo_977");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("porto alegre casa"));
//    }
//
//    @Test
//    public void test_termo_978() {
//        System.out.println(">>>>  test_termo_978");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento 1 dormitorio"));
//    }
//
//    @Test
//    public void test_termo_979() {
//        System.out.println(">>>>  test_termo_979");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("terreno em Porto Alegre"));
//    }
//
//    @Test
//    public void test_termo_980() {
//        System.out.println(">>>>  test_termo_980");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("bairro floresta porto alegre"));
//    }
//
//    @Test
//    public void test_termo_981() {
//        System.out.println(">>>>  test_termo_981");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sobrado em sao jose sc"));
//    }
//
//    @Test
//    public void test_termo_982() {
//        System.out.println(">>>>  test_termo_982");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamento capao da canoa"));
//    }
//
//    @Test
//    public void test_termo_983() {
//        System.out.println(">>>>  test_termo_983");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em capao da canoa"));
//    }
//
//    @Test
//    public void test_termo_984() {
//        System.out.println(">>>>  test_termo_984");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Apartamento Cap"));
//    }
//
//    @Test
//    public void test_termo_985() {
//        System.out.println(">>>>  test_termo_985");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imoveis Canoas"));
//    }
//
//    @Test
//    public void test_termo_986() {
//        System.out.println(">>>>  test_termo_986");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("Sitios rs"));
//    }
//
//    @Test
//    public void test_termo_987() {
//        System.out.println(">>>>  test_termo_987");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("morro das pedras"));
//    }
//
//    @Test
//    public void test_termo_988() {
//        System.out.println(">>>>  test_termo_988");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa em sao jose sc"));
//    }
//
//    @Test
//    public void test_termo_989() {
//        System.out.println(">>>>  test_termo_989");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("osório"));
//    }
//
//    @Test
//    public void test_termo_990() {
//        System.out.println(">>>>  test_termo_990");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imoveis Araranguá"));
//    }
//
//    @Test
//    public void test_termo_991() {
//        System.out.println(">>>>  test_termo_991");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("sao lourenco do sul"));
//    }
//
//    @Test
//    public void test_termo_992() {
//        System.out.println(">>>>  test_termo_992");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("cachoeirinha"));
//    }
//
//    @Test
//    public void test_termo_993() {
//        System.out.println(">>>>  test_termo_993");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("imoveis Guaiba Country Club Eldorado do Sul"));
//    }
//
//    @Test
//    public void test_termo_994() {
//        System.out.println(">>>>  test_termo_994");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casa na tristeza em condominio"));
//    }
//
//    @Test
//    public void test_termo_995() {
//        System.out.println(">>>>  test_termo_995");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("praia"));
//    }
//
//    @Test
//    public void test_termo_996() {
//        System.out.println(">>>>  test_termo_996");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("mariluz"));
//    }
//
//    @Test
//    public void test_termo_997() {
//        System.out.println(">>>>  test_termo_997");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("apartamentos no menino deus"));
//    }
//
//    @Test
//    public void test_termo_998() {
//        System.out.println(">>>>  test_termo_998");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("casas em porto alegre zona norte"));
//    }
//
//    @Test
//    public void test_termo_999() {
//        System.out.println(">>>>  test_termo_999");
//        assertEquals("{}", engImoveis.obtemParametrosAsString("terreno gravatai"));
//    }
//
//    @Test
//    public void test_termo_1000() {
//        System.out.println(">>>>  test_termo_1000");
//        assertEquals("{cidade=[Tramandaí]}", engImoveis.obtemParametrosAsString("Tramandai"));
//    }

}
