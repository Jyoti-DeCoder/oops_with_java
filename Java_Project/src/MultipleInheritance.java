
interface Printer {
    // Interface variable
    int MAX_PAGES = 100;

    // Abstract method
    void print();

    // Concrete method (default method)
    default void showPrinterInfo() {
        System.out.println("This is a printer.");
    }
}

interface Scanner {
    // Interface variable
    int SCAN_RESOLUTION = 1200;

    // Abstract method
    void scan();

    // Concrete method
    default void showScannerInfo() {
        System.out.println("This is a scanner.");
    }
}

interface FaxMachine {
    // Interface variable
    String FAX_TYPE = "Digital";

    // Abstract method
    void sendFax();

    // Concrete method
    default void showFaxInfo() {
        System.out.println("This is a fax machine.");
    }
}

class SmartPrinter implements Printer, Scanner, FaxMachine {
    // Implementing abstract methods
    public void print() {
        System.out.println("Printing document...");
    }

    public void scan() {
        System.out.println("Scanning document...");
    }

    public void sendFax() {
        System.out.println("Sending fax...");
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {

        SmartPrinter sp = new SmartPrinter();

        // Abstract methods implemented by SmartPrinter
        sp.print();
        sp.scan();
        sp.sendFax();

        // Concrete default methods inherited from interfaces
        sp.showPrinterInfo();
        sp.showScannerInfo();
        sp.showFaxInfo();

        // Interface variables
        System.out.println("Maximum pages: " + Printer.MAX_PAGES);
        System.out.println("Scan resolution: " + Scanner.SCAN_RESOLUTION);
        System.out.println("Fax type: " + FaxMachine.FAX_TYPE);
    }
}