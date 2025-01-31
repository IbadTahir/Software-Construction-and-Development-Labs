package Lab11;

public class Main {
	 public static void main(String[] args) {
	     BillPayment billPayment = new BillPayment();
	     billPayment.addBill("Electricity");
	     billPayment.addBill("Water");
	     billPayment.executeTask();

	     AccountOpening accountOpening = new AccountOpening();
	     accountOpening.addNewAccount("Ibad Tahir");
	     accountOpening.addNewAccount("Taqi Rahmani");
	     accountOpening.executeTask();

	     LoanContact loanContact = new LoanContact();
	     loanContact.addLoanDefaulter("Arqum", "arqum@example.com");
	     loanContact.addLoanDefaulter("Umer", "umer@example.com");
	     loanContact.executeTask();
	 }
	}

