package br.com.etecia.myapp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {

    //Declarar as variáveis globais:

    TextInputEditText email, senha;
    Button btnEsqSenha, btnCriarconta, btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.login_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //Apresentando as variáveis do java para o xml

        email = findViewById(R.id.email);
        senha = findViewById(R.id.senha);

        btnEsqSenha = findViewById(R.id.btnEsqSenha);
        btnCriarconta = findViewById(R.id.btnCriarconta);
        btnEntrar = findViewById(R.id.btnEntrar);

        //Criando as ações dos botões

        btnEntrar.setOnClickListener(view -> {
             String txtEmail, password;

             txtEmail = email.getText().toString().trim();
             password = senha.getText().toString().trim();

            if (txtEmail.equals("etecia") && password.equals("etecia")) {
                startActivity(new Intent(getApplicationContext(),
                    MenuActivity.class));
                finish();
            }else{
                Toast.makeText(getApplicationContext(),
                        "Usuário ou senha inválidos",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btnEsqSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), RecuperarSenhaActivity.class));
                finish();
            }
        });

        btnCriarconta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), CadastrarSenhaActivity.class));
                finish();
            }
        });

        /*
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MenuActivity.class));
                finish();
            }
        });
        */
    }
}