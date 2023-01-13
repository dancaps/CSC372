/*
 * Assignment Title: Creating an Abstract Class Shape I
 * Name: Danny Caperton
 * School: Colorado State University Global
 * Course: 22WB-CSC372-1
 * Instructor: Dr. Brian Holbert
 * Due Date: January 15, 2023
 */

package com.dancaps.m4;

public class Cone extends Shape {
    /* Cone implements the abstract Shape methods */

    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cone{" +
                "radius=" + radius +
                ", height=" + height +
                '}';
    }

    @Override
    public double surface_area() {
        return Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height / 3.0;
    }

}
