package ch.denis.todoapp.frontend;

import ch.denis.todoapp.backend.Task;
import ch.denis.todoapp.backend.Tasks;
import javafx.beans.property.Property;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class MainScene extends Controller{
    public TableView<Task> table;
    public TableColumn<Task, String> tname;
    public TableColumn<Task, String> tdescription;
    public TableColumn<Task, LocalDate> tduedate;
    public TableColumn<Task, String> timportance;
    public TableColumn<Task, String> tcategory;

    public void init(){
        tname.setCellValueFactory(new PropertyValueFactory<>("taskname"));
        tdescription.setCellValueFactory(new PropertyValueFactory<>("taskdescription"));
        tduedate.setCellValueFactory(new PropertyValueFactory<>("dueDate"));
        timportance.setCellValueFactory(new PropertyValueFactory<>("importance"));
        tcategory.setCellValueFactory(new PropertyValueFactory<>("category"));

        table.setItems(Tasks.taskList);
    }


    public void edit(ActionEvent actionEvent) {
        if (table.getSelectionModel().getSelectedItem() != null){
            UiManager.showEditScene(table.getSelectionModel().getSelectedItem());
        }
    }

    public void create(ActionEvent actionEvent) {
        UiManager.showCreateScene();
    }

}
