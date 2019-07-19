package com.equiposemilleromuru.aprendiendo.control;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.equiposemilleromuru.aprendiendo.MainActivity;
import com.equiposemilleromuru.aprendiendo.R;

import java.util.Timer;
import java.util.TimerTask;

public class JuegoDavidActivity extends AppCompatActivity {

    private ImageView btnIniciar, btnCerrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_david);


        getSupportActionBar().hide();  // Quitar nav bar

        referenciar();

    }

    private void referenciar() {

        btnIniciar = findViewById(R.id.btnIniciarDavid);
        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(JuegoDavidActivity.this, "En construcción", Toast.LENGTH_SHORT).show();
            }
        });

        btnCerrar = findViewById(R.id.btnCerrarDavid);
        btnCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(JuegoDavidActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }



}
