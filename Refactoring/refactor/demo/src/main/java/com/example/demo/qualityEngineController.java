package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
public class qualityEngineController {

    @GetMapping("/")
    public String index() {
        return "Greetings from hamara basket!";
    }



    @PostMapping(path = "/item", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Item> addAnItem(@RequestBody Item item){
        Model.getModel().addItem(item);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(item.getBatch_ID())
                .toUri();

        return ResponseEntity.created(uri)
                .body(item);
    }
    @GetMapping("/item/{id}")
    public ResponseEntity<Item> read(@PathVariable("id") int id) {
        Item[] Items= Model.getModel().getAll();

        for(Item i: Items){
            if(i.getBatch_ID() == id){
                return ResponseEntity.ok(i);
            }

        }
        return ResponseEntity.notFound().build();
            }




}
