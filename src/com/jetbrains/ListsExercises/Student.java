package com.jetbrains.ListsExercises;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil;

public class Student {

    private String name;
    private String surname;
    private String email;
    private int age;
    private int phoneNumber;


    public Student(String name, String surname, String email, int age, int phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString(){
        return "Mam na Imię "+name+
                " oraz Nazwisko "+surname+
                ", posiadam lat "+ age+
                ", mój email to: "+email+
                ",a mało tego, mój numer telefonu: "+phoneNumber;

    }

}
