package com.example.hackathon;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MENU extends AppCompatActivity implements Button.OnClickListener {
    Button btnCentro,btnPanico,btnReporte,btnGame;
    String Nombre_Guardado;
    TextView LABEL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        btnCentro = (Button)findViewById(R.id.btnCentro);
        btnGame = (Button)findViewById(R.id.btnGame);
        btnPanico = (Button)findViewById(R.id.btnPanic);
        btnReporte = (Button)findViewById(R.id.btnReport);

        LABEL = (TextView) findViewById(R.id.CAJA) ;
        SharedPreferences preferencias = getSharedPreferences("Prefu",0);
        Nombre_Guardado  = preferencias.getString("Nombre_Guardado","");

        LABEL.setText("Hola "+Nombre_Guardado);

        btnCentro.setOnClickListener(this);
        btnReporte.setOnClickListener(this);
        btnPanico.setOnClickListener(this);
        btnGame.setOnClickListener(this);

    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnCentro)
        {
            if(btnCentro.getText().toString().equals("ALERTA!!"))
            {
                Toast.makeText(MENU.this, "  Datos Enviados  ", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MENU.this, ALERT.class);
                startActivity(intent);
                finish();
            }
            if (btnCentro.getText().toString().equals("PLAY!!"))
            {
                Toast.makeText(MENU.this, "  PANTALLA DE JUEGO  ", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MENU.this, GAME.class);
                startActivity(intent);
                finish();
            }
            if (btnCentro.getText().toString().equals("REPORTE!!"))
            {
                Toast.makeText(MENU.this, "  PANTALLA DE REPORTE  ", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MENU.this, REPORT.class);
                startActivity(intent);
                finish();
            }
        }
        if(v.getId()== R.id.btnPanic)
        {
            btnCentro.setText("ALERTA!!");
            btnCentro.setBackgroundColor(Color.parseColor("#DD1515"));
            btnCentro.setEnabled(true);
        }
        else
        {
            if (v.getId() == R.id.btnGame)
            {
                btnCentro.setText("PLAY!!");
                btnCentro.setBackgroundColor(Color.parseColor("#4CAF50"));
                btnCentro.setEnabled(true);
            }
            else
            if(v.getId()== R.id.btnReport)
            {
                btnCentro.setText("REPORTE!!");
                btnCentro.setBackgroundColor(Color.parseColor("#1518DD"));
                btnCentro.setEnabled(true);
            }

        }



    }
}
