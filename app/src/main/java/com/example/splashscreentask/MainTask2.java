package com.example.splashscreentask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainTask2 extends AppCompatActivity {

    TextView tvName,tvArid;
    Button btnBack2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_task2);
        tvName=findViewById(R.id.tvName);
        tvArid=findViewById(R.id.tvArid);
        btnBack2=findViewById(R.id.btnBack2);

        btnBack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainTask2.this.finish();
            }
        });
    }
}