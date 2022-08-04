package com.example.demo.service;

import com.example.demo.repository.entity.Suit;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface ItemService
{
    Suit save( Suit Suit );

    boolean delete( int id );

    void delete(Integer id);

    List<Suit> all();

    Suit findById(int id );

}