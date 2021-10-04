package com.dharani.registerservice.controller;



import com.dharani.registerservice.model.LoginModel;
import com.dharani.registerservice.model.User;
import com.dharani.registerservice.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class RegisterController {

    @Autowired
    RegisterService registerService;

    @PostMapping("/add")
    public User getUserDetials(@RequestBody User user){
        registerService.addUser(user);
        return user;

    }
    @GetMapping("/login")
    public List<User> getAllUser(){
        List<User> users = registerService.getUsers();
        return users;
    }
}
