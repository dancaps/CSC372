/*
 * Assignment Title: Creating a User Interface I
 * Name: Danny Caperton
 * School: Colorado State University Global
 * Course: 22WB-CSC372-1
 * Instructor: Dr. Brian Holbert
 * Due Date: January 8, 2023
 */

package com.dancaps.m3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class CTA3Application extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        /* Sets up the application */

        FXMLLoader fxmlLoader = new FXMLLoader(CTA3Application.class.getResource("cta3-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 250);
        stage.setTitle("Working with JavaFX Menus");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        /* Starts the application */

        launch();
    }
}