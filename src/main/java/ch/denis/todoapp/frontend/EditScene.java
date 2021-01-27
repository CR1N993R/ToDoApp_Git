package ch.denis.todoapp.frontend;

import ch.denis.todoapp.backend.Task;
import ch.denis.todoapp.backend.Tasks;
import javafx.event.ActionEvent;
import javafx.scene.control.MenuButton;

public class EditScene extends CreateScene{
    private Task task;

    public void init(Task task){
        this.task = task;
        taskname.setText(task.taskname);
        taskdescription.setText(task.taskdescription);
        duedate.setValue(task.dueDate);
        category.setText(task.category);

        super.init();
        combobox.getSelectionModel().select(task.importance);
    }

    public void save(ActionEvent actionEvent) {
        if (allValuesSet()){
            task.taskname = taskname.getText();
            task.taskdescription = taskdescription.getText();
            task.dueDate = duedate.getValue();
            task.importance = combobox.getSelectionModel().getSelectedItem();
            task.category = category.getText();
            Tasks.saveTasks();
            back();
        }
    }

    public void delete(ActionEvent actionEvent) {
        Tasks.removeTask(task);
        Tasks.saveTasks();
        back();
    }
}
