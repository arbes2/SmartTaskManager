package com.example.taskmanager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskServiceTest {

    @Test
    public void testAddAndRemoveTask() {
        TaskService service = new TaskService();
        Task task = new Task("Test Task", "2025-06-01", "High");

        service.addTask(task);
        assertEquals(1, service.getAllTasks().size());

        boolean removed = service.removeTask("Test Task");
        assertTrue(removed);
        assertEquals(0, service.getAllTasks().size());
    }
}
