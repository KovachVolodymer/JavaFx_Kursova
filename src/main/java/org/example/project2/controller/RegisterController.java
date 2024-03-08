package org.example.project2.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.example.project2.model.User;
import org.example.project2.mongo.MongoDBConnector;
import org.example.project2.utils.FxmlUtil;
import org.example.project2.utils.PasswordHashing;

import java.io.IOException;


public class RegisterController {

    public TextField nameField;
    public PasswordField passwordField;
    public PasswordField confirmPasswordField;

    FxmlUtil fxmlUtil = new FxmlUtil();


    @FXML
    private void switchToLogin(ActionEvent event) throws IOException {
        fxmlUtil.switchScene(event, "/org/example/project2/authorization/login.fxml", 800, 500, false);
    }
    @FXML
    private void register(ActionEvent event) {

        try {
            String username = nameField.getText().trim();
            String password = passwordField.getText().trim();
            String confirmPassword = confirmPasswordField.getText().trim();

            // Валідація даних
            if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                fxmlUtil.showAlert("Помилка", "Всі поля повинні бути заповнені!");
                return;
            }
            if (!password.equals(confirmPassword)) {
                fxmlUtil.showAlert("Помилка", "Паролі не співпадають!");
                return;
            }
            if (User.existsByName(username)) {
                fxmlUtil.showAlert("Помилка", "Користувач з таким іменем вже існує!");
                return;
            }

            // Хешування пароля та збереження користувача
            password = PasswordHashing.hashPassword(password);
            User user = new User(username, password);
            user.save(user);

            // Перехід на головну сторінку
            fxmlUtil.switchScene(event, "/org/example/project2/mainPage.fxml", 800, 500, false);
        } catch (Exception e) {
            e.printStackTrace();
            fxmlUtil.showAlert("Помилка", "Помилка під час реєстрації: " + e.getMessage());
        }
    }





}
