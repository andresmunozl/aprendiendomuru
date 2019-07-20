package com.equiposemilleromuru.aprendiendo.control.juegodaniel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.equiposemilleromuru.aprendiendo.R;

import java.util.Timer;
import java.util.TimerTask;

public class JuegoDanielActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_daniel6);
        getSupportActionBar().hide();

        referenciar();
    }

    private void referenciar() {

        Timer timer = new Timer();

        TimerTask task= new TimerTask() {
            @Override
            public void run() {
                Intent ir = new Intent(getApplicationContext(),JuegoDanielActivity7.class);
                startActivity(ir);
            }
        };
        timer.schedule(task,4000);
    }
}
