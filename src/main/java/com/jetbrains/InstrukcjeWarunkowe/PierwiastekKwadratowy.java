package com.jetbrains.InstrukcjeWarunkowe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PierwiastekKwadratowy {
    public static void main(String[] args) throws IOException {
        double a, b, c, delta, x1, x2;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Program, który oblicza pierwiastki równania kwadratowego ax^2+bx+c = 0.");
        System.out.println("Podaj a: ");
        a = Double.parseDouble(br.readLine());
        if (a == 0)
            System.out.println("Niedozwolona wartość wspólczynnika a. ");
        else {
            System.out.println("Podaj b: ");
            b = Double.parseDouble(br.readLine());
            System.out.println("Podaj c: ");
            c = Double.parseDouble(br.readLine());

            delta = b * b - 4 * a * c;

            if (delta < 0)
                System.out.println("Brak pierwiastków rzeczywistych");
            else {
                if (delta == 0) {
                    x1 = -b / (2 * a);
                    System.out.printf("Dla a = " + "%4.2f,", a);
                    System.out.printf("Dla b = " + "%4.2f,", b);
                    System.out.printf("Dla c = " + "%4.2f\n", c);
                    System.out.print("trójmian ma jeden pierwiastek podwójny x1 = ");
                    System.out.printf("%4.2f.\n", x1);
                    System.out.println("");
                } else {
                    x1 = (-b - Math.sqrt(delta)) / (2 * a);
                    x2 = (-b + Math.sqrt(delta)) / (2 * a);
                    System.out.printf("Dla a = " + "%4.2f,", a);
                    System.out.printf("Dla b = " + "%4.2f,",b);
                    System.out.printf("Dla c = " + "%4.2f\n",c);
                    System.out.println("trójmian ma pierwiastki: ");
                    System.out.print("x1 = ");
                    System.out.printf("%4.2f,",x1);
                    System.out.print("x2 = ");
                    System.out.printf("%4.2f. \n",x2);
                    System.out.println("");
                }
            }
        }
    }
}
