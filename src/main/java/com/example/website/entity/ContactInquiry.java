package com.example.website.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ContactInquiry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String contactEmail;
    private String inquiryType;

    @Column(length = 5000)
    private String message;

    public ContactInquiry(String firstName,
                          String lastName,
                          String contactEmail,
                          String inquiryType,
                          String message) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.contactEmail = contactEmail;
        this.inquiryType = inquiryType;
        this.message = message;
    }
}