package com.example.andredeoliveira.trabalhoimc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ImcActivity extends AppCompatActivity {

    EditText imcAltura, imcPeso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);

        Button btnCalcular = (Button)findViewById(R.id.calcular_imc);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imcAltura = (EditText)findViewById(R.id.imc_altura);
                imcPeso = (EditText) findViewById(R.id.imc_peso);

                if(imcAltura.getText().toString().length() <= 0){
                    imcAltura.setError("Preenchimento Obrigatório");
                    imcAltura.requestFocus();
                }else if(imcPeso.getText().toString().length() <= 0){
                    imcPeso.setError("Preenchimento Obrigatório");
                    imcPeso.requestFocus();
                }else {


                    int peso = Integer.parseInt(imcPeso.getText().toString());
                    float altura = Float.parseFloat(imcAltura.getText().toString());

                    float imc = peso / (altura * altura);

                    if (imc <= 18.5) {
                        Toast.makeText(ImcActivity.this, "BAIXO PESO", Toast.LENGTH_LONG).show();
                    } else if (imc > 18.5 && imc <= 24.5) {
                        Toast.makeText(ImcActivity.this, "PESO NORMAL", Toast.LENGTH_LONG).show();
                    } else if (imc > 24.5 && imc <= 29.9) {
                        Toast.makeText(ImcActivity.this, "SOBREPESO", Toast.LENGTH_LONG).show();
                    } else if (imc > 29.9 && imc <= 34.9) {
                        Toast.makeText(ImcActivity.this, "OBESIDADE GRAU I", Toast.LENGTH_LONG).show();
                    } else if (imc > 34.9 && imc <= 39.9) {
                        Toast.makeText(ImcActivity.this, "OBESIDADE GRAU II", Toast.LENGTH_LONG).show();
                    } else if (imc > 39.9) {
                        Toast.makeText(ImcActivity.this, "OBESIDADE GRAU III", Toast.LENGTH_LONG).show();
                    }
                }

            }
        });
    }
}
