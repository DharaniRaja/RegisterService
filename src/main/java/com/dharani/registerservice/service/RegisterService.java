package com.dharani.registerservice.service;



import com.dharani.registerservice.model.LoginModel;
import com.dharani.registerservice.model.User;

import java.util.List;

public interface RegisterService {
    User addUser(User user);
    List<User> getUsers();
}
