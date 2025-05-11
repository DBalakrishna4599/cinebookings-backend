package com.cinebookings.dto.request;

import com.cinebookings.entity.User;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserRegistrationRequest {
	
	    @NotBlank
	    @Size(min = 3, max = 20) // Is username between 3 and 20 chars?
	    private String username;

	    @NotBlank
	    @Email // Is email a valid format?
	    private String email;

	    @NotBlank
	    @Size(min = 8) // Is password at least 8 chars?
	    private String password;

	    private User.Role role = User.Role.CUSTOMER;
	    // ...
	
    // Getters and Setters
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public User.Role getRole() { return role; }
    public void setRole(User.Role role) { this.role = role; }
}