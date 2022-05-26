package com.example.jfx_test;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class Stages extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Stage stage = new Stage();
        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);
//        Image icon = new Image("https://pbs.twimg.com/profile_images/1364610572029816833/HJ5izDQ0_400x400.jpg");
//        stage.getIcons().add(icon);
        stage.setWidth(700);
        stage.setHeight(520);
        stage.setResizable(false);
//        stage.setX(50);
//        stage.setY(50);
//        stage.setFullScreen(true);
//        stage.setFullScreenExitHint("Test hint!");
//        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        stage.setTitle("Stage Demo Program");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}