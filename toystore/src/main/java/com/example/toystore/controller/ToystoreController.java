package com.example.toystore.controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.toystore.model.Toystore;
import com.example.toystore.service.ToystoreService;

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
    @GetMapping("/sort/{field}")
    public List<Toystore> sortToys(@PathVariable String field) {
        return toystoreService.sortBasedUponName(field);
    }
    @GetMapping("/pagination/{offset}/{pageSize}")
    public Page<Toystore> pageToys(@PathVariable int offset,@PathVariable int pageSize) {
        return toystoreService.getToyWithPagination(offset,pageSize);
    }
    
    @GetMapping("/gettoy/{toyId}")
    public Optional<Toystore> getToystoreById(@PathVariable Long toyId) {
        return toystoreService.getToystoreById(toyId);
    }
    @PutMapping("/edittoystore/{toyId}")
    public Toystore editToystore(@PathVariable Long toyId,@RequestBody Toystore toystore)
    {
        return toystoreService.editToystore(toyId, toystore);
    }
    @DeleteMapping("/deltoy/{userId}")
    public void deluser(@PathVariable Long toyId)
    {
        toystoreService.deluser(toyId);
    }
}