package com.dancaps.m3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DiscussionThreeController {
    @FXML
    private Label buttonText;

    @FXML
    protected void onButtonClick() { buttonText.setText("You clicked the button!");}
}