package com.github.wallace.biblioteca_online.controllers;

import com.github.wallace.biblioteca_online.entities.Book;
import com.github.wallace.biblioteca_online.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/novo")
    public String showTemplates(Model model) {
        model.addAttribute("book", new Book());
        return "Book-form";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Book book) {
        bookService.save(book);
        return "redirect:/books/novo";
    }
}
