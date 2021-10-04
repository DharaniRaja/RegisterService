package com.dharani.registerservice.service;

import com.dharani.registerservice.model.LoginModel;
import com.dharani.registerservice.model.User;
import com.dharani.registerservice.repository.UserRepository;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class RegisterServiceImpl implements RegisterService{

    @Autowired
    UserRepository userRepository;
    RestTemplate restTemplate = new RestTemplate();

    @Override
    public User addUser(User user) {
        userRepository.save(user);
        return null;
    }

    @Override
    public List<User> getUsers() {
        String url = "http://localhost:8089/RegDetials/getAll";
        ResponseEntity<User[]> entity = restTemplate.getForEntity(url, User[].class);
        List<User> list = Arrays.asList(entity.getBody());
        return list;
    }
}
