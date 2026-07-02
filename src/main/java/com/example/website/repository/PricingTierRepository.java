package com.example.website.repository;

import com.example.website.entity.PricingTier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PricingTierRepository extends JpaRepository<PricingTier, Long> {

}