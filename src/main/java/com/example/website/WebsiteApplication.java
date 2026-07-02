package com.example.website;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import com.example.website.entity.TeamMember;
import com.example.website.entity.PricingTier;
import com.example.website.entity.PortfolioItem;

import com.example.website.repository.TeamMemberRepository;
import com.example.website.repository.PricingTierRepository;
import com.example.website.repository.PortfolioItemRepository;

@SpringBootApplication
public class WebsiteApplication {

	@Bean
CommandLineRunner seedDatabase(
        TeamMemberRepository teamRepo,
        PricingTierRepository pricingRepo,
        PortfolioItemRepository portfolioRepo) {

    return args -> {

        if (teamRepo.count() == 0) {

            teamRepo.save(new TeamMember(
                    "John Smith",
                    "CEO",
                    "JS"));

            teamRepo.save(new TeamMember(
                    "Sarah Johnson",
                    "Cloud Architect",
                    "SJ"));
            teamRepo.save(new TeamMember(
                    "David Lee",
                    "Lead Developer",
                    "DL"));
            teamRepo.save(new TeamMember(
                    "Emily Brown",
                    "DevOps Engineer",
                    "EB"));
        }

        if (pricingRepo.count() == 0) {

            pricingRepo.save(new PricingTier(
                    "Starter",
                    "$499",
                    "1",
                    "24 Hours",
				"Basic Updates"));

            pricingRepo.save(new PricingTier(
                    "Professional",
                    "$999",
                    "3",
                    "8 Hours",
				"Full Support"));

            pricingRepo.save(new PricingTier(
                    "Enterprise",
                    "Custom",
                    "Dedicated Team",
                    "1 Hour",
				"Proactive Refactoring"));
        }

        if (portfolioRepo.count() == 0) {

            portfolioRepo.save(new PortfolioItem(
                    "Cloud Migration",
                    "AWS Migration for a Fortune 500 client",
                    "Project",
                    "project-bg"));
            portfolioRepo.save(new PortfolioItem(
                    "Annual Tech Summit",
                    "Company innovation showcase",
                    "Event",
                    "event-bg"));
            portfolioRepo.save(new PortfolioItem(
                    "Team Building",
                    "Corporate culture initiatives",
                    "Team",
                    "team-bg"));
        }
    };
}
	public static void main(String[] args) {
		SpringApplication.run(WebsiteApplication.class, args);
	}

}
