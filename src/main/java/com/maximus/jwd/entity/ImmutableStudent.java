package com.maximus.jwd.entity;

import java.util.Arrays;

public final class ImmutableStudent {
    private final String name;
    private final int age;
    private final University university;
    private final int[] marks;
    private final Subject[] subjects;

    public ImmutableStudent(String name, int age, University university, int[] marks, Subject[] subjects) {
        this.name = name;
        this.age = age;
        this.university = new University(university.getName());
        this.marks = marks.clone();
        this.subjects = getSubjectsClone(subjects);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public University getUniversity() {
        return new University(university.getName());
    }

    public int[] getMarks() {
        return marks.clone();
    }

    public Subject[] getSubjects() {
        return getSubjectsClone(subjects);
    }


    private Subject[] getSubjectsClone(Subject[] subjects) {
        Subject[] subjectsClone = new Subject[subjects.length];

        for (int i = 0; i < subjects.length; i++) {
            subjectsClone[i] = new Subject(subjects[i].getName(), subjects[i].isHasExam());
        }

        return subjectsClone;
    }

    @Override
    public String toString() {
        return "ImmutableStudent{" +
                "name = '" + name + '\'' +
                ", age = " + age +
                ", university = " + university +
                ", marks = " + Arrays.toString(marks) +
                ", subjects = " + Arrays.toString(subjects) +
                '}';
    }
}
