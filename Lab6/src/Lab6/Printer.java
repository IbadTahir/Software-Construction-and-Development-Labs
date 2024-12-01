package Lab6;

class Printer {
    private int totalPages = 10; 
    public synchronized void addPages(int pages) {
        totalPages += pages;
        System.out.println("Added " + pages + " pages to the tray. Total pages: " + totalPages);
        notify(); 
    }

    public synchronized void printPages(int pages) {
        System.out.println("Printing job requested for " + pages + " pages.");
        while (totalPages < pages) {
            System.out.println("Not enough pages to print. Waiting for more pages...");
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted while waiting.");
            }
        }
        totalPages -= pages;
        System.out.println("Printed " + pages + " pages. Remaining pages in tray: " + totalPages);
    }
}

