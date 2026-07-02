package com.example.website.entity;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class PortfolioItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String category;
    private String cssClass;

    public PortfolioItem(){
        
    }

    public PortfolioItem(String title,
                         String description,
                         String category,
                         String cssClass) {

        this.title = title;
        this.description = description;
        this.category = category;
        this.cssClass = cssClass;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public String getCssClass() {
        return cssClass;
    }

}