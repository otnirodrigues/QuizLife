package com.quiz.rodrigues.quizlife;


public class Questoes {

    public String nQuestoes[] = {

            "Qual das alternativas é um componente de entrada e saida do computador?",
            "Qual das alternativas é um componente de entrada e saida do computador?",
            "Qual das alternativas é um componente de entrada e saida do computador?",
            "Qual das alternativas é um componente de entrada e saida do computador?",
            "Qual das alternativas é um componente de entrada e saida do computador?",
            "Qual das alternativas é um componente de entrada e saida do computador?"
    };

    private String nEscolhas[][] = {

            {"Gabinete","CPU","Monitor","Teclado"},
            {"Teclado","Gabinete","Monitor","CPU"},
            {"Gabinete","CPU","Monitor","Teclado"},
            {"CPU","Gabinete","Monitor","Teclado"},
            {"CPU","Monitor","Gabinete","Teclado"},
            {"Gabinete","CPU","Teclado","Monitor"}


    };

    private String nRespostaCorreta[] = {"Monitor","Monitor","Monitor","Monitor","Monitor","Monitor"};



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