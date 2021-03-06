package com.dharani.registerservice.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data
public class User {

    @Id
    @GeneratedValue
    private int userId;
    @ApiModelProperty(notes = "Name of the User")
    private String name;
    private String email;
    private String password;
    private double phoneNo;
    //    Date dateOfBirth;
    private String doorNo_StreetName;
    private String district;
    private String state;
    private int pincode;
    private String country;

    /*@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "User_Id", referencedColumnName = "userId")
    private List<DateModel> dateList = new ArrayList<>();*/

}