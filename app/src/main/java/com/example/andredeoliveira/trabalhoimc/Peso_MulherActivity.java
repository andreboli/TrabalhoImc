package com.example.andredeoliveira.trabalhoimc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Peso_MulherActivity extends AppCompatActivity {

    EditText altura, resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peso__mulher);

        Button calcularM = (Button)findViewById(R.id.calcular_imc);
        calcularM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                altura = (EditText) findViewById(R.id.dig_alturaM);
                resultado = (EditText) findViewById(R.id.result_M);

                float PI;
                float alturaM;


                Intent telaAtual=getIntent();
                Bundle valores = telaAtual.getExtras();
                if(altura.getText().toString().length() <= 0){
                    altura.setError("Obrigatório preenchimento");
                }else {
                    alturaM = Float.parseFloat(altura.getText().toString());
                    altura.requestFocus();

                    PI = ((alturaM * 100) - 100) * 0.85f;
                    resultado.setText(String.valueOf(PI) + "Kg é seu peso ideal");
                }
            }
        });
    }
}
