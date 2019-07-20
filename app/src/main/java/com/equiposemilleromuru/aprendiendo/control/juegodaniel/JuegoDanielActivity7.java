package com.equiposemilleromuru.aprendiendo.control.juegodaniel;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.equiposemilleromuru.aprendiendo.R;

public class JuegoDanielActivity7 extends AppCompatActivity {

    ImageView uno,dos,cuatro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_daniel7);
        getSupportActionBar().hide();

        referenciar();
    }

    private void referenciar() {

        uno = findViewById(R.id.corre);
        dos = findViewById(R.id.mal5);
        cuatro = findViewById(R.id.mal6);
        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bien();
            }
        });
        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mal();
            }
        });
        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mal();
            }
        });
    }


    private void bien() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Bien Hecho");
        builder.setMessage("Has escojido la opción correcta");
        builder.setPositiveButton("Siguiente", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent ir = new Intent(getApplicationContext(),JuegoDanielActivity8.class);
                startActivity(ir);
            }
        });
        builder.setNegativeButton("Volver a Intentar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent ir = new Intent(getApplicationContext(),JuegoDanielActivity6.class);
                startActivity(ir);
            }
        });
        builder.show();
    }

    private void mal() {

        AlertDialog.Builder builde = new AlertDialog.Builder(this);
        builde.setTitle("Noooo que mal");
        builde.setMessage("Has escojido una opción incorrecta");
        builde.setPositiveButton("Volver a Intentar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent ir = new Intent(getApplicationContext(),JuegoDanielActivity6.class);
                startActivity(ir);
            }
        });
        builde.show();
    }
}
