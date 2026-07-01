/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.adse2509.sess02_ArithmeticOperators;

/**
 * Java program to demonstrate precedence among the various operators.
 * 
 * @author odhia
 */
public class OperatorPrecidence {

    
    public static void main(String[] args) {
        //================================================
        // 1. OPERATOR PRECEDENCE & EXPRESSION EVALUATION
        //================================================
        System.out.println("\n" + "=".repeat(70));
        System.out.println(" 1. OPERATOR PRECEDENCE EXAMPLE");
        System.out.println("-".repeat(55));
        
        // Variables to be used in the program
        int p = 8, q = 3, r= 2;
        double result = p + q * r / 2.0 - 1;
        
        // Step by step 
        System.out.println("p = " + p + ", q = " + q + ", r =" + r);
        System.out.println("Expression: p + q * r / 2.0 - 1");
        System.out.println("Step 1. q * r " + (q * r));
        System.out.println("Step 2. " + (q * r) + " / 2.0 = " +((q * r) / 2.0));
        System.out.println("Step 3. p + above = " + ( p + (q * r) / 2.0) );
        System.out.println("Step 4. final - 1 = " + result);
        
        
        // 2. Special cases: Division by zero & negative modulus
        //================================================
        System.out.println("\n" + "=".repeat(70));
        System.out.println(" 2. SPECIAL CASES");
        System.out.println("-".repeat(55));
        System.out.println("Interger division by zero");
        try
        {
            System.out.println("10 / 0 = ? -> Throws ArithmeticException");
            int zero = 0;
            int div = 10 / zero;
            System.out.println(div);
        }catch (ArithmeticException ae)
        {
            System.err.println("Caught: " + ae + "\n");
        }
        
        
    }
    
    
}
