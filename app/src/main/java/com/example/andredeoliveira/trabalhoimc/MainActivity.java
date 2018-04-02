package com.example.andredeoliveira.trabalhoimc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHomem = (Button)findViewById(R.id.button_pesoH);
        Button btnMulher = (Button)findViewById(R.id.button_pesoM);
        Button btnImc = (Button)findViewById(R.id.btn_imc);
        Button btnSobre = (Button)findViewById(R.id.button_Sobre);

        btnHomem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pesoHomem = new Intent(MainActivity.this, Peso_HomemActivity.class);
                startActivity(pesoHomem);
            }
        });

        btnMulher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pesoMulher = new Intent(MainActivity.this, Peso_MulherActivity.class);
                startActivity(pesoMulher);
            }
        });

        btnImc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Imc = new Intent(MainActivity.this, ImcActivity.class);
                startActivity(Imc);
            }
        });

        btnSobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sobre = new Intent(MainActivity.this, SobreActivity.class);
                startActivity(sobre);
            }
        });
    }
}
