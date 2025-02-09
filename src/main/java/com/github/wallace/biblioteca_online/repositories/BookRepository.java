package com.github.wallace.biblioteca_online.repositories;

import com.github.wallace.biblioteca_online.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

    Book findByTitle(String title);
}
