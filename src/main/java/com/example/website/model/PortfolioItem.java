package com.example.website.model;

public class PortfolioItem {

    
    private String title;
    private String description;
    private String category;
    private String cssClass;

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