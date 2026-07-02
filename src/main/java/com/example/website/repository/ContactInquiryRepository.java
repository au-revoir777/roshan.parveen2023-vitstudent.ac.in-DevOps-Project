package com.example.website.repository;

import com.example.website.entity.ContactInquiry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactInquiryRepository
        extends JpaRepository<ContactInquiry, Long> {
}