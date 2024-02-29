package com.example.toystore.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.toystore.model.Toystore;


@Repository
public interface ToystoreRepo extends JpaRepository<Toystore,Long>{
   
}
