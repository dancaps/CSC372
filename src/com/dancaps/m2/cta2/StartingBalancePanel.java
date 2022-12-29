/*
 * Assignment Title: Creating a GUI Bank Balance Application
 * Name: Danny Caperton
 * School: Colorado State University Global
 * Course: 22WB-CSC372-1
 * Instructor: Dr. Brian Holbert
 * Due Date: January 1, 2023
 */

package com.dancaps.m2.cta2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.text.NumberFormat;

public class StartingBalancePanel extends JPanel implements ActionListener {

    private final JFormattedTextField inputField;
    private final OutputPanel outputPanel;

    public StartingBalancePanel(OutputPanel outputPanel) {
        /* Constructs the object with a specific configuration for the starting balance panel */

        // Passes the outputPanel object reference so that the label can be updated by this object
        this.outputPanel = outputPanel;

        // JLabel configuration
        JLabel label = new JLabel("Enter the starting balance:");

        // JFormattedTextField configuration
        this.inputField = new JFormattedTextField(NumberFormat.getNumberInstance());
        this.inputField.setColumns(10);

        // JButton configuration
        JButton button = new JButton("Submit");
        button.addActionListener(this);

        // JPanel configuration
        this.add(label, BorderLayout.LINE_START);
        this.add(inputField, BorderLayout.CENTER);
        this.add(button, BorderLayout.LINE_END);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /* Sends the starting balance amount to the output panel to update the balance and redraw the label */

        // Assigns value based on input
        double startingBalance = (inputField.getValue() == null) ? 0 : ((Number) inputField.getValue()).doubleValue();

        // Sends the starting balance to the outputPanel object to update the label
        outputPanel.setStartingBalance(startingBalance);
    }
}
