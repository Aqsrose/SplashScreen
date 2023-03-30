package com.example.splashscreentask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainTask1 extends AppCompatActivity {

TextView tvName,tvArid;
Button btnBack1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_task1);
        tvName=findViewById(R.id.tvName);
        tvArid=findViewById(R.id.tvArid);
        btnBack1=findViewById(R.id.btnBack1);


        btnBack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainTask1.this.finish();
            }
        });

    }
}