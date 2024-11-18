package models;

import exception.InsufficientFundsException;
import exception.InvalidAccountException;
import interfaces.PaymentProcessor;

public class BankTransferPayment implements PaymentProcessor {
    private String accountNumber;
    public double balance;

    public BankTransferPayment(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void processPayment(double amount) {
        if (validateBankAccount(accountNumber)) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Transfer processed successfully. Current balance: $" + balance);
            } else {
                throw new InsufficientFundsException("Insufficient funds to complete the transfer");
            }
        } else {
            throw new InvalidAccountException("Invalid bank account");
        }
    }

    @Override
    public void generateReceipt() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void applyDiscount(double discount) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean validateBankAccount(String accountNumber) {
        return accountNumber.equals(this.accountNumber);
    }
}
