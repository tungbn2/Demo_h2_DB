package com.example.demo;

import java.util.List;

public interface BookService {
    void create(BookDTO dto);
    List<BookDTO> findAll();
}
