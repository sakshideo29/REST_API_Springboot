package com.example.Machine_crud.dao;

import com.example.Machine_crud.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category, Long> {
}
