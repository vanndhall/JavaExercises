package com.jetbrains.Iteracje;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TablicaMnozenia {
    public static void main(String[] args) throws IOException {
        int n, wiersze, kolumny;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Program wyświetla tabliczkę mnożenia dla dowolnego rozmiaru");
        System.out.println("Podaj rozmiar tabiicy mnożenia: ");
        n = Integer.parseInt(br.readLine());

        System.out.println(" _____________________TABLICA MNOŻENIA_____________________");
        for(wiersze = 1;wiersze<=10;wiersze++)
        {
                for(kolumny=1;kolumny<=10;kolumny++)
                {
                    System.out.print(wiersze*kolumny +"\t");
                }
            System.out.println();
        }
    }
}
