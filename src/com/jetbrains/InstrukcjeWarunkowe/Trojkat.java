package com.jetbrains.InstrukcjeWarunkowe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Trojkat {
    public static void main(String[] args) throws IOException {
        int a, b, c;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        try {
<<<<<<< HEAD
        System.out.println("Program sprawdzający czy na podstawie wprowadzonych danych  powstanie trójkąt prostokątny.");
        System.out.println("Podaj bok a: ");
        a = Integer.parseInt(br.readLine());
        System.out.println("Podaj bok b: ");
        b = Integer.parseInt(br.readLine());
        System.out.println("Podaj bok c: ");
        c = Integer.parseInt(br.readLine());
=======
            System.out.println("Program sprawdzający czy na podstawie wprowadzonych danych  powstanie trójkąt prostokątny.");
            System.out.println("Podaj bok a: ");
            a = Integer.parseInt(br.readLine());
            System.out.println("Podaj bok b: ");
            b = Integer.parseInt(br.readLine());
            System.out.println("Podaj bok c: ");
            c = Integer.parseInt(br.readLine());
>>>>>>> 423e74a7afe81cb53ac6353ee0ad6e3b0c87a363
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
<<<<<<< HEAD
        } else {
=======
        }
        else{
>>>>>>> 423e74a7afe81cb53ac6353ee0ad6e3b0c87a363
            System.out.println("Boki: ");
            System.out.println("A = " + a);
            System.out.println("B = " + b);
            System.out.println("C = " + c);
            System.out.println("Nie tworzą trójką prostokątnego!  :(");
        }

    }
<<<<<<< HEAD
}



=======

}
>>>>>>> 423e74a7afe81cb53ac6353ee0ad6e3b0c87a363
