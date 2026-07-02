package com.example.website.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TeamMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String role;
    private String initials;

    public TeamMember(){

    }
    
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