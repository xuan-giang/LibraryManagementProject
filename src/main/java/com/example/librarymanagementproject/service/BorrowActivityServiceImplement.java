package com.example.librarymanagementproject.service;

import com.example.librarymanagementproject.model.BorrowActivity;
import com.example.librarymanagementproject.repository.BorrowActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowActivityServiceImplement implements BorrowActivityService{
    @Autowired
    private BorrowActivityRepository borrowActivityRepository;

    @Override
    public List<BorrowActivity> getAllBorrowActivity() {
        return borrowActivityRepository.findAll();
    }

    @Override
    public Boolean createNewBorrowActivity(BorrowActivity borrowActivity) {
        borrowActivityRepository.save(borrowActivity);

        return true;
    }

    @Override
    public BorrowActivity getById(int id) {
        return borrowActivityRepository.getOne(id);
    }

    @Override
    public Boolean updateBorrowActivityById(int id) {
        return null;
    }

    @Override
    public Boolean deleteBorrowActivityById(int id) {
        borrowActivityRepository.deleteById(id);
        return true;
    }

    @Override
    public Boolean updateQuantityBookById(int id) {
        return null;
    }
}
