package com.example.Machine_crud.controller;


import com.example.Machine_crud.entities.Product;
import com.example.Machine_crud.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts(@RequestParam(defaultValue = "1") int page) {
        Page<Product> productPage = productService.getAllProducts(page);
        return productPage.getContent();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id) {
        return productService.getProductById(id);
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable("id") Long id, @RequestBody Product updatedProduct) {
        return productService.updateProduct(id, updatedProduct);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long id) {
        productService.deleteProductById(id);
    }


}