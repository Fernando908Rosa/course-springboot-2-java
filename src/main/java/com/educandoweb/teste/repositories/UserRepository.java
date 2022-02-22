package com.educandoweb.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.teste.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
