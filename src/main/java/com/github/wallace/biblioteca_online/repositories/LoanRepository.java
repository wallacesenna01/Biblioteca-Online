package com.github.wallace.biblioteca_online.repositories;

import com.github.wallace.biblioteca_online.entities.Book;
import com.github.wallace.biblioteca_online.entities.Loan;
import com.github.wallace.biblioteca_online.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LoanRepository extends JpaRepository<Loan, Long> {

    Optional<Loan> findByUserAndBook(User user, Book book);
}
