package com.example.demo.service;

import com.example.demo.repository.entity.Suit;
import com.example.demo.repository.entity.SuitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemServiceMySQL
        implements ItemService
{
    private final SuitRepo suitRepo;

    public ItemServiceMySQL(@Autowired SuitRepo suitRepo )
    {
        this.suitRepo = suitRepo;
    }

    @Override
    public Suit save(Suit suit )
    {
        return suitRepo.save( suit );
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public void delete(Integer id)
    {
        suitRepo.deleteById( id );

    }

    @Override
    public List<Suit> all()
    {
        List<Suit> result = new ArrayList<>();
        suitRepo.findAll().forEach( result::add );
        return result;
    }

    @Override
    public Suit findById( int id )
    {
        //TODO implement this method
        return null;
    }
}
