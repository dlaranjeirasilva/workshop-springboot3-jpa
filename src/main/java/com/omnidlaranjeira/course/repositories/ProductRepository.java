package com.omnidlaranjeira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omnidlaranjeira.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
