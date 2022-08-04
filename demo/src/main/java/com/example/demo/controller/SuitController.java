package com.example.demo.controller;

import com.example.demo.controller.dto.ItemDto;
import com.example.demo.repository.entity.Suit;
import com.example.demo.repository.entity.SuitRepo;
import com.example.demo.service.ItemService;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/suit")
public class SuitController{

    final ItemService itemService;

    public SuitController (@Autowired ItemService itemService) {this.itemService = itemService;}


    @GetMapping("/all")
    public Iterable<Suit> getSuits(){
        return itemService.all();
    }
    @PostMapping
    public Suit save(@RequestBody ItemDto itemDto )
    {
        return itemService.save( new Suit( itemDto ) );
    }
    @GetMapping("/{id}")
    public Suit findItemById( @PathVariable Integer id ){
        return itemService.findById( id );
    }
    @PutMapping( "/{id}" )
    public Suit update( @RequestBody ItemDto itemDto, @PathVariable Integer id )
    {
        Suit suit = itemService.findById( id );
        suit.setName( itemDto.getName() );
        suit.setDescription( itemDto.getDescription() );
        suit.setImageUrl( itemDto.getImageUrl() );
        return itemService.save( suit );
    }

    @DeleteMapping( "/{id}" )
    public void delete( @PathVariable Integer id )
    {
        itemService.delete( id );
    }
}
