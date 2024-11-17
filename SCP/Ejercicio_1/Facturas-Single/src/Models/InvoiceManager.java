package Models;

import java.util.ArrayList;
import java.util.List;

public class InvoiceManager {
    private List<Invoice> invoices;

    public InvoiceManager() {
        this.invoices = new ArrayList<>();
    }

    public void addInvoice(Invoice invoice) {
        this.invoices.add(invoice);
    }

    public double getTotalAmount() {
        double totalAmount = 0.0;
        for (Invoice invoice : this.invoices) {
            totalAmount += invoice.getAmount();
        }
        return totalAmount;
    }

    public void saveInvoicesToFile( String filePath) {
        System.out.println("Saving invoices to file...");

        invoices.forEach(invoice -> {
            try {
                invoice.saveToFile(filePath);
            } catch (Exception e) {
                System.out.println("Error saving invoice to file: " + e.getMessage());
            }
        });
    }
    public void generateReport() {
        System.out.println("Generating report...");
        System.out.println("Invoices:");
        invoices.forEach(System.out::println);
        System.out.println("Total amount: $" + getTotalAmount());

    }
}
