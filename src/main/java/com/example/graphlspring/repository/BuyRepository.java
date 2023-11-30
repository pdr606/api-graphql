package com.example.graphlspring.repository;

import com.example.graphlspring.model.Buy;
import com.example.graphlspring.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyRepository extends JpaRepository<Buy, Long> {
}
