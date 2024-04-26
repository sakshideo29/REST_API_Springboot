package com.example.Machine_crud.services;

import com.example.Machine_crud.entities.Product;
import org.springframework.data.domain.Page;

public interface ProductService {
    Page<Product> getAllProducts(int page);
    Product getProductById(Long id);
    Product createProduct(Product product);
    Product updateProduct(Long id, Product updatedProduct);
    String  deleteProductById(Long id);
}
