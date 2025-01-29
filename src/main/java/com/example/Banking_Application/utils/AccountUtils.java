package com.example.Banking_Application.utils;

import java.time.Year;

public class AccountUtils {

    public static final String ACCOUNT_EXISTS_CODE = "001";

    public static final String ACCOUNT_EXISTS_MESSAGE="already has account created";

    public static final String ACCOUNT_CREATION_SUCCESS="002";

    public static final String ACCOUNT_CREATION_MESSAGE="account created";


    public static String generateAccountNumber() {
        // Get the current year
        Year currentYear = Year.now();
        int min = 100000;
        int max = 999999;

        // Generate random number between min and max
        int randNumber = (int) (Math.random() * (max - min + 1) + min);

        // Convert year and random number to strings
        String year = String.valueOf(currentYear.getValue());
        String randomNumber = String.valueOf(randNumber);

        // Concatenate year and random number to form the account number
        StringBuilder accountNumber = new StringBuilder();
        accountNumber.append(year).append(randomNumber);

        // Return the generated account number
        return accountNumber.toString();
    }
}
