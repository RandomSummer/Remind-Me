package com.app.todoapp.controller;

import com.app.todoapp.models.Task;
import com.app.todoapp.services.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
//@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskServices;


    public TaskController(TaskService taskServices) {
        this.taskServices = taskServices;
    }

//    mapping
    @GetMapping
    public String getTasks(Model model) {
        List<Task> tasks = taskServices.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "tasks";
    }

    @PostMapping
    public String createTask(@RequestParam String title) {
        taskServices.createTask(title);
        return "redirect:/";
    }

    @GetMapping("/{id}/delete")
    public String deleteTask(@PathVariable Long id) {
        taskServices.deleteTask(id);
        return "redirect:/";
    }

    @GetMapping("/{id}/toggle")
    public String toggleTask(@PathVariable Long id) {
        taskServices.toggleTask(id);
        return "redirect:/";
    }
}
