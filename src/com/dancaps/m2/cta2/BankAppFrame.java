/*
 * Assignment Title: Creating a GUI Bank Balance Application
 * Name: Danny Caperton
 * School: Colorado State University Global
 * Course: 22WB-CSC372-1
 * Instructor: Dr. Brian Holbert
 * Due Date: January 1, 2023
 */

package com.dancaps.m2.cta2;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;

public class BankAppFrame extends JFrame {

    public BankAppFrame() throws HeadlessException {
        /* Constructs the application frame and organizes the individual panels */

        // Instantiates the JPanels
        OutputPanel outputPanel = new OutputPanel();
        DepositPanel depositPanel = new DepositPanel(outputPanel);
        StartingBalancePanel startingBalancePanel = new StartingBalancePanel(outputPanel);
        WithdrawPanel withdrawPanel = new WithdrawPanel(outputPanel);

        // Adds the JPanel objects to the JFrame
        this.add(startingBalancePanel);
        this.add(depositPanel);
        this.add(withdrawPanel);
        this.add(outputPanel);

        // JFrame configurations
        this.setSize(500, 200);
        this.setLayout(new GridLayout(4, 1));
        this.setTitle("Banking Application");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
