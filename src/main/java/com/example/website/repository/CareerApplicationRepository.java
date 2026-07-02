package com.example.website.repository;

import com.example.website.entity.CareerApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CareerApplicationRepository
        extends JpaRepository<CareerApplication, Long> {
}