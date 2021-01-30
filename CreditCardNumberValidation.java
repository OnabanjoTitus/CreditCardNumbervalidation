package com.cohortFive.tdd;

import java.lang.invoke.SwitchPoint;
import java.math.BigInteger;

public class CreditCardNumberValidation {
    private BigInteger creditCardNumber;
    private boolean visaCard;
    private boolean masterCard;
    private boolean americanExpress;
    private boolean discoverCards;
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
    public boolean IsVisaCard() {
      checkCardType(creditCardNumber);
        return visaCard;
    }
    public boolean IsMastercard() {
        checkCardType(creditCardNumber);
        return masterCard;
    }
    public boolean IsDiscovercard() {
        checkCardType(creditCardNumber);
        return discoverCards;
    }
    public boolean IsAmericanExpress() {
        checkCardType(creditCardNumber);
        return americanExpress;
    }

    private void checkCardType(BigInteger creditCardNumber) {

        char number = caseCondition(creditCardNumber.toString());
        switch (number){
            case '4' ->
                   visaCard = true;
            case '5' ->
                    masterCard = true;
            case '6' ->
                    discoverCards = true;
            case '3' -> {
                char output = americanExpressClause(creditCardNumber.toString());
                        if(output == '7')
                            americanExpress = true;
            }
        }

    }
    private char caseCondition(String input) {
        return  input.charAt(0);
    }
    private char americanExpressClause(String input){
        return input.charAt(1);

    }


}
