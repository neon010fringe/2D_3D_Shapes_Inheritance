package com.example.cmsc_335_shapes;

/**
 * File Name: Circle.java
 * Date: March 25, 2025
 * Description: Represents a circle shape and provides methods to calculate area and perimeter.
 */
public class Circle extends TwoDimensionalShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public double getPerimeter() {  // 2 * pi * radius      // 2 * 3.14 * 2
        return (2 * Math.PI) * radius;
    }
    public String getFormattedResults() {   // Method formats displayed results
        return String.format("Circle\nArea: %.2f\nPerimeter: %.2f", getArea(), getPerimeter());
    }
}


