package com.dharani.registerservice.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
public class LoginModel {

    private String email;
    private String password;
}
