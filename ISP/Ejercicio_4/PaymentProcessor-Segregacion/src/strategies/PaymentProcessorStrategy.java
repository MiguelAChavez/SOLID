package strategies;

public class PaymentProcessorStrategy {
    public void applyPayment(double amount, double balance) {
        balance -= amount;
        System.out.println("Payment processed. Current balance:" + balance);
    }

    public void applyCharge(double balance, double charge) {
        balance -= charge;
        System.out.println("Charge applied. Current balance:" + balance);
    }

    public void addInterest(double balance, double interestRate) {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Added interest. Current balance: " + balance);
    }
}
