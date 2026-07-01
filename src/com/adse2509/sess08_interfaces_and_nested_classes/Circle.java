package com.adse2509.sess08_interfaces_and_nested_classes;

import com.adse2509.sess07_inheritance_and_polymorphism.Shape;

/**
 * The {@code Circle} class represents a 2-dimensional circle with its radius.
 * It provides methods to compute its area.
 * 
 * @author odhia
 */
public class Circle extends Shape implements I2DShape {
    // =================================
    // Instance Fields
    // =================================
    /**
     * The radius of a Circle
     */
    protected float radius;

    // =================================
    // Constructor
    // =================================
    public Circle() {
        this.radius = 0;
        this.name = "Circle";
    }

    public Circle(int radius) {
        this.radius = radius;
        this.name = "Circle";
    }

    public Circle(float radius) {
        this.radius = radius;
        this.name = "Circle";
    }

    // =================================
    // Getters and setters
    // =================================
    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    // =================================
    // Instance Methods
    // =================================
    public float calculateCircumfrence() {
        return (float) (2 * Math.PI * radius);

    }

    // =================================
    // Overridden Methods
    // =================================
    /**
     * Method to return the name of the shape as a String
     *
     * @return the shape's name as a String.
     */
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float calcArea() {
        return (float) (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public String toString() {
        return String.format(
                """
                        %s Details
                        -------------------------------------------------------------
                        Radius: %.2f
                        Area: %.2f
                        Circumference: %.2f
                        -------------------------------------------------------------
                        """, this.getName(), this.radius, this.calcArea(),
                this.calculateCircumfrence());
    }

}
