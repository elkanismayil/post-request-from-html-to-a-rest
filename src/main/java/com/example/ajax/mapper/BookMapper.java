package com.example.ajax.mapper;

import com.example.ajax.dto.BookDTO;
import com.example.ajax.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    BookDTO bookToBookDto(Book book);

    Book bookDtoToBook(BookDTO bookDTO);

    List<BookDTO> listBookToListBookDto(List<Book> books);
}
