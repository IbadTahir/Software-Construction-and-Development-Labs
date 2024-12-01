package lab4;

public class Lab4task {
	static class PrintInfo extends Thread {
		
private String[] data;
private String label;

	 public PrintInfo(String[] data, String label) {
	      this.data = data;
	      this.label = label;
	      }

@Override
public void run() {
	for (String item : data) {
	      System.out.println(label + ": " + item);
	      
	  try {
		  Thread.sleep(1000);
	} catch (InterruptedException e) {
	     System.out.println("Thread interrupted: " + e.getMessage());
	    }
	  }
	}
 }

	public static void main(String[] args) {
	    String[] rollNumbers = {"2022-SE-344", "2022-SE-345", "2022-SE-346", "2022-SE-347", "2022-SE-348"};
	    String[] birthDates = {"07-April", "06-May", "07-June", "08-July", "09-August"};

	    PrintInfo rollThread = new PrintInfo(rollNumbers, "Roll Number");
	    PrintInfo dateThread = new PrintInfo(birthDates, "Date of Birth");

	    rollThread.start();
	    dateThread.start();

	 try {
	     rollThread.join();
	     dateThread.join();
	 } catch (InterruptedException e) {
	     System.out.println("Main thread interrupted: " + e.getMessage());
	  }

	      System.out.println("Finished printing both tables concurrently.");
	    }
	}
