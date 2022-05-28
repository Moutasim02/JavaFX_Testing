package com.example.jfx_test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneBuilderTest extends Application {
    public static void main(String[] args) {
        launch();
    }


    @Override
    public void start(Stage stage) throws Exception {
        Parent root = new FXMLLoader().load(getClass().getResource("sceneBuilder.fxml"));
        stage.setTitle("Scene Builder Test");
        stage.setScene(new Scene(root));
        stage.show();
    }
}
