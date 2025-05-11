package com.cinebookings.dto.response;

import java.time.LocalDateTime;

public class UserResponse {
    private Integer id;
    private String username;
    private String email;
    private String role;
    private LocalDateTime createdAt;

    public UserResponse(Integer id, String username,
                       String email, String role,
                       LocalDateTime createdAt) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.role = role;
        this.createdAt = createdAt;
    }

    // Getters (no setters needed for response DTO)
    public Integer getId() { return id; }
    public String getUsername() { return username; }
    public String getEmail() { return email; }
    public String getRole() { return role; }
    public LocalDateTime getCreatedAt() { return createdAt; }
}