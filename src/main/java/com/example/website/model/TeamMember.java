package com.example.website.model;

public class TeamMember {
    
    private String fullName;
    private String role;
    private String initials;
    
    public TeamMember(String fullName, String role, String initials) {
        this.fullName = fullName;
        this.role = role;
        this.initials = initials;
    }

    public String getFullName() {
        return fullName;
    }

    public String getRole() {
        return role;
    }

    public String getInitials() {
        return initials;
    }
}