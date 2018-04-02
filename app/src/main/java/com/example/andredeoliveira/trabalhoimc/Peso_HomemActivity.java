package com.example.andredeoliveira.trabalhoimc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Peso_HomemActivity extends AppCompatActivity {

    EditText altura, resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peso__homem);

        Button calcularH = (Button)findViewById(R.id.btn_H);
        calcularH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                altura = (EditText) findViewById(R.id.dig_alturaH);
                resultado = (EditText) findViewById(R.id.result_H);

                float PI;
                float alturaH;


                Intent telaAtual=getIntent();
                Bundle valores = telaAtual.getExtras();
                if(altura.getText().toString().length() <= 0){
                    altura.setError("Obrigatório preenchimento");
                }else {
                    alturaH = Float.parseFloat(altura.getText().toString());
                    altura.requestFocus();

                    PI = ((alturaH * 100) - 100) * 0.90f;
                    resultado.setText(String.valueOf(PI) + "Kg é seu peso ideal");
                }
            }
        });
    }
}
