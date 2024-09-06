package br.com.etecia.myapp2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.splash_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //abrir a janela de login utilizando uma thread

        /*

        Public class Pessoa{
            Public Pessoa(){ Método construtor
            }
        }

        Pessoa p = new Pessoa(); -- Pessoa = Tipo da variável, p = nome da variável, new = instância/executar/chamar, Pessoa() = Função

         */

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(),LoginActivity.class)); //Intent é tudo que o usuário consegue fazer -- Para identificar uma classe: this, getApplicationContext
                finish();
            }
        },3000);

    }
}