package com.fzfhlv.Modul1;

public class Kelas {

    private static String nama = "Paimon";

    private static int setMinute(){
        int minute = 18;
        return minute;
    }

    public static void main(String[] args) {
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Set Minute\t" + setMinute());
    }
}
