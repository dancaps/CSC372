/*
 * Assignment Title: Creating a GUI Bank Balance Application
 * Name: Danny Caperton
 * School: Colorado State University Global
 * Course: 22WB-CSC372-1
 * Instructor: Dr. Brian Holbert
 * Due Date: January 1, 2023
 */

package com.dancaps.m3;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class CTA3Controller {
    @FXML
    private Label labelText;
//    @FXML
//    private BackgroundFill bf = new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY);
//    @FXML
//    private Background bg = new Background(bf);

    private final String assignmentInformation = "Assignment Title: Creating a User Interface I\n" +
            "Name: Danny Caperton\n" +
            "School: Colorado State University Global\n" +
            "Course: 22WB-CSC372-1\n" +
            "Instructor: Dr. Brian Holbert\n" +
            "Due Date: January 8, 2023\n";

    @FXML
    private void changeBackgroundColor() {
        //vbox.setStyle(backgroundColor);
        labelText.setText("Changing the background color");
    }

    @FXML
    private void exitTheApplication() {
        Platform.exit();
    }
    @FXML
    private void getAssignmentInformation() {
        labelText.setText(assignmentInformation);
    }

    @FXML
    private void getDateTime() {
        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDate.now(),
                                                       LocalTime.now(),
                                                       ZoneId.of("America/Denver"));
        labelText.setText(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).format(zonedDateTime));
    }

    @FXML
    private void writeTextFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("CTA3.txt"))) {
            writer.write(assignmentInformation);
            writer.newLine();
            writer.write("*** Below is the display information. ***\n");
            writer.newLine();
            writer.write(labelText.getText());
            labelText.setText("The file was created.");
        } catch (IOException e) {
            labelText.setText("There was a problem write to the file. Please try again.");
        }
    }
}