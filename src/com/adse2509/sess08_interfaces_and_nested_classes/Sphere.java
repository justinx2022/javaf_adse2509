package com.adse2509.sess08_interfaces_and_nested_classes;

import com.adse2509.sess07_inheritance_and_polymorphism.Shape;

/**
 * The {@code Sphere} class represents a 3-dimensional Sphere.
 * It extends {@code Shape} and implements {@code I3DShape}.
 * 
 * @author odhia
 */
public class Sphere extends Shape implements I3DShape {
    private float radius;

    public Sphere() {
        this.name = "Sphere";
        this.radius = 0.0f;
    }

    public Sphere(float radius) {
        this.name = "Sphere";
        this.radius = radius;
    }

    public Sphere(int radius) {
        this.name = "Sphere";
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float calcArea() {
        // Surface area of sphere = 4 * PI * r^2
        return (float) (4 * Math.PI * radius * radius);
    }

    @Override
    public float calcVolume() {
        // Volume of sphere = (4/3) * PI * r^3
        return (float) ((4.0 / 3.0) * Math.PI * Math.pow(radius, 3));
    }

    @Override
    public String toString() {
        return String.format(
                """
                        %s Details
                        -------------------------------------------------------------
                        Radius: %.2f
                        Surface Area: %.2f
                        Volume: %.2f
                        -------------------------------------------------------------
                        """, this.getName(), this.radius, this.calcArea(),
                this.calcVolume());
    }
}
