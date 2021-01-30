import javax.swing.*;
import java.util.Scanner;

public class CreditCardValidationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CreditCardNumberValidation creditCardNumberValidation = new CreditCardNumberValidation();
        System.out.println("Enter card number:");
        String cardNumber = scanner.next();
        creditCardNumberValidation.setCreditCardNumber(cardNumber);
        String output = creditCardNumberValidation.toString();
        System.out.printf("%s",output);
    }
}
