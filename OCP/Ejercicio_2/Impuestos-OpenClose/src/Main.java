import Models.TaxCalculator;

public class Main {
    public static void main(String[] args) {
        TaxCalculator calculator = new TaxCalculator();
        calculator.printInvoice("Clothing", 100.0);
        calculator.printInvoice("Food", 50.0);
        calculator.printInvoice("Electronics", 200.0);
        calculator.printInvoice("Luxury", 500.0);
        calculator.printInvoice("Unknown", 300.0);

    }
}