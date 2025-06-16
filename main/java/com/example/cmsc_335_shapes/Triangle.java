package com.example.cmsc_335_shapes;

/**
 * File Name: Triangle.java
 * Date: March 25, 2025
 * Description: Represents a right triangle.
 * Assumes base and height are the legs, and calculates hypotenuse for perimeter.
 */

public class Triangle extends TwoDimensionalShape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Calculates and returns the area of the right triangle.
     * Formula: (base * height) / 2
     */
    public double getArea() {
        return (base * height) / 2;
    }

    /**
     * Calculates and returns the perimeter of the right triangle.
     * Formula: base + height + hypotenuse
     */
    public double getPerimeter() {
        double hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        return base + height + hypotenuse;
    }
    public String getFormattedResults() {   // Method formats displayed results
        return String.format("Triangle\nArea: %.2f\nPerimeter: %.2f", getArea(), getPerimeter());
    }

}
