package org.example.project2.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import java.io.IOException;

public class LoginController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public void onRegisterButtonClick(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/example/project2/authorization/register.fxml"));
            Parent registerRoot = fxmlLoader.load();
            Scene currentScene = ((Node)actionEvent.getSource()).getScene();
            currentScene.setRoot(registerRoot);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}