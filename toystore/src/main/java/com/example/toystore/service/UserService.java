package com.example.toystore.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.toystore.model.User;
import com.example.toystore.repository.UserRepo;

@Service
public class UserService {
@Autowired
UserRepo userRepo;
public User addUser(User user)
{
    return userRepo.save(user);
}

public List<User> getUsers()
{
    return userRepo.findAll();
}
public Optional<User> getUserById(Long userId)
{
    return userRepo.findById(userId);
}
public void deluser(Long userId)
{
    userRepo.deleteById(userId);
}
public User editUser(Long userId,User User)
{
    User UserAvail=userRepo.findById(userId).orElse(null);
    if(UserAvail!=null)
    {
        UserAvail.setUserName(User.getUserName());
        UserAvail.setEmailAddress(User.getEmailAddress());
        UserAvail.setToyId(User.getToyId());
        UserAvail.setGender(User.getGender());
        return userRepo.saveAndFlush(UserAvail);
    }
    else
    {
        return null;
    }
}



}
