package com.example.demo.service;

import com.example.demo.entiry.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class userService implements UserService {

@Autowired
private UserService userService;

    @Override
    public user Find(String id, String password) {
        return userService.Find(id, password);
    }

    @Override
    public boolean Add(user user) {
        return false;
    }

    @Override
    public boolean Del(String id) {
        return false;
    }

    @Override
    public boolean Update(String id, String password, String name) {
        return false;
    }
}
