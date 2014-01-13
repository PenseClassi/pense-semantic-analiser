package br.com.pense.produto.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.query.ResultSetFormatter;
import java.util.HashMap;
import org.springframework.util.StringUtils;

public abstract class AbstractSemanticEngine {

    private String textoBusca;
    private Query query;
    protected List<String> listaDePalavrasParaPesquisa;
    private static OntModel ontologia;
    List<QuerySolution> lstResultados;

    public AbstractSemanticEngine() {

    }

    public String getTextoBusca() {
        return textoBusca;
    }

    public void setTextoBusca(String textoBusca) {
        this.textoBusca = textoBusca;
    }

    public OntModel getOntologia() {
        return ontologia;
    }

    public void setOntologia(OntModel ontologia) {
        this.ontologia = ontologia;
    }

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }


    /*
     * Trata o conteudo informado no campo de busca para posterior pesquisa 
     * @return	Verdadeiro se procedimento terminou corretamente
     */
    @Deprecated
    public boolean preparaConteudoBusca() {
        if (!this.textoBusca.isEmpty()) {

            String[] lstPalavras = this.textoBusca.split(" ");
            int posPrimeiraReservada = 0;
            int posSegundaReservada = 0;
            List<String> palavrasDaPesquisa = new ArrayList<String>();
            List<String> listaAuxiliarDePalavras = new ArrayList<String>();
            int contador = 0;
            String palavraPesquisa = "";

            //Remove as palavras reservadas - as que não entram na pesquisa
            for (String palavra : lstPalavras) {
                if (!ehPalavraReservada(palavra)) {
                    listaAuxiliarDePalavras.add(palavra);
                }
            }

            for (String palavra : listaAuxiliarDePalavras) {
                if (ehPalavraLigacao(palavra)) {
                    //Ao encontrar a palavra marca a posicao inicial se não existir
                    if (posPrimeiraReservada == 0) {
                        posPrimeiraReservada = contador;
                    } //Senão pega o intervalo entre a primeira e a segunda marcação como uma unica palavra
                    else {
                        palavraPesquisa = "";
                        posSegundaReservada = contador;
                        for (int i = posPrimeiraReservada + 1; i < posSegundaReservada; i++) {
                            //Concatenando as palavras do intervalo
                            palavraPesquisa += " " + lstPalavras[i];
                        }
                        //Nova palavra vai pra lista de palavras
                        palavrasDaPesquisa.add(palavraPesquisa.trim());
                        //Reseta ponteiros 
                        posPrimeiraReservada = posSegundaReservada;
                        posSegundaReservada = 0;
                    }
                } else {
                    //Virgula representa o mesmo que uma palavra de ligação
                    if (posPrimeiraReservada == 0) {
                        palavrasDaPesquisa.add(palavra.replace(",", "").trim());
                        if (palavra.contains(",")) {
                            posPrimeiraReservada = contador;
                        }
                    } else {
                        if (palavra.contains(",")) {
                            palavrasDaPesquisa.add(palavra.replace(",", "").trim());
                            posPrimeiraReservada = contador;
                        }
                    }
                }
                contador++;
            }
            //Uma palavra reservada foi encontrada mas a lista acabou, pega o intervalo
            if (posPrimeiraReservada > posSegundaReservada) {
                palavraPesquisa = "";
                posSegundaReservada = lstPalavras.length;
                for (int i = posPrimeiraReservada + 1; i < posSegundaReservada; i++) {
                    //Concatenando as palavras do intervalo
                    palavraPesquisa += " " + lstPalavras[i];
                }
                //Nova palavra vai pra lista de palavras
                palavrasDaPesquisa.add(palavraPesquisa.trim());
            }
            System.out.println(palavrasDaPesquisa.toString() + " - " + palavrasDaPesquisa.size());
            this.listaDePalavrasParaPesquisa = palavrasDaPesquisa;
            return true;
        }
        return false;
    }

    public boolean preparaConteudoBusca(String textoBusca) {
        System.out.println("Texto: " + textoBusca);
        textoBusca = this.executaPreProcessamento(textoBusca);
        this.setTextoBusca(textoBusca);
        List<String> listaAuxiliarDePalavras = new ArrayList<String>();

        if (!this.textoBusca.isEmpty()) {

            String[] lstPalavras = this.textoBusca.split(" ");

            //Remove as palavras reservadas - as que não entram na pesquisa
            for (String palavra : lstPalavras) {
                if (!ehPalavraReservada(palavra)) {
                    listaAuxiliarDePalavras.add(palavra.trim());
                }
            }
            this.listaDePalavrasParaPesquisa = preparaListaParaPesquisa_d(listaAuxiliarDePalavras);
            System.out.println(this.listaDePalavrasParaPesquisa.toString() + " - " + this.listaDePalavrasParaPesquisa.size());
            return true;
        }
        return false;

    }

    public List<String> preparaListaParaPesquisa_d(List<String> preLista) {
        int posPrimeiraReservada = -1;
        int posSegundaReservada = -1;
        String palavraPesquisa = "";
        int contador = 0;
        List<String> palavrasDaPesquisa = new ArrayList<String>();
        boolean jumpToNextWord = false;
        boolean indicacaoLugar = false;
//        boolean temQuantidade = false;
//        boolean temValor = false;
//        int primeiraocorrenciaNumerica = -1;
//        int segundaocorrenciaNumerica = -1;
//        boolean obterSegundaOcorrenciaNumerica = false;

        boolean aspasDetectadas = false;
        int posPrimeiraAspa = -1;

        for (String palavra : preLista) {
            if (jumpToNextWord) {
                jumpToNextWord = false;
                posSegundaReservada = posPrimeiraReservada;
                contador++;
                continue;
            }

            //Verifica a existência de aspas nas palavras
            if (!aspasDetectadas && palavra.startsWith("\"")) {
                //Marca a primeira aspas detectada
                aspasDetectadas = true;
                posPrimeiraAspa = contador;
                //Precisa pegar as palavras entre posPrimeiraReservada e posPrimeiraAspa
                if (posPrimeiraReservada > -1){
                    String novaPalavra = "";
                    for (int i = posPrimeiraReservada+1; i < posPrimeiraAspa; i++) {
                        //Concatenando as palavras do intervalo
                        novaPalavra += " " + preLista.get(i);
                    }
                    if (!novaPalavra.isEmpty()){
                        palavrasDaPesquisa.add(novaPalavra.trim());
                    }
                    indicacaoLugar = false; //Se havia indicação de lugar reseta
                }
                
            } else if (aspasDetectadas && (palavra.endsWith("\"")|| palavra.endsWith("\","))) {
                //Na segunda obtem o texto entre as aspas
                String novaPalavra = "";
                for (int i = posPrimeiraAspa; i <= contador; i++) {
                    //Concatenando as palavras do intervalo
                    novaPalavra += " " + preLista.get(i);
                }
                
                if (novaPalavra.endsWith("\",")){
                    posPrimeiraReservada = contador;
                }else{
                    posPrimeiraReservada = 1+ contador;
                }
                //Insere na lista de palavras
                if (!novaPalavra.isEmpty()) {
                    palavrasDaPesquisa.add(novaPalavra.replace("\",", "").replace("\"", "").trim());
                }
                posPrimeiraAspa = -1;                
                aspasDetectadas = false;
                
            } else {

                if (ehPalavraLigacao(palavra)) {

                    if (indicacaoLugar && !"com".equals(palavra) && !"no".equals(palavra)) {
                        contador++;
                        continue;
                    }

                    //Ao encontrar a palavra marca a posicao inicial se não existir
                    if (posPrimeiraReservada == -1) {
                        posPrimeiraReservada = contador;

                    } //Senão pega o intervalo entre a primeira e a segunda marcação como uma unica palavra
                    else {
                        palavraPesquisa = "";
                        posSegundaReservada = contador;
                        for (int i = posPrimeiraReservada + 1; i < posSegundaReservada; i++) {
                            //Concatenando as palavras do intervalo
                            palavraPesquisa += " " + preLista.get(i);
                        }
                        //Nova palavra vai pra lista de palavras
                        if (!palavraPesquisa.isEmpty()) {
                            palavrasDaPesquisa.add(palavraPesquisa.trim());
                        }
                        //Reseta ponteiros 
                        posPrimeiraReservada = posSegundaReservada;
                        posSegundaReservada = -1;
                    }

                    if ("de".equals(palavra) && contador - 1 >= 0) {
                        if (ehPalavraDeExcessao(preLista.get(contador - 1))) {
                            if (palavrasDaPesquisa.size() > 0) {
                                //String novaPalavra = palavrasDaPesquisa.get(palavrasDaPesquisa.size()-1);
                                String novaPalavra = "";
                                if (contador - 1 >= 0) {
                                    novaPalavra += preLista.get(contador - 1);
                                }
                                novaPalavra += " " + palavra;
                                novaPalavra += " " + preLista.get(contador + 1);
                                palavrasDaPesquisa.remove(palavrasDaPesquisa.size() - 1);
                                palavrasDaPesquisa.add(novaPalavra.replace(",", "").trim());
                                posPrimeiraReservada++;
                                jumpToNextWord = true;
                            }
                        }
                    } else if ("em".equals(palavra)) {
                        //Quando indicação de um lugar "em" pegar como palavra o intervalo até "com", "," ou fim da lista
                        indicacaoLugar = true;
                    }
                } else {
                    //Virgula representa o mesmo que uma palavra de ligação
                    if (posPrimeiraReservada == -1) {
                        palavrasDaPesquisa.add(palavra.replace(",", "").trim());
                        if (palavra.contains(",")) {
                            posPrimeiraReservada = contador;
                        }
                    } else {
                        if (palavra.contains(",")) {
                            if (indicacaoLugar) {
                            //Indicação de lugar pega o intervalo como uma unica palvra

                                palavraPesquisa = "";
                                posSegundaReservada = contador;
                                for (int i = posPrimeiraReservada + 1; i <= posSegundaReservada; i++) {
                                    //Concatenando as palavras do intervalo
                                    palavraPesquisa += " " + preLista.get(i).replace(",", "").trim();
                                }
                                //Nova palavra vai pra lista de palavras
                                palavrasDaPesquisa.add(palavraPesquisa.trim());
                                //Reseta ponteiros 
                                posSegundaReservada = -1;

                                indicacaoLugar = false;

                            } else {
                                //Reprocessa as palavras entre a primeira reservada e a palavra com virgula
                                palavrasDaPesquisa.addAll(preparaListaParaPesquisa_d(preLista.subList(posPrimeiraReservada + 1, contador)));
                                //Insere a palavra com vírgula na lista tb
                                palavrasDaPesquisa.add(palavra.replace(",", "").trim());
                            }
                            posPrimeiraReservada = contador;
                        }
                    }
                }
            }
            contador++;
        }
        //Uma palavra reservada foi encontrada mas a lista acabou, reprocessa o restante
        if (posPrimeiraReservada > posSegundaReservada && posPrimeiraReservada < preLista.size()) {
            //Se a lista acabou com uma referencia a lugar "em" toma o restante como nome de cidade/lugar
            if ("em".equals(preLista.get(posPrimeiraReservada).toLowerCase())) {
                //Trata o restante como uma unica palavra
                palavraPesquisa = "";
                posSegundaReservada = preLista.size();
                for (int i = posPrimeiraReservada + 1; i < posSegundaReservada; i++) {
                    //Concatenando as palavras do intervalo
                    palavraPesquisa += " " + preLista.get(i);
                }
                //Nova palavra vai pra lista de palavras
                palavrasDaPesquisa.add(palavraPesquisa.trim());
            } else {
                //Reprocessa o restante
                if (preLista.get(posPrimeiraReservada).contains(",") || posPrimeiraReservada == 0) {
                    palavrasDaPesquisa.addAll(preparaListaParaPesquisa_d(preLista.subList(posPrimeiraReservada + 1, preLista.size())));
                } else {
                    palavrasDaPesquisa.addAll(preparaListaParaPesquisa_d(preLista.subList(posPrimeiraReservada, preLista.size())));
                }
            }
        }
        return palavrasDaPesquisa;
    }

    public List<String> preparaListaParaPesquisa_e(List<String> preLista) {
        int posPrimeiraReservada = -1;
        int posSegundaReservada = -1;
        String palavraPesquisa = "";
        int contador = 0;
        List<String> palavrasDaPesquisa = new ArrayList<String>();
        boolean jumpToNextWord = false;
        boolean indicacaoLugar = false;
        boolean temQuantidade = false;
        boolean temValor = false; //TODO "R$" "US$"
        int primeiraocorrenciaNumerica = -1;
        int segundaocorrenciaNumerica = -1;
        boolean obterSegundaOcorrenciaNumerica = false;

        boolean aspasDetectadas = false;
        int posPrimeiraAspa = -1;
        int posSegundaAspa = -1;

        for (String palavra : preLista) {
            if (jumpToNextWord) {
                jumpToNextWord = false;
                posSegundaReservada = posPrimeiraReservada;
                contador++;
                continue;
            }

            if (!aspasDetectadas && palavra.startsWith("\"")) {
                aspasDetectadas = true;
                posPrimeiraAspa = contador;
            } else if (aspasDetectadas && palavra.endsWith("\"")) {
                aspasDetectadas = false;
            }

            //Identifica informação de que tem um valor especificado
            if ("R$".equals(palavra)) {
                temValor = true;
                posPrimeiraReservada = contador;
                contador++;
                continue;
            } else if (defineValorMoeda(palavra)) { //Detectou especificação de valor (moeda)
                String auxPalavra = palavra;
                if (auxPalavra.endsWith(",")) {
                    auxPalavra = auxPalavra.substring(0, auxPalavra.length() - 1);
                }
                if (temValor) { //Já havia detectado a referencia a um valor
                    palavrasDaPesquisa.add(preLista.get(posPrimeiraReservada) + " " + auxPalavra);
                } else { //Sem a referencia informa uma (valor em reais) 
                    palavrasDaPesquisa.add("R$ " + auxPalavra);
                }
                posPrimeiraReservada = contador;
                temValor = false;
                contador++;
                continue;
            }

            // Verifica se a palavra define uma quantidade
            if (!temQuantidade && defineQuantidade(palavra)) {
                temQuantidade = true;
                primeiraocorrenciaNumerica = contador;
                posPrimeiraReservada = contador;
                contador++;
                continue;
            }

            // Pega os valores e monta as relações de quantidades
            // n [e|a|até] m {elemento}
            // n {elemento}
            if (temQuantidade) {
                if ("e".equals(palavra) || "a".equals(palavra) || "até".equals(palavra)) {
                    //Intervalo de valores - define que tem de obter segunda ocorrencia numerica
                    obterSegundaOcorrenciaNumerica = true;
                } else if (obterSegundaOcorrenciaNumerica) {
                    //Obtem a segunda ocorrencia numerica
                    segundaocorrenciaNumerica = contador;
                    obterSegundaOcorrenciaNumerica = false;
                } else if (segundaocorrenciaNumerica != -1) {
                    //Tendo as duas ocorrencias numericas monta as palavras e encerra a avaliação 
                    palavrasDaPesquisa.add(preLista.get(primeiraocorrenciaNumerica) + " " + palavra.replace(",", "").trim());
                    palavrasDaPesquisa.add(preLista.get(segundaocorrenciaNumerica) + " " + palavra.replace(",", "").trim());
                    temQuantidade = false;
                    if (palavra.contains(",")) {
                        posPrimeiraReservada = contador;
                    } else {
                        posPrimeiraReservada = 1 + contador;
                    }
                    segundaocorrenciaNumerica = -1;
                } else {
                    //Somente um valor - concatena direto
                    palavrasDaPesquisa.add(preLista.get(posPrimeiraReservada) + " " + palavra.replace(",", "").trim());
                    temQuantidade = false;
                    if (palavra.contains(",")) {
                        posPrimeiraReservada = contador;
                    } else {
                        posPrimeiraReservada = 1 + contador;
                    }
                }
                contador++;
                continue;
            }

            if (ehPalavraLigacao(palavra)) {

                if (indicacaoLugar && !"com".equals(palavra) && !"no".equals(palavra)) {
                    contador++;
                    continue;
                }

                //Ao encontrar a palavra marca a posicao inicial se não existir
                if (posPrimeiraReservada == -1) {
                    posPrimeiraReservada = contador;

                } //Senão pega o intervalo entre a primeira e a segunda marcação como uma unica palavra
                else {
                    palavraPesquisa = "";
                    posSegundaReservada = contador;
                    for (int i = posPrimeiraReservada + 1; i < posSegundaReservada; i++) {
                        //Concatenando as palavras do intervalo
                        palavraPesquisa += " " + preLista.get(i);
                    }
                    //Nova palavra vai pra lista de palavras
                    if (!palavraPesquisa.isEmpty()) {
                        palavrasDaPesquisa.add(palavraPesquisa.trim());
                    }
                    //Reseta ponteiros 
                    posPrimeiraReservada = posSegundaReservada;
                    posSegundaReservada = -1;
                }

                if ("de".equals(palavra) && contador - 1 >= 0) {
                    if (ehPalavraDeExcessao(preLista.get(contador - 1))) {
                        if (palavrasDaPesquisa.size() > 0) {
                            //String novaPalavra = palavrasDaPesquisa.get(palavrasDaPesquisa.size()-1);
                            String novaPalavra = "";
                            if (contador - 1 >= 0) {
                                novaPalavra += preLista.get(contador - 1);
                            }
                            novaPalavra += " " + palavra;
                            novaPalavra += " " + preLista.get(contador + 1);
                            palavrasDaPesquisa.remove(palavrasDaPesquisa.size() - 1);
                            palavrasDaPesquisa.add(novaPalavra.replace(",", "").trim());
                            posPrimeiraReservada++;
                            jumpToNextWord = true;
                        }
                    }
                } else if ("em".equals(palavra)) {
                    //Quando indicação de um lugar "em" pegar como palavra o intervalo até "com", "," ou fim da lista
                    indicacaoLugar = true;
                }
            } else {
                //Virgula representa o mesmo que uma palavra de ligação
                if (posPrimeiraReservada == -1) {
                    palavrasDaPesquisa.add(palavra.replace(",", "").trim());
                    if (palavra.contains(",")) {
                        posPrimeiraReservada = contador;
                    }
                } else {
                    if (palavra.contains(",")) {
                        if (indicacaoLugar) {
                            //Indicação de lugar pega o intervalo como uma unica palvra

                            palavraPesquisa = "";
                            posSegundaReservada = contador;
                            for (int i = posPrimeiraReservada + 1; i <= posSegundaReservada; i++) {
                                //Concatenando as palavras do intervalo
                                palavraPesquisa += " " + preLista.get(i).replace(",", "").trim();
                            }
                            //Nova palavra vai pra lista de palavras
                            palavrasDaPesquisa.add(palavraPesquisa.trim());
                            //Reseta ponteiros 
                            posSegundaReservada = -1;

                            indicacaoLugar = false;

                        } else {
                            //Reprocessa as palavras entre a primeira reservada e a palavra com virgula
                            palavrasDaPesquisa.addAll(preparaListaParaPesquisa_d(preLista.subList(posPrimeiraReservada + 1, contador)));
                            //Insere a palavra com vírgula na lista tb
                            palavrasDaPesquisa.add(palavra.replace(",", "").trim());
                        }
                        posPrimeiraReservada = contador;
                    }
                }
            }
            contador++;
        }
        //Uma palavra reservada foi encontrada mas a lista acabou, reprocessa o restante
        if (posPrimeiraReservada > posSegundaReservada && posPrimeiraReservada < preLista.size()) {
            //Se a lista acabou com uma referencia a lugar "em" toma o restante como nome de cidade/lugar
            if ("em".equals(preLista.get(posPrimeiraReservada).toLowerCase())) {
                //Trata o restante como uma unica palavra
                palavraPesquisa = "";
                posSegundaReservada = preLista.size();
                for (int i = posPrimeiraReservada + 1; i < posSegundaReservada; i++) {
                    //Concatenando as palavras do intervalo
                    palavraPesquisa += " " + preLista.get(i);
                }
                //Nova palavra vai pra lista de palavras
                palavrasDaPesquisa.add(palavraPesquisa.trim());
            } else {
                //Reprocessa o restante
                if (preLista.get(posPrimeiraReservada).contains(",") || posPrimeiraReservada == 0) {
                    palavrasDaPesquisa.addAll(preparaListaParaPesquisa_d(preLista.subList(posPrimeiraReservada + 1, preLista.size())));
                } else {
                    palavrasDaPesquisa.addAll(preparaListaParaPesquisa_d(preLista.subList(posPrimeiraReservada, preLista.size())));
                }
            }
        }
        return palavrasDaPesquisa;
    }
    /*
     * Avalia se a palavra informada é uma palavra de ligação
     * @param palavra Palavra a ser avaliada
     * @return Verdadeiro se a palavra for de ligação
     */

    protected boolean ehPalavraLigacao(String palavra) {
        if (palavra != null) {
            palavra = palavra.toLowerCase();

            if ("em".equals(palavra)
                    || "na".equals(palavra)
                    || "ou".equals(palavra)
                    || "até".equals(palavra)
                    || "no".equals(palavra)
                    || "de".equals(palavra)
                    || "com".equals(palavra)
                    || "e".equals(palavra)
                    || "apartir".equals(palavra)
                    || "para".equals(palavra)) {
                return true;
            }
        }
        return false;
    }

    /*
     * Verifica se a palavra define uma quantidade
     * @param Palavra a ser avaliada
     * @return Verdadeiro se for uma quantidade
     */
    private boolean defineQuantidade(String palavra) {
        if (palavra != null) {
            palavra = palavra.toLowerCase();
            if ("1".equals(palavra) || "01".equals(palavra)
                    || "2".equals(palavra) || "02".equals(palavra)
                    || "3".equals(palavra) || "03".equals(palavra)
                    || "4".equals(palavra) || "04".equals(palavra)
                    || "5".equals(palavra) || "05".equals(palavra)) {
                return true;
            }
        }
        return false;
    }

    /*
     * Verifica se a palavra define um valor no formato de moeda
     * @param Palavra a ser avaliada
     * @return Verdadeiro se for um valor dentro do padrão: "1,00","1.000,00","1000,00"
     */
    private boolean defineValorMoeda(String palavra) {
        if (palavra != null) {
            if (palavra.endsWith(",")) {
                palavra = palavra.substring(0, palavra.length() - 1);
            }

            return palavra.matches("^\\d{1,3}[\\.\\d{3}]*\\,\\d{2}$");
        }
        return false;
    }

    /*
     * Informa se a palavra informada é reservada
     * @param palavra Palavra para avaliação
     * @result Verdadeiro se a palavra informada for reservada 
     */
    private boolean ehPalavraReservada(String palavra) {
        palavra = palavra.toLowerCase();
        if ("bairro".equals(palavra)
                || "cidade".equals(palavra)
                || "região".equals(palavra)
                || "estado".equals(palavra)) {
            return true;
        }
        return false;
    }

    /*
     * Gera a query de consulta SPARQL baseado em uma lista de palavras informadas
     * @param lstPalavras Lista de palavras que deverão estar presentes na consulta
     * @return Query para aplicação em uma consulta
     */
    protected abstract Query geraConsultaSPARQL(List<String> lstPalavras);

    protected abstract boolean ehPalavraDeExcessao(String palavra);

    /*
     * Obtém o resultado da consulta à ontologia em uma string
     * @return Resultados em uma string
     */
    public String getResultsAsString() {
        Map<String, List<String>> lstParameters = getResultAsParameter();

        if (lstParameters != null) {
            return lstParameters.toString();
        }
        return "";
    }

    /*
     * Obtém o resultado da consulta à ontologia na forma de parâmetros
     * @result Listagem dos resultados da consulta à ontologia na forma de parâmetros
     */
    public Map<String, List<String>> getResultAsParameter() {
        Map<String, List<String>> lstParametros = new HashMap<String, List<String>>();
        String auxString;
        String[] lstPalavras;
        List<String> param;
        for (QuerySolution item : this.lstResultados) {
            auxString = item.getLiteral("parametro").toString();
            if (auxString != null && !auxString.isEmpty()) {
                lstPalavras = auxString.split("=");

                //Verifica se já não há registros do tipo do parâmetro
                if (lstParametros.containsKey(lstPalavras[0])) {
                    param = lstParametros.get(lstPalavras[0]);
                } else {
                    param = new ArrayList<String>();
                }
                param.add(lstPalavras[1]);
                lstParametros.put(lstPalavras[0], param);
            }
        }

        return executaPosProcessamento(lstParametros);
    }

    /*
     * Executa a consulta junto a ontologia armazenando o resultado em uma lista de resultados
     */
    public void executeQuery() {
        Query query = this.geraConsultaSPARQL(this.listaDePalavrasParaPesquisa);

        QueryExecution qe = QueryExecutionFactory.create(query, this.getOntologia());
        ResultSet results = qe.execSelect();

        this.lstResultados = ResultSetFormatter.toList(results);

        qe.close();
    }

    /*
     * Processa o texto informado procurando aprametrizar o seu conteúdo para aplicar à consulta do site,
     * objetivando melhorar a precisão do resultado.
     * @param texto Conteúdo a ser parametrizado
     * @return Verdadeiro para execução da consulta, Falso para erro no procedimento
     */
    public boolean obtemParametros(String texto) {
        if (!StringUtils.isEmpty(texto)) {
            try {
                this.preparaConteudoBusca(texto);                
                this.executeQuery();
                return true;
            } catch (Exception e) {

            }
        }
        return false;
    }

    protected abstract Map<String, List<String>> executaPosProcessamento(Map<String, List<String>> mapParametros);

    protected abstract String executaPreProcessamento(String texto);
}
