package com.example.website.model;

public class PricingTier {

    private String tierName;
    private String price;
    private String dedicatedEngineers;
    private String slaResponse;

    public PricingTier(String tierName,
                       String price,
                       String dedicatedEngineers,
                       String slaResponse) {

        this.tierName = tierName;
        this.price = price;
        this.dedicatedEngineers = dedicatedEngineers;
        this.slaResponse = slaResponse;
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

}