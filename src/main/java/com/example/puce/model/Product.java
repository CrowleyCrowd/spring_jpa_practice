package com.example.puce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
    
    @Id
    private Integer id;
    private String name;
    private float price;

    // Constructor con datos
    public Product(Integer id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Constructor vacío
    public Product() {
        super();
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

}
