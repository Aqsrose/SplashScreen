package com.example.splashscreentask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainTask3 extends AppCompatActivity {

    TextView tvName,tvArid;
    Button btnBack3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_task3);
        tvName=findViewById(R.id.tvName);
        tvArid=findViewById(R.id.tvArid);
        btnBack3=findViewById(R.id.btnBack2);

        btnBack3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainTask3.this.finish();
            }
        });
    }
}