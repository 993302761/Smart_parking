package com.example.demo.Controller;

import com.example.demo.entiry.Point;
import com.example.demo.entiry.park;
import com.example.demo.entiry.user;
import com.example.demo.service.ParkServicelmpl;
import com.example.demo.service.userService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/App")
public class Appcontroller {
    @Autowired
    private userService userService;



    @RequestMapping(value = "/find",method = RequestMethod.POST)
    public user FindUser(@RequestBody String data)
    {
        Gson gson = new Gson();
        user user = gson.fromJson(data,user.class);
        user user0= userService.Find(user.getId(), user.getPassword());
//        System.out.println(user0.getName());
        if(user0.getId()==null)
            return null;
        return  user0;
    }




}
