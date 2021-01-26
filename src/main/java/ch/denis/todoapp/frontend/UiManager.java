package ch.denis.todoapp.frontend;

import ch.denis.todoapp.Main;
import ch.denis.todoapp.backend.Task;
import com.sun.source.tree.TryTree;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class UiManager {
    public static Stage stage;

    public static Controller loadScene(String path){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getClassLoader().getResource(path));
            stage.setScene(new Scene(fxmlLoader.load()));
            return fxmlLoader.getController();
        }catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }

    public static void showLoginScene(){
        loadScene("LoginForm.fxml");
    }

    public static void showMainScene(){
        loadScene("MainScene.fxml").init();
    }

    public static void showEditScene(Task task){
        loadScene("EditScene.fxml").init(task);
    }

    public static void showCreateScene(){
        loadScene("CreateScene.fxml").init();
    }
}
