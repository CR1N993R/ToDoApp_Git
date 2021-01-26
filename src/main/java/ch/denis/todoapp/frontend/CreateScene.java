package ch.denis.todoapp.frontend;

import ch.denis.todoapp.backend.Task;
import ch.denis.todoapp.backend.Tasks;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

/**
 * @author Denis Dzeladini
 */
public class CreateScene extends Controller{
    public TextField taskname;
    public TextField taskdescription;
    public DatePicker duedate;
    public TextField category;
    public ComboBox<String> combobox;

    public void init(){
        ObservableList<String> categories = FXCollections.observableArrayList();
        categories.addAll("Schwer", "Mittel", "Leicht");
        combobox.setItems(categories);
    }


    public void back() {
        UiManager.showMainScene();
    }

    /**
     *
     */
    public void add() {
        if (allValuesSet()){
            Task currentTask = new Task(taskname.getText(), taskdescription.getText(), duedate.getValue(), combobox.getSelectionModel().getSelectedItem(), category.getText());
            Tasks.addTask(currentTask);
            back();
        }
    }

    /**
     *
     * @return
     */
    public boolean allValuesSet(){
        return taskname.getText().length() > 0 && taskdescription.getText().length() > 0 &&
                category.getText().length() > 0 && combobox.getSelectionModel().getSelectedItem() != null && duedate.getValue() != null;
    }

}
