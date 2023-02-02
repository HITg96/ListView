package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListaPrzepisow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_przepisow);


        int kat = getIntent().getExtras().getInt("Kategoria");
        Toast.makeText(this, Integer.toString(kat), Toast.LENGTH_SHORT).show();

        ArrayList<Przepis> przepisy = RepozytoriumPrzepisow.wybierzPrzepis(kat);
        //przepisy.add(RepozytoriumPrzepisow.przepisy[kat]);
        ArrayAdapter<Przepis> adapterPrzepisow = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, przepisy);
        ListView listviewPrzepisy = findViewById(R.id.listViewNew);
        listviewPrzepisy.setAdapter(adapterPrzepisow);

        AdapterView.OnItemClickListener wybranyPrzepis = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intencja = new Intent(ListaPrzepisow.this, Przepisiki.class);
                //Do intencji dodać kliknięty przepis
                intencja.putExtra("Kategoria", kat);
                intencja.putExtra("Przepisy", i);
                Toast.makeText(ListaPrzepisow.this, przepisy.get(i).toString(), Toast.LENGTH_SHORT).show();
                startActivity(intencja);
            }
        };
        listviewPrzepisy.setOnItemClickListener(wybranyPrzepis);
    }
}