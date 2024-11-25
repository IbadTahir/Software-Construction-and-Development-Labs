package lab6;

public class bank {
    public static void main(String[] args) {
        JointBankAccount account = new JointBankAccount(50000);

        User userA = new User(account, 45000, "User A");
        User userB = new User(account, 20000, "User B");

        userA.start();
        userB.start();

        try {
            userA.join();
            userB.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Transaction processing complete.");
    }
}