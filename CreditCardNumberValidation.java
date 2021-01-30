package com.cohortFive.tdd;

import java.lang.invoke.SwitchPoint;
import java.math.BigInteger;

public class CreditCardNumberValidation {
    private BigInteger creditCardNumber;

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = new BigInteger( creditCardNumber);
    }

    public BigInteger getCreditCardNumber() {
        return creditCardNumber;
    }
    public  int creditCardNumberLength(){
       int  creditCardNumberLength = creditCardNumber.toString().length();
       return creditCardNumberLength;
    }
    public boolean IsValidCreditCardNumber(){
        boolean validation = cardValidity(creditCardNumberLength());
        return validation;
    }
    private boolean cardValidity(int cardNumber){
        boolean validity;
        switch (cardNumber){
            case 13,14,15,16->
                 validity = true;
            default ->
                    validity = false;
        }
    return validity;
    }
}
