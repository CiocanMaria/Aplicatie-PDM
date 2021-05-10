package com.example.app0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buton1=(Button)findViewById(R.id.button1);
        Button buton2=(Button)findViewById(R.id.button2);
        Button buton3=(Button)findViewById(R.id.button3);
        buton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1= new Intent(MainActivity.this, second.class);
                startActivity(int1);
            }
        });
        buton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2= new Intent(MainActivity.this, third.class);
                startActivity(int2);
            }
        });

        buton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3= new Intent(MainActivity.this, four.class);
                startActivity(int3);
            }
        });

    }
}