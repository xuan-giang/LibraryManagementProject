package com.example.librarymanagementproject.repository;

import com.example.librarymanagementproject.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
