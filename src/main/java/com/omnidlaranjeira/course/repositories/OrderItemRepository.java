package com.omnidlaranjeira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omnidlaranjeira.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
