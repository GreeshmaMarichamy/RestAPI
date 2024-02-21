package com.example.toystore1.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.toystore1.model.Toystore;
import com.example.toystore1.service.ToystoreService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class ToystoreController {
@Autowired
ToystoreService toystoreService;
    @PostMapping("/addtoy")
    public Toystore addToystore(@RequestBody Toystore toystore) {
        
        return toystoreService.addToystore(toystore);
    }
    
    @GetMapping("/gettoy")
    public List<Toystore> getToystores() {
        return toystoreService.getToystores();
    }
    
    @GetMapping("/gettoy/{userId}")
    public Optional<Toystore> getToystoreById(@PathVariable Long userId) {
        return toystoreService.getToystoreById(userId);
    }
    @PutMapping("/edittoystore/{userId}")
    public Toystore editToystore(@PathVariable Long userId,@RequestBody Toystore toystore)
    {
        return toystoreService.editToystore(userId, toystore);
    }
    @DeleteMapping("/deltoy/{userId}")
    public void deluser(@PathVariable Long userId)
    {
        toystoreService.deluser(userId);
    }
}