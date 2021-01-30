

import java.math.BigInteger;

public class CreditCardTypeCheck {
    private boolean visaCard;
    private boolean masterCard;
    private boolean americanExpress;
    private boolean discoverCards;
    private BigInteger creditCardNumber;

    private boolean IsVisaCard() {
        checkCardType(creditCardNumber);
        return visaCard;
    }
    private boolean IsMastercard() {
        checkCardType(creditCardNumber);
        return masterCard;
    }
    private boolean IsDiscoverCard() {
        checkCardType(creditCardNumber);
        return discoverCards;
    }
    private boolean IsAmericanExpress() {
        checkCardType(creditCardNumber);
        return americanExpress;
    }

    public void checkCardType(BigInteger CardNumber) {
        creditCardNumber = CardNumber;
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

    @Override
    public String toString() {
        String cardType = null;
        if(IsMastercard())
        {cardType ="MasterCard";}
        if(IsDiscoverCard())
        {cardType ="DiscoverCard";}
        if(IsAmericanExpress())
        {cardType ="AmericanExpress";}
        if(IsVisaCard())
        {cardType ="VisaCard";}
        return cardType;
    }
}
