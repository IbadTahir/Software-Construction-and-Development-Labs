package Lab3task3;

class Agent implements CommonFunctions {
    private int id;
    private String name;

    public Agent(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void searchTicket() {
        System.out.println("Agent " + name + " is searching for a ticket.");
    }

    @Override
    public void bookTicket() {
        System.out.println("Agent " + name + " is booking a ticket.");
    }

    @Override
    public void cancelTicket() {
        System.out.println("Agent " + name + " is canceling a ticket.");
    }

    @Override
    public void makePayment() {
        System.out.println("Agent " + name + " is processing payment.");
    }

    @Override
    public void fillDetails() {
        System.out.println("Agent " + name + " is filling details.");
    }
}
