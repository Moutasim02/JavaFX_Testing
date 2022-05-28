package com.example.jfx_test;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllersCommunication_Scene1Controller {

    @FXML
    TextField nameTextField;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void login(ActionEvent event) {
        try {
            String username = nameTextField.getText();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Comm_Scene2.fxml"));
            root = loader.load();
            ControllersCommunication_Scene2Controller controllersCommunicationScene2Controller = loader.getController();
            controllersCommunicationScene2Controller.displayName(username);
            //  root = FXMLLoader.load(getClass().getResource("Comm_Scene2.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
