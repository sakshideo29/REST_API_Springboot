package com.example.Machine_crud.controller;

import com.example.Machine_crud.entities.Category;
import com.example.Machine_crud.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity
            <List<Category>> getAllCategories(@RequestParam(defaultValue = "0") int page) {
        Pageable pageable = PageRequest.of(page-1, 10); // Default page size is 10
        Page<Category> categories = categoryService.getAllCategories(pageable);
        return ResponseEntity.ok(categories.getContent());
    }


    @PostMapping
    public ResponseEntity<Category> createCategory(@RequestBody Category category) {
        Category createdCategory = categoryService.createCategory(category);
        return new ResponseEntity<>(createdCategory, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable("id") Long id) {
        Category category = categoryService.getCategoryById(id);
        if (category != null) {
            return ResponseEntity.ok(category);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Category> updateCategory(@PathVariable("id") Long id, @RequestBody Category updatedCategory) {
        Category category = categoryService.getCategoryById(id);
        if (category != null) {
            updatedCategory.setId(id);
            categoryService.updateCategory(updatedCategory);
            return ResponseEntity.ok(updatedCategory);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategory(@PathVariable("id") Long id) {
        Category category = categoryService.getCategoryById(id);
        if (category != null) {
            categoryService.deleteCategory(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}

//
//    @PostMapping
//    public ResponseEntity<Category> createCategory(@RequestBody Category category) {
//        Category createdCategory = categoryService.createCategory(category);
//        return ResponseEntity.status(HttpStatus.CREATED).body(createdCategory);
//    }







