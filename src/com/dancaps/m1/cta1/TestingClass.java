/*
 * Assignment Title: Implementing a Superclass Bank Account
 * Name: Danny Caperton
 * School: Colorado State University Global
 * Course: 22WB-CSC372-1
 * Instructor: Dr. Brian Holbert
 * Due Date: December 18, 2022
 */
package com.dancaps.m1.cta1;

public class TestingClass {
    public static void main(String[] args) {
        CheckingAccount account1 = new CheckingAccount();

        // Printing the account details
        System.out.printf("%nTESTING :: Account details after initialization%n");
        account1.displayAccount();

        // Adding details and testing setters
        account1.setFirstName("James");
        account1.setLastName("Gosling");
        account1.setAccountID(123456789);
        account1.setInterestRate(0.18);

        // Showing the setters worked and testing getters
        System.out.printf("%nTESTING :: Account details after using the setters%n");
        account1.displayAccount();

        // Testing deposit
        System.out.printf("%nTESTING :: Deposit of $100%n");
        account1.deposit(100);
        account1.accountSummary();

        // Testing generic withdrawal
        System.out.printf("%nTESTING :: Withdrawal of $75%n");
        account1.withdrawal(75);
        account1.accountSummary();

        // Testing process withdrawal with overdraft functionality
        System.out.printf("%nTESTING :: Withdrawal of $125 resulting in $100 overdraft and a $30 charge%n");
        account1.processWithdrawal(125);
        account1.displayAccount();

        // Testing a second process withdrawal with overdraft functionality
        System.out.printf("%nTESTING :: Second overdraft withdrawal of $50 resulting " +
                           "in $150 overdraft and $60 of charges%n");
        account1.processWithdrawal(50);
        account1.displayAccount();

        System.out.printf("%nTesting complete%n");
    }
}
