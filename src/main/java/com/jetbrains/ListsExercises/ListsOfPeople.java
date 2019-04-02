package com.jetbrains.ListsExercises;

import main.java.com.jetbrains.ListsExercises.Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ListsOfPeople {

    public static List myStudentsList = new ArrayList();


    public static void main(String[] args) throws IOException {




       // myStudentsList.add(writeData());
        readDataFromList();

    }

    public static Object writeData(String name, String surname, String email, int age, int phone) throws IOException {



        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Podaj swoje Imię: " );
        name = bufferedReader.readLine();


        System.out.println("Podaj swoje Nazwisko: " );
        surname = bufferedReader.readLine();


        System.out.println("Podaj swój Email: " );
        email = bufferedReader.readLine();


        System.out.println("Podaj swoj wiek: " );
        age = Integer.parseInt(bufferedReader.readLine());



        System.out.println("Podaj swoj numer komórkowy: " );
        phone = Integer.parseInt(bufferedReader.readLine());

        Student student = new Student(name,surname,email,age,phone);

        return student.toString();

    }

    public static void readDataFromList(){
        for(Object students : myStudentsList){
            System.out.println("Moje dane: "+ students.toString());

        }
    }
}
