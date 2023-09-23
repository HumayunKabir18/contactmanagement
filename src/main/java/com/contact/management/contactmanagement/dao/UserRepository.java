package com.contact.management.contactmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.contact.management.contactmanagement.entites.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    
}
