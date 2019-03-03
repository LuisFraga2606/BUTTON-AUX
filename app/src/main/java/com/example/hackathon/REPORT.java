package com.example.hackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class REPORT extends AppCompatActivity implements Button.OnClickListener {
Button Return2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        Return2= (Button)findViewById(R.id.btnReturn2);

        Return2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btnReturn2)
        {
            Intent intent = new Intent(REPORT.this, MENU.class);
            startActivity(intent);
            finish();
        }
    }
}
