package com.example.blog.service;

import com.example.blog.entity.Category;

import java.util.List;

public interface CategoryService {

    Category createCategory(Category category);

    List<Category> getAllCategories();

    Category getCategoryById(Long id);

    Category updateCategory(Long id, Category updatedCategory);

    void deleteCategory(Long id);
}
