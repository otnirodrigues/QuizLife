package com.quiz.rodrigues.quizlife;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;


public class SplashActivity extends MainActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

    }


        public void JogarOnClick(View v){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

        public void SobreOnClick(View v){
            Intent i = new Intent(this, Sobre.class);
            startActivity(i);
        }
        public void SairOnClick(View v){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(01);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    finish();
                }
            });
            thread.start();
        }
    }



