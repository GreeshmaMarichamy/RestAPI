package com.example.toystore.model;



import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    long userId;
    String userName;
    String emailAddress;
    Long toyId;
    String gender;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="users_id")
    List<Toystore> toyStore;
    
    public long getUserId() {
        return userId;
    }
    public void setUserId(long userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public Long getToyId() {
        return toyId;
    }
    public void setToyId(Long toyId) {
        this.toyId = toyId;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    // public Toystore getToyStore() {
    //     return toyStore;
    // }
    // public void setToyStore(Toystore toyStore) {
    //     this.toyStore = toyStore;
    // }
    public List<Toystore> getToyStore() {
        return toyStore;
    }
    public void setToyStore(List<Toystore> toyStore) {
        this.toyStore = toyStore;
    }
    
}