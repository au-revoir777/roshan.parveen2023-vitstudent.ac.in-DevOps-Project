package com.example.website.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class CareerApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    private String email;

    private String position;

    private String resume;

    public CareerApplication(String fullName,
                             String email,
                             String position,
                             String resume) {

        this.fullName = fullName;
        this.email = email;
        this.position = position;
        this.resume = resume;
    }
}