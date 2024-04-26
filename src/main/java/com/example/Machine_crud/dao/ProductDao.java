
package com.example.Machine_crud.dao;
import com.example.Machine_crud.entities.Product;
import  org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Long> {
}