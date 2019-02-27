package com.jetbrains;

public class LiczbaPi {
    public static void main(String[] args) {
        System.out.println("Program wyświetla liczbę pi z zadaną dokładnością.");
        System.out.printf("Pi ="+ "%1.10f\n", Math.PI );
        System.out.println("Program wyświetla pierwiastek  pi z dokładnością do dwóch liczb po przecinku.");
        System.out.printf("Sqrt(Pi) = "+ "%2.2f\n",Math.sqrt(Math.PI));

    }
}
