package lab6;

class Printer {
    private int availablePages = 10;

    public synchronized void refillPages(int pages) {
        System.out.println("Refilling printer tray with " + pages + " pages.");
        availablePages += pages;
        System.out.println("Printer tray now has " + availablePages + " pages.");
        notify(); 
    }

    public synchronized void printPages(int pagesToPrint) {
        System.out.println("Print job requested for " + pagesToPrint + " pages.");
        while (availablePages < pagesToPrint) {
            System.out.println("Not enough pages to print. Available pages: " + availablePages + ". Waiting for refill...");
            try {
                wait(); 
            } catch (InterruptedException e) {
                System.out.println("Print thread interrupted.");
            }
        }
        availablePages -= pagesToPrint;
        System.out.println("Printed " + pagesToPrint + " pages. Remaining pages: " + availablePages);
    }
}

class RefillThread extends Thread {
    private Printer printer;

    public RefillThread(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000); 
            printer.refillPages(20); 
        } catch (InterruptedException e) {
            System.out.println("Refill thread interrupted.");
        }
    }
}

class PrintThread extends Thread {
    private Printer printer;
    private int pagesToPrint;

    public PrintThread(Printer printer, int pagesToPrint) {
        this.printer = printer;
        this.pagesToPrint = pagesToPrint;
    }

    @Override
    public void run() {
        printer.printPages(pagesToPrint);
    }
}

public class lab6t2 {
    public static void main(String[] args) {
        Printer printer = new Printer();

        PrintThread printThread = new PrintThread(printer, 15); 
        RefillThread refillThread = new RefillThread(printer);

        printThread.start();
        refillThread.start();

        try {
            printThread.join();
            refillThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("All printer jobs completed.");
    }
}
