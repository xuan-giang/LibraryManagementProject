package com.example.librarymanagementproject.service;

import com.example.librarymanagementproject.model.Book;
import com.example.librarymanagementproject.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImplement implements BookService{

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getAllBook() {
        return bookRepository.findAll();
    }

    @Override
    public Boolean createNewBook(Book book) {
        bookRepository.save(book);
        return true;
    }

    @Override
    public Boolean updateBookById(int id) {
        return null;
    }

    @Override
    public Boolean deleteBookById(int id) {
        bookRepository.deleteById(id);

        return true;
    }

    @Override
    public Boolean deleteBookById2(int id) {
        bookRepository.deleteById(id);
        return true;
    }

    @Override
    public Book getById(int id) {
        return bookRepository.getOne(id);
    }
}
