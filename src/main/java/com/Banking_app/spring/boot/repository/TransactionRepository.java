package com.Banking_app.spring.boot.repository;

import com.Banking_app.spring.boot.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,  String > {

}
