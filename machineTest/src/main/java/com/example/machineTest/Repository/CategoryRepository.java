package com.example.machineTest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.machineTest.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
