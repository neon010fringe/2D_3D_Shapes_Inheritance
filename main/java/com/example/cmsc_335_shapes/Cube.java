package com.example.cmsc_335_shapes;
/**
 File Name: Cube.java
 Date: March 25, 2025
 Description: Represents a cube shape and provides methods to calculate volume and surface area.
 */
public class Cube extends ThreeDimensionalShape{
    private double sidesLength;

    public Cube(double sidesLength){
        this.sidesLength = sidesLength;
    }
    public void setSidesLength(double sidesLength){
        this.sidesLength = sidesLength;
    }
    public double getSidesLength(){
        return sidesLength;
    }

    @Override
    public double getSurfaceArea() {
        return 6 * Math.pow(sidesLength, 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(sidesLength, 3);
    }
    public String getFormattedResults() {   // Method formats displayed results
        return String.format("Cube\nVolume: %.2f\nSurface Area: %.2f", getVolume(), getSurfaceArea());
    }
}


