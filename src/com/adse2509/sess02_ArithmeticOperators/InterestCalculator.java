/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.adse2509.sess02_ArithmeticOperators;
import java.util.Scanner;

/**
 *Java program to demonstrate the calculation Simple Interest
 *
 * @author odhia
 */
public class InterestCalculator {
    static Scanner sc;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Intialise the scanner to ask for user input
        sc = new Scanner(System.in);
        
        //Declare the variables
        float principal, rate, time, SI;
        
        System.out.println("Please enter your principal: ");
        principal = sc.nextFloat();
        
        System.out.println("Please enter your rate in % : ");
        rate = sc.nextFloat();
        
        System.out.println("Please enter your time: ");
        time = sc.nextFloat();
        sc.close();
        
        //Calculate the Simple Interest given P * R / 100 * T
        SI = (principal * (rate / 100.0f) * (time));
        
        //Print out the result
        System.out.printf("Your Principal is ksh %.2f\n ", principal);
        System.out.printf("Your Rate is %.2f%%\n ", rate);
        System.out.printf("Your Time is %.2f\n", time);
        System.out.printf("Your Simple Interest is ksh %.2f\n", SI);
        
        
    }
    
}
