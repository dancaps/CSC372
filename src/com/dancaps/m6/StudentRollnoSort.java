/*
 * Assignment Title: Storing an ArrayList
 * Name: Danny Caperton
 * School: Colorado State University Global
 * Course: 22WB-CSC372-1
 * Instructor: Dr. Brian Holbert
 * Due Date: January 29, 2023
 */

package com.dancaps.m6;

import java.util.Comparator;

public class StudentRollnoSort extends StudentSort implements Comparator<Student> {
    /* Child class of StudentSort that contains its own version of the compare method on the rollno attribute. */

    @Override
    public int compare(Student o1, Student o2) {
        /* Compares the rollno attribute and returns one of three values. -1, 0, 1 */

        if (o1.getRollno() > o2.getRollno()) {
            return 1; // Returns 1 if the first object is larger
        } else if (o1.getRollno() < o2.getRollno()) {
            return -1; // Returns -1 if the first object is smaller
        } else {
            return 0; // Returns 0 if they have the same rollno
        }
    }
}
