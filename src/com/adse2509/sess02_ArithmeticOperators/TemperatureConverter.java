/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.adse2509.sess02_ArithmeticOperators;
import java.util.Scanner;
/**
 *Java Program that accepts the temperature in Degrees Celsius and converts it to Degrees Fahrenheit
 * @author odhia
 */
public class TemperatureConverter {
    static Scanner sc;

    public static void main(String[] args) {
        // Declare the Variables to be used
        float celcius, fahrenheit;
        // Initiate Scanner For User Input
        sc = new Scanner(System.in);
        
        System.out.println("=".repeat(70));
        System.out.println("Degrees Fahrenheit to Degrees Celcius Converter ");
        System.out.println("=".repeat(70));
        
        // Prompt the user to input the value in Degrees Fahrenheit
        System.out.println("Please enter the temperature in Degrees Fahrenheit: ");
        fahrenheit = sc.nextFloat();
      
        // Calculate Celsius using its formula °C = ( °F - 32) ÷ (9/5).
        celcius = (fahrenheit - 32) / (9.0f / 5.0f);
        
        //Print out the result
        System.out.printf("Degrees Fahrenheit: %.2f  deg F\n", fahrenheit );
        System.out.printf("Degrees Celcius: %.2f deg C\n",  celcius);
        
        sc.close();
        
    
      
    }
}
