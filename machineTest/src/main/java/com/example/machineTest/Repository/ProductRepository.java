package com.example.machineTest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.machineTest.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
