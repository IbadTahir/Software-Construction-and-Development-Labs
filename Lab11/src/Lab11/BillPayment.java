package Lab11;

import java.util.ArrayList;

public class BillPayment implements BankInterface {
 private ArrayList<String> bills = new ArrayList<>();

 public void addBill(String bill) {
     bills.add(bill);
 }

 @Override
 public void executeTask() {
     System.out.println("Processing bill payments...");
     for (String bill : bills) {
         System.out.println("Paid bill: " + bill);
     }
 }
}
