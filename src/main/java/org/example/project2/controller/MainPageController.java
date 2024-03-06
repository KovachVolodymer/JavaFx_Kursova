package org.example.project2.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import org.example.project2.utils.FxmlUtil;

import java.io.IOException;

public class MainPageController {

    FxmlUtil fxmlUtil = new FxmlUtil();
    public void onLesson1Click(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/example/project2/lesson/Lesson1.fxml"));
        Parent loginRoot = fxmlLoader.load();
        Scene currentScene = ((Node)event.getSource()).getScene();
        currentScene.setRoot(loginRoot);
    }

    public void onLesson2Click(ActionEvent actionEvent) {
    }

    public void onLesson3Click(ActionEvent actionEvent) {
    }

    public void onLesson4Click(ActionEvent actionEvent) {
    }

    public void onLesson5Click(ActionEvent actionEvent) {
    }

    public void onLesson6Click(ActionEvent actionEvent) {
    }

    public void onLesson7Click(ActionEvent actionEvent) {
    }
}
