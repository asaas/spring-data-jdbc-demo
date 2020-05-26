package com.example.demo.infrastructure;

import com.example.demo.domain.Book;
import com.example.demo.domain.BookRepository;
import org.springframework.data.repository.Repository;

public interface BookRepositoryImpl extends BookRepository, Repository<Book, Integer> {
}
