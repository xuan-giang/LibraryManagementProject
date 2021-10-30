package com.example.librarymanagementproject.service;

import com.example.librarymanagementproject.model.Book;
import com.example.librarymanagementproject.model.Category;
import com.example.librarymanagementproject.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImplement implements CategoryService{
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }

    @Override
    public Boolean createNewCategory(Category category) {
        categoryRepository.save(category);
        return true;
    }

    @Override
    public Category getById(int id) {
        return categoryRepository.getOne(id);
    }

    @Override
    public Boolean updateCategoryById(int id) {
        return null;
    }

    @Override
    public Boolean deleteCategoryById(int id) {
        categoryRepository.deleteById(id);
        return true;
    }

    @Override
    public Boolean updateQuantityCategoryById(int id) {
        Category category = getById(id);
        category.setQuantity(category.getQuantity()+1);
        createNewCategory(category);
        return true;
    }
}
