package com.jetbrains.ListsExercises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FirstExample {
    public static void main(String[] args) { // snippet psvm
        List<String> mylist = new ArrayList<String>();

        mylist.add("Object 1");
        mylist.add("Object 2");
        mylist.add("Object 3");

        String myString = mylist.get(0);

        System.out.println(myString);

        Iterator<String> iterator = mylist.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(iterator);
        }

        System.out.println("______________________________");
        for(String next : mylist){
            System.out.println(next);
        }
       // mylist.add(new Integer(3));


        //Clear list:
        //__________________________-
//        mylist.clear();
//        System.out.println(mylist);

        //Interatio list:
        //______________________________________________________________
//        Iterator iterator = mylist.iterator();
//        while(iterator.hasNext()){
//            Object next = iterator.next();
//            System.out.println("Wynik mojej listy: " + iterator);
//        }
//
//        System.out.println("___________________________________________");
//
//        for(Object next : mylist){
//            System.out.println("Wynik mojej listy: " + next);
//        }
//
//        System.out.println("___________________________________________");
//        for(int i =0;i<mylist.size();i++){
//            System.out.println(mylist.get(i));
//        }
//
        //Inicialize lists:
        //___________________________________________________
//        mylist.remove(2);
//
//        Object firstObject = mylist.get(0);
//
//        int size = mylist.size();
//
//        System.out.println("Rozmiar listy: "+size);
//        System.out.println("Obiekt z 0 indeksu listy  "+firstObject);

    }
}