package ru.shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

    @GetMapping("/blog")
    public String block(Model model){
        model.addAttribute("title", "Blog Package");
        return "blog-main";
    }
}
