package ch.denis.todoapp.frontend;

import ch.denis.todoapp.backend.Tasks;
import javafx.event.ActionEvent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginScene extends Controller{
    public PasswordField password;
    public TextField username;
    public static final String FUSERNAME = "todoapp";
    public static final String FPASSWORD = "todoapp123";


    public void login() {
        if (password.getText().equals(FPASSWORD) && username.getText().equals(FUSERNAME)){
            Tasks.loadTasks();
            UiManager.showMainScene();
        }
    }
}
