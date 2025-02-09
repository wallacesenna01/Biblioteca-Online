package com.github.wallace.biblioteca_online.services;

import com.github.wallace.biblioteca_online.entities.Book;
import com.github.wallace.biblioteca_online.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book save(Book book) {
        return bookRepository.save(book);
    }
}
