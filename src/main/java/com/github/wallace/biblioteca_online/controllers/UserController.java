package com.github.wallace.biblioteca_online.controllers;

import com.github.wallace.biblioteca_online.entities.User;
import com.github.wallace.biblioteca_online.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/novo")
    public String save(Model model) {
        model.addAttribute("user", new User());
        return "User-form";
    }

    @PostMapping("/salvar")
    public String save(@ModelAttribute User user) {
        userService.save(user);
        return "redirect:/users/novo";
    }
}
