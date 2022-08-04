package com.example.demo.controller;

import com.example.demo.repository.entity.Suit;
import com.example.demo.repository.entity.SuitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class SuitController{

    final SuitRepo suitRepo;


    public SuitController(@Autowired SuitRepo suitRepo )
    {
        this.suitRepo = suitRepo;
    }

    @GetMapping
    public Iterable<Suit> getItems(){
        return suitRepo.findAll();
    }
}
