package com.dharani.registerservice.controller;

import com.dharani.registerservice.model.LoginModel;


import com.dharani.registerservice.model.DateModel;
import com.dharani.registerservice.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import com.dharani.registerservice.model.User;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @PostMapping("/add")
    public User getUserDetails(@RequestBody final User user) {
        registerService.addUser(user);
        return user;

    }

    @GetMapping("/login/{email}")
    public User getAllUser(@PathVariable String email) {
        User users = registerService.getUsers(email);
        System.out.println(users.getName());
        return users;
    }
    @GetMapping("/date/{userId}")
    public ResponseEntity<List<DateModel>> getAllDate(@PathVariable("userId") int userId)
    {
        List<DateModel> list = registerService.getLoginDate(userId);
        return new ResponseEntity<List<DateModel>>(list, HttpStatus.OK);
    }

    @GetMapping("/getUser/{id}")
    public User getUserById(@PathVariable("id") int userId)
    {
        return registerService.getUserById(userId);
    }
}