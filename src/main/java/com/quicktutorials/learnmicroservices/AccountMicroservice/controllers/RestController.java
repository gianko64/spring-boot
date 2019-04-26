package com.quicktutorials.learnmicroservices.AccountMicroservice.controllers;

import com.quicktutorials.learnmicroservices.AccountMicroservice.entities.User;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
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

    @RequestMapping("/newuser2")
    public String addUserValid(@Valid User user){
        return "User added correctly " + user.getId()+ " " + user.getUsername();
    }

    @RequestMapping("/newuser3")
    public String addUserValidPlusBinding(@Valid User user, BindingResult result){
        if(result.hasErrors()){
            return result.toString();
        }
        return "User added correctly " + user.getId()+ " " + user.getUsername();
    }

    @RequestMapping("/newuser4")
    public String addUserValidPlusBinding2(User user, BindingResult result){
        UserValidator userValidator = new UserValidator();
        userValidator.validate(user, result);

        if(result.hasErrors()){
            return result.toString();
        }
        return "User added correctly " + user.getId()+ " " + user.getUsername();
    }

    /*----------------------INNER CLASS--------------------------------*/
    private class UserValidator implements Validator {

        @Override
        public boolean supports(Class<?> aClass) {
            return User.class.equals(aClass);
        }

        @Override
        public void validate(Object o, Errors errors) {
            User user = (User) o;
            if(user.getPassword().length() < 8){
                errors.rejectValue("password", "the password must be at least 8 chars long!");
            }
        }
    /*----------------------INNER CLASS--------------------------------*/
    }
}
