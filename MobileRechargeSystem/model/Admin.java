
package model;

public class Admin extends User {
    public Admin(String name, String phone) {
        super(name, phone);
    }

    @Override
    public void displayInfo() {
        System.out.println("Admin: " + name + " | Phone: " + phone);
    }
}
