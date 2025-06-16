package com.example.cmsc_335_shapes;

/**
 File Name: ThreeDimensionalShape.java
 Date: March 25, 2025
 Description: Abstract subclass of Shape for 3D shapes with abstract volume and surface area methods.
 */
public abstract class ThreeDimensionalShape extends Shape {

    public ThreeDimensionalShape() {
        super(3);
    }
    public abstract double getSurfaceArea();
    public abstract double getVolume();

}


// Sphere
// Cube
// Cone
// Cylinder
// Torus