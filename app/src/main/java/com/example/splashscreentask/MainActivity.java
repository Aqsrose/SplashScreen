package com.example.splashscreentask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnAddRecord,btnShow1,btnShow2,btnShow3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAddRecord=findViewById(R.id.btnAddRecord);
        btnShow1=findViewById(R.id.btnShow1);
        btnShow2=findViewById(R.id.btnShow2);
        btnShow3=findViewById(R.id.btnShow3);
        btnAddRecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, MainAddRecord.class);
                startActivity(intent);
            }
        });
        btnShow1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, MainTask1.class);
                startActivity(intent);
            }
        });
        btnShow2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, MainTask2.class);
                startActivity(intent);
            }
        });
        btnShow3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, MainTask3.class);
                startActivity(intent);
            }
        });


    }
}