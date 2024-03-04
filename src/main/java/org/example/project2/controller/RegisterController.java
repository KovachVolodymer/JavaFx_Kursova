package org.example.project2.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.example.project2.model.User;
import org.example.project2.mongo.MongoDBConnector;

import java.io.IOException;


public class RegisterController {

    public TextField nameField;
    public PasswordField passwordField;
    public PasswordField confirmPasswordField;

    @FXML
    private void switchToLogin(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/example/project2/authorization/login.fxml"));
        Parent loginRoot = fxmlLoader.load();
        Scene currentScene = ((Node)event.getSource()).getScene();
        currentScene.setRoot(loginRoot);
    }
    @FXML
    private void register(ActionEvent event) throws IOException {
        String username = nameField.getText();
        String password = passwordField.getText();
        String confirmPassword = confirmPasswordField.getText();
        if (password.equals(confirmPassword)) {
            User user = new User(username, password);
            user.save(user);
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/example/project2/authorization/login.fxml"));
            Parent loginRoot = fxmlLoader.load();
            Scene currentScene = ((Node)event.getSource()).getScene();
            currentScene.setRoot(loginRoot);
        }

    }

}
