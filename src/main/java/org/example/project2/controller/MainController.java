package org.example.project2.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public void onRegisterButtonClick(ActionEvent actionEvent) {
        try {
            // Завантаження FXML для нової форми
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/example/project2/register.fxml"));
            Parent root = fxmlLoader.load();

            // Створення нової сцени
            Scene scene = new Scene(root);

            // Створення нового вікна (Stage)
            Stage registerStage = new Stage();
            registerStage.setTitle("Форма Реєстрації");
            registerStage.setMinWidth(400);
            registerStage.setMinHeight(600);
            registerStage.setScene(scene);
            ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
            // Відображення вікна
            registerStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}