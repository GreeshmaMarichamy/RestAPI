package com.example.toystore1.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.toystore1.model.Toystore;
import com.example.toystore1.repo.ToystoreRepo;

@Service
public class ToystoreService {
@Autowired
ToystoreRepo toystoreRepo;
public Toystore addToystore(Toystore toystore)
{
    return toystoreRepo.save(toystore);
}

public List<Toystore> getToystores()
{
    return toystoreRepo.findAll();
}
public Optional<Toystore> getToystoreById(Long userId)
{
    return toystoreRepo.findById(userId);
}
public void deluser(Long userId)
{
    toystoreRepo.deleteById(userId);
}
public Toystore editToystore(Long userId,Toystore toystore)
{
    Toystore toystoreAvail=toystoreRepo.findById(userId).orElse(null);
    if(toystoreAvail!=null)
    {
        toystoreAvail.setUserName(toystore.getUserName());
        toystoreAvail.setEmailAddress(toystore.getEmailAddress());
        toystoreAvail.setPassword(toystore.getPassword());
        toystoreAvail.setConfirmPassword(toystore.getConfirmPassword());
        return toystoreRepo.saveAndFlush(toystoreAvail);
    }
    else
    {
        return null;
    }
}



}