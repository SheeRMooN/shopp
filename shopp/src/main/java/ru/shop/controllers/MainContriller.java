package ru.shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainContriller {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Main Package");
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model){
        model.addAttribute("title", "About Package");
        return "about";
    }

    @GetMapping("/shop")
    public String shop(Model model){
        model.addAttribute("title", "Shop Package");
        return "shop";
    }
    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("title", "Login Package");
        return "login";
    }


}
