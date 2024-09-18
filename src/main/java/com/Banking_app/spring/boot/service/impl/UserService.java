package com.Banking_app.spring.boot.service.impl;

import com.Banking_app.spring.boot.dto.*;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);

    BankResponse deleteUser(String accountNumber);

    BankResponse balanceEnquiry(EnquiryRequest request);

    String nameEnquiry(EnquiryRequest request);

    BankResponse creditAccount(CreditDebitRequest request);

    BankResponse debitAccount(CreditDebitRequest request);

    BankResponse transfer(TransferRequest request);

    BankResponse login(LoginDto loginDto);
}
