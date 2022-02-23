package com.educandoweb.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.teste.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
