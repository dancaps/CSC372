/*
 * Assignment Title: Creating an Abstract Class Shape I
 * Name: Danny Caperton
 * School: Colorado State University Global
 * Course: 22WB-CSC372-1
 * Instructor: Dr. Brian Holbert
 * Due Date: January 15, 2023
 */

package com.dancaps.m4;

public class ShapeArray {
    /* Using the objects */

    public static void main(String[] args) {

        // Shape array to hold the child objects. Polymorphism!
        Shape[] shapeArray = new Shape[3];

        // Adding the child objects to the array
        shapeArray[0] = new Sphere(100);
        shapeArray[1] = new Cylinder(200, 250);
        shapeArray[2] = new Cone(300, 350);

        // Looping the objects and calling the toString() method
        for ( int i = 0; i < shapeArray.length; i++) {
            System.out.println(shapeArray[i].toString());
        }

    }
}
