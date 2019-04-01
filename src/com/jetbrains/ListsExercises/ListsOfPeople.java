package com.jetbrains.ListsExercises;

import java.util.ArrayList;
import java.util.List;

public class ListsOfPeople {
    public static void main(String[] args) {
        List myStudentsList = new ArrayList();

        Student student1 = new Student("Szymon","Kowalski","przyklad1@gmail.om",24,803023443);
        Student student2 = new Student("Marcin","Nowak","przyklad2@gmail.om",30,803023444);
        Student student3 = new Student("Janina","Korcz","przyklad3@gmail.om",54,803023445);

        myStudentsList.add(student1);
        myStudentsList.add(student2);
        myStudentsList.add(student3);

        for(Object students : myStudentsList){
            System.out.println("Moje dane:"+ students.toString());

        }


    }
}
