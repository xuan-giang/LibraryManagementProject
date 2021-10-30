package com.example.librarymanagementproject.service;

import com.example.librarymanagementproject.model.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBook();

    Boolean createNewBook(Book book);

    Boolean updateBookById(int id);

    Boolean deleteBookById(int id);

    Boolean deleteBookById2(int id);

    Book getById(int id);
}
