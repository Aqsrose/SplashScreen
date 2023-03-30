package com.example.splashscreentask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainAddRecord extends AppCompatActivity {
EditText etName,etArid;
Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_add_record);
        etName=findViewById(R.id.etName);
        etArid=findViewById(R.id.etArid);
        btnAdd=findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainAddRecord.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}