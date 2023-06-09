package com.javaspringboot.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaspringboot.spring.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
