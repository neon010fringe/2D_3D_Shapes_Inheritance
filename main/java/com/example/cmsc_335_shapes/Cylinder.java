package com.example.cmsc_335_shapes;
/**
 File Name: Cylinder.java
 Date: March 25, 2025
 Description: Represents a cylinder and provides volume and surface area calculations.
 */
public class Cylinder extends ThreeDimensionalShape{
    private double height;
    private double radius;

    public Cylinder(double height, double radius){
        this. height = height;
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {

        return Math.PI * Math.pow(radius, 2) * height;
    }
    @Override
    public double getSurfaceArea() {
        return (2 * Math.PI * Math.pow(radius, 2) + (2 * Math.PI * radius * height));
    }
    public String getFormattedResults() {   // Method formats displayed results
        return String.format("Cylinder\nVolume: %.2f\nSurface Area: %.2f", getVolume(), getSurfaceArea());
    }
}

