package com.fzfhlv.Modul1.Manusia;


public class DemoManusia {
    public static void main(String[] args) {
        Manusia manusia = new Manusia();
        //Array of object
        Manusia arrayMahasiswa[] = new Manusia[3];

        //constructor pertama
        Manusia manusia1 = new Manusia();
        manusia1.setNama("Lisa");
        manusia1.setUmur(20);

        //constructor kedua
        Manusia manusia2 = new Manusia("Satan",20);

        //constructor ketiga
        Manusia manusia3 = new Manusia("Nica", 18);

        arrayMahasiswa[0] = manusia1;
        arrayMahasiswa[1] = manusia2;
        arrayMahasiswa[2] = manusia3;

        for (Manusia x : arrayMahasiswa) {
            System.out.println("Character");
            System.out.println("Nama\t: " + x.getNama());
            System.out.println("Umur\t: " + x.getUmur());
            System.out.println();
        }
    }
}
