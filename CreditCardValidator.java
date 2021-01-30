import java.math.BigInteger;

public class CreditCardValidator {
    private  int total;
    private int total2;
    private BigInteger creditCardNumber;
    public boolean IsValidCreditCard(BigInteger creditCardNumber) {
       this.creditCardNumber = creditCardNumber;
        return creditCardValidator();
    }


    private boolean creditCardValidator() {
        boolean cardValidator = false;
        int resultsLeft =getTotalResultOfSummationOfEverySecondDigitsFromLeftToRight();
        int resultRight =  getTotalResultOfSummationOfEveryDigitsInOddPlacesFromRightToLeft();
        int results = resultsLeft+resultRight;
        if(results%10==0){
            cardValidator = true;
        }
        return cardValidator;
    }

    private void sumOfEveryDoubleDigitFromLeftToRight(BigInteger creditCardNumber){
        String character = creditCardNumber.toString();
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

    private int getTotalResultOfSummationOfEverySecondDigitsFromLeftToRight(){
        sumOfEveryDoubleDigitFromLeftToRight(creditCardNumber);
        return total;
    }

    private int getTotalResultOfSummationOfEveryDigitsInOddPlacesFromRightToLeft() {
        sumOfEveryDoubleDigitFromRightToLeft(creditCardNumber);
        return total2;

    }

    private void sumOfEveryDoubleDigitFromRightToLeft(BigInteger creditCardNumber) {
        String character = creditCardNumber.toString();
        convertAllDigitsToCharToBeSummedFromRightToLeft(character);
    }

    private void convertAllDigitsToCharToBeSummedFromRightToLeft(String character) {
        char[] characters = new char[character.length()];
        for(int counter = 0; counter< character.length(); counter++){
            characters[counter] = character.charAt(counter);
        }
        conversionOfAllCharactersIntoAStringForRightToLeft(characters);
    }

    private void conversionOfAllCharactersIntoAStringForRightToLeft(char[] characters) {
        String integer= String.valueOf(characters);
        sumOfDoubleSecondDigitsFromRightToLeft(integer);
    }

    private void sumOfDoubleSecondDigitsFromRightToLeft(String integer) {
        int []  integers = new int[integer.length()];
        resultOfSummationOfSecondDigitsFromRightToLeft(integer,integers);

    }

    private void resultOfSummationOfSecondDigitsFromRightToLeft(String integer, int[] integers) {
        for(int counter = 0; counter<integers.length;counter++)
        {
            int integerValue = Integer.parseInt(String.valueOf(integer.charAt(counter)));
            if(counter%2>0){
                integers[counter]=integerValue;
                total2+=integers[counter];
                continue;
            }
            integers[counter] =integerValue;
        }
    }

}
