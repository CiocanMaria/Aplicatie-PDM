package com.example.app0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class second extends AppCompatActivity {
    ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        listview= (ListView) findViewById(R.id.listview) ;
        ArrayList<String> arrayList= new ArrayList<>();
        arrayList.add("Guacamole");
        arrayList.add("Salata cu pui");
        arrayList.add("Briose cu ciuperci si cascaval");
        arrayList.add("Ciuperci umplute la cuptor");
        arrayList.add("Supa de pui cu galuste");
        arrayList.add("Supa crema de legume coapte");
        arrayList.add("Ciorba radauteana");
        arrayList.add("Pate cu rosii cherry si branza feta");
        arrayList.add("Noodles cu pui si legume");
        arrayList.add("Shakshuka");
        arrayList.add("Risotto cu ciuperci");
        arrayList.add("Cheesecake");
        arrayList.add("Brownie cu cirese");
        arrayList.add("Lava cake");
        arrayList.add("Tiramisu");

       // ArrayAdapter arrayAdapter= new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        ArrayAdapter arrayAdapter= new ArrayAdapter(this, R.layout.row, arrayList);
        listview.setAdapter(arrayAdapter);


        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //primul item
                if (position == 0)
                {
                    Intent intent= new Intent(view.getContext(), reteta1.class);
                    startActivity(intent);
                }
                if (position == 1)
                {
                    Intent intent= new Intent(view.getContext(), reteta2.class);
                    startActivity(intent);
                }
                if (position == 2)
                {
                    Intent intent= new Intent(view.getContext(), reteta3.class);
                    startActivity(intent);
                }
                if (position == 3)
                {
                    Intent intent= new Intent(view.getContext(), reteta4.class);
                    startActivity(intent);
                }
                if (position == 4)
                {
                    Intent intent= new Intent(view.getContext(), reteta5.class);
                    startActivity(intent);
                }
                if (position == 5)
                {
                    Intent intent= new Intent(view.getContext(), reteta6.class);
                    startActivity(intent);
                }
                if (position == 6)
                {
                    Intent intent= new Intent(view.getContext(), reteta7.class);
                    startActivity(intent);
                }
                if (position == 7)
                {
                    Intent intent= new Intent(view.getContext(), reteta8.class);
                    startActivity(intent);
                }
                if (position == 8)
                {
                    Intent intent= new Intent(view.getContext(), reteta9.class);
                    startActivity(intent);
                }
                if (position == 9)
                {
                    Intent intent= new Intent(view.getContext(), reteta10.class);
                    startActivity(intent);
                }
                if (position == 10)
                {
                    Intent intent= new Intent(view.getContext(), reteta11.class);
                    startActivity(intent);
                }
                if (position == 11)
                {
                    Intent intent= new Intent(view.getContext(), reteta12.class);
                    startActivity(intent);
                }
                if (position == 12)
                {
                    Intent intent= new Intent(view.getContext(), reteta13.class);
                    startActivity(intent);
                }
                if (position == 13)
                {
                    Intent intent= new Intent(view.getContext(), reteta14.class);
                    startActivity(intent);
                }
                if (position == 14)
                {
                    Intent intent= new Intent(view.getContext(), reteta15.class);
                    startActivity(intent);
                }
            }
        });
    }


}