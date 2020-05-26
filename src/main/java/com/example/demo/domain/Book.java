package com.example.demo.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Book {
    @Id
    Integer id;
    String title;
}
