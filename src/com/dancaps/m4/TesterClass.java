/*
 * Assignment Title: Creating an Abstract Class Shape I
 * Name: Danny Caperton
 * School: Colorado State University Global
 * Course: 22WB-CSC372-1
 * Instructor: Dr. Brian Holbert
 * Due Date: January 15, 2023
 */

package com.dancaps.m4;

public class TesterClass {
    /* Testing the classes */

    public static void main(String[] args) {

        // Tests the surface area and volume functions for a sphere
        Sphere sphereTester1 = new Sphere(1);
        System.out.println("Sphere surface area (1): " + sphereTester1.surface_area());
        System.out.println("Sphere volume (1): " + sphereTester1.volume());

        Sphere sphereTester2 = new Sphere(2);
        System.out.println("Sphere surface area (2): " + sphereTester2.surface_area());
        System.out.println("Sphere volume (2): " + sphereTester2.volume());

        // Tests the surface area and volume functions for a cylinder
        Cylinder cylinderTester1 = new Cylinder(1, 1);
        System.out.println("Cylinder surface area (1, 1): " + cylinderTester1.surface_area());
        System.out.println("Cylinder volume (1, 1): " + cylinderTester1.volume());

        Cylinder cylinderTester2 = new Cylinder(2, 2);
        System.out.println("Cylinder surface area (2, 2): " + cylinderTester2.surface_area());
        System.out.println("Cylinder volume (2, 2): " + cylinderTester2.volume());

        // Tests the surface area and volume functions for a cone
        Cone coneTester1 = new Cone(1, 1);
        System.out.println("Cone surface area (1, 1): " + coneTester1.surface_area());
        System.out.println("Cone volume (1, 1): " + coneTester1.volume());

        Cone coneTester2 = new Cone(2, 2);
        System.out.println("Cone surface area (2, 2): " + coneTester2.surface_area());
        System.out.println("Cone volume (2, 2): " + coneTester2.volume());
    }
}
