package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Przepisiki extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_przepisiki);

        int kat = getIntent().getExtras().getInt("Kategoria");//Odbieranie intencji
        int przepis = getIntent().getExtras().getInt("Przepisy");
        Przepis przepis1 = RepozytoriumPrzepisow.wybierzPrzepis(kat).get(przepis);

    }
}