package com.example.listview;

import java.util.ArrayList;

public class RepozytoriumPrzepisow {
    static public final Przepis przepisy[]={
      new Przepis("muffinki", 3, "melko, cukier, mąka, kawa, proszek do pieczenia, jajko. Przepis: " +
              "Wszystko wymieszać, wlać do foremek i piec w 180 stopniach bez termoobiegu", R.drawable.muffin),
      new Przepis("Rogalik", 3, "Drożdże, mleko, jajka, dżem różany", R.drawable.rogalik),
      new Przepis("jabłecznik", 2, "jabłka, drożdże, jajko, mleko, proszek do pieczenia, mąka", R.drawable.jablecznik),
      new Przepis("Gofry", 1, "mąka, jajko, mleko, czekolada, kawa", R.drawable.gofry),
      new Przepis("Kawa Latte", 0, "proszek latte, mleko, śmietanka, kakao, bita śmietana", R.drawable.latte)
    };

    public static ArrayList<Przepis> wybierzPrzepis(int kategoria){
        ArrayList<Przepis> wybrane = new ArrayList<>();
        for(Przepis przepis: przepisy){
            if(przepis.getKategoria() == kategoria){
                wybrane.add(przepis);
            }
        }
        return wybrane;
    }
}
