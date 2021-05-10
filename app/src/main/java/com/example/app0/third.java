package com.example.app0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class third extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Button buton4=(Button)findViewById(R.id.button4);
        buton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4= new Intent(third.this, fainoase.class);
                startActivity(int4);
            }
        });

        Button buton5=(Button)findViewById(R.id.button5);
        buton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int5= new Intent(third.this, carne.class);
                startActivity(int5);
            }
        });

        Button buton6=(Button)findViewById(R.id.button6);
        buton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int6= new Intent(third.this, legume.class);
                startActivity(int6);
            }
        });

        Button buton7=(Button)findViewById(R.id.button7);
        buton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int7= new Intent(third.this, fructe.class);
                startActivity(int7);
            }
        });

        Button buton8=(Button)findViewById(R.id.button8);
        buton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int8= new Intent(third.this, lactate.class);
                startActivity(int8);
            }
        });

        Button buton9=(Button)findViewById(R.id.button9);
        buton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int9= new Intent(third.this, zaharoase.class);
                startActivity(int9);
            }
        });
    }

}