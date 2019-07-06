package com.equiposemilleromuru.aprendiendo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MenuVocalesNumerosA extends AppCompatActivity implements View.OnClickListener{

    ImageButton btnVocales,btnNumeros;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_vocales_numeros);

        btnNumeros = findViewById(R.id.btnNumeros);
        btnVocales = findViewById(R.id.btnVocales);
        btnVocales.setOnClickListener(this);
        btnNumeros.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnNumeros:
                Intent intentNum = new Intent(MenuVocalesNumerosA.this,NumerosActivityA.class);
                startActivity(intentNum);
                break;
            case R.id.btnVocales:
                Intent intentVoc = new Intent(MenuVocalesNumerosA.this,VocalesActivityA.class);
                startActivity(intentVoc);
                break;
            default:
                Toast.makeText(this, "Opción no valida!", Toast.LENGTH_SHORT).show();
        }
    }
}
