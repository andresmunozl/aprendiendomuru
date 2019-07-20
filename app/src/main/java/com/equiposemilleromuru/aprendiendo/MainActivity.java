package com.equiposemilleromuru.aprendiendo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.equiposemilleromuru.aprendiendo.control.JuegoDavidActivity;
import com.equiposemilleromuru.aprendiendo.control.juegodaniel.JuegoDanielActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton btnLuis,btnLina,btnDavid,btnFernanda,btnCarlos,btnCristian,btnVictoria,btnDaniel,btnAndres;

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        referenciar();
        
    }

    public void referenciar(){
        btnLuis = findViewById(R.id.btnDavid);
        btnLuis.setOnClickListener(this);
        btnCarlos = findViewById(R.id.btnCarlos);
        btnCarlos.setOnClickListener(this);
        btnCristian = findViewById(R.id.btnCristian);
        btnCristian.setOnClickListener(this);
        btnDaniel = findViewById(R.id.btnDaniel);
        btnDaniel.setOnClickListener(this);
        btnFernanda = findViewById(R.id.btnFernanda);
        btnFernanda.setOnClickListener(this);
        btnLina = findViewById(R.id.btnLina);
        btnLina.setOnClickListener(this);
        btnDavid = findViewById(R.id.btnDavid);
        btnDavid.setOnClickListener(this);
        btnVictoria = findViewById(R.id.btnVictoria);
        btnVictoria.setOnClickListener(this);
        btnAndres = findViewById(R.id.btnAndres);
        btnAndres.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnCarlos:
                Toast.makeText(this, "btn Carlos", Toast.LENGTH_SHORT).show();
                break;
            case  R.id.btnCristian:
                Toast.makeText(this, "btn Cristian", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnLuis:
                Toast.makeText(this, "btn Luis", Toast.LENGTH_SHORT).show();
                break;
            case  R.id.btnDaniel:
                Intent ir = new Intent(getApplicationContext(), JuegoDanielActivity.class);
                startActivity(ir);
                break;
            case R.id.btnFernanda:
                Toast.makeText(this, "btn Fernanda", Toast.LENGTH_SHORT).show();
                break;
            case  R.id.btnLina:
                Toast.makeText(this, "btn Lina", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnDavid:

                intent = new Intent(MainActivity.this, JuegoDavidActivity.class);
                startActivity(intent);
                finish();

                break;
            case  R.id.btnVictoria:
                Toast.makeText(this, "btn Victoria", Toast.LENGTH_SHORT).show();
                break;
            case  R.id.btnAndres:
                //Toast.makeText(this, "btnandres", Toast.LENGTH_SHORT).show();
                Intent intentNum = new Intent(MainActivity.this,MenuVocalesNumerosA.class);
                startActivity(intentNum);
                break;
        }
    }
}
