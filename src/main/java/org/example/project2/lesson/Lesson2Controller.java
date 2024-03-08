package org.example.project2.lesson;

import javafx.event.ActionEvent;
import org.example.project2.utils.FxmlUtil;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Lesson2Controller {

    FxmlUtil fxmlUtil = new FxmlUtil();
    public void openWikipedia(ActionEvent event) {
        try {
            Desktop.getDesktop().browse(new URI("https://uk.wikipedia.org/wiki/%D0%9F%D1%80%D0%B8%D0%BC%D1%96%D1%82%D0%B8%D0%B2%D0%BD%D0%B8%D0%B9_%D1%82%D0%B8%D0%BF_%D0%B4%D0%B0%D0%BD%D0%B8%D1%85"));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public void backToMain(ActionEvent actionEvent) throws IOException {
        fxmlUtil.switchScene(actionEvent, "/org/example/project2/mainPage.fxml", 800, 500, false);
    }
}
