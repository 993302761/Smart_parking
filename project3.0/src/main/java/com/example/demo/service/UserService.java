package com.example.demo.service;

import com.example.demo.entiry.user;

public interface UserService {
    public user Find(String id,String password);

    public boolean Add(user user);

    public boolean Del(String id);

    public boolean Update(String id,String password,String name);

}
