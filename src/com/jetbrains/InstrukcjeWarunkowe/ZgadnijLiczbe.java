package com.jetbrains.InstrukcjeWarunkowe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class ZgadnijLiczbe {
    public static void main(String[] args) throws IOException {
        int zgadnij_liczbe = 0, losuj_liczbe;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Gra zgadula! Zgadnij liczbę z przedziału od 0-10!");
        Random random = new Random();
        losuj_liczbe = Math.round((random.nextInt(10)));
        while (zgadnij_liczbe != losuj_liczbe) {
            System.out.println("Podaj liczbę: ");
            zgadnij_liczbe = Integer.parseInt(br.readLine());
            System.out.println("Podana liczba to: " + losuj_liczbe);
            if (zgadnij_liczbe < losuj_liczbe)
                System.out.println("Niestety szukana liczba jest większa! Szukaj dalej!");
            else if (zgadnij_liczbe > losuj_liczbe)
                System.out.println("Niestety szukana liczba jest mniejsza! Szukaj dalej!");
            else
                System.out.println("Gratulacje! trafiłeś !");

        }
    }

}
