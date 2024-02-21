package com.example.toystore1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.toystore1.model.Toystore;

@Repository
public interface ToystoreRepo extends JpaRepository<Toystore,Long>{
    
}