package com.dancaps.m8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {
    private final String name;
    private final String address;
    private double gpa;

    public Student() {
        //try(Scanner input = new Scanner(System.in)) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the students name: ");
            this.name = input.nextLine();
            System.out.print("Enter the students address: ");
            this.address = input.nextLine();
            System.out.print("Enter the students gpa: ");
            this.gpa = input.nextDouble();
        //} catch (InputMismatchException e) {
        //    System.out.println("There was a problem with the GPA that was entered. Please try again.");
        //}
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
