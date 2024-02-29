package com.example.toystore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="toystore")
public class Toystore 
{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long toyId;
    String toyName;
    String price;
    String brand;
    int age;
    public Long getToyId() {
        return toyId;
    }
    public void setToyId(Long toyId) {
        this.toyId = toyId;
    }
    public String getToyName() {
        return toyName;
    }
    public void setToyName(String toyName) {
        this.toyName = toyName;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
}
