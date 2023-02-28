package com.tutorial.api.services;

import com.tutorial.api.models.entities.Product;

import java.util.List;

public interface ProductService  {
    Product save(Product product);
    Product findById(Long id);
    List<Product> findAll();

    void deleteById(Long id);
}
