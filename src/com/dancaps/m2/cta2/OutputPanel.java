/*
 * Assignment Title: Creating a GUI Bank Balance Application
 * Name: Danny Caperton
 * School: Colorado State University Global
 * Course: 22WB-CSC372-1
 * Instructor: Dr. Brian Holbert
 * Due Date: January 1, 2023
 */

package com.dancaps.m2.cta2;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class OutputPanel extends JPanel {

    private double balance;
    private final JLabel label;

    public OutputPanel() {
        /* Constructs the object with a new label, sets the label text and adds the label to the panel */

        this.label = new JLabel();
        this.updateLabel();
        this.add(label, BorderLayout.CENTER);
    }

    public void deposit(double amount) {
        /* Updates the balance with the deposit amount and redraws the label */

        this.balance += amount;
        this.updateLabel();
    }

    public void setStartingBalance(double balance) {
        /* Updates the balance with the starting balance and redraws the label */

        this.balance = balance;
        this.updateLabel();
    }

    public void withdrawal(double amount) {
        /* Updates the balance with the withdrawal amount and redraws the label */

        this.balance -= amount;
        this.updateLabel();
    }

    private void updateLabel() {
        /* Redraws the label */

        this.label.setText(String.format("Account Balance: $%.2f", balance));
    }
}
