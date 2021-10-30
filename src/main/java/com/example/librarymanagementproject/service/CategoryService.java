package com.example.librarymanagementproject.service;


import com.example.librarymanagementproject.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategory();

    Boolean createNewCategory(Category category);

    Category getById(int id);

    Boolean updateCategoryById(int id);

    Boolean deleteCategoryById(int id);

    Boolean updateQuantityCategoryById(int id);
}
