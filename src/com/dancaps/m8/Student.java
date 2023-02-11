package com.dancaps.m8;

import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {

    private final String name;
    private final String address;
    private double gpa;

    public Student(String name, String address, double gpa) {
        this.name = name;
        this.address = address;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
