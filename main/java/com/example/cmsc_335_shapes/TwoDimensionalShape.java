package com.example.cmsc_335_shapes;

/**
 File Name: TwoDimensionalShape.java
 Date: March 25, 2025
 Description: Abstract subclass of Shape for 2D shapes with abstract area and perimeter methods.
 */

public abstract class TwoDimensionalShape extends Shape {

    public TwoDimensionalShape() {
        super(2);
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}

// Circle
// Square
// Triangle
// Rectangle