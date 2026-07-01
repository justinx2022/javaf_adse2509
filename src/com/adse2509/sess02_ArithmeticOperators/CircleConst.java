/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adse2509.sess02_ArithmeticOperators;
import java.util.Scanner;

/**
 * Java program to demonstrate the concept of constatnts and class variables
 * @author odhia
 */
public class CircleConst {
    
    
    //Class field constant to hold the valur of PI 
    static final float MYPI = 3.1415923f;
    
    // Class field to get input from the user
    static Scanner sc;
    // main method begins program execution Main => C#
    public static void main(String[] args)
    {
        // Method level variavles to be used in the program
        float radius, area, circumference;
        //instatiate the class variable for the user input
        sc = new Scanner(System.in);
        
        // Read in the radius from the user
        System.out.println("Please enter the radius of the circle in cm and" + 
                "I'll calculate area and circumference");
        radius = sc.nextFloat();
        sc.close(); //close the input stream
        
        //Calculate the area and circumference of the circle
        area = (float) (MYPI * Math.pow(radius, 2));
        circumference = MYPI * (radius * 2);
        
        //Display the circles dimensions
        System.out.println("Circle's Dimensions");
        System.out.println("-".repeat(55));
        System.out.printf("%-15s : %7.1f cm", "Radius", radius);
        System.out.printf("%n%-15s : %7.1f cm", "Area", area);
        System.out.printf("%n%-15s : %7.1f cm", "Circumference", circumference);
        System.out.println("-".repeat(55));
    }
    
}
