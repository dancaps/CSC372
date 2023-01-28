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

public class StudentNameSort extends StudentSort implements Comparator<Student> {
    /* Child class of StudentSort that contains its own version of the compare method on the name attribute. */

    @Override
    public int compare(Student o1, Student o2) {
        /* Using the built-in string compare functionality */
        return o1.getName().compareToIgnoreCase(o2.getName());
    }
}