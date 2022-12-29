/*
 * Assignment Title: Implementing a Superclass Bank Account
 * Name: Danny Caperton
 * School: Colorado State University Global
 * Course: 22WB-CSC372-1
 * Instructor: Dr. Brian Holbert
 * Due Date: December 18, 2022
 */
package com.dancaps.m1.cta1;

public class CheckingAccount extends BankAccount {
    private final int OVERDRAFT_FEE = 30;
    private double interestRate;
    private int overdraftCharges;

    public CheckingAccount() {
        super();
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getOverdraftCharges() {
        return overdraftCharges;
    }

    public void processWithdrawal(double value) {
        if(getBalance() - value < 0) {
            overdraftCharges += OVERDRAFT_FEE;
        }
        withdrawal(value);
    }

    public void displayAccount() {
        accountSummary();
        System.out.printf("Interest Rate:     %.2f%%%n" +
                          "Overdraft Charges: %d%n",
                           getInterestRate() * 100,
                           getOverdraftCharges());
    }
}
