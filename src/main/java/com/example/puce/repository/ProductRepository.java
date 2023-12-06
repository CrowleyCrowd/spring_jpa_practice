package com.example.puce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.puce.model.Product;


//Se puede usar CrudRepository en lugar de JpaRepository
public interface ProductRepository extends JpaRepository <Product, Integer> {
    List<Product> findByName(String name);
    List<Product> findByPriceGreaterThan(float price);
}
