package com.example.cmsc_335_shapes;

/**
 File Name: Square.java
 Date: March 25, 2025
 Description: Represents a square shape and provides methods to calculate area and perimeter.
 */
public class Square extends TwoDimensionalShape{
    private double length;
    public Square(double length){
        this.length = length;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getPerimeter(){
        return (length * 4);
    }

    public double getArea(){
        return (Math.pow(length, 2));
    }
    public String getFormattedResults() {   // Method formats displayed results
        return String.format("Square\nArea: %.2f\nPerimeter: %.2f", getArea(), getPerimeter());
    }

}

