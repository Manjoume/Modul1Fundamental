package com.fzfhlv.Modul1.Pass;

public class TestPass {
    int nomer1, nomer2;

    //constructor
    public TestPass(int nomer1, int nomer2) {
        this.nomer1 = nomer1;
        this.nomer2 = nomer2;
    }
    //pass by value, parameter berupa tipe data primit
    public void calculate(int m, int n){
        m = m * 10;
        n = n / 2;
    }
    //pass by reference, parameter berupa tipe data class
    public void calculate(TestPass pass){
        pass.nomer1 = pass.nomer1 * 10;
        pass.nomer2 = pass.nomer2 / 2;
    }
}
