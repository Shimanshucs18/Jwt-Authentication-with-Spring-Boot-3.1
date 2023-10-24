package com.jwt.example.services;

import com.jwt.example.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store=new ArrayList<>();


    public UserService() {
        store.add(new User(UUID.randomUUID().toString(),"Shimanshu sharma","shimanshu@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Abhishek sharma","abhishek@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Harsh sharma","harsh@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Ankit sharma","ankit@gmail.com"));
    }

    public List<User> getUser(){
        return this.store;
    }
}
