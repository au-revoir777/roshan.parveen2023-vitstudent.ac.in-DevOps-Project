package com.example.website.dto;

public class CareerApplicationDto {

    private String fullName;
    private String email;
    private String position;
    private String resume;

    public CareerApplicationDto() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    @Override
    public String toString() {
        return "CareerApplicationDto{" +
                "fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", position='" + position + '\'' +
                ", resume='" + resume + '\'' +
                '}';
    }
}