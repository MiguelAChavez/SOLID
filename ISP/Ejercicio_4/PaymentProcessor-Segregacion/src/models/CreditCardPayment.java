package models;

import interfaces.PaymentProcessor;
import strategies.PaymentProcessorStrategy;
import models.validators.PaymentValidator;

public class CreditCardPayment implements PaymentProcessor {
    private static final double CHARGE_AMOUNT = 10;
    private double balance;
    private double interestRate;
    private double minimumPayment;
    private PaymentValidator validator;
    private PaymentProcessorStrategy paymentProcessorStrategy;

    public CreditCardPayment(double balance, double interestRate, double minimumPayment) {
        this.balance = balance;
        this.interestRate = interestRate;
        this.minimumPayment = minimumPayment;
        this.validator = new PaymentValidator();
        this.paymentProcessorStrategy = new PaymentProcessorStrategy();
    }

    @Override
    public void processPayment(double amount) {
        if (!validator.isValidPayment(amount)) {
            throw new IllegalArgumentException("Invalid payment, amount must be greater than 0.");
        }

        if (validator.isPaymentExceedsBalance(amount, balance)) {
            System.out.println("Payment exceeds balance, processing full payment.");
            amount = balance;
        }

        paymentProcessorStrategy.applyPayment(amount, balance);
        if (validator.isBalanceLessThanMinimumPayment(balance, minimumPayment)) {
            System.out.println("Balance is less than minimum payment, applying charge.");
            paymentProcessorStrategy.applyCharge(balance, CHARGE_AMOUNT);
        }
        paymentProcessorStrategy.addInterest(balance, interestRate);
    }

    @Override
    public void generateReceipt() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void applyDiscount(double discount) {
        if (discount > balance) {
            throw new IllegalArgumentException("Discount cannot be greater than balance.");
        }
        balance -= discount;
        System.out.println("Discount applied. New balance: " + balance);
    }

    @Override
    public boolean validateBankAccount(String accountNumber) {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}
