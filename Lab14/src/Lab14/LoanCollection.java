package Lab14;

import java.util.ArrayList;
import java.util.List;

public class LoanCollection<T> {
 private List<Loan<T>> loans;

 public LoanCollection() {
     loans = new ArrayList<>();
 }

 public void addLoan(Loan<T> loan) {
     loans.add(loan);
 }

 public Loan<T> getLoan(int index) {
     if (index < 0 || index >= loans.size()) {
         throw new IndexOutOfBoundsException("Invalid index.");
     }
     return loans.get(index);
 }

 public double calculateTotalLoanAmount() {
     double total = 0.0;
     for (Loan<T> loan : loans) {
         if (loan.getLoanAmount() instanceof Number) {
             total += ((Number) loan.getLoanAmount()).doubleValue();
         }
     }
     return total;
 }
}
