package com.quiz.rodrigues.quizlife;


public class Questoes {

    public String nQuestoes[] = {

            "Ao redigir uma ata de reunião realizada na empresa em que trabalha , um secretário executivo precisou   traduzir para o inglês o trecho “todas as  informações necessárias para realização de determinada ação”  e a palavra “orçamento”\n" +
                    "\n" +
                    "Esse trecho sublinhado e a palavra “orçamento” pode ser adequado  e respectivamente traduzido  por:\n",

    };

    private String nEscolhas[][] = {

            {"budget e order","scope e receipt","briefing e budget","briefing e broad band","benchmark e business plan"},


    };

    private String nRespostaCorreta[] = {"briefing e budget"};



    public String getQuestao(int a) {
        String questao = nQuestoes[a];
        return questao;
    }

    public String getEscolha1(int a) {
        String escolha = nEscolhas[a][0];
        return escolha;
    }

    public String getEscolha2(int a) {
        String escolha = nEscolhas[a][1];
        return escolha;
    }

    public String getEscolha3(int a) {
        String escolha = nEscolhas[a][2];
        return escolha;
    }

    public String getEscolha4(int a) {
        String escolha = nEscolhas[a][3];
        return escolha;
    }

    public String getRespostaCorreta(int a) {
        String respostaCorreta = nRespostaCorreta[a];
        return respostaCorreta;

    }
}