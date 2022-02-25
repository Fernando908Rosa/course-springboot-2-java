package com.educandoweb.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.teste.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
