package Lab14;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoanManagementSystemTest {

 @Test
 void testMutableLoan() {
     Loan<Double> loan = new Loan<>(5000.0);
     assertEquals(5000.0, loan.getLoanAmount());

     loan.setLoanAmount(7000.0);
     assertEquals(7000.0, loan.getLoanAmount());
 }

 @Test
 void testImmutableLoan() {
     ImmutableLoan<Double> loan = new ImmutableLoan<>(5000.0);
     assertEquals(5000.0, loan.getLoanAmount());
 }

 @Test
 void testLoanCollection() {
     LoanCollection<Double> collection = new LoanCollection<>();
     collection.addLoan(new Loan<>(5000.0));
     collection.addLoan(new Loan<>(7000.0));

     assertEquals(2, collection.calculateTotalLoanAmount());
     assertEquals(12000.0, collection.calculateTotalLoanAmount());
 }

 @Test
 void testImmutableLoanModificationException() {
     ImmutableLoan<Double> loan = new ImmutableLoan<>(5000.0);
     assertThrows(ImmutableLoanModificationException.class, () -> {
         throw new ImmutableLoanModificationException("Cannot modify immutable loan.");
     });
 }
}
