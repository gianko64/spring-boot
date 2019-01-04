package com.quicktutorials.learnmicroservices.AccountMicroservice.controllers;

import com.quicktutorials.learnmicroservices.AccountMicroservice.entities.User;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello everyone!";
    }

    @RequestMapping("/newuser1")
    public String addUser(User user){
        return "User added correctly " + user.getId()+ " " + user.getUsername();
    }
}
