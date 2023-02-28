package com.tutorial.api.controllers;

import com.tutorial.api.dto.ResponeData;
import com.tutorial.api.models.entities.Product;
import com.tutorial.api.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/create")
    public ResponseEntity<ResponeData<Product>> create(@Valid @RequestBody Product product, Errors errors){
        ResponeData<Product> responeData = new ResponeData<>();
        if (errors.hasErrors()){
            for (ObjectError objectError : errors.getAllErrors()){
                responeData.getMessage().add(objectError.getDefaultMessage());
            }
            responeData.setStatus(false);
            responeData.setPayload(null);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responeData);
        }
        responeData.setStatus(true);
        responeData.setPayload(productService.save(product));
        return ResponseEntity.ok(responeData);
    }

    @PutMapping("/update")
    public ResponseEntity<ResponeData<Product>> update(@Valid @RequestBody Product product, Errors errors){
        ResponeData<Product> responeData = new ResponeData<>();
        if (errors.hasErrors()){
            for (ObjectError objectError : errors.getAllErrors()){
                responeData.getMessage().add(objectError.getDefaultMessage());
            }
            responeData.setStatus(false);
            responeData.setPayload(null);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responeData);
        }
        responeData.setStatus(true);
        responeData.setPayload(productService.save(product));
        return ResponseEntity.ok(responeData);
    }
    @GetMapping("/findId/{id}")
    public Product findById(@PathVariable("id") Long id){
        return productService.findById(id);
    }

    @GetMapping("/findAll")
    public List<Product> findAll(){
        return productService.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Long id){
        productService.deleteById(id);
    }


}
