package com.example.website.service;

import com.example.website.model.*;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebsiteService {

    public List<TeamMember> getTeamMembers() {

        return List.of(

                new TeamMember(
                        "John Smith",
                        "Chief Executive Officer",
                        "JS"),

                new TeamMember(
                        "Sarah Johnson",
                        "Cloud Architect",
                        "SJ"),

                new TeamMember(
                        "David Lee",
                        "Lead Developer",
                        "DL"),

                new TeamMember(
                        "Emily Brown",
                        "DevOps Engineer",
                        "EB")
        );

    }

    public List<PricingTier> getPricing() {

        return List.of(

                new PricingTier(
                        "Starter",
                        "$499",
                        "1",
                        "24 Hours",
                        "Basic Updates"
                    ),

                new PricingTier(
                        "Professional",
                        "$999",
                        "3",
                        "8 Hours",
                        "Full Support"
                    ),

                new PricingTier(
                        "Enterprise",
                        "Custom",
                        "Dedicated Team",
                        "1 Hour",
                        "Proactive Refactoring"
                    )
        );

    }

    public List<PortfolioItem> getPortfolio() {

        return List.of(

                new PortfolioItem(
                        "Cloud Migration",
                        "Migration to AWS infrastructure",
                        "Project",
                        "project-bg"),

                new PortfolioItem(
                        "Annual Tech Summit",
                        "Company innovation showcase",
                        "Events",
                        "office-bg"),

                new PortfolioItem(
                        "Team Building",
                        "Corporate culture initiatives",
                        "Culture",
                        "mobile-bg")
        );

    }

}