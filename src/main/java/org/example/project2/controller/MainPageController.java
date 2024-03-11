package org.example.project2.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.project2.utils.FxmlUtil;

import java.io.IOException;

public class MainPageController {

    FxmlUtil fxmlUtil = new FxmlUtil();
    public void onLesson1Click(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/example/project2/lesson/Lesson1.fxml"));
        Parent lessonRoot = fxmlLoader.load();

        // Отримання поточної сцени з події, що була викликана
        Scene currentScene = ((Node)event.getSource()).getScene();

        // Встановлення нового кореня для поточної сцени
        currentScene.setRoot(lessonRoot);

        // Отримання об'єкта Stage з поточної сцени
        Stage primaryStage = (Stage) currentScene.getWindow();

        // Встановлення повноекранного режиму
        primaryStage.setMinWidth(1700);
        primaryStage.setMinHeight(880);
        primaryStage.setFullScreen(true);
    }

    public void onLesson2Click(ActionEvent actionEvent) throws IOException {
        fxmlUtil.switchScene(actionEvent, "/org/example/project2/lesson/Lesson2.fxml", 1700, 880, true);
    }

    public void onLesson3Click(ActionEvent actionEvent) throws IOException {
        fxmlUtil.switchScene(actionEvent, "/org/example/project2/lesson/Lesson3.fxml", 1700, 880, true);
    }

    public void onLesson4Click(ActionEvent actionEvent) throws IOException {
        fxmlUtil.switchScene(actionEvent, "/org/example/project2/lesson/Lesson4.fxml", 1700, 880, true);
    }

    public void onLesson5Click(ActionEvent actionEvent) throws IOException {
        fxmlUtil.switchScene(actionEvent, "/org/example/project2/lesson/Lesson5.fxml", 1700, 880, true);
    }

    public void onLesson6Click(ActionEvent actionEvent) {
    }

    public void onLesson7Click(ActionEvent actionEvent) {
    }
}
