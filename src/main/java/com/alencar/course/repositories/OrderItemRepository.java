package com.alencar.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alencar.course.entities.OrderItem;
import com.alencar.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
