package com.jetbrains;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ObliczPunkty {

    public static void main(String[] args) throws IOException {
       float x,y,suma,roznica,iloczyn,iloraz;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Program obliczający sumę, różnicę, iloczyn oraz iloraz dwóch liczb.");
        System.out.println("Podaj X: ");
        x = Float.parseFloat(br.readLine());
        System.out.println("Podaj Y: ");
        y = Float.parseFloat(br.readLine());

        System.out.printf("Dla liczby X: "+ "%1.2f",x);
        System.out.printf(" oraz dla liczby Y " + "%1.2f",y);
        System.out.println("");
        System.out.printf("Suma: "+ "%1.2f, \n", suma = x+y);
        System.out.printf("Różnica: "+ "%1.2f, \n", roznica = x-y);
        System.out.printf("Iloczyn: "+ "%1.2f, \n", iloczyn =x*y);
        System.out.printf("Iloraz: "+ "%1.2f, \n",iloraz = x/y);


    }
}
