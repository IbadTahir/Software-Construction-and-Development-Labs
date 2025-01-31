package Lab11;

import java.util.HashMap;

public class LoanContact implements BankInterface {
 private HashMap<String, String> loanDefaulters = new HashMap<>(); 

 public void addLoanDefaulter(String name, String contactInfo) {
     loanDefaulters.put(name, contactInfo);
 }

 @Override
 public void executeTask() {
     System.out.println("Contacting loan defaulters...");
     for (String name : loanDefaulters.keySet()) {
         System.out.println("Contacting " + name + " at " + loanDefaulters.get(name));
     }
 }
}