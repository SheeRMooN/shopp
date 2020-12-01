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

    @GetMapping("/blog-create")
    public String blogCreate(Model model){
        model.addAttribute("title", "Blog Create");
        return "blog-create";
    }
    @GetMapping("/blog-update")
    public String blogUpdate(Model model){
        model.addAttribute("title", "Blog Update");
        return "blog-update";
    }
    @GetMapping("/blog-delete")
    public String blogDelete(Model model){
        model.addAttribute("title", "Blog Delete");
        return "blog-delete";
    }
    @GetMapping("/blog-read")
    public String blogRead(Model model){
        model.addAttribute("title", "Blog Read");
        return "blog-read";
    }
}
