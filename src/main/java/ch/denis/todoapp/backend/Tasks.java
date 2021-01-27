package ch.denis.todoapp.backend;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class Tasks {
    public static ObservableList<Task> taskList = FXCollections.observableArrayList();

    public static void addTask(Task task){
        taskList.add(task);
    }

    /**
     *
     * @param task
     */
    public static void removeTask(Task task){
        taskList.remove(task);
    }

    public static void saveTasks(){
        try {
            Gson gson = new Gson();
            FileWriter fileWriter = new FileWriter("ToDoTasks.json");
            gson.toJson(taskList, fileWriter);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void loadTasks(){
        try {
            File file = new File("ToDoTasks.json");
            if (file.exists()) {
                Gson gson = new Gson();
                JsonReader jsonReader = new JsonReader(new FileReader(file));
                Type type = new TypeToken<ArrayList<Task>>() {
                }.getType();
                ArrayList<Task> tasks = gson.fromJson(jsonReader, type);
                taskList.addAll(tasks);
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
