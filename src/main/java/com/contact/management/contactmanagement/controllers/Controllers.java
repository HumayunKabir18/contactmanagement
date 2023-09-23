package com.contact.management.contactmanagement.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controllers {
    
    @GetMapping("")
    public String home(Model model){
        model.addAttribute("title", "Home");
        return "home";
    }
    @RequestMapping("/about")
    public String about(Model model){
        model.addAttribute("title", "About");
        return "about";
    }
}