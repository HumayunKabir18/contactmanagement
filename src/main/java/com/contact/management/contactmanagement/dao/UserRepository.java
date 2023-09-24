package com.contact.management.contactmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.contact.management.contactmanagement.entites.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    
}
