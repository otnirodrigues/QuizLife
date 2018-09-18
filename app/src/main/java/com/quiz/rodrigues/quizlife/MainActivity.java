package com.quiz.rodrigues.quizlife;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button resposta1 , resposta2, resposta3, resposta4;

    TextView questao, pontuacao;

    private Questoes nQuestoes = new Questoes();

    private String nResposta;

    private int nPontuacao = 0;

    private int nQuestoesLength = nQuestoes.nQuestoes.length;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();

        resposta1 = findViewById(R.id.resposta1);
        resposta2 = findViewById(R.id.resposta2);
        resposta3 = findViewById(R.id.resposta3);
        resposta4 = findViewById(R.id.resposta4);

        questao = findViewById(R.id.questao);
        // Pontuação
        pontuacao = findViewById(R.id.pontuacao);

        pontuacao.setText("Pontuação " + nPontuacao);

        atualizarQuestoes(r.nextInt(nQuestoesLength));

        resposta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resposta1.getText() == nResposta){
                    //new SplashAcertou();
                    nPontuacao++;
                    pontuacao.setText("Pontuação " + nPontuacao);
                    atualizarQuestoes(r.nextInt(nQuestoesLength));


                }else gameOver();{

                }

            }
        });

        resposta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resposta2.getText() == nResposta){
                    nPontuacao++;
                    pontuacao.setText("Pontuação " + nPontuacao);
                    atualizarQuestoes(r.nextInt(nQuestoesLength));
                    //startActivity(i);


                }else gameOver();{

                }
            }
        });

        resposta3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resposta3.getText() == nResposta){
                    nPontuacao++;
                    pontuacao.setText("Pontuação " + nPontuacao);
                    atualizarQuestoes(r.nextInt(nQuestoesLength));
                    //new SplashAcertou();

                }else gameOver();{

                }
            }
        });

        resposta4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resposta4.getText() == nResposta){
                   // new SplashAcertou();
                    nPontuacao++;
                    pontuacao.setText("Pontuação " + nPontuacao);
                    atualizarQuestoes(r.nextInt(nQuestoesLength));


                }else gameOver();{

                }
            }
        });
    }

    private void atualizarQuestoes(int num){
        questao.setText(nQuestoes.getQuestao(num));
        resposta1.setText(nQuestoes.getEscolha1(num));
        resposta2.setText(nQuestoes.getEscolha2(num));
        resposta3.setText(nQuestoes.getEscolha3(num));
        resposta4.setText(nQuestoes.getEscolha4(num));

        nResposta = nQuestoes.getRespostaCorreta(num);

    }

    private void gameOver(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder.setMessage("Resposta Incorreta! Sua pontuação final é: " + nPontuacao + " Pontos!");
        alertDialogBuilder.setCancelable(false);
        alertDialogBuilder.setPositiveButton("Nova Partida",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        /*Quando o usuario deseja iniciar um novo jogo
                        finaliza a activity antes de iniciar uma nova*/
                        finish();
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    }
                });
        alertDialogBuilder.setNegativeButton("Finalizar Partida",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }

                });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
        }
}
