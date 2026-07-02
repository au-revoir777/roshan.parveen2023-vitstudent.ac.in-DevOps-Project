package com.example.website.controller;

import com.example.website.dto.*;
import com.example.website.entity.CareerApplication;
import com.example.website.entity.ContactInquiry;
import com.example.website.repository.*;
import com.example.website.service.WebsiteService;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class HomeController {

    private final WebsiteService websiteService;
    private final CareerApplicationRepository careerRepository;
    private final ContactInquiryRepository contactRepository;

    public HomeController(WebsiteService websiteService,
                          CareerApplicationRepository careerRepository,
                          ContactInquiryRepository contactRepository) {
        this.websiteService = websiteService;
        this.careerRepository = careerRepository;
        this.contactRepository = contactRepository;
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model) {

    model.addAttribute(
            "teamMembers",
            websiteService.getTeamMembers());

    return "about";
}


    @GetMapping("/services")
    public String services(Model model) {

    model.addAttribute(
            "pricing",
            websiteService.getPricing());

    return "services";
}

    @GetMapping("/careers")
    public String careers() {
        return "careers";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("/gallery")
    public String gallery(Model model) {

    model.addAttribute(
            "portfolio",
            websiteService.getPortfolio());

    return "gallery";
    }

   
    @PostMapping("/careers/apply")
    public String apply(@ModelAttribute CareerApplicationDto dto,
        RedirectAttributes redirectAttributes) {

        CareerApplication application =
                new CareerApplication(
                        dto.getFullName(),
                        dto.getEmail(),
                        dto.getPosition(),
                        dto.getResume());

        careerRepository.save(application);

        return "redirect:/careers";
    }

    
    @PostMapping("/contact/submit")
    public String submit(@ModelAttribute ContactInquiryDto dto, RedirectAttributes redirectAttributes) {

    ContactInquiry inquiry =
            new ContactInquiry(
                    dto.getFirstName(),
                    dto.getLastName(),
                    dto.getContactEmail(),
                    dto.getInquiryType(),
                    dto.getMessage());

    contactRepository.save(inquiry);

    return "redirect:/contact";
}

}