package com.jetbrains.Iteracje;

public class Alphabet {
    public static void main(String[] args) {

        char znak;
        System.out.println("Program wypisujący alfabet: ");

        for(znak ='a';znak<='z';znak++){

            if(znak<'z')
                System.out.print(znak+", ");
            else
                System.out.println(".");
        }
        for (znak='z';znak>='a';znak--)
            if(znak>'a')
                System.out.print(znak+ ",  ");
            else
                System.out.println(".");


    }
}
