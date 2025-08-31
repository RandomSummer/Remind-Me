package com.app.todoapp.controller;

import com.app.todoapp.models.Quote; // ADDED: Import for Quote class
import com.app.todoapp.models.Task;
import com.app.todoapp.services.TaskService;
import org.springframework.http.ResponseEntity; // ADDED: Import for ResponseEntity
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@Controller
public class TaskController {

    private final TaskService taskServices;

    // ADDED: List of quotes for the dynamic feature
    private final List<Quote> quotes = List.of(
            new Quote("The only way to do great work is to love what you do.", "Steve Jobs"),
            new Quote("Success is not final, failure is not fatal: it is the courage to continue that counts.", "Winston Churchill"),
            new Quote("The future belongs to those who believe in the beauty of their dreams.", "Eleanor Roosevelt"),
            new Quote("Believe you can and you're halfway there.", "Theodore Roosevelt"),
            new Quote("A journey of a thousand miles begins with a single step.", "Lao Tzu")
    );
    private final Random random = new Random();

    public TaskController(TaskService taskServices) {
        this.taskServices = taskServices;
    }

    // This method now loads the main page and provides a random quote
    @GetMapping("/") // CHANGED: Explicitly mapped to the root URL "/"
    public String getTasks(Model model) {
        // --- Logic for dynamic quote ---
        Quote randomQuote = quotes.get(random.nextInt(quotes.size()));
        model.addAttribute("randomQuote", randomQuote);

        // --- Existing logic to get tasks ---
        List<Task> tasks = taskServices.getAllTasks();
        model.addAttribute("tasks", tasks);

        // Assumes your HTML file is named 'tasks.html' in the templates folder
        return "tasks";
    }

    // This method now handles the AJAX POST request without reloading the page
    @PostMapping("/") // CHANGED: Explicitly mapped to "/"
    @ResponseBody   // ADDED: This is crucial for AJAX requests
    public ResponseEntity<Void> createTask(@RequestParam String title) {
        taskServices.createTask(title);
        // CHANGED: Returns "200 OK" instead of a redirect to prevent page refresh
        return ResponseEntity.ok().build();
    }

    // This method now handles the AJAX GET request for deleting without reloading
    @GetMapping("/{id}/delete")
    @ResponseBody   // ADDED: This is crucial for AJAX requests
    public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
        taskServices.deleteTask(id);
        // CHANGED: Returns "200 OK" instead of a redirect
        return ResponseEntity.ok().build();
    }

    // This method now handles the AJAX GET request for toggling without reloading
    @GetMapping("/{id}/toggle")
    @ResponseBody   // ADDED: This is crucial for AJAX requests
    public ResponseEntity<Void> toggleTask(@PathVariable Long id) {
        taskServices.toggleTask(id);
        // CHANGED: Returns "200 OK" instead of a redirect
        return ResponseEntity.ok().build();
    }
}