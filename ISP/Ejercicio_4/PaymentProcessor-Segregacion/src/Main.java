import interfaces.PaymentProcessor;
import models.BankTransferPayment;
import models.CreditCardPayment;

public class Main {
    public static void main(String[] args) {
        test(new CreditCardPayment(1000, 5, 100));
        test(new BankTransferPayment("123456789", 1000));
    }

    public static void test(PaymentProcessor payment) {
        executeSafely(() -> payment.processPayment(100));
        executeSafely(() -> payment.applyDiscount(50));
        executeSafely(() -> payment.validateBankAccount("123456789"));
        executeSafely(() -> payment.generateReceipt());
    }

    public static void executeSafely(Runnable runnable) {
        try {
            runnable.run();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}