package com.example.listview;

public class Przepis {
    private String nazwaPrzepisu;
    private int kategoria;
    private String trescPrzepisu;
    private int idObrazka;

    public Przepis(String nazwaPrzepisu, int kategoria, String trescPrzepisu, int idObrazka) {
        this.nazwaPrzepisu = nazwaPrzepisu;
        this.kategoria = kategoria;
        this.trescPrzepisu = trescPrzepisu;
        this.idObrazka = idObrazka;
    }

    public Przepis(String nazwaPrzepisu, int kategoria, String trescPrzepisu) {
        this.nazwaPrzepisu = nazwaPrzepisu;
        this.kategoria = kategoria;
        this.trescPrzepisu = trescPrzepisu;
    }

    public String getNazwaPrzepisu() {
        return nazwaPrzepisu;
    }

    public int getKategoria() {
        return kategoria;
    }

    public String getTrescPrzepisu() {
        return trescPrzepisu;
    }

    public int getIdObrazka() {
        return idObrazka;
    }

    public void setNazwaPrzepisu(String nazwaPrzepisu) {
        this.nazwaPrzepisu = nazwaPrzepisu;
    }

    public void setKategoria(int kategoria) {
        this.kategoria = kategoria;
    }

    public void setTrescPrzepisu(String trescPrzepisu) {
        this.trescPrzepisu = trescPrzepisu;
    }

    public void setIdObrazka(int idObrazka) {
        this.idObrazka = idObrazka;
    }

    @Override
    public String toString() {
        return nazwaPrzepisu;
    }
}
