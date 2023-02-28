package com.tutorial.api.models.repositories;

import com.tutorial.api.models.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepositories extends CrudRepository<Product , Long> {
}
