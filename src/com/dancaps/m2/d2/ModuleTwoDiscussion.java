package com.dancaps.m2.d2;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import javax.swing.*;

public class ModuleTwoDiscussion extends JFrame implements ActionListener {

    JFormattedTextField fahrenheitNumber;
    JTextField celsiusNumber;
    JTextField kelvinNumber;
    JLabel fahrenheitLabel;
    JLabel celsiusLabel;
    JLabel kelvinLabel;
    JButton calculateButton;

    public ModuleTwoDiscussion() {

        GridBagConstraints bagConstraints;

        fahrenheitLabel = new JLabel("Enter Fahrenheit:");
        celsiusLabel = new JLabel("Celsius:");
        kelvinLabel = new JLabel("Kelvin:");

        fahrenheitNumber = new JFormattedTextField(NumberFormat.getNumberInstance());
        fahrenheitNumber.setColumns(15);
        fahrenheitNumber.setEditable(true);

        celsiusNumber = new JTextField(15);
        celsiusNumber.setEditable(false);

        kelvinNumber = new JTextField(15);
        kelvinNumber.setEditable(false);

        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);

        setTitle("Fahrenheit to Celsius/Kelvin Converter");
        setLayout(new GridBagLayout());

        bagConstraints = new GridBagConstraints();
        bagConstraints.gridx = 0;
        bagConstraints.gridy = 0;
        bagConstraints.insets = new Insets(10, 10, 10, 1);
        add(fahrenheitLabel, bagConstraints);

        bagConstraints = new GridBagConstraints();
        bagConstraints.gridx = 1;
        bagConstraints.gridy = 0;
        bagConstraints.insets = new Insets(10, 1, 10, 10);
        add(fahrenheitNumber, bagConstraints);

        bagConstraints = new GridBagConstraints();
        bagConstraints.gridx = 2;
        bagConstraints.gridy = 0;
        bagConstraints.insets = new Insets(10, 5, 10, 10);
        add(calculateButton, bagConstraints);

        bagConstraints = new GridBagConstraints();
        bagConstraints.gridx = 1;
        bagConstraints.gridy = 1;
        bagConstraints.insets = new Insets(10, 0, 1, 10);
        add(celsiusLabel, bagConstraints);

        bagConstraints = new GridBagConstraints();
        bagConstraints.gridx = 1;
        bagConstraints.gridy = 2;
        bagConstraints.insets = new Insets(1, 0, 10, 10);
        add(celsiusNumber, bagConstraints);

        bagConstraints = new GridBagConstraints();
        bagConstraints.gridx = 2;
        bagConstraints.gridy = 1;
        bagConstraints.insets = new Insets(10, 0, 1, 10);
        add(kelvinLabel, bagConstraints);

        bagConstraints = new GridBagConstraints();
        bagConstraints.gridx = 2;
        bagConstraints.gridy = 2;
        bagConstraints.insets = new Insets(1, 0, 10, 10);
        add(kelvinNumber, bagConstraints);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        double input = ((Number) fahrenheitNumber.getValue()).doubleValue();
        double celsiusResult = (input - 32) * .5556;
        double kelvinResult = (input - 32) * 5 / 9 + 273.15;
        celsiusNumber.setText(String.valueOf(celsiusResult));
        kelvinNumber.setText(String.valueOf(kelvinResult));
    }
}
