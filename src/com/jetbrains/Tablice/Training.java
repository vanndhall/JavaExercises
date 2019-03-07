package com.jetbrains.Tablice;

public class Training {
    public static void main(String[] args) {
        int n=10,i;
        int dane[] = new int [n];
        for (i=0;i<dane.length;i++){
            dane[i] = n-1-i;
            System.out.println("Dane["+i+"] = " + dane[i]);
        }
    }
}
