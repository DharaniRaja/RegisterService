package com.dharani.registerservice.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue
    private int userId;
    private String name;
    private String email;
    private String password;
    private double phoneNo;
    //  Date dateOfBirth;
    String address;

}
