package org.example.project2.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class RegisterController {
    @FXML
    private void switchToLogin(ActionEvent event) throws IOException {
        // Завантаження FXML для форми логіна
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/example/project2/authorization/login.fxml"));
        Parent loginRoot = fxmlLoader.load();
        // Отримання поточної сцени з події
        Scene currentScene = ((Node)event.getSource()).getScene();
        // Встановлення нової сцени
        currentScene.setRoot(loginRoot);
    }

}
