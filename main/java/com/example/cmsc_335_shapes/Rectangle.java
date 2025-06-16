package com.example.cmsc_335_shapes;
/**
 File Name: Rectangle.java
 Date: March 25, 2025
 Description: Represents a rectangle shape and provides methods to calculate area and perimeter.
 */

public class Rectangle extends TwoDimensionalShape{

    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }
    public double getArea(){
        return (length * width);
    }
    public String getFormattedResults() {   // Method formats displayed results
        return String.format("Rectangle\nArea: %.2f\nPerimeter: %.2f", getArea(), getPerimeter());
    }
}

