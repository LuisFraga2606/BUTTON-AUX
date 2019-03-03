package com.example.hackathon;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Usuario extends AppCompatActivity implements Button.OnClickListener {
EditText etNombre,etAnos,etCalle;
Button btnAcept;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);

        btnAcept = (Button) findViewById(R.id.btnAceptar);
        etNombre = (EditText) findViewById(R.id.etNom);
        etAnos =  (EditText) findViewById(R.id.etAno);
        etCalle = (EditText) findViewById(R.id.etCalle);

        btnAcept.setOnClickListener(this);






    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.btnAceptar )
        {
            if(etNombre.getText().toString().equals("") || etCalle.getText().toString().equals("") || etAnos.getText().toString().equals(""))
            {
                Toast.makeText(Usuario.this, "  Todas los campos deben estar rellenos  ", Toast.LENGTH_SHORT).show();
            }
            else
                {
                    Toast.makeText(Usuario.this, "  Datos registrados  ", Toast.LENGTH_SHORT).show();
                    SharedPreferences preferencia = getSharedPreferences("Prefu",0);
                    SharedPreferences.Editor editora = preferencia.edit();
                    editora.putString("Nombre_Guardado",etNombre.getText().toString());
                    editora.apply();
                 Intent intent = new Intent(Usuario.this, MENU.class);
                 startActivity(intent);
                 finish();
                }
        }

    }
}
