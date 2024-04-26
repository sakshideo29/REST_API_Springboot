package com.example.Machine_crud.services;
import com.example.Machine_crud.entities.Category;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface CategoryService {
    Page<Category> getAllCategories(Pageable pageable);
    Category createCategory(Category category);
    Category getCategoryById(Long id);
    Category updateCategory(Category category);
    void deleteCategory(Long id);
}
