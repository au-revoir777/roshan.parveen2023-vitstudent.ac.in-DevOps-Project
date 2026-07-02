package com.example.website;

import com.example.website.dto.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/services")
    public String services() {
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
    public String gallery() {
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