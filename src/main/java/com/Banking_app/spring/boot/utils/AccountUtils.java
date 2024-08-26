package com.Banking_app.spring.boot.utils;

import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.Year;

@RestControllerAdvice
public class AccountUtils {

    public static final String ACCOUNT_EXISTS_CODE = "001";

    public  static final String ACCOUNT_EXISTS_MESSAGE = "This user already has Created";

    public static final String ACCOUNT_CREATION_MESSAGE = "Account has been successfully created";

    public static String generateAccountNumber() {

        /**
         * 2024 + randomSixDigits
         */
        Year currentYear = Year.now();
        int min = 100000;
        int max = 999999;
        //generate a random number between min and max

        int  randNumber = (int)Math.floor(Math.random() * (max - min + 1) + min);
        //convert the current and randomNumber to Strings, then concatenate

        String year = String.valueOf(currentYear);
        String randomNumber = String.valueOf(randNumber);
        StringBuilder accountNumber = new StringBuilder();

        return accountNumber.append(year).append(randomNumber).toString();
    }

}
