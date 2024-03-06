package org.example.project2.lesson;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.project2.utils.FxmlUtil;

import java.io.IOException;

public class Lesson1Controller {

    FxmlUtil fxmlUtil = new FxmlUtil();

    @FXML
    private void openQuizWindow(ActionEvent event) throws IOException {
        fxmlUtil.switchScene(event,"/org/example/project2/quiz/QuizLesson1.fxml", 800, 600);
    }
}
