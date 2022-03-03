package com.educandoweb.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.teste.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
