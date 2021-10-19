package com.dharani.registerservice.service;



import com.dharani.registerservice.model.DateModel;
import com.dharani.registerservice.model.User;

import java.util.List;


public interface RegisterService {
    User addUser(User user);

    User getUsers(String email);
    List<DateModel> getLoginDate(int userId);

    User getUserById(int id);
}