public class CreditCardValidLength {

    public boolean IsValidCreditCardNumber(int creditCardNumberLength){
        boolean validation = false;
        try { 
            validation = cardValidity(creditCardNumberLength);
           
        }catch (Throwable throwable){
            System.err.println("Enter the correct value");
        }
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
