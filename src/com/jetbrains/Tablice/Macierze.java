package com.jetbrains.Tablice;

public class Macierze {
    public static void main(String[] args) {

    PierwszaMacierz();
    }

    public static void PierwszaMacierz(){
        int n=10, i,j,suma;
        int macierz[][] = new int[n][n];
        //wypisywanie do tablicy 1 na przekątnej, a 0 poza przekątną

        for (i=0;i<macierz.length;i++){

            for (j=0;j<macierz.length;j++){
                if (j==j)
                    macierz[i][j] = 1;
                else
                    macierz[i][j] = 0;
            }
        }

        // wyswietlenie zawartosci tablicy
        for (i=0;i<macierz.length;i++){
            for (j=0;j<macierz.length;j++){
                System.out.print(macierz[i][j]+" ");
            }
            System.out.println();
        }

        suma=0;
        for (i=0;i<macierz.length;i++){
            suma+=macierz[i][i]; // suma= suma+macierz[i][i];
        }

        System.out.println("Suma wyróznionych elementów w tablicy wynosi: "+suma+".");
        System.out.println("=========================================");
    }
}
