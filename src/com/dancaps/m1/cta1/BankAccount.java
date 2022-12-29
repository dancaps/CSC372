/*
 * Assignment Title: Implementing a Superclass Bank Account
 * Name: Danny Caperton
 * School: Colorado State University Global
 * Course: 22WB-CSC372-1
 * Instructor: Dr. Brian Holbert
 * Due Date: December 18, 2022
 */
package com.dancaps.m1.cta1;

public class BankAccount {
    protected String firstName;
    protected String lastName;
    protected int accountID;
    protected double balance;

    public BankAccount() {
        balance = 0.0;
    }

    public void deposit(double value) {
        balance += value;
    }

    public void withdrawal(double value) {
        balance -= value;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public double getBalance() {
        return balance;
    }

    public void accountSummary() {
        System.out.printf("First Name:        %s%n" +
                          "Last Name:         %s%n" +
                          "Account ID:        %s%n" +
                          "Account Balance:   $%.2f %n",
                          getFirstName(),
                          getLastName(),
                          getAccountID(),
                          getBalance());
    }
}
