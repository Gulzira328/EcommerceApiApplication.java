package com.example.ecommerceapi.repository;

import com.example.ecommerceapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
