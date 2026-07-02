package com.example.website.service;

import org.springframework.stereotype.Service;
import com.example.website.entity.*;
import com.example.website.repository.*;
import java.util.List;

@Service
public class WebsiteService {

    private final TeamMemberRepository teamRepository;

    private final PricingTierRepository pricingRepository;

    private final PortfolioItemRepository portfolioRepository;

    public WebsiteService(
            TeamMemberRepository teamRepository,
            PricingTierRepository pricingRepository,
            PortfolioItemRepository portfolioRepository) {

        this.teamRepository = teamRepository;
        this.pricingRepository = pricingRepository;
        this.portfolioRepository = portfolioRepository;
    }

    public List<TeamMember> getTeamMembers() {
        return teamRepository.findAll();
    }

    public List<PricingTier> getPricing() {
        return pricingRepository.findAll();
    }

    public List<PortfolioItem> getPortfolio() {
        return portfolioRepository.findAll();
    }

}