package com.example.puce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.puce.model.Product;
import com.example.puce.service.ProductService;




@RestController
@RequestMapping("/api/v1")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public List<Product> listProducts() {
        return service.listProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable Integer id) {
        return service.getProduct(id);
    }
    
    @PostMapping("/products")
    public Product saveProduct(@RequestBody Product product) {
        service.saveProduct(product);
        return product;
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable Integer id) {
        service.deleteProduct(id);
    }

    @PutMapping("products/{id}")
    public Product updateProduct (@RequestBody Product product, @PathVariable Integer id) {
        service.saveProduct(product);
        Product productUpdated = service.getProduct(id);
        return productUpdated;
    }


    
}
