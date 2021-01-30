

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
        creditCardNumberValidation = null;
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

     }
  @Test
  void testForTheCreditCardType(){
     creditCardNumberValidation.setCreditCardNumber("4388576018402626");
        assertEquals("VisaCard",creditCardNumberValidation.getCreditCardType());
//
//        creditCardNumberValidation.setCreditCardNumber("5388576018402626");
//         assertEquals("MasterCard",creditCardNumberValidation.getCreditCardType());
//
//        creditCardNumberValidation3.setCreditCardNumber("6388576018402626");
//        assertEquals("DiscoverCard",creditCardNumberValidation3.getCreditCardType());
//
//         creditCardNumberValidation4.setCreditCardNumber("3788576018402626");
//        assertEquals("AmericanExpress",creditCardNumberValidation4.getCreditCardType());
//
    }
   @Test
     void testCreditCardEnteredIsAValidCard(){
        creditCardNumberValidation.setCreditCardNumber("4388576018402626");
        assertNotNull(creditCardNumberValidation.toString());
       System.out.println(creditCardNumberValidation.toString());
    }
}