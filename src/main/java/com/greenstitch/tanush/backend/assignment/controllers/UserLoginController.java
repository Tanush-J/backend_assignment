package com.greenstitch.tanush.backend.assignment.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greenstitch.tanush.backend.assignment.models.User;
import com.greenstitch.tanush.backend.assignment.services.UserService;

@RestController
public class UserLoginController {
    
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return this.userService.getUser();
    }
}
