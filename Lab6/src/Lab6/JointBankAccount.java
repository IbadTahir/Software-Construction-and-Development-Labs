package Lab6;

class JointBankAccount {
    private int balance;

    public JointBankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void withdraw(int amount, String user) {
        System.out.println(user + " is trying to withdraw " + amount);

        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        if (balance >= amount) {
            balance -= amount;
            System.out.println(user + " successfully withdrew " + amount + ". Remaining balance: " + balance);
        } else {
            System.out.println(user + " failed to withdraw " + amount + ". Insufficient balance: " + balance);
        }
    }

    public int getBalance() {
        return balance;
    }
}