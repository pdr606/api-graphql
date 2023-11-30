package com.example.graphlspring.repository;

import com.example.graphlspring.model.Client;
import com.example.graphlspring.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
