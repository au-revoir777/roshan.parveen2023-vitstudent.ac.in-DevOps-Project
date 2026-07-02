package com.example.website.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PricingTier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tierName;
    private String price;
    private String dedicatedEngineers;
    private String slaResponse;
    private String maintenanceSupport;

    public PricingTier(){

    }
    
    public PricingTier(String tierName,
                       String price,
                       String dedicatedEngineers,
                       String slaResponse,
                       String maintenanceSupport) {

        this.tierName = tierName;
        this.price = price;
        this.dedicatedEngineers = dedicatedEngineers;
        this.slaResponse = slaResponse;
        this.maintenanceSupport = maintenanceSupport;
    }

    public String getTierName() {
        return tierName;
    }

    public String getPrice() {
        return price;
    }

    public String getDedicatedEngineers() {
        return dedicatedEngineers;
    }

    public String getSlaResponse() {
        return slaResponse;
    }

    public String getMaintenanceSupport() {
        return maintenanceSupport;
    }

}