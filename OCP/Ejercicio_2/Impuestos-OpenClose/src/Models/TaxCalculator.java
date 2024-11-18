package Models;

public class TaxCalculator {
    public double calculateTax(String type, double amount) {
        return switch (type.toLowerCase()) {
            case "food" -> amount * 0.5;
            case "electronics" -> amount * 0.18;
            case "clothing" -> amount * 0.12;
            case "luxury" -> amount * 0.25;
            default -> throw new IllegalArgumentException("Unknown product type: " + type);
        };
    }

    public double calculateTotalWithTax(String type, double amount) {
        double tax = calculateTax(type, amount);
        return amount + tax;
    }

    public double applyDiscount(String type, double amount) {
        return switch (type.toLowerCase()) {
            case "food" -> amount * 0.8;
            case "electronics" -> amount * 0.95;
            case "clothing" -> amount * 0.85;
            default -> amount;
        };
    }

    public void printInvoice(String type, double amount) {
        double totalWithTax = calculateTotalWithTax(type, amount);
        double discountedAmount = applyDiscount(type, totalWithTax);
        System.out.println("Product Type: " + type);
        System.out.println("Amount: $" + amount);
        System.out.println("Tax: $" + calculateTax(type, amount));
        System.out.println("Total with Tax: $" + totalWithTax);
        System.out.println("Discounted Amount: $" + discountedAmount);
    }

}
