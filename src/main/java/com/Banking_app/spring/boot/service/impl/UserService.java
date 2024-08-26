package com.Banking_app.spring.boot.service.impl;

import com.Banking_app.spring.boot.dto.BankResponse;
import com.Banking_app.spring.boot.dto.UserRequest;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    BankResponse createAccount(UserRequest userRequest);

}
