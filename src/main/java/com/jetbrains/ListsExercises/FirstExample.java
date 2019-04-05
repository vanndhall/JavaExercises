package com.jetbrains.ListsExercises;

import org.omg.CORBA.OBJECT_NOT_EXIST;
import sun.rmi.log.LogInputStream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FirstExample {
    public static void main(String[] args) { // snippet psvm

//        System.out.println("_____shouldAddNullToList()_____");
//        shouldAddNullToList();

//        System.out.println("_____shouldAddElementAtSpecificIndex()_____");
//        shouldAddElementAtSpecificIndex();

//        System.out.println("_____shouldInsertAllElementsFromOneListIntoAnother()_____");
//        shouldInsertAllElementsFromOneListIntoAnother();

//        System.out.println("_____shouldInsertAllElementsFromOneListIntoAnother()_____");
//        shouldGetELementFromJavaList();

//        System.out.println("_____shouldFindElementInList()_____");
//        shouldFindElementInList();

//          System.out.println("_____shouldConvertListToArray()_____");
//          shouldConvertListToArray();


    }

    public static void shouldConvertListToArray(){
        List myList = new ArrayList();
        myList.add("Index 0");
        myList.add("Index 1");
        myList.add("Index 2");

        Object[] tablica = myList.toArray();
        Object[] tablica2 = myList.toArray();





        System.out.println("_____lista_____");
        for(Object x : myList){
            System.out.println(x);
        }
        System.out.println("____tablica_____");

        for(Object x : tablica){
            System.out.println("["+x+"]");
        }
        //String tablica2[] = new String[10];

        List listaPoTablicy = Arrays.asList(tablica2);

        System.out.println("Lista po konwersji z tablicy ");
        for(Object x: listaPoTablicy){
            System.out.println(x);
        }
        System.out.println("Po dodaniu kolejnego wiersza do Listy");
        listaPoTablicy.add(1,"Dodałem kolejny wiersz do indeksu 1");

        for(Object x: listaPoTablicy){
            System.out.println(x);
        }

    }


    public static void shouldFindElementInList(){
        List list1 = new ArrayList();
        String element0 ="List 1 index 0";
        String element1 ="List 1 index 1";
        String element2 ="List 1 index 2";
        String element3 ="List 1 index 3";
        int element4 =4444;
        double element5 = 5.555;


        list1.add(element0);
        list1.add(element1);
        list1.add(element2);
        list1.add(element3);
        list1.add(element4);
        list1.add(element5);

        for(Object next : list1){
            System.out.println(next);
        }

        System.out.println("Szukanie elementu: __________________________");

        int index1 = list1.indexOf(element2);
        System.out.println("index1 = "+index1);

        int index2 = list1.indexOf(element4);
        System.out.println("index2 = "+index2);

        System.out.println("list1.indexOf(element0)  ::: "+ list1.indexOf(element0));

        boolean containsElement = list1.contains("List 1 index 2"); //Sprawdzanie czy lista zawiera element
        System.out.println("\nFind if List have element using value: "+containsElement);

        boolean containsElement2 = list1.contains(null); //Sprawdzanie czy lista zawiera element null
        System.out.println("\nFind if List have element using value null: "+containsElement2);









    }

    public static void shouldGetELementFromJavaList(){

        System.out.println("Lista1_________________________");
        List lista1 = new ArrayList();
        lista1.add("Lista1 index 0");
        lista1.add("lista1 index 1");
        for(Object elementList1 : lista1){
            System.out.println(elementList1);
        }


        System.out.println("Lista2_________________________");
        List lista2 = new ArrayList();
        lista2.add("Lista2 index 0");
        lista2.add("Lista2 index 1");
        lista2.add(0,lista1);
        for(Object elementList2: lista2){
            System.out.println(elementList2);
        }

        System.out.println("\nWydobycie elementu z listy 2 index 0: ");
        Object element0 = lista2.get(0);
        System.out.println("element z listy 2 index 0 :::    " +element0);

    }

    public static void shouldAddNullToList() {
        Object element = null;
        List listaNull = new ArrayList();

        listaNull.add(element);

        for (Object next : listaNull) {
            System.out.println("W liście jest: " + next); //wyswietli null
        }
    }

    public static void shouldAddElementAtSpecificIndex() {
        String zerowy = "zerowy";
        String pierwszy = "pierwszy";
        String drugi = "drugi";
        String trzeci = "trzeci";
        String czwarty = "czwarty";
        String piaty = "piąty";

        List myList = new ArrayList();

        myList.add(zerowy);
        myList.add(pierwszy);
        myList.add(drugi);
        myList.add(trzeci);
        myList.add(czwarty);
        myList.add(piaty);

        for (Object next : myList) {
            System.out.println(next);
        }
        System.out.println("_______________");

        String szosty = "szósty - udało mi się wbić w index 2";
        myList.add(2, szosty);

        for (Object next : myList) {
            System.out.println(next);
        }
    }

    public static void shouldInsertAllElementsFromOneListIntoAnother() {
        List listSource = new ArrayList();

        System.out.println("_____listaSource_____");
        listSource.add("Zerowy");
        listSource.add("pierwszy");
        listSource.add("drugi");

        for (Object element : listSource) {
            System.out.println(element);
        }

        System.out.println("_____Lista Destination______");

        List listDestinaction = new ArrayList();
        listDestinaction.add("listaDestination index 0");
        listDestinaction.add("listaDestination index 1");
        listDestinaction.add("listaDestination index 2");
        for (Object next : listDestinaction) {
            System.out.println(next);
        }

        listDestinaction.add(listSource);
        System.out.println(" Po dodaniu listySource do ListyDestination");
        for (Object next1 : listDestinaction) {
            System.out.println(next1);
        }
        listDestinaction.clear();

        System.out.println("Lista wyczyszczona i dodano domyślne wartości, + dodanie listSource ( z 3 elementami) do 1 indexu ");
        listDestinaction.add("listaDestination index 0");
        listDestinaction.add("listaDestination index 1");
        listDestinaction.add(1, listSource);
        for (Object next2 : listDestinaction) {
            System.out.println(next2);
        }
        System.out.println("___ListaThird____");
        List listThird = new ArrayList();

        listThird.add("ListaThird index 0");
        listThird.add("ListaaThird index 1");
        listThird.add(listDestinaction);
        for (Object third : listThird) {
            System.out.println(third);
        }

        listThird.clear();

        System.out.println("ListaThird wyczyszczona!");
        listThird.add("ListaThird index 0");
        listThird.add("ListaaThird index 1");
        listThird.add(0, listDestinaction);

        System.out.println("Czy listaThird jest pusta?: ");
        for (Object elementThird : listThird) {
            System.out.println(elementThird);

        }



//        public static void shouldOstatecznosc(){
//            List<String> mylist = new ArrayList<String>();
//
//            mylist.add("Object 1");
//            mylist.add("Object 2");
//            mylist.add("Object 3");
//
//            String myString = mylist.get(0);
//
//            System.out.println(myString);
//
//            Iterator<String> iterator = mylist.iterator();
//            while (iterator.hasNext()) {
//                String next = iterator.next();
//                System.out.println(iterator);
//            }
//
//            System.out.println("______________________________");
//            for (String next : mylist) {
//                System.out.println(next);
//            }
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

