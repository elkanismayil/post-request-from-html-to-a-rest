package com.example.ajax.controller;

import com.example.ajax.dto.BookDTO;
import com.example.ajax.dto.ServiceResponse;
import com.example.ajax.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService service;


    @PostMapping("/saveBook")
    public ResponseEntity<Object> addBook(@RequestBody BookDTO bookDTO) {
        BookDTO newBook = service.createBook(bookDTO);
        ServiceResponse<BookDTO> response = new ServiceResponse<>("success", newBook);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/getBooks")
    public ResponseEntity<Object> getAllBooks() {
        List<BookDTO> books = service.books();
        ServiceResponse<List<BookDTO>> response = new ServiceResponse<>("success", books);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
