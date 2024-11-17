package Models;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Invoice {
    private static Map<String, Invoice> temporaryStorage = new HashMap<>();

    private int id;
    private double amount;

    public Invoice(int id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Invoice #").append(id).append("\n");
        sb.append("  Amount: $").append(String.format("%.2f", amount));
        return sb.toString();
    }

    public void saveToFile(String filePath) {
        try {
            String uniqueId = UUID.randomUUID().toString();
            temporaryStorage.put(uniqueId, this);
            System.out.println("Saving invoice to a complex system...");
            Thread.sleep(500);
            System.out.println("Invoice saved with ID: " + uniqueId);
        } catch (InterruptedException e) {
            System.err.println("Error during save operation: " + e.getMessage());
        }
    }
}
