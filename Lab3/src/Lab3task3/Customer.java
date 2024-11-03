package Lab3task3;

class Customer {
    private String custId;
    private String name;
    private String address;
    private int phNo;
    private int age;

    public Customer(String custId, String name, String address, int phNo, int age) {
        this.custId = custId;
        this.name = name;
        this.address = address;
        this.phNo = phNo;
        this.age = age;
    }

    public void addDetails() {
        System.out.println("Adding details for customer: " + name);
    }

    public void modifyDetails() {
        System.out.println("Modifying details for customer: " + name);
    }

    public String getCustId() {
        return custId;
    }
}
