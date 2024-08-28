package com.Banking_app.spring.boot.service.impl;

import com.Banking_app.spring.boot.dto.BankResponse;
import com.Banking_app.spring.boot.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);

}
