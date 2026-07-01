/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adse2509.sess02_ArithmeticOperators;

/**
 *
 * @author odhia
 */
public class OperatorPrecedence {
    
    public static void main(String[] args)
    {
        //================================================
        // 1. OPERATOR PRECEDENCE $ EXPRESSION EVALUATION
        //================================================
        System.out.println("\n" + "=".repeat(70));
        System.out.println(" 1. OPERATOR PRECEDENCE EXAMPLE");
        System.out.println("-".repeat(55));
        
        // VARIABLES TO BE USED
        int p = 8, q = 3, r = 2;
        double result = p+q*r / 2.0 - 1;
        
        // Step by step (q*r) = 6 -> 6/2.0 = 3.0 = 11.0 -1 = 10.0
        System.out.println("p = " + p + ", q = " + q + ", r = " + r);
        System.out.println(" Expression: p + q * r/ 2.0 - 1");
        System.out.println(" Step 1. q * r = " + (q * r));
        System.out.println(" Step 2. " + (q * r) +" / 2.0 = " + ((q * r) / 2.0));
        System.out.println(" Step 3. p + above = " + (p + (q * r) / 2.0));
        System.out.println(" Step 4. final -1 = " + result);
        
        //================================================
        // 2. SPECIAL CASES: DIVISION BY ZERO & NEGATIVE MODULUS
        //================================================
        System.out.println("\n" + "=".repeat(70));
        System.out.println(" 1. SPECIAL CASES");
        System.out.println("-".repeat(55));
        System.out.println("INTEGER DIVISION BY ZERO");
        try
        {
            System.out.println("10 / 0 = ? -> Throws ArithmeticExceptiion");
            int zero = 0;
            int div = 10 / zero;
            System.out.println(div);
        }catch (ArithmeticException ae)
        {
           System.err.println("  Caught: " + ae + "\n");
        }
        
        System.out.println("Floating-point division by zero:");
        double d1 = 10.0 / 0.0;
        double d2 = -10.0 / 0.0;
        double d3 = 0.0 / 0.0;
        
        System.out.printf("10.0 / 0.0 = %.2f (Infinity)" , d1);
        System.out.printf(" %n-10.0 / 0.0 = %.2f (-Infinity)", d2);
        System.out.printf("0.0 / 0.0 = %.2f (NaN)\n\n",d3);
        
        System.out.println("Modulus with negative numbers: ");
        System.out.println("-10 % 3 = " + (-10 % 3));    // Result: -1
        System.out.println("10 % -3 = " + (10 % -3));    // Result: 1
        System.out.println("-10 % -3 = " + (-10 % -3));  // Result: -1
        System.out.println();
    }
}
