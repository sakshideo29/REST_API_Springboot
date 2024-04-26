package com.example.Machine_crud.services;

import com.example.Machine_crud.dao.ProductDao;

import com.example.Machine_crud.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;


    private static final int DEFAULT_PAGE_SIZE = 10;

    @Override
    public Page<Product> getAllProducts(int page) {
        return productDao.findAll(PageRequest.of(page - 1, DEFAULT_PAGE_SIZE));
    }


    @Override
    public Product getProductById(Long id) {
        Optional<Product> optionalProduct = productDao.findById(id);
        return optionalProduct.orElse(null);
    }


    @PostMapping
    public Product createProduct( Product product) {
        System.out.println("product"+  product);
        return productDao.save(product);
    }


    @Override
    public Product updateProduct(Long id, Product updatedProduct) {

        Product existingProduct = productDao.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found with id: " + id));


        existingProduct.setName(updatedProduct.getName());
        existingProduct.setPrice(updatedProduct.getPrice());
        existingProduct.setCategory(updatedProduct.getCategory());


        return productDao.save(existingProduct);
    }

    public String deleteProductById(Long id) {
        if (productDao.existsById(id)) {
            productDao.deleteById(id);
            return "Product with ID " + id + " successfully deleted.";
        } else {
            return "Product with ID " + id + " does not exist.";
        }
    }

}
