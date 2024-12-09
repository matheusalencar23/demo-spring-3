package com.alencar.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alencar.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
