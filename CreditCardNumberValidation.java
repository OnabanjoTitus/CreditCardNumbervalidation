package com.cohortFive.tdd;

import java.math.BigInteger;

public class CreditCardNumberValidation {
    private BigInteger creditCardNumber;
    private boolean visaCard;
    private boolean masterCard;
    private boolean americanExpress;
    private boolean discoverCards;
    private boolean validCreditCard;
    private  char[] charray;
    private  int total;
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
    public boolean IsDiscoverCard() {
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


    public boolean IsValidCreditCard() {
        validCreditCard = creditCardValidator(creditCardNumber.toString());
        return validCreditCard;
    }


    private boolean creditCardValidator(String creditCardNumber) {
       BigInteger y = new BigInteger(creditCardNumber);
       return false;
        }

    private void sumOfEveryDoubleDigitFromLeftToRight(BigInteger charray){
        String character = charray.toString();
        convertAllDigitsToCharToBeSummed(character);
    }


    private void convertAllDigitsToCharToBeSummed(String character) {
        char[] characters = new char[character.length()];
        for(int counter = 0; counter< character.length(); counter++){
            characters[counter] = character.charAt(counter);
        }
        conversionOfAllCharactersIntoAString(characters);
    }

    private void conversionOfAllCharactersIntoAString(char[] characters) {
        String integer= String.valueOf(characters);
        sumOfDoubleSecondDigitsFromLeftToRight(integer);
    }

    private void sumOfDoubleSecondDigitsFromLeftToRight(String integer) {
        int []  integers = new int[integer.length()];
        resultOfSummationOfSecondDigitsFromLeftToRight(integer,integers);
    }

    private void resultOfSummationOfSecondDigitsFromLeftToRight(String integer, int[] integers) {
        for(int counter = 0; counter<integers.length;counter++)
        {
            int integerValue = Integer.parseInt(String.valueOf(integer.charAt(counter)));
            if(counter%2==0){
                integers[counter]= integerValue *2;
                if(integers[counter]<10)
                    total+=integers[counter];
                if(integers[counter]>=10){
                    int a=integers[counter]/10;
                    int b=integers[counter]%10;
                    total+=a+b;
                }
                continue;
            }
            integers[counter] =integerValue;
        }

    }

    public int getTotalResultOfSummationOfEverySecondDigitsFromLeftToRight(){
        sumOfEveryDoubleDigitFromLeftToRight(getCreditCardNumber());
        return total;
    }

    public int getTotalResultOfSummationOfEveryDigitsInOddPlacesFromRightToLeft() {
        sumOfEveryDoubleDigitFromRightToLeft(getCreditCardNumber());
        
    }

    private void sumOfEveryDoubleDigitFromRightToLeft(BigInteger creditCardNumber) {
    }


}


