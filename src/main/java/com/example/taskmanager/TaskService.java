package com.example.taskmanager;

import java.util.ArrayList;
import java.util.List;

public class TaskService {
    private final List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getAllTasks() {
        return tasks;
    }

    public boolean removeTask(String title) {
        return tasks.removeIf(t -> t.getTitle().equalsIgnoreCase(title));
    }
}
