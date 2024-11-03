package Lab3task3;
class Refund {
    private float amount;
    private String customerId;

    public Refund(float amount, String customerId) {
        this.amount = amount;
        this.customerId = customerId;
    }

    public void refundAmount() {
        System.out.println("Refunding amount: " + amount + " to customer ID: " + customerId);
    }
}
