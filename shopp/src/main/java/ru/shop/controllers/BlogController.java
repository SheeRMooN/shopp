package ru.shop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.shop.models.Post;
import ru.shop.repo.PostRepository;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class BlogController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/blog")
    public String block(Model model){
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("title", "Blog Package");
        model.addAttribute("posts", posts);
        return "blog-main";
    }
    @GetMapping("/blog/create")
    public String blogCreateGet(Model model){
        model.addAttribute("title", "Blog Create");
        return "blog-create";
    }
    @GetMapping("/blog/update")
    public String blogUpdate(Model model){
        model.addAttribute("title", "Blog Update");
        return "blog-update";
    }
    @GetMapping("/blog/delete")
    public String blogDelete(Model model){
        model.addAttribute("title", "Blog Delete");
        return "blog-delete";
    }
    @GetMapping("/blog/read")
    public String blogRead(Model model){
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("title", "Blog Read");
        model.addAttribute("posts", posts);
        return "blog-read";
    }

    @PostMapping("/blog/create")
    public String blogCreatePost(@RequestParam String title,
                                 @RequestParam String anons,
                                 @RequestParam String full_text,
                                 Model model){
        Post post = new Post(title, anons, full_text);
        postRepository.save(post);
        return "redirect:/blog";
    }
    @GetMapping("/blog/{id}")
    public String blogReadId(@PathVariable (value = "id") long id, Model model){
        Optional<Post> post = postRepository.findById(id);
        ArrayList<Post> postArray = new ArrayList<>();
        post.ifPresent(postArray::add);
        model.addAttribute("post",post);
        return "blog-read";
    }
}
