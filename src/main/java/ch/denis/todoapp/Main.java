package ch.denis.todoapp;

import ch.denis.todoapp.frontend.UiManager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        UiManager.stage = stage;
        stage.show();
        UiManager.showLoginScene();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
