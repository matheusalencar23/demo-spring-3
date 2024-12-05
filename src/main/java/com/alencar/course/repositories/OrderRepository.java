package com.alencar.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alencar.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
