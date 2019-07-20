package com.equiposemilleromuru.aprendiendo.control.juegodaniel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.equiposemilleromuru.aprendiendo.R;

public class JuegoDanielActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_daniel);

        getSupportActionBar().hide();//quitar barra superior
        
        referenciar();
    }

    private void referenciar() {

        btn = findViewById(R.id.ir);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ir = new Intent(getApplicationContext(),JuegoDanielActivity2.class);
                startActivity(ir);
            }
        });
    }
}
