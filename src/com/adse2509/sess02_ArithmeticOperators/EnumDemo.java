package com.adse2509.sess02_ArithmeticOperators;

/**
 * Java program to demonstrate working with enumeration types
 * @author odhia
 */
public class EnumDemo {
    
    public static void main(String[] args){
        System.out.println("=".repeat(70));
        System.out.println("JAVA ENUMERATION TYPES DEMONSTRATION");
        System.out.println("=".repeat(70));
        
        // DECLARING the missing variable to fix your initial error
        String game = "Minecraft"; 
        
        //---------------------------------------------------------
        // 1. GAME DIFFICULTY ENUMERATION
        //---------------------------------------------------------
        GameDifficulty difficulty = GameDifficulty.MEDIUM;
        
        // Display the game setting (Added spacing inside quotes for readability)
        System.out.println("\nThe game " + game + " is being played on " + difficulty + " setting.");
        
        //--------------------------------------------------------
        // 2. PAYMENT METHOD ENUMERATION
        //---------------------------------------------------------
        // FIXED: Added the dot notation between PaymentMethod and CASH
        PaymentMethod payment = PaymentMethod.CASH;
        String customerName = "Justin";
        
        // FIXED: Corrected the quotation marks and string concatenation
        System.out.println("\n" + customerName + " prefers paying with " + payment + ".");
        
    }
}
