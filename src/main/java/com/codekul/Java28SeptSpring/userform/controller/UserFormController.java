package com.codekul.Java28SeptSpring.userform.controller;

import com.codekul.Java28SeptSpring.userform.domain.UserForm;
import com.codekul.Java28SeptSpring.userform.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserFormController {

    @Autowired
    private UserRepo userRepo;

    @PostMapping("saveUserForm")
    public String saveUser(@RequestBody UserForm user){
        userRepo.save(user);
        return "user saved..";
    }
}
