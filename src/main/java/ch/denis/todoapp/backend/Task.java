package ch.denis.todoapp.backend;

import java.time.LocalDate;

public class Task {
    public String taskname;
    public String taskdescription;
    public LocalDate dueDate;
    public int importance;
    public String category;


    public Task(String taskname, String taskdescription, LocalDate dueDate, int importance, String category) {
        this.taskname = taskname;
        this.taskdescription = taskdescription;
        this.dueDate = dueDate;
        this.importance = importance;
        this.category = category;
    }
}
