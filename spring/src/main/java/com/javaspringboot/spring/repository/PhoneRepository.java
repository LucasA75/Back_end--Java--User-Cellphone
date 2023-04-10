package com.javaspringboot.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaspringboot.spring.model.Phone;

public interface PhoneRepository extends JpaRepository<Phone,Long>{
    
}
