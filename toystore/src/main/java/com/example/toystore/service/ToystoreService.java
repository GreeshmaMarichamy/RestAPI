package com.example.toystore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.toystore.model.Toystore;
import com.example.toystore.model.User;
import com.example.toystore.repository.ToystoreRepo;

@Service
public class ToystoreService {
@Autowired
ToystoreRepo toystoreRepo;
User user;

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
        toystoreAvail.setToyName(toystore.getToyName());
        toystoreAvail.setPrice(toystore.getPrice());
        toystoreAvail.setBrand(toystore.getBrand());
        toystoreAvail.setAge(toystore.getAge());
        // user.setToyStore(user.getToyStore());
        return toystoreRepo.saveAndFlush(toystoreAvail);
    }
    else
    {
        return null;
    }
}
public List<Toystore> sortBasedUponName(String field)
{
    return toystoreRepo.findAll(Sort.by(Sort.Direction.ASC,field));
}
public Page<Toystore> getToyWithPagination(int offset,int pageSize)
{
    return toystoreRepo.findAll(PageRequest.of(offset,pageSize));
}
}

