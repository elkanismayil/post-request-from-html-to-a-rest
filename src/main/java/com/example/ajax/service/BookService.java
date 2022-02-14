package com.example.ajax.service;

import com.example.ajax.dto.BookDTO;

import java.util.List;

public interface BookService {
    BookDTO createBook(BookDTO bookDTO);
    List<BookDTO> books();
}
