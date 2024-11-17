package lab5;
import java.util.Random;

class AlphabetPrinter extends Thread {
    @Override
    public void run() {
        Random random = new Random();

        for (int i = 0; i < 26; i++) {
            char randomChar = (char) (random.nextInt(26) + 'A');
            System.out.print(randomChar + " ");
            
        try {
            Thread.sleep(100 + random.nextInt(400)); 
      } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
          }
       }
    }

    public static void main(String[] args) {
        AlphabetPrinter alphabetThread = new AlphabetPrinter();
        alphabetThread.start();
        
        try {
            alphabetThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        
        System.out.println("\nDone printing alphabets!");
    }
}
