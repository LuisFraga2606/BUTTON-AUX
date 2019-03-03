package com.example.hackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GAME extends AppCompatActivity implements Button.OnClickListener{
Button Return1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Return1 = (Button)findViewById(R.id.btnReturn1);

        Return1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btnReturn1)
        {
            Intent intent = new Intent(GAME.this, MENU.class);
            startActivity(intent);
            finish();
        }

    }
}
