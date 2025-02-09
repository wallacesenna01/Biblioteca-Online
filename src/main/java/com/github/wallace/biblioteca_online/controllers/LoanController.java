package com.github.wallace.biblioteca_online.controllers;

import com.github.wallace.biblioteca_online.entities.Book;
import com.github.wallace.biblioteca_online.entities.Loan;
import com.github.wallace.biblioteca_online.entities.User;
import com.github.wallace.biblioteca_online.repositories.BookRepository;
import com.github.wallace.biblioteca_online.repositories.LoanRepository;
import com.github.wallace.biblioteca_online.repositories.UserRepository;
import com.github.wallace.biblioteca_online.services.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
@RequestMapping("/loans")
public class LoanController {

    @Autowired
    private LoanRepository loanRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private LoanService loanService;

    @GetMapping("/novo")
    public String mostrarTemplate(Model model) {
        model.addAttribute("loan", new Loan());
        return "Loan-form";
    }

    @PostMapping("/salvar")
    public String save(
            @RequestParam("user") String userName,
            @RequestParam("book") String bookTitle,
            @RequestParam("dataLoan") String dataLoan,
            @RequestParam("dataBorrow") String dataBorrow,
            Model model) {

        System.out.println("Método save() chamado!");

        try {
            loanService.save(userName,bookTitle,dataLoan,dataBorrow);
            return "redirect:/loans/novo";
        }
        catch (IllegalArgumentException e) {
            model.addAttribute("error", e.getMessage());
            return "erro";
        }
        }

}
