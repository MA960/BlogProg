package com.example.blog;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity // Tells Spring Boot/JPA that this class maps to a database table
@Table(name = "posts") // Optional: sets the table name
public class Post {

    @Id // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment ID
    private Long id;

    @Column(nullable = false) // Cannot be null
    private String title;

    @Column(nullable = false, columnDefinition = "TEXT") // Content can be long
    private String content;

    private String author;

    private LocalDateTime createdAt;

    // Default constructor (needed by JPA)
    public Post() {
        this.createdAt = LocalDateTime.now();
    }

    // Constructor with fields (optional, convenient)
    public Post(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.createdAt = LocalDateTime.now();
    }

    // Getters and setters (required for JPA + JSON serialization)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}
