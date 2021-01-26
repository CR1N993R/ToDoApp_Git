package ch.denis.todoapp.backend;

import java.time.LocalDate;

public class Task {
    public String taskname;
    public String taskdescription;
    public LocalDate dueDate;
    public String importance;
    public String category;


    public Task(String taskname, String taskdescription, LocalDate dueDate, String importance, String category) {
        this.taskname = taskname;
        this.taskdescription = taskdescription;
        this.dueDate = dueDate;
        this.importance = importance;
        this.category = category;
    }

    public String getTaskname() {
        return taskname;
    }

    public String getTaskdescription() {
        return taskdescription;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public String getImportance() {
        return importance;
    }

    public String getCategory() {
        return category;
    }
}
