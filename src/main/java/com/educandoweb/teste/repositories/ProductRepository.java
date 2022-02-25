package com.educandoweb.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.teste.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
