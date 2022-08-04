package com.example.demo.repository.entity;

import com.example.demo.repository.entity.Suit;
import org.springframework.data.jpa.repository.JpaRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called SuitRepository
// CRUD refers Create, Read, Update, Delete
public interface SuitRepo extends JpaRepository<Suit, Integer>
{
}