package lab6;


class JointBankAccount {
    private int balance;

    public JointBankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void withdraw(int amount, String user) {
        System.out.println(user + " is attempting to withdraw " + amount + ".");
        if (balance >= amount) {
            System.out.println(user + " is withdrawing " + amount + ".");
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("Transaction interrupted.");
            }
            balance -= amount;
            System.out.println(user + " completed the withdrawal. Remaining balance: " + balance);
        } else {
            System.out.println(user + " could not withdraw " + amount + ". Insufficient funds. Remaining balance: " + balance);
        }
    }
}

class User extends Thread {
    private JointBankAccount account;
    private int amount;
    private String name;

    public User(JointBankAccount account, int amount, String name) {
        this.account = account;
        this.amount = amount;
        this.name = name;
    }

    @Override
    public void run() {
        account.withdraw(amount, name);
    }
}


