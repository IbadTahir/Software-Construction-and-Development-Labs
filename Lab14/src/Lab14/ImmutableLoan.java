package Lab14;

public final class ImmutableLoan<T> {
	 private final T loanAmount;

	 public ImmutableLoan(T loanAmount) {
	     this.loanAmount = loanAmount;
	 }

	 public T getLoanAmount() {
	     return loanAmount;
	 }
	}
