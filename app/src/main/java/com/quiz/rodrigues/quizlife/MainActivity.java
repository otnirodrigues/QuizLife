package com.quiz.rodrigues.quizlife;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends Activity {

    Button resposta1 , resposta2, resposta3, resposta4;

    TextView questao, score;

    private Questoes nQuestoes = new Questoes();

    private String nRespostaCorreta;

    private int nScore = 0;

    private int QuestoesLenght = nQuestoes.nQuestoes.length;

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
        score = findViewById(R.id.pontuacao);

        score.setText("Pontuação" + nScore);

        atualizarQuestoes(r.nextInt(QuestoesLenght));

        resposta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resposta1.getText() == nRespostaCorreta){
                    nScore++;
                    score.setText("Pontuação" + nScore);
                    atualizarQuestoes(r.nextInt(QuestoesLenght));

                }else gameOver();{

                }

            }
        });

        resposta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resposta2.getText() == nRespostaCorreta){
                    nScore++;
                    score.setText("Pontuação" + nScore);
                    atualizarQuestoes(r.nextInt(QuestoesLenght));

                }else gameOver();{

                }
            }
        });

        resposta3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resposta3.getText() == nRespostaCorreta){
                    nScore++;
                    score.setText("Pontuação" + nScore);
                    atualizarQuestoes(r.nextInt(QuestoesLenght));

                }else gameOver();{

                }
            }
        });

        resposta4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resposta4.getText() == nRespostaCorreta){
                    nScore++;
                    score.setText("Pontuação" + nScore);
                    atualizarQuestoes(r.nextInt(QuestoesLenght));

                }else gameOver();{

                }
            }
        });
    }

    private void atualizarQuestoes(int num){
        questao.setText(nQuestoes.getQuestoes(num));
        resposta1.setText(nQuestoes.getEscolha1(num));
        resposta2.setText(nQuestoes.getEscolha2(num));
        resposta3.setText(nQuestoes.getEscolha3(num));
        resposta4.setText(nQuestoes.getEscolha4(num));

        nRespostaCorreta = nQuestoes.getRespostaCorreta(num);
    }

    private void gameOver(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder.setMessage("Você perdeu o Jogo! Sua pontuação foi:" + nScore + "Pontos!");
        alertDialogBuilder.setCancelable(false);
        alertDialogBuilder.setPositiveButton("Novo jogo",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    }
                });
        alertDialogBuilder.setNegativeButton("Finalizar Jogo",
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
