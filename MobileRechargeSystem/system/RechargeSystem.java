
package system;

import model.Customer;
import recharge.Recharge;

import java.util.ArrayList;
import java.util.Scanner;

public class RechargeSystem {
    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<Recharge> recharges = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        System.out.println("Welcome to the Mobile Recharge System!");

        Customer c1 = new Customer("Alice", "0788001122", 5000);
        customers.add(c1);

        while (true) {
            System.out.println("\n1. View Balance\n2. Recharge Phone\n3. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    c1.displayInfo();
                    break;
                case 2:
                    handleRecharge(c1);
                    break;
                case 3:
                    System.out.println("Thank you!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private void handleRecharge(Customer customer) {
        scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter operator (e.g., MTN, Airtel): ");
        String operator = scanner.nextLine();

        try {
            if (amount <= 0 || amount > customer.getBalance()) {
                throw new IllegalArgumentException("Invalid amount or insufficient balance.");
            }

            customer.recharge(amount);
            Recharge recharge = new Recharge(phone, amount, operator);
            recharges.add(recharge);
            recharge.printReceipt();
        } catch (Exception e) {
            System.out.println("Recharge failed: " + e.getMessage());
        }
    }
}
