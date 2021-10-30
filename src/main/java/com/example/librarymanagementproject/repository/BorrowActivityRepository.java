package com.example.librarymanagementproject.repository;

import com.example.librarymanagementproject.model.BorrowActivity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowActivityRepository extends JpaRepository<BorrowActivity, Integer> {
}
