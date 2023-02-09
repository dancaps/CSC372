package com.dancaps.m8;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CollectStudentData {
    List<Student> students = new LinkedList<>();

    public static void addStudent(Student student) {
        System.out.println("Adding a student...");
        System.out.println(student);
    }

    public static void main(String[] args) {

        List<Student> students = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        String quit = "false";
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
                case "a" -> addStudent(new Student());
                case "q" -> continueAdding = "q";
                default -> System.out.println("Opps. You must enter either an {a} or {q}. Please try again.");
            }
        } while (!(continueAdding.equalsIgnoreCase("q")));
    }
}
