package com.example.hackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ALERT extends AppCompatActivity implements Button.OnClickListener {
    Button Return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);

        Return = (Button)findViewById(R.id.btnReturn);

        Return.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btnReturn)
        {
            Intent intent = new Intent(ALERT.this, MENU.class);
            startActivity(intent);
            finish();
        }

    }
}
