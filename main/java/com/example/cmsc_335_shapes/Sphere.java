package com.example.cmsc_335_shapes;

/**
 File Name: Sphere.java
 Date: March 25, 2025
 Description: Represents a sphere shape and provides methods to calculate volume and surface area.
 */
public class Sphere extends ThreeDimensionalShape {
    private double radius;

    public Sphere(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSurfaceArea() {
        return ((4 * Math.PI) * Math.pow(radius, 2));
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
    public String getFormattedResults() {   // Method formats displayed results
        return String.format("Sphere\nVolume: %.2f\nSurface Area: %.2f", getVolume(), getSurfaceArea());
    }
}

