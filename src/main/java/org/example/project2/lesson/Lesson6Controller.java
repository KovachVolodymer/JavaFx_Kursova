package org.example.project2.lesson;

import javafx.event.ActionEvent;
import org.example.project2.utils.FxmlUtil;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Lesson6Controller {
    FxmlUtil fxmlUtil = new FxmlUtil();
    public void backToMain(ActionEvent actionEvent) throws IOException {
        fxmlUtil.switchScene(actionEvent, "/org/example/project2/mainPage.fxml", 800, 500, false);
    }

    public void openWebPage() {
        try {
            Desktop.getDesktop().browse(new URI("https://en.wikipedia.org/wiki/Array_data_structure#JavaScript"));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
