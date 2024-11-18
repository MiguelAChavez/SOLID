package interfaces;

public interface PaymentProcessor {
    void processPayment(double amount);

    void generateReceipt();

    void applyDiscount(double discount);

    boolean validateBankAccount(String accountNumber);
}
