package com.burakkutbay.springbootlogging.model;

/**
 * Created by Hasan Burak KUTBAY on 11/7/20.
 */
public class Ogrenci {
    private int id;
    private String adi;

    public Ogrenci(int id, String adi) {
        this.id = id;
        this.adi = adi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }
}

