package com.app.todoapp.models;

public class Quote {
    private String text;
    private String author;

    public Quote(String text, String author) {
        this.text = text;
        this.author = author;
    }

    // Getters
    public String getText() {
        return text;
    }

    public String getAuthor() {
        return author;
    }
}
