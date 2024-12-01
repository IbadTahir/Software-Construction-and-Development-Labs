package Lab6;

public class BankAccount {
    public static void main(String[] args) {
        JointBankAccount account = new JointBankAccount(100000);

        Thread userA = new Thread(() -> account.withdraw(50000, "User A"));
        Thread userB = new Thread(() -> account.withdraw(60000, "User B"));
        userA.start();
        userB.start();

        try {
            userA.join();
            userB.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Final balance: " + account.getBalance());
    }
}