package com.jetbrains.Iteracje;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class PetlaMinMaxAndArg {
    public static void main(String[] args) throws IOException {
        int ilosc_liczb,liczba,suma=0,min,max,i;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Podaj  ilość liczb do wylosowania: ");
        ilosc_liczb = Integer.parseInt(br.readLine());
        System.out.println("System losuje "+ilosc_liczb+" liczb całkowitych z przedziału od 0-99\n");
        System.out.println("A następnie znajduje najmniejszą i największą oraz oblicza średnią ze wszystkich wylosowanych liczb.");

        Random random = new Random();
        min =random.nextInt(100);
        System.out.println();
        System.out.println("Wylosowano liczby: "+min+", ");
        max=min;
        suma+=max;
        for (i=1;i<=ilosc_liczb;i++)
        {
            liczba = random.nextInt(100);
            System.out.println( liczba +", ");
            if (max<liczba) max = liczba;
            else min=liczba;
            suma +=liczba;
        }
        System.out.println("\n Największa suma to: "+max+", ");
        System.out.println("Najmniejsza suma to: "+min+", ");
        System.out.println("średnia = "+suma/ilosc_liczb+".");

    }
}
