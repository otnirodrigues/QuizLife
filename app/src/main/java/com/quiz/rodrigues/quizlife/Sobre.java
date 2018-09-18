package com.quiz.rodrigues.quizlife;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Sobre extends Activity{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);

    }

    public void VoltarOnClick(View v){
        Intent intent = new Intent(this, SplashActivity.class);
        startActivity(intent);
    }

    public String nSobre [] = {
            "Esse app foi criado para esses fins"
    };

}
