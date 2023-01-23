/*
 * Assignment Title: Implementing Recursion to Provide a Product
 * Name: Danny Caperton
 * School: Colorado State University Global
 * Course: 22WB-CSC372-1
 * Instructor: Dr. Brian Holbert
 * Due Date: January 22, 2023
 */

package com.dancaps.m5.cta5;

import java.util.ArrayList;
import java.util.Scanner;

public class Recursion {

    public static void main(String[] args) {

        int numberCount = 5; // The number times a user will enter a number
        ArrayList<Double> numbs = new ArrayList<>(); // Stored the user numbers

        // Scanner to collect user input
        Scanner input = new Scanner(System.in);
        System.out.println("You will enter 5 numbers one at a time to get the product of these numbers. Let's begin.");

        // Loop to collect the input and add it to an array
        while (numberCount > 0) {
            System.out.print("Enter a number: ");
            numbs.add(input.nextDouble());
            numberCount--;
        }

        // Calls the recursive method which returns an array with one element that is the answer
        System.out.println("The product of the numbers you entered is: " + product(numbs).get(0));
    }

    public static ArrayList<Double> product(ArrayList<Double> numbs) {

        // Base case that tests if there are 2 numbers to multiply.
        if (numbs.size() < 2) {
            return numbs;
        }

        // Multiplies the first 2 elements and saves the answer to element 0
        numbs.set(0, numbs.get(0) * numbs.get(1));
        numbs.remove(1); // removes the no longer needed element

        return product(numbs); // Recalls itself until the base case has been met
    }
}
