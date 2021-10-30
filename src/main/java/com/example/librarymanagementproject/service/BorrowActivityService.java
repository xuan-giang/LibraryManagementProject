package com.example.librarymanagementproject.service;

import com.example.librarymanagementproject.model.BorrowActivity;


import java.util.List;

public interface BorrowActivityService {
    List<BorrowActivity> getAllBorrowActivity();

    Boolean createNewBorrowActivity(BorrowActivity borrowActivity);

    BorrowActivity getById(int id);

    Boolean updateBorrowActivityById(int id);

    Boolean deleteBorrowActivityById(int id);

    Boolean updateQuantityBookById(int id);
}
