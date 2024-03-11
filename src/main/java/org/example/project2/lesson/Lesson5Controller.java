package org.example.project2.lesson;

import javafx.event.ActionEvent;
import org.example.project2.utils.FxmlUtil;

import java.io.IOException;

public class Lesson5Controller {
    FxmlUtil fxmlUtil = new FxmlUtil();
    public void backToMain(ActionEvent actionEvent) throws IOException {
        fxmlUtil.switchScene(actionEvent, "/org/example/project2/mainPage.fxml", 800, 500, false);
    }

}
