package com.example.toystore.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.toystore.model.User;
import com.example.toystore.service.UserService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class UserController {
@Autowired
UserService userService;
    @PostMapping("/adduser")
    public User addUser(@RequestBody User User) {
        
        return userService.addUser(User);
    }
    
    @GetMapping("/getuser")
    public List<User> getUsers() {
        return userService.getUsers();
    }
   
    
    @GetMapping("/getuser/{userId}")
    public Optional<User> getUserById(@PathVariable Long userId) {
        return userService.getUserById(userId);
    }
    
    @PutMapping("/editUser/{userId}")
    public User editUser(@PathVariable Long userId,@RequestBody User User)
    {
        return userService.editUser(userId, User);
    }
    @DeleteMapping("/deluser/{userId}")
    public void deluser(@PathVariable Long userId)
    {
        userService.deluser(userId);
    }
}
