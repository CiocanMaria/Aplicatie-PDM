package com.example.app0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class four extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

        Button buton10=(Button)findViewById(R.id.button10);
        buton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int10= new Intent(four.this, masa.class);
                startActivity(int10);
            }
        });

        Button buton11=(Button)findViewById(R.id.button11);
        buton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int11= new Intent(four.this, vin.class);
                startActivity(int11);
            }
        });

        Button buton12=(Button)findViewById(R.id.button12);
        buton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int12= new Intent(four.this, condimente.class);
                startActivity(int12);
            }
        });
    }
}