package com.quiz.rodrigues.quizlife;


public class Questoes {

    public String nQuestoes[] = {

            "Qual das alternativas é um componente de entrada e saida o computador?",
            "Qual das alternativas é um componente de entrada e saida o computador?",
            "Qual das alternativas é um componente de entrada e saida o computador?",
            "Qual das alternativas é um componente de entrada e saida o computador?",
            "Qual das alternativas é um componente de entrada e saida o computador?",
            "Qual das alternativas é um componente de entrada e saida o computador?"
    };

    private String nEscolhas[][] = {

            {"Gabinete , CPU, Monitor, Teclado"},
            {"Gabinete , CPU, Monitor, Teclado"},
            {"Gabinete , CPU, Monitor, Teclado"},
            {"Gabinete , CPU, Monitor, Teclado"},
            {"Gabinete , CPU, Monitor, Teclado"},
            {"Gabinete , CPU, Monitor, Teclado"}

    };

    private String nRespostaCorreta[] = {"Monitor"};


    public String getQuestoes(int a) {
        String questoes = nQuestoes[a];
        return questoes;
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