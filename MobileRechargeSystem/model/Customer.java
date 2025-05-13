
package model;

public class Customer extends User {
    private double balance;

    public Customer(String name, String phone, double balance) {
        super(name, phone);
        this.balance = balance;
    }

    public void recharge(double amount) {
        balance -= amount;
        System.out.println("Recharge successful. New balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public void displayInfo() {
        System.out.println("Customer: " + name + " | Phone: " + phone + " | Balance: " + balance);
    }
}
