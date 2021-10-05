package com.dharani.registerservice.service;



import com.dharani.registerservice.model.LoginModel;
import com.dharani.registerservice.model.User;

import java.util.List;

public interface RegisterService {
    void addUser(User user);
    User getUsers(String email);
}
