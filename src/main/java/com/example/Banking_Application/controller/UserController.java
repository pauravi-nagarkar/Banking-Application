package com.example.Banking_Application.controller;

import com.example.Banking_Application.dto.BankResponse;
import com.example.Banking_Application.dto.UserRequest;
import com.example.Banking_Application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/create-account")
    public BankResponse createAccount(@RequestBody UserRequest userRequest) {
        // Delegate the request to the service layer
        return userService.createAccount(userRequest);
    }
}
