package org.example.project2.lesson;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.project2.utils.FxmlUtil;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import java.awt.Desktop;


public class Lesson1Controller {

    FxmlUtil fxmlUtil = new FxmlUtil();
    
    public void backToMain(ActionEvent actionEvent) throws IOException {
        fxmlUtil.switchScene(actionEvent, "/org/example/project2/mainPage.fxml", 800, 500, false);
    }

    public void openWikipedia(ActionEvent event) {
        try {
            Desktop.getDesktop().browse(new URI("https://en.wikipedia.org/wiki/JavaScript"));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
