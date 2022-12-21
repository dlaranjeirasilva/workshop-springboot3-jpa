package com.omnidlaranjeira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omnidlaranjeira.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
