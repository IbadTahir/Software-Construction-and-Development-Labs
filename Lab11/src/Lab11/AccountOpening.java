package Lab11;

import java.util.LinkedList;

public class AccountOpening implements BankInterface {
 private LinkedList<String> newAccounts = new LinkedList<>(); 

 public void addNewAccount(String accountHolder) {
     newAccounts.add(accountHolder);
 }

 @Override
 public void executeTask() {
     System.out.println("Opening new accounts...");
     for (String account : newAccounts) {
         System.out.println("Opened account for: " + account);
     }
 }
}
