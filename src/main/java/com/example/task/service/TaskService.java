package com.example.task.service;

import com.example.task.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    private final List<Task> tasks = new ArrayList<>();

    public void addTask(String description) {
        tasks.add(new Task(description));
    }

    public void deleteTask(int id) {
        Task task = findTask(id);
        tasks.remove(task);
    }

    public Task findTask(int id) {
        for (Task t: tasks) {
           if (t.getId() == id) return t;
        }

        return null;
    }

    public List<Task> getAllTasks() {
        return List.copyOf(tasks);
    }

    /// TO BE IMPLEMENTED
    /// Handle and manage a list of Task objects
    public static void main(String[] args) {
        TaskService todo = new TaskService();

        todo.addTask("Faire les courses");
        todo.addTask("task2");
        todo.addTask("task3");
        System.out.println(todo.findTask(2).getDescription());
        todo.deleteTask(2);

        for (Task task: todo.tasks) {
            System.out.println(task.getId() + " : " + task.getDescription());
        }
    }

}

