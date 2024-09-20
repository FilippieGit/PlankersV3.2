package br.com.etecia.myapp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    CardView cardBikes, cardAcessorios, cardManutencao, cardDicas, cardLocais, cardEventos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.menu_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        cardBikes = findViewById(R.id.menuBikes);
        cardAcessorios = findViewById(R.id.menuAcessorios);
        cardManutencao = findViewById(R.id.menuManutencao);
        cardDicas = findViewById(R.id.menuDicas);
        cardLocais = findViewById(R.id.menuLocais);
        cardEventos = findViewById(R.id.menuEventos);

        cardBikes.setOnClickListener(this);
        cardAcessorios.setOnClickListener(this);
        cardManutencao.setOnClickListener(this);
        cardDicas.setOnClickListener(this);
        cardLocais.setOnClickListener(this);
        cardEventos.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.menuBikes) {
            startActivity(new Intent(getApplicationContext(), BikesActivity.class));
            finish();
        }
        if (view.getId() == R.id.menuAcessorios) {
            startActivity(new Intent(getApplicationContext(), AcessoriosActivity.class));
            finish();
        }
        if (view.getId() == R.id.menuManutencao) {
            startActivity(new Intent(getApplicationContext(), ManutencaoActivity.class));
            finish();
        }
        if (view.getId() == R.id.menuDicas) {
            startActivity(new Intent(getApplicationContext(), DicasActivity.class));
            finish();
        }
        if (view.getId() == R.id.menuLocais) {
            startActivity(new Intent(getApplicationContext(), LocaisActivity.class));
            finish();
        }
        if (view.getId() == R.id.menuEventos) {
            startActivity(new Intent(getApplicationContext(), EventosActivity.class));
            finish();
        }

    }
}