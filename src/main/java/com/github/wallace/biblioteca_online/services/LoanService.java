package com.github.wallace.biblioteca_online.services;

import com.github.wallace.biblioteca_online.entities.Book;
import com.github.wallace.biblioteca_online.entities.Loan;
import com.github.wallace.biblioteca_online.entities.User;
import com.github.wallace.biblioteca_online.repositories.BookRepository;
import com.github.wallace.biblioteca_online.repositories.LoanRepository;
import com.github.wallace.biblioteca_online.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class LoanService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private LoanRepository loanRepository;

    public Loan save(String userName, String bookTitle, String dataLoan, String dataBorrow) {
       User user = userRepository.findByName(userName);
       Book book = bookRepository.findByTitle(bookTitle);

        if (user == null || book == null) {
            throw new IllegalArgumentException("Usuário ou Livro não encontrados.");
        }

        Loan loan = new Loan();
        loan.setUser(user);
        loan.setBook(book);
        loan.setDataLoan(LocalDate.parse(dataLoan));
        loan.setDataBorrow(LocalDate.parse(dataBorrow));

        return loanRepository.save(loan);

    }
}
