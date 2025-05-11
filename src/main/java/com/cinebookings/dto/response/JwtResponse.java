package com.cinebookings.dto.response;

// Remove entity import
// import com.cinebookings.entity.User; <-- This is the error

public class JwtResponse {
    private String token;
    private UserResponse user;  // Uses UserResponse DTO instead of User entity

    public JwtResponse(String token, UserResponse user) {
        this.token = token;
        this.user = user;
    }

    // Getters
    public String getToken() { return token; }
    public UserResponse getUser() { return user; }
}