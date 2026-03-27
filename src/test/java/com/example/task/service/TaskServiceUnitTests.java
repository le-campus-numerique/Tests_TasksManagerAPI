package com.example.task.service;

import com.example.task.model.Task;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TaskServiceUnitTests {

    private TaskService taskService;

    @BeforeEach
    void setup() {
        this.taskService = new TaskService();
    }

    @Test
    void addTask_should_add_task_to_the_list() {
        taskService.addTask("Faire les courses");
        assertThat(taskService.getAllTasks()).hasSize(1);
    }

    @Test
    void task_id_should_be_unique() {
        taskService.addTask("task1");
        taskService.addTask("task2");
        assertThat(taskService.getAllTasks().getFirst()
                .getId()).isNotEqualTo(taskService.getAllTasks().getLast().getId());
    }

    @Test
    void get_all_tasks_should_return_the_all_the_tasks(){
        for(int i = 1; i <= 5; i++) {
            taskService.addTask("task" + i);
        }

        assertThat(taskService.getAllTasks()).hasSize(5);
    }
}
