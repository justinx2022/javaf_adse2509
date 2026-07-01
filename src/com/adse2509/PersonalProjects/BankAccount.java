package com.adse2509.PersonalProjects;

/**
 * This is a bank account class that will demonstrate how to use constructors,
 * getters and setters and instance methods
 * 
 * @author odhia
 */
public class BankAccount {
    // =========================================
    // Instance variables
    // =========================================
    private int accountNumber;
    private String accountHolder;
    private double balance;

    // =========================================
    // Constructors
    // =========================================
    public BankAccount() {
        this.accountNumber = 0;
        this.accountHolder = "";
        this.balance = 0;

        System.out.println("\nBank Account created successfully");
        this.displayAccountInfo();
    }

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;

        System.out.println("\nBank Account created successfully");
        this.displayAccountInfo();
    }

    // =========================================
    // Getters and setters
    // =========================================
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // =========================================
    // Instance methods
    // =========================================
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully");
        this.displayAccountInfo();
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Amount withdrawn successfully");
        this.displayAccountInfo();
    }

    // =========================================
    // String methods
    // =========================================
    @Override
    public String toString() {
        return String.format(
                """
                        %s Details
                        -------------------------------------------------------------
                        Account Number: %d
                        Account Holder: %s
                        Balance: %.2f
                        -------------------------------------------------------------
                        """,
                this.getAccountHolder(),
                this.accountNumber,
                this.accountHolder,
                this.balance);
    }

}
