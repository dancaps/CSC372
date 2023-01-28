/*
 * Assignment Title: Storing an ArrayList
 * Name: Danny Caperton
 * School: Colorado State University Global
 * Course: 22WB-CSC372-1
 * Instructor: Dr. Brian Holbert
 * Due Date: January 29, 2023
 */

package com.dancaps.m6;

public class Student {
    /* Student class following the assignment specifications */

    private final int rollno;
    private final String name;
    private final String address;

    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
