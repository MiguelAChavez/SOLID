import Models.Invoice;
import Models.InvoiceManager;

public class Main {
    public static void main(String[] args) {
        InvoiceManager invoiceManager = new InvoiceManager();
        invoiceManager.addInvoice(new Invoice(1, 100.0));
        invoiceManager.addInvoice(new Invoice(2, 200.0));
        invoiceManager.addInvoice(new Invoice(3, 300.0));

        invoiceManager.generateReport();

        invoiceManager.saveInvoicesToFile("invoices.txt");
    }
}