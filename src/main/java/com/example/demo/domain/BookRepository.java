package com.example.demo.domain;

import java.util.List;
import java.util.Optional;

public interface BookRepository {
    Book save(Book book);
    List<Book> findAll();
    Boolean existsById(Integer id);
    Optional<Book> findById(Integer id);
    void delete(Book book);
}
