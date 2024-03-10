package org.example.project2.lesson;

import javafx.event.ActionEvent;
import org.example.project2.utils.FxmlUtil;

import java.io.IOException;

public class Lesson4Controller {
    FxmlUtil fxmlUtil = new FxmlUtil();
    public void openWikipedia(ActionEvent actionEvent) {
        try {
            java.awt.Desktop.getDesktop().browse(new java.net.URI("https://uk.wikipedia.org/wiki/%D0%9F%D1%80%D0%B8%D0%BC%D1%96%D1%82%D0%B8%D0%B2%D0%BD%D0%B8%D0%B9_%D1%82%D0%B8%D0%BF_%D0%B4%D0%B0%D0%BD%D0%B8%D1%85"));
        } catch (IOException | java.net.URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public void backToMain(ActionEvent actionEvent) throws IOException {
        fxmlUtil.switchScene(actionEvent, "/org/example/project2/mainPage.fxml", 800, 500, false);
    }
}
