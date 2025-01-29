package com.example.Banking_Application.service;

import com.example.Banking_Application.dto.BankResponse;
import com.example.Banking_Application.dto.UserRequest;

public interface UserService {

    BankResponse createAccount(UserRequest userRequest);


}
