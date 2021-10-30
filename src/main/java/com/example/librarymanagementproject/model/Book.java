package com.example.librarymanagementproject.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int idOfBook;

    private String idBook;

    private String name;

    private String author;

    private String publisher;

    private int quantity;

    @Column(name = "imageUrl")
    private String imageUrl;

    @OneToMany(mappedBy="book",cascade = CascadeType.ALL)
    private List<BorrowActivity> borrowActivities = new ArrayList<BorrowActivity>();

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @JoinColumn(name = "category_id")
    private Category category;

    // Contructor
    public Book() {
    }

    public Book(int id, String idBook, String name, String author, String publisher, int quantity, String imageUrl) {
        this.idOfBook = id;
        this.idBook = idBook;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
        this.imageUrl = imageUrl;
    }

    public Book(int id, String idBook, String name, String author, String publisher, int quantity, String imageUrl, Category category) {
        this.idOfBook = id;
        this.idBook = idBook;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
        this.imageUrl = imageUrl;
        this.category = category;
    }


    // Getter, Setter


    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }

    public int getId() {
        return idOfBook;
    }

    public void setId(int id) {
        this.idOfBook = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<BorrowActivity> getBorrowActivities() {
        return borrowActivities;
    }

    public void setBorrowActivities(List<BorrowActivity> borrowActivities) {
        this.borrowActivities = borrowActivities;
    }


}
