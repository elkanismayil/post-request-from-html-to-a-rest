package com.example.ajax.service;

import com.example.ajax.dto.BookDTO;
import com.example.ajax.entity.Book;
import com.example.ajax.mapper.BookMapper;
import com.example.ajax.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository repository;

    @Autowired
    private BookMapper mapper;

    @Override
    public BookDTO createBook(BookDTO bookDTO) {
        Book book = mapper.bookDtoToBook(bookDTO);
        Book savedBook = repository.save(book);
        return mapper.bookToBookDto(savedBook);
    }

    @Override
    public List<BookDTO> books() {
        List<Book> bookList = repository.findAll();
        return mapper.listBookToListBookDto(bookList);
    }
}
