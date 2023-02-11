/*
 * Assignment Title: Portfolio Project
 * Name: Danny Caperton
 * School: Colorado State University Global
 * Course: 22WB-CSC372-1
 * Instructor: Dr. Brian Holbert
 * Due Date: February 12, 2023
 */

package com.dancaps.m8.portfolio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class CollectStudentData {

    public static void main(String[] args) {

        // Attributes
        List<Student> students = new LinkedList<>(); // Linked list to hold the Student objects.
        String name;
        String address;
        double gpa;
        String continueAdding; // Test to end the do while loop.

        // Creates the Scanner.
        Scanner input = new Scanner(System.in);

        // Explains the program.
        System.out.println("Welcome to the CSC372 module 8 portfolio project.");
        System.out.println("==> In this system you will be prompted to enter student data.");
        System.out.println("==> Once you are done with data entry you will get a sorted");
        System.out.println("==> list of student data written to a local file.");

        // This loops manages the menu, collects the user input and creates the objects in the list.
        do {
            // Prompts the user to create a new student or quite the program.
            System.out.println();
            System.out.println("Press {a} to add a new student.");
            System.out.println("Press {q} to to quit.");
            System.out.print("Enter your selection: ");
            continueAdding = input.nextLine();

            // Switch to orchestrate the actions.
            switch (continueAdding.toLowerCase()) {
                case "a" -> { // Starts the process of adding a new Student.
                    System.out.print("Enter the students name: ");
                    name = input.nextLine();
                    System.out.print("Enter the students address: ");
                    address = input.nextLine();
                    System.out.print("Enter the students gpa: ");

                    // Validates the gpa user input by taking the user input as a String and parses it as a double.
                    // Catches any errors and restarts the loop if needed.
                    try {
                        gpa = Double.parseDouble(input.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("==> There was an error with the values entered. Please try again.");
                        break;
                    }

                    // Creates a Student object and adds it to the Linked List.
                    students.add(new Student(name, address, gpa));
                }
                // Ends the loop.
                case "q" -> continueAdding = "q";
                // Manages all the other entries.
                default -> System.out.println("==> Oops. You must enter either an {a} or {q}. Please try again.");
            }
        } while (!(continueAdding.equalsIgnoreCase("q"))); // Tests the loop to see if it should continue.

        // Closes the Scanner.
        input.close();

        // Shows the unsorted Linked List in the console.
        System.out.println();
        System.out.println("==> Writing the unsorted data to the console:");
        System.out.println(students);

        // Sorts the Linked List using Collections and the custom sort class.
        Collections.sort(students, new StudentNameSort());

        // Shows the sorted Linked List in the console.
        System.out.println();
        System.out.println("==> Writing the sorted data to the console:");
        System.out.println(students);
        System.out.println();

        // Writes the sorted list to a file.
        System.out.println("==> Writing the data to a file.");

        // Using try with resources to open a file and print writer
        try (FileWriter fw = new FileWriter("/Users/danny/IdeaProjects/CSC372/src/com/dancaps/m8/portfolio/m8_output.txt");
             PrintWriter pw = new PrintWriter(fw)) {
            // Loops the Linked List and outputs the toString method for the Student object to each line in the file.
            for (Student s : students) {
                pw.println(s);
            }
        } catch (IOException e) { // Catches an IO exception and notifies the user.
            System.out.println("==> There was an error writing the data to the file. Please run the program again.");
        }

        // End of the program.
        System.out.println("==> The program finished successfully. Have a nice day.");
    }
}