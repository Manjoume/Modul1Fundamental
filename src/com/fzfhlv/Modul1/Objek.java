package com.fzfhlv.Modul1;

//class main / demo class
public class Objek {
    public static void main(String[] args) {
        //Deklarasi Objek tanpa parameter
        Mahasiswa mahasiswaTanpa = new Mahasiswa();

        mahasiswaTanpa.setNama("Faiz Rizky Fahlevi");
        mahasiswaTanpa.setNim(19104047);


        //output
        System.out.println("Mahasiswa 1");
        System.out.println("Nama\t: " + mahasiswaTanpa.getNama());
        System.out.println("Nim\t\t: " + mahasiswaTanpa.getNim());


        //deklarasi object dengan parameter
        Mahasiswa mahasiswa = new Mahasiswa("Yoshino", 123215);

        System.out.println("Mahasiswa 2");
        System.out.println("Nama\t: " + mahasiswa.getNama());
        System.out.println("Nim\t\t: " + mahasiswa.getNim());
    }
}
