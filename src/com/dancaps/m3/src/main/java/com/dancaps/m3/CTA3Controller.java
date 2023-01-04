/*
 * Assignment Title: Creating a User Interface I
 * Name: Danny Caperton
 * School: Colorado State University Global
 * Course: 22WB-CSC372-1
 * Instructor: Dr. Brian Holbert
 * Due Date: January 8, 2023
 */

package com.dancaps.m3;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Random;

public class CTA3Controller {

    @FXML
    public VBox backgroundColor;
    @FXML
    private Label labelText;
    private final String assignmentInformation = """
            Assignment Title: Creating a User Interface I
            Name: Danny Caperton
            School: Colorado State University Global
            Course: 22WB-CSC372-1
            Instructor: Dr. Brian Holbert
            Due Date: January 8, 2023""";

    @FXML
    private void changeBackgroundColor() {
        /* Changes the background to a hue of green and keeps the initial color for the entire program execution */

        // Hues of green chart located here: https://www.rapidtables.com/web/color/green-color.html
        String[] colors = {"lawngreen", "chartreuse", "limegreen", "lime", "forestgreen", "green", "darkgreen",
                "greenyellow", "yellowgreen", "springgreen", "mediumspringgreen", "lightgreen", "palegreen",
                "darkseagreen", "seagreen", "olive", "darkolivegreen", "olivedrab"};
        // Generates a random number that corresponds to an array element
        int random = new Random().nextInt(18);

        // Check if the color is in use so that the initial color is never changed
        for (String color: colors) {
            if (this.backgroundColor.getStyle().equals("-fx-background-color: " + color)) {
                return;
            }
        }

        // If the color is not in the array the background will be set
        backgroundColor.setStyle("-fx-background-color: " + colors[random]);
    }

    @FXML
    private void exitTheApplication() {
        /* Exits the program */

        Platform.exit();
    }
    @FXML
    private void getAssignmentInformation() {
        /* Additional functionality to display the assignment information to the application */

        labelText.setText(assignmentInformation);
    }

    @FXML
    private void getDateTime() {
        /* Gets the current date and time and displays it to the application */

        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDate.now(), LocalTime.now(),
                                                       ZoneId.of("America/Denver"));
        labelText.setText(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).format(zonedDateTime));
    }

    @FXML
    private void writeTextFile() {
        /* Writes the displayed application information to a text file with the assignment information as a heading */

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt"))) {
            writer.write(assignmentInformation);
            writer.write("\n\n*** Below is the display information. ***\n\n");
            writer.write(labelText.getText());
            labelText.setText("The file was created.");
        } catch (IOException e) {
            labelText.setText("There was a problem write to the file. Please try again.");
        }
    }
}