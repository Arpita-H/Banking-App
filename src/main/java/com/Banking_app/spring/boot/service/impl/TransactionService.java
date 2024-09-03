package com.Banking_app.spring.boot.service.impl;

import com.Banking_app.spring.boot.dto.TransactionDto;
import org.springframework.stereotype.Component;

@Component
public interface TransactionService {
    void saveTransaction(TransactionDto transactionDto);
}
