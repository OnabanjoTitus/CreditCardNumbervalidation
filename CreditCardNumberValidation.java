

import java.math.BigInteger;

public class CreditCardNumberValidation {
    CreditCardTypeCheck creditCardTypeCheck = new CreditCardTypeCheck();
    CreditCardValidLength cardValidity = new CreditCardValidLength();
    CreditCardValidator creditCardValidity = new CreditCardValidator();
    private BigInteger creditCardNumber;
    private boolean validLength;
    private boolean validation;

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = new BigInteger(creditCardNumber);
       validLength = IsValidCreditCardNumberLength(creditCardNumber);
       validation = creditCardValidator();
        creditCardTypeCheck.checkCardType(getCreditCardNumber());
    }
    public String getCreditCardType(){
        String cardType;
        cardType = creditCardTypeCheck.toString();
        return cardType;
    }
    public BigInteger getCreditCardNumber() {
        return creditCardNumber;
    }
    public  int creditCardNumberLength(){
       int  creditCardNumberLength = creditCardNumber.toString().length();
       return creditCardNumberLength;
    }
    private boolean IsValidCreditCardNumberLength(String creditCardNumber){
       boolean validLengthCheck = cardValidity.IsValidCreditCardNumber(creditCardNumber.length());
        return  validLengthCheck ;
    }
    private boolean creditCardValidator(){
        return creditCardValidity.IsValidCreditCard(this.creditCardNumber);
    }

    @Override
    public String toString() {
        String cardDetails ="";
        if(validLength){
            cardDetails+=String.format("The card with the number %d is of valid length%n",getCreditCardNumber());
        }
        else{
            cardDetails+=String.format("The card is of an invalid length%n");
        }
        if(validation){
            cardDetails+=String.format("The card is also a valid card%n");
        }else{
            cardDetails+=String.format("The card is an invalid card%n");
        }
        if(validLength||validation){
            cardDetails+=String.format("And the card is of type %s",getCreditCardType());
        }else{
            cardDetails+=String.format("The card is of an unknown type%n");
        }
        return cardDetails;
    }
}


