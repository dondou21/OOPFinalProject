
package recharge;

public class Recharge {
    private String phoneNumber;
    private double amount;
    private String operator;

    public Recharge(String phoneNumber, double amount, String operator) {
        this.phoneNumber = phoneNumber;
        this.amount = amount;
        this.operator = operator;
    }

    public void printReceipt() {
        System.out.println("Recharged " + phoneNumber + " with " + amount + " via " + operator);
    }
}
