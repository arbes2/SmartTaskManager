package com.example.taskmanager;

import java.util.Scanner;

public class ConsoleUI {
    private final TaskService service = new TaskService();
    private final Scanner scanner = new Scanner(System.in);

    public void run() {
        System.out.println("=== Smart Task Manager ===");

        while (true) {
            System.out.println("\n1. Add Task\n2. View Tasks\n3. Delete Task\n4. Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> addTask();
                case "2" -> viewTasks();
                case "3" -> deleteTask();
                case "4" -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }

    private void addTask() {
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Deadline (YYYY-MM-DD): ");
        String deadline = scanner.nextLine();
        System.out.print("Priority (High/Medium/Low): ");
        String priority = scanner.nextLine();

        service.addTask(new Task(title, deadline, priority));
        System.out.println("Task added!");
    }

    private void viewTasks() {
        for (Task t : service.getAllTasks()) {
            System.out.println(t);
        }
    }

    private void deleteTask() {
        System.out.print("Enter task title to delete: ");
        String title = scanner.nextLine();
        if (service.removeTask(title)) {
            System.out.println("Task removed.");
        } else {
            System.out.println("Task not found.");
        }
    }
}
