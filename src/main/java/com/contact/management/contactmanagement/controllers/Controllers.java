package com.contact.management.contactmanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.contact.management.contactmanagement.dao.UserRepository;
import com.contact.management.contactmanagement.entites.User;

@Controller
public class Controllers {
    @Autowired
   private UserRepository repo;
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("title", "Home");
        return "home";
    }
    @RequestMapping("/about")
    public String about(Model model){
        model.addAttribute("title", "About");
        return "about";
    }

 @RequestMapping("/signUp")
    public String signUp(Model model){
        model.addAttribute("title", "SignUp");
        model.addAttribute("user", new User());
        return "signUp";
    }
    @PostMapping("/doSignUp")
    @ResponseBody
    public String doSignUp(@ModelAttribute("user") User user,@RequestParam(value = "agrement",defaultValue = "false") boolean agrement, Model model){
        System.out.println(user);
       this.repo.save(user);
        return "x";
    }
}
