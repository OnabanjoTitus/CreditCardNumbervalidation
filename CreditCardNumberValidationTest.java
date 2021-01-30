package com.cohortFive.tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardNumberValidationTest {
CreditCardNumberValidation creditCardNumberValidation;
    @BeforeEach
    void setUp() {
        creditCardNumberValidation = new CreditCardNumberValidation();
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testThatCreditCardNumbersCanBeEntered(){
        creditCardNumberValidation.setCreditCardNumber("4388576018402626");
        BigInteger creditCardNumber = creditCardNumberValidation.getCreditCardNumber();
        BigInteger cardNumber = new BigInteger("4388576018402626");
        assertEquals(cardNumber,creditCardNumber);
    }
    @Test
    void testThatLengthOfCreditCardNumberEnteredIsValid(){
        creditCardNumberValidation.setCreditCardNumber("4388576018402626");
        String cardNumber = "4388576018402626";
        assertEquals(cardNumber.length(),creditCardNumberValidation.creditCardNumberLength());
     }
     @Test
    void testThatCreditCardIsOfValidLength(){
        creditCardNumberValidation.setCreditCardNumber("4388576018402626");
        assertTrue(creditCardNumberValidation.IsValidCreditCardNumber());
     }
}