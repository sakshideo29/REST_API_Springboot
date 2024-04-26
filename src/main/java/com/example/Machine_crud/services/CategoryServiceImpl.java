package com.example.Machine_crud.services;

import com.example.Machine_crud.dao.CategoryDao;
import com.example.Machine_crud.entities.Category;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public Page<Category> getAllCategories(Pageable pageable) {
        return categoryDao.findAll(pageable);
    }

    @Override
    public Category createCategory(Category category) {
        return categoryDao.save(category);
    }

    @Override
    public Category getCategoryById(Long id) {
        return categoryDao.findById(id).orElse(null);
    }

    @Override
    public Category updateCategory(Category category) {
        return categoryDao.save(category);
    }

    @Override
    public void deleteCategory(Long id) {
        categoryDao.deleteById(id);
    }



}
