package Lab14;

public class Loan<T> {
	 private T loanAmount;

	 public Loan(T loanAmount) {
	     this.loanAmount = loanAmount;
	 }

	 public T getLoanAmount() {
	     return loanAmount;
	 }

	 public void setLoanAmount(T loanAmount) {
	     this.loanAmount = loanAmount;
	 }
	}
