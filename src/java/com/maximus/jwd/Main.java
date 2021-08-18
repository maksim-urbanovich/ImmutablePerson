package com.maximus.jwd;

import com.maximus.jwd.entity.ImmutableStudent;
import com.maximus.jwd.entity.Subject;
import com.maximus.jwd.entity.University;
import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        University university = new University("BSU");
        int[] marks = {8, 9, 10};
        Subject subject1 = new Subject("Algebra", true);
        Subject subject2 = new Subject("Geometry", false);

        Subject[] subjects = {subject1, subject2};

        ImmutableStudent student1 = new ImmutableStudent("Max", 19, university, marks, subjects);
        System.out.println(student1);

        university.setName("BNTU");
        subject2.setHasExam(true);

        System.out.println(student1);

	// write your code here
    }
}
