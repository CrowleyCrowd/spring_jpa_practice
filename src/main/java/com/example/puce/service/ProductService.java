package com.example.puce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.puce.model.Product;
import com.example.puce.repository.ProductRepository;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository repository;

    public List<Product> listProducts() {
        return repository.findAll();
    }

    public void saveProduct(Product product) {
        repository.save(product);
    }

    public Product getProduct(Integer id) {
        return repository.findById(id).get();
    }

    public void deleteProduct(Integer id) {
        repository.deleteById(id);
    }

    public List<Product> findByName(String name) {
        return repository.findByName(name);
    }

    public List<Product> findByPriceGreaterThan(float price) {
        return repository.findByPriceGreaterThan(price);
    }

}
