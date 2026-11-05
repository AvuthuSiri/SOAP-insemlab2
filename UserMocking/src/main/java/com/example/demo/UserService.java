package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User getUserById(int id) {
        return new User(id, "John");
    }
}