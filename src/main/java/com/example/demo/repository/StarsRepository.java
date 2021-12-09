package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.*;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface StarsRepository extends CrudRepository<Sales, Integer> {

}