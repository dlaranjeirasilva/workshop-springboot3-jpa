package com.omnidlaranjeira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omnidlaranjeira.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
