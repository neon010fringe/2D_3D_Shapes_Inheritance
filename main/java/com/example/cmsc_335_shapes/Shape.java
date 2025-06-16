package com.example.cmsc_335_shapes;

/**
 File Name: Shape.java
 Date: March 25, 2025
 Description: Abstract base class for all shapes with a dimensionality property.
 */

public abstract class Shape {
    private int numberOfDimensions;

    public Shape(int numberOfDimensions) {
        this.numberOfDimensions = numberOfDimensions;
    }
    public int getNumberOfDimensions() {
        return numberOfDimensions;
    }
}

// fix Torus, Cylinder, and Rectangle for v