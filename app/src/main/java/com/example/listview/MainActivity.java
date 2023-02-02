package com.example.listview;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.ListaListViewKategoria);
        AdapterView.OnItemClickListener clickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intencja = new Intent(MainActivity.this, ListaPrzepisow.class);
                intencja.putExtra("Kategoria", i);
                startActivity(intencja);

                String kategoria = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(MainActivity.this, kategoria, Toast.LENGTH_LONG).show();
            }
        };
        listView.setOnItemClickListener(clickListener);







        //DYNAMICZNA
        ArrayList<String> slowa = new ArrayList<>();
        slowa.add("Pogłaszcz Kota");
        slowa.add("Zamiaucz ");
        slowa.add("Wyjście z psem");
        slowa.add("Nauczyć się potrójnej całki");
        ArrayAdapter<String> slowaAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, slowa); //simple_list_item pozwala wyświetlić String
        //Adapter ołączony z Danymi z tablicy slowa

        ListView listview2 = findViewById(R.id.ListViewDynamicznie);
        listview2.setAdapter(slowaAdapter);



        Button button = findViewById(R.id.button);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        EditText editText = findViewById(R.id.editTextPersonalnie);
                        String wpisanyText = editText.getText().toString();
                        slowa.add(wpisanyText);
                        slowaAdapter.notifyDataSetChanged();
                    }
                }
        );

        AdapterView.OnItemClickListener kliknieteDynamiczne = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, slowa.get(i), Toast.LENGTH_SHORT).show();
                slowa.remove(i);
                slowaAdapter.notifyDataSetChanged();
            }
        };
        listview2.setOnItemClickListener(kliknieteDynamiczne);




    }
}