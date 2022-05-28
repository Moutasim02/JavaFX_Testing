package com.example.jfx_test;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ControllersCommunication_Scene2Controller {
    @FXML
    Label nameLabel;
    public void displayName(String username) {
        nameLabel.setText("Hello: " + username);
    }
}
