package com.jetbrains;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PoleProstokata {

    public static void main(String[] args)
    throws IOException
    {
        double a,b;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      try {
          System.out.println("Porgram oblicza pole prostokąta.");
          System.out.println("Podaj bok  A: ");
          a = Double.parseDouble(br.readLine());
          System.out.println("Podaj bok B: ");
          b = Double.parseDouble(br.readLine());

          System.out.print("Pole prostokąta o boku a= " + a + " i boku b= " + b);
          System.out.println(" wynosi " + Oblicz(a, b));
        }
      catch(NumberFormatException e)
      {
          System.out.println("Nie wczytano liczby, program się zakończy.");
      }

    }

    public static Double Oblicz(double a, double b){
        double oblicz =a*b;
        return oblicz;
    }

}
