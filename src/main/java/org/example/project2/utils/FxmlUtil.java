package org.example.project2.utils;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;

import java.io.IOException;

public class FxmlUtil {
    public void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public void switchScene(ActionEvent event, String nameScene) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(nameScene));
        Parent loginRoot = fxmlLoader.load();
        Scene currentScene = ((Node)event.getSource()).getScene();
        currentScene.setRoot(loginRoot);
    }
}
