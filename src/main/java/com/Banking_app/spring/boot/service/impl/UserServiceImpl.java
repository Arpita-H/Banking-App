package com.Banking_app.spring.boot.service.impl;

import com.Banking_app.spring.boot.dto.AccountInfo;
import com.Banking_app.spring.boot.dto.BankResponse;
import com.Banking_app.spring.boot.dto.UserRequest;
import com.Banking_app.spring.boot.entity.User;
import com.Banking_app.spring.boot.repository.UserRepository;
import com.Banking_app.spring.boot.utils.AccountUtils;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public BankResponse createAccount(UserRequest userRequest) {
        /**
         * Creating an account - saving a new user into the db
         * check if user is already has an account
         */
        if(userRepository.existsByEmail(userRequest.getEmail())) {
    BankResponse response = BankResponse.builder()
        .responseCode(AccountUtils.ACCOUNT_EXISTS_CODE)
        .responseMessage(AccountUtils.ACCOUNT_EXISTS_MESSAGE)
            .accountInfo(null)
        .build();
            return response;
        }

        User newUser = User.builder()
                .firstName(userRequest.getFirstName())
                .lastName(userRequest.getLastName())
                .otherName(userRequest.getOtherName())
                .gender(userRequest.getGender())
                .address(userRequest.getAddress())
                .stateOfOrigin(userRequest.getStateOfOrigin())
                .accountNumber(AccountUtils.generateAccountNumber())
                .accountBalance(BigDecimal.ZERO)
                .email(userRequest.getEmail())
                .phoneNumber(userRequest.getPhoneNumber())
                .alternativePhoneNumber(userRequest.getAlternativePhoneNumber())
                .status("ACTIVE")
                .build();

            User savedUser = userRepository.save(newUser);
            return BankResponse.builder()
                    .responseCode(AccountUtils.ACCOUNT_CREATION_MESSAGE)
                    .responseMessage(AccountUtils.ACCOUNT_CREATION_MESSAGE)
                    .accountInfo(AccountInfo.builder()
                            .accountBalance(savedUser.getAccountBalance())
                            .accountNumber(savedUser.getAccountNumber())
                            .accountName(savedUser.getFirstName() + " " + savedUser.getLastName() + " " + savedUser.getOtherName())
                            .build())
        .build();
    }

}
