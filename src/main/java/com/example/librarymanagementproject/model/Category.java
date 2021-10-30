package com.example.librarymanagementproject.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int idOfCategory;

    private String idSach;

    private String name;

    private int quantity;

    public String getIdSach() {
        return idSach;
    }

    public void setIdSach(String idSach) {
        this.idSach = idSach;
    }

    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
    private Set<Book> bookList = new HashSet<>();
//    private List<Book> bookList = new ArrayList<Book>();

    // Contructor
    public Category() {
    }


    public Category(int id, String name, int quantity) {
        this.idOfCategory = id;
        this.name = name;
        this.quantity = quantity;
    }

//    public Category(int id, String name, int quantity, List<Book> bookList) {
//        this.id = id;
//        this.name = name;
//        this.quantity = quantity;
//        this.bookList = bookList;
//    }

    public Category(int id, String idSach, String name, int quantity, Set<Book> bookList) {
        this.idOfCategory = id;
        this.idSach = idSach;
        this.name = name;
        this.quantity = quantity;
        this.bookList = bookList;
    }


    // Getter, Setter



    public int getId() {
        return idOfCategory;
    }

    public void setId(int id) {
        this.idOfCategory = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Set<Book> getBookList() {
        return bookList;
    }

    public void setBookList(Set<Book> bookList) {
        this.bookList = bookList;
    }

//        public List<Book> getBookList() {
//        return bookList;
//    }
//
//    public void setBookList(List<Book> bookList) {
//        this.bookList = bookList;
//    }
}
