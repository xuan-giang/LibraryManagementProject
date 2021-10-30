package com.example.librarymanagementproject.model;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Date;

@Entity
public class BorrowActivity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    private Date borrowFrom;

    private Date borrowTo;

    @Column(name = "actualReturn", nullable = true)
    private Date actualReturn;

    private String deposit;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "reader_id", nullable = false)
    private Reader reader;

    // Contructor
    public BorrowActivity() {
    }

    public BorrowActivity(int id, Date borrowFrom, Date borrowTo, Date actualReturn, String deposit, Book book, Reader reader) {
        this.id = id;
        this.borrowFrom = borrowFrom;
        this.borrowTo = borrowTo;
        this.actualReturn = actualReturn;
        this.deposit = deposit;
        this.book = book;
        this.reader = reader;
    }
    // Getter, Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getBorrowFrom() {
        return borrowFrom;
    }

    public void setBorrowFrom(Date borrowFrom) {
        this.borrowFrom = borrowFrom;
    }

    public Date getBorrowTo() {
        return borrowTo;
    }

    public void setBorrowTo(Date borrowTo) {
        this.borrowTo = borrowTo;
    }

    public Date getActualReturn() {
        return actualReturn;
    }

    public void setActualReturn(Date actualReturn) {
        this.actualReturn = actualReturn;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }
}
