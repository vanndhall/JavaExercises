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

    public Student() {
    }

    @Override
    public String toString(){
        return "Mam na Imię "+name+
                " oraz Nazwisko "+surname+
                ", posiadam "+ age+" lat"+
                ", mój email to: "+email+
                ",a mało tego, mój numer telefonu: "+phoneNumber;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
