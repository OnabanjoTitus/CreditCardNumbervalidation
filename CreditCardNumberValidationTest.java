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
    void testThatLengthOfCreditCardNumberEnteredIsValidLength(){
        creditCardNumberValidation.setCreditCardNumber("4388576018402626");
        String cardNumber = "4388576018402626";
        assertEquals(cardNumber.length(),creditCardNumberValidation.creditCardNumberLength());
     }
     @Test
    void testThatCreditCardIsOfValidLength(){
        creditCardNumberValidation.setCreditCardNumber("4388576018402626");
        assertTrue(creditCardNumberValidation.IsValidCreditCardNumber());
     }
     @Test
    void testForTheCreditCardType(){
        creditCardNumberValidation.setCreditCardNumber("4388576018402626");
        assertTrue(creditCardNumberValidation.IsVisaCard());

        creditCardNumberValidation.setCreditCardNumber("5388576018402626");
        assertTrue(creditCardNumberValidation.IsMastercard());

        creditCardNumberValidation.setCreditCardNumber("6388576018402626");
        assertTrue(creditCardNumberValidation.IsDiscoverCard());

         creditCardNumberValidation.setCreditCardNumber("3788576018402626");
         assertTrue(creditCardNumberValidation.IsAmericanExpress());

     }
     @Test
    void testCreditCardEnteredIsAValidCard(){
        creditCardNumberValidation.setCreditCardNumber("4388576018402626");
        assertEquals(37,creditCardNumberValidation.getTotalResultOfSummationOfEverySecondDigitsFromLeftToRight());
        assertEquals(38,creditCardNumberValidation.getTotalResultOfSummationOfEveryDigitsInOddPlacesFromRightToLeft());

//        assertTrue(creditCardNumberValidation.IsValidCreditCard());
     }
}