package com.jetbrains.Tablice;

public class Macierze {
    public static void main(String[] args) {

        PierwszaMacierz();
        DrugaMacierz();
    }


    public static void PierwszaMacierz() {

        System.out.println("Macierz Jeden: Tablica dwuwymiarowa, która umieszcza liczbę 1 a poza przekątną \n Dodatkowo oblicza sume elementów wyróżnionych w tablicy\n tj. tych znajdujących się na jej przekątnej.");
        int n = 10, i, j, suma;
        int macierz[][] = new int[n][n];
        //wypisywanie do tablicy 1 na przekątnej, a 0 poza przekątną

        for (i = 0; i < macierz.length; i++) {

            for (j = 0; j < macierz.length; j++) {
                if (i == j)
                    macierz[i][j] = 1;
                else
                    macierz[i][j] = 0;
            }
        }

        // wyswietlenie zawartosci tablicy
        for (i = 0; i < macierz.length; i++) {
            for (j = 0; j < macierz.length; j++) {
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }

        suma = 0;
        for (i = 0; i < macierz.length; i++) {
            suma += macierz[i][i]; // suma= suma+macierz[i][i];
        }

        System.out.println("Suma wyróznionych elementów w tablicy wynosi: " + suma + ".");
        System.out.println("=========================================\n");
    }
    public static void DrugaMacierz() {
        System.out.println("Macierz Dwa: Tablica dwuwymiarowa 10x10 umieszcza na przekątnej liczby od 0 do 9,\n a poza przekątną liczbę 0. Dodatkowo program oblicza sumę\n elementów wyróżnionych w tablicy(znajdujących się na przekątnej)");
        int n = 10, i, j, suma;
        int macierz[][] = new int[n][n];

        //wpisywanie do tablicy liczb od 0 do 9 na przekątnej, a 0 poza przekątną
        for (i = 0; i < macierz.length; i++) {
            for (j = 0; j < macierz.length; j++) {
                if (i == j)
                    macierz[i][j] = j;
                else
                    macierz[i][j] = 0;
            }

        }

        //wyswietlenie zawartości tablicy
        for (i=0;i<macierz.length;i++){
            for (j=0;j<macierz.length;j++){
                System.out.print(macierz[i][j]+" ");
            }
            System.out.println();
        }

        suma=0;
    for (i=0;i<macierz.length;i++){
        suma+=macierz[i][i]; // suma=suma+macierz[i][i]
    }
        System.out.println("Suma wyróznionych elementów w tablicy wynosi: " + suma + ".");
        System.out.println("=========================================\n");
    }
}
