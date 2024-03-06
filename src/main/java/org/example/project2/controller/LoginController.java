package org.example.project2.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.example.project2.model.User;
import org.example.project2.utils.FxmlUtil;
import org.example.project2.utils.PasswordHashing;

import java.io.IOException;

public class LoginController {


    FxmlUtil fxmlUtil = new FxmlUtil();

    public PasswordField passwordField;
    public TextField loginField;




    @FXML
    public void onRegisterButtonClick(ActionEvent actionEvent) {
        try {
            fxmlUtil.switchScene(actionEvent, "/org/example/project2/authorization/register.fxml", 800, 500);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void login(ActionEvent actionEvent) {
        String login = loginField.getText().trim();
        String password = passwordField.getText().trim();

        if (login.isEmpty() || password.isEmpty()) {
            fxmlUtil.showAlert("Помилка", "Всі поля повинні бути заповнені!");
            return;
        }
        User user = User.getByName(login);
        if (user == null) {
            fxmlUtil.showAlert("Помилка", "Користувача з таким іменем не існує!");
            return;
        }
        if (!PasswordHashing.checkPassword(password, user.getPassword())) {
            fxmlUtil.showAlert("Помилка", "Неправильний пароль!");
            return;
        }
        try {
            fxmlUtil.switchScene(actionEvent, "/org/example/project2/mainPage.fxml", 800, 500);
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
}