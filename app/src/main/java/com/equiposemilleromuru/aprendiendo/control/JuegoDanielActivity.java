package com.equiposemilleromuru.aprendiendo.control;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.equiposemilleromuru.aprendiendo.R;

public class JuegoDanielActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_daniel);

        getSupportActionBar().hide();//quitar barra superior
        
        referenciar();
    }

    private void referenciar() {
    }
}
