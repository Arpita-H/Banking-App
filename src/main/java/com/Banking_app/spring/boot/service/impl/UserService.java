package com.Banking_app.spring.boot.service.impl;

import com.Banking_app.spring.boot.dto.BankResponse;
import com.Banking_app.spring.boot.dto.CreditDebitRequest;
import com.Banking_app.spring.boot.dto.EnquiryRequest;
import com.Banking_app.spring.boot.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
    BankResponse balanceEnquiry(EnquiryRequest request);
    String nameEnquiry(EnquiryRequest request);
    BankResponse creditAccount(CreditDebitRequest request);
    BankResponse debitAccount(CreditDebitRequest request);
}
