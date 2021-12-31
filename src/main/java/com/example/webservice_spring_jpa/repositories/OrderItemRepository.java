package com.example.webservice_spring_jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webservice_spring_jpa.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
