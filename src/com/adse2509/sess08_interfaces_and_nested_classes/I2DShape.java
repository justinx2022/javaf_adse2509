/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.adse2509.sess08_interfaces_and_nested_classes;

/**
 * The {@code I2DShape} interface represents a two-dimensional geometric shape.
 * It defines a contract for calculating the area of a shape tat implements it.
 * Any class implementing this interface must provide its own implementation of
 * {@link #calcArea()} method
 * 
 * @author odhia
 */
@FunctionalInterface
public interface I2DShape {
    /**
     * Calculates the area of 2-D shape as {@code float}
     * 
     * @return the area of th 2-D shape as {@code float}. The area is
     *         typically expressed in square units (eg. square cm, or square feet)
     */
    public float calcArea();
}
