package com.fzfhlv.Modul1.Manusia;

public class Manusia {
    private String nama;
    private int umur;

    //Constuctorr Pertama
    public Manusia(){}

    //Constuctor kedua
    public Manusia(String nama) {
        this.nama = nama;
    }
    //Constuctor ketiga
    public Manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    //Getter & Setter

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}
