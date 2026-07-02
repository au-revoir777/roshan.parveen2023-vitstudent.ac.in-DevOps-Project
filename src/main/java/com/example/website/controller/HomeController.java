package com.example.website.controller;

import com.example.website.dto.*;
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

    public HomeController(WebsiteService websiteService) {
        this.websiteService = websiteService;
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
    public String applyJob(
            @ModelAttribute CareerApplicationDto application,
            RedirectAttributes redirectAttributes) {

        System.out.println(application);

        redirectAttributes.addFlashAttribute(
                "success",
                "Application submitted successfully!");

        return "redirect:/careers";
    }

    
    @PostMapping("/contact/submit")
    public String submitInquiry(
            @ModelAttribute ContactInquiryDto inquiry,
            RedirectAttributes redirectAttributes) {

        System.out.println(inquiry);

        redirectAttributes.addFlashAttribute(
                "success",
                "Your inquiry has been received!");

        return "redirect:/contact";
    }
}

