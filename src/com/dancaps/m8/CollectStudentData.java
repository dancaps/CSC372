package com.dancaps.m8;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class CollectStudentData {

    public static void main(String[] args) {
        List<Student> students = new LinkedList<>();
        String name;
        String address;
        double gpa;

        Scanner input = new Scanner(System.in);
        String continueAdding;

        System.out.println("Welcome to the CSC372 module 8 portfolio project.");
        System.out.println("==> In this system you will be prompted to enter student data.");
        System.out.println("==> Once you are done with data entry you will get a sorted");
        System.out.println("==> list of student data written to a local file.");

        do {
            System.out.println();
            System.out.println("Press {a} to add a new student.");
            System.out.println("Press {q} to to quit.");
            System.out.print("Enter your selection: ");
            continueAdding = input.nextLine();
            switch (continueAdding.toLowerCase()) {
                case "a" -> {
                    System.out.print("Enter the students name: ");
                    name = input.nextLine();
                    System.out.print("Enter the students address: ");
                    address = input.nextLine();
                    System.out.print("Enter the students gpa: ");
                    try {
                        gpa = Double.parseDouble(input.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("==> There was an error with the values entered. Please try again.");
                        break;
                    }
                    students.add(new Student(name, address, gpa));
                }
                case "q" -> continueAdding = "q";
                default -> System.out.println("==> Oops. You must enter either an {a} or {q}. Please try again.");
            }
        } while (!(continueAdding.equalsIgnoreCase("q")));

        input.close();

        System.out.println();
        System.out.println("==> Writing the unsorted data to the console:");
        System.out.println(students);
        System.out.println("==> Writing the sorted data to the console:");
        Collections.sort(students, new StudentNameSort());
        System.out.println(students);
        System.out.println();

        System.out.println("==> Writing the data to a file.");
        try (FileWriter fw = new FileWriter("/Users/danny/IdeaProjects/CSC372/src/com/dancaps/m8/m8_output.txt");
             PrintWriter pw = new PrintWriter(fw)) {
            for (Student s : students) {
                pw.println(s);
            }
        } catch (IOException e) {
            System.out.println("==> There was an error writing the data to the file. Please run the program again.");
        }

        System.out.println("==> The program finished successfully. Have a nice day.");
    }
}
