package com.omnidlaranjeira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omnidlaranjeira.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
