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
import java.util.Comparator;

public class StudentRollnoSort implements Comparator<Student> {
    /* Allows Student objects to be compared and ArrayLists of the Student object to be sorted in ascending order */

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

    public ArrayList<Student> sort(ArrayList<Student> students) {
        /* Sorts the object in the array in ascending order based on the rollno attribute */

        // Creates a copy of the array which will be used to manipulate
        ArrayList<Student> result = new ArrayList<>(students);
        Student temp; // Temp variable to hold values when they must be moved
        int smallestIndex; // Keeps track of the index of the smallest value

        // First loop to keep track of the sorted values
        for (int i = 0; i < result.size(); i++) {
            smallestIndex = i; // Resets the smallest index to the first unsorted index

            // Looks through the unsorted values
            for (int j = i + 1; j < result.size(); j++) {

                // Compares each value to the smallest value and changes the index to the smallest value when needed
                if (this.compare(result.get(smallestIndex), result.get(j)) > 0) {
                    smallestIndex = j; // Changes the smallest index if needed
                }
            }

            // Checks to see if the second loop found a smaller value in the current unsorted section
            if (!(i == smallestIndex)) {
                temp = result.get(smallestIndex); // Moves the object with the smaller value to a temp variable
                result.set(smallestIndex, result.get(i)); // Moves the first object in the unsorted section to the smallest index location
                result.set(i, temp); // Moves the object in temp to the first index of the unsorted section
            }
        }

        return result;
    }
}
