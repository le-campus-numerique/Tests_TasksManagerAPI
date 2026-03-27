package com.example.task.model;

import java.util.UUID;

public class Task {
    private static int counter = 0;
    private int id;
    private String description;
    private String status;
    private boolean isCompleted;

    public Task(String description) {
        this.description = description;
        this.id = ++counter;
        this.description = description;
        this.status = "en cours";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
