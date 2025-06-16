package com.example.cmsc_335_shapes;

/**
 File Name: Torus.java
 Date: March 25, 2025
 Description: Represents a torus (donut shape) with volume and surface area methods.
 */
public class Torus extends ThreeDimensionalShape{
    private double majorRadius;     // Distance from the center of the hole to the center of the tube
    private double minorRadius;     // Defines the thickness of the ring

    public Torus(double majorRadius, double minorRadius){
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    public double getMajorRadius() {
        return majorRadius;
    }

    public void setMajorRadius(double majorRadius) {
        this.majorRadius = majorRadius;
    }

    public double getMinorRadius() {
        return minorRadius;
    }

    public void setMinorRadius(double minorRadius) {
        this.minorRadius = minorRadius;
    }
    @Override
    public double getVolume() {
        return 2 * Math.PI * Math.PI * majorRadius * Math.pow(minorRadius, 2);
    }
    @Override
    public double getSurfaceArea() {
        return (4 * (Math.PI * Math.PI) * (majorRadius * minorRadius));

    }
    public String getFormattedResults() {   // Method formats displayed results
        return String.format("Torus\nVolume: %.2f\nSurface Area: %.2f", getVolume(), getSurfaceArea());
    }
}


