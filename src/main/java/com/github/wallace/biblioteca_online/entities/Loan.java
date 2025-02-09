package com.github.wallace.biblioteca_online.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "loans")
public class Loan {

    public Loan() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "book_id", unique = true, nullable = false)
    private Book book;

    @OneToOne
    @JoinColumn(name = "user_id" , unique = true, nullable = false)
    private User user;

    private LocalDate dataLoan;

    private LocalDate dataBorrow;

    public Loan(Long id, Book book, User user, LocalDate dataLoan, LocalDate dataBorrow) {
        this.id = id;
        this.book = book;
        this.user = user;
        this.dataLoan = dataLoan;
        this.dataBorrow = dataBorrow;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getDataLoan() {
        return dataLoan;
    }

    public void setDataLoan(LocalDate dataLoan) {
        this.dataLoan = dataLoan;
    }

    public LocalDate getDataBorrow() {
        return dataBorrow;
    }

    public void setDataBorrow(LocalDate dataBorrow) {
        this.dataBorrow = dataBorrow;
    }
}
