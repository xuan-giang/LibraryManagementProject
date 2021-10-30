package com.example.librarymanagementproject.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Reader {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String idReader;

    private String name;

    private String gender;

    private String email;

    private String phone;

    private String address;


    @OneToMany(fetch = FetchType.LAZY,mappedBy="reader",cascade = CascadeType.ALL)
    private List<BorrowActivity> borrowActivities = new ArrayList<BorrowActivity>();

    // Contructor
    public Reader() {
    }

    public Reader(int id, String idReader, String name, String gender, String email, String phone, String address) {
        this.id = id;
        this.idReader = idReader;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public Reader(int id, String name, String gender, String email, String phone, String address, List<BorrowActivity> borrowActivities) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.borrowActivities = borrowActivities;
    }
    // Getter, Setter


    public String getIdReader() {
        return idReader;
    }

    public void setIdReader(String idReader) {
        this.idReader = idReader;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<BorrowActivity> getBorrowActivities() {
        return borrowActivities;
    }

    public void setBorrowActivities(List<BorrowActivity> borrowActivities) {
        this.borrowActivities = borrowActivities;
    }
}
