package com.example.taskmanager;

public class Task {
    private String title;
    private String deadline;
    private String priority;

    public Task(String title, String deadline, String priority) {
        this.title = title;
        this.deadline = deadline;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public String getDeadline() {
        return deadline;
    }

    public String getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "[" + priority + "] " + title + " (Due: " + deadline + ")";
    }
}
