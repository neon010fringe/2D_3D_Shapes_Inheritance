package com.example.cmsc_335_shapes;

/**
 File Name: Cone.java
 Date: March 25, 2025
 Description: Represents a cone and calculates volume and surface area using slant height.
 */
public class Cone extends ThreeDimensionalShape {
    private double height;
    private double radius;

    public Cone(double height, double radius) {
        this.height = height;
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

    public double getVolume() {
        return (Math.PI * Math.pow(radius, 2) * height * (1.0 / 3));
    }

    @Override
    public double getSurfaceArea() {
        double lineSlant = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        return Math.PI * radius * (radius + lineSlant);
    }

    public String getFormattedResults() {   // Method formats displayed results
        return String.format("Cone\nVolume: %.2f\nSurface Area: %.2f", getVolume(), getSurfaceArea());
    }
}

