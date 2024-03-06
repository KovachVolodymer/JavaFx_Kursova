package org.example.project2.utils;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import org.example.project2.MainApplication;
import javafx.stage.Stage;


import java.io.IOException;
import java.util.Objects;

public class FxmlUtil {
    public void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    //new size scene can be set in the method switchScene
    public void switchScene(ActionEvent event, String nameScene,Integer v,Integer v1) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(MainApplication.class.getResource(nameScene)));
        Scene scene = new Scene(root, v, v1);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

}
