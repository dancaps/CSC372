/*
 * Assignment Title: Creating an Abstract Class Shape I
 * Name: Danny Caperton
 * School: Colorado State University Global
 * Course: 22WB-CSC372-1
 * Instructor: Dr. Brian Holbert
 * Due Date: January 15, 2023
 */

package com.dancaps.m4;

public class Sphere extends Shape {
    /* Sphere implements the abstract Shape methods */

    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double surface_area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double volume() {
        return 4.0/3.0 * Math.PI * Math.pow(radius, 3);
    }

}
