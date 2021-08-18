package com.maximus.jwd.entity;

import java.util.Objects;

public class Subject {
    private String name;
    private boolean hasExam;

    public Subject(String name, boolean hasExam) {
        this.name = name;
        this.hasExam = hasExam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasExam() {
        return hasExam;
    }

    public void setHasExam(boolean hasExam) {
        this.hasExam = hasExam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return hasExam == subject.hasExam && Objects.equals(name, subject.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hasExam);
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name = '" + name + '\'' +
                ", hasExam = " + hasExam +
                '}';
    }
}
