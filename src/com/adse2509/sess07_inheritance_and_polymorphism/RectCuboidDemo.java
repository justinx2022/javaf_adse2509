package com.adse2509.sess07_inheritance_and_polymorphism;

import java.util.Scanner;

/**
 * Java program to demonstrate parent and child objects of {@code Rectangle} and
 * {@code Cuboid} classes.
 * 
 * @author odhia
 */

public class RectCuboidDemo {
    // main method begins program execution

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for the dimensions of the Rectangle
        System.out.println("Please enter the rectangle's length in cm\n");
        int length = sc.nextInt();

        System.out.println("Please enter the rectangle's width in cm\n");
        int width = sc.nextInt();

        // Declare and intiate a Rectangle object with the user's dimensions
        Rectangle rect1 = new Rectangle(length, width);

        // Display the rectangle's dimensions
        System.out.println(rect1);

        // Declare cuboid and hardcode its values
        Cuboid cbd1;
        cbd1 = new Cuboid(5, 8, 2);

        // Display the cuboid's dimensions
        System.out.println("\n" + cbd1);

    }

}
