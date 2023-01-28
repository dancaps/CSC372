/*
 * Assignment Title: Storing an ArrayList
 * Name: Danny Caperton
 * School: Colorado State University Global
 * Course: 22WB-CSC372-1
 * Instructor: Dr. Brian Holbert
 * Due Date: January 29, 2023
 */

package com.dancaps.m6;

import java.util.ArrayList;

public class ModuleSixCTA {
    public static void main(String[] args) {
        /* Demonstrating adding 10 Student objects to an ArrayList and sorting them by rollno and name attributes. The
           requirements stated that I must implement the comparator interface along with my own sorting algorithm based
           off the selection sort algorithm. We are not allowed to use the collections library
         */

        // Creating the ArrayList and adding the Student objects
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(3, "Danny", "123 Main St."));
        students.add(new Student(1, "Bob", "234 West Main St."));
        students.add(new Student(2, "Sally", "345 East Main St."));
        students.add(new Student(300, "Zack", "456 Main St."));
        students.add(new Student(151, "Kelly", "567 West Main St."));
        students.add(new Student(222, "Jacob", "678 East Main St."));
        students.add(new Student(329, "Ryan", "789 Main St."));
        students.add(new Student(117, "Katie", "890 West Main St."));
        students.add(new Student(25, "Brian", "900 East Main St."));
        students.add(new Student(99, "Lisa", "101 Main St."));

        // Printing the unsorted ArrayList
        System.out.println("UNSORTED");
        for (Student student : students) {
            System.out.println("--> " + student);
        }
        System.out.println();

        // Printing the rollno sorted ArrayList
        System.out.println("ROLLNO SORTED");
        StudentRollnoSort rollSort = new StudentRollnoSort(); // Instantiating the rollno sorting object
        ArrayList<Student> rollnoSortedStudents = rollSort.sort(students); // Using the rollno sorting object
        // Printing the results from the sort
        for (Student rollnoSortedStudent : rollnoSortedStudents) {
            System.out.println("--> " + rollnoSortedStudent);
        }
        System.out.println();

        // Printing the name sorted ArrayList
        System.out.println("NAME SORTED");
        StudentNameSort nameSort = new StudentNameSort(); // Instantiating the name sorting object
        ArrayList<Student> nameSortedStudents = nameSort.sort(students);// Using the name sorting object
        // Printing the results from the sort
        for (Student nameSortedStudent : nameSortedStudents) {
            System.out.println("--> " + nameSortedStudent);
        }
    }
}
