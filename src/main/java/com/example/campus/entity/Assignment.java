package com.example.campus.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "assignments")
public class Assignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Assignment details
    private String title;
    private String description;
    private String subject;        // ✅ Added
    private Integer maxMarks;      // ✅ Added
    private LocalDateTime dueDate; // ✅ Added

    // Who created it (faculty username or id)
    private String createdBy;

    // Track when created
    private LocalDateTime createdAt;

    // Student submission details (nullable until submitted)
    private Long studentId;
    private LocalDateTime submittedAt;

    // ✅ Default Constructor
    public Assignment() {}

    // ✅ Constructor for creating new assignment (faculty use)
    public Assignment(String title, String description, String createdBy,
                      String subject, Integer maxMarks, LocalDateTime dueDate) {
        this.title = title;
        this.description = description;
        this.createdBy = createdBy;
        this.subject = subject;
        this.maxMarks = maxMarks;
        this.dueDate = dueDate;
        this.createdAt = LocalDateTime.now();
    }

    // ✅ Getters and Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getMaxMarks() {
        return maxMarks;
    }
    public void setMaxMarks(Integer maxMarks) {
        this.maxMarks = maxMarks;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }
    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Long getStudentId() {
        return studentId;
    }
    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public LocalDateTime getSubmittedAt() {
        return submittedAt;
    }
    public void setSubmittedAt(LocalDateTime submittedAt) {
        this.submittedAt = submittedAt;
    }
}
