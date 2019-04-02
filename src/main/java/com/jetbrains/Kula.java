package com.jetbrains;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kula {
    public static void main(String[] args) throws IOException {
       double promien, objetosc;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Program, który oblicza objętosć kuli o podanym promieniu r: ");
        System.out.println("Podaj promień kuli: ");
        promien = Double.parseDouble(br.readLine());

        objetosc = 4*Math.PI*promien*promien*promien/3;

        System.out.printf("Objętość kuli wynosi: "+"%2.2f",objetosc);
    }
}
