package models.validators;

public class PaymentValidator {
    public boolean isValidPayment(double amount) {
        return amount > 0;
    }

    public boolean isPaymentExceedsBalance(double amount, double balance) {
        return amount > balance;
    }

    public boolean isBalanceLessThanMinimumPayment(double balance, double minimumPayment) {
        return balance < minimumPayment;
    }
}
