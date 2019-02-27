package com.jetbrains.InstrukcjeWarunkowe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Trojkat {
    public static void main(String[] args) throws IOException {
        int a, b, c;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        try {
        System.out.println("Program sprawdzający czy na podstawie wprowadzonych danych  powstanie trójkąt prostokątny.");
        System.out.println("Podaj bok a: ");
        a = Integer.parseInt(br.readLine());
        System.out.println("Podaj bok b: ");
        b = Integer.parseInt(br.readLine());
        System.out.println("Podaj bok c: ");
        c = Integer.parseInt(br.readLine());
//        }
//         catch (NumberFormatException e) {
//            System.out.println("Nie wczytano liczby. Program się zakończy!");
//        }

        if ((a * a + b * b) == c * c) {
            System.out.println("Boki: ");
            System.out.println("A = " + a);
            System.out.println("B = " + b);
            System.out.println("C = " + c);
            System.out.println("Tworzą trójką prostokątny!  :)");
        } else {
            System.out.println("Boki: ");
            System.out.println("A = " + a);
            System.out.println("B = " + b);
            System.out.println("C = " + c);
            System.out.println("Nie tworzą trójką prostokątnego!  :(");
        }

    }
}



