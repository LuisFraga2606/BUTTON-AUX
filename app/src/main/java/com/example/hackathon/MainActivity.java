package com.example.hackathon;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;


public class MainActivity extends AppCompatActivity {
    LottieAnimationView confetty;
    TextView LETRAS;
    String Nombre_Guardado;

    private final int DURACION_SPLASH = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        confetty = (LottieAnimationView) findViewById(R.id.avConfetti);



        LETRAS = (TextView)findViewById(R.id.tvHACK);
        Animation efecto = AnimationUtils.loadAnimation(this, R.anim.nueva_transicion);

        LETRAS.setAnimation(efecto);
        confetty.playAnimation();
        confetty.setSpeed(1);

        SharedPreferences preferencias = getSharedPreferences("Prefu",0);
        Nombre_Guardado  = preferencias.getString("Nombre_Guardado","");



        new Handler().postDelayed(new Runnable() {
            public void run() {

                if(Nombre_Guardado== "") {
                    Intent intent = new Intent(MainActivity.this, Usuario.class);
                    startActivity(intent);
                    finish();
                }else{
                    Intent intent = new Intent(MainActivity.this, MENU.class);
                    startActivity(intent);
                    finish();
                }
            }

            ;
        }, DURACION_SPLASH);


    }
}
