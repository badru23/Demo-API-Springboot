package com.tutorial.api.services.impl;

import com.tutorial.api.models.entities.Product;
import com.tutorial.api.models.repositories.ProductRepositories;
import com.tutorial.api.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepositories productRepositories;

    @Override
    public Product save(Product product) {
        return productRepositories.save(product);
    }

    @Override
    public Product findById(Long id) {
        Optional<Product> product = productRepositories.findById(id);
        if(!product.isPresent()){
            return null;
        }
        return product.get();
    }

    @Override
    public List<Product> findAll() {
        return (List<Product>) productRepositories.findAll();
    }

    @Override
    public void deleteById(Long id) {
        productRepositories.deleteById(id);
    }
}
