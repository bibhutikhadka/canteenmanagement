package models;

public class Waiter extends Employees {
    private int tablesAssigned;

    public Waiter(String employeeName, String employeePost, String employeeAddress, String employeeEmail, int employeeNumber, int tablesAssigned) {
        super(employeeName, employeePost, employeeAddress, employeeEmail, employeeNumber);
        this.tablesAssigned = tablesAssigned;
    }

    public void serveCustomer() {
        System.out.println("Serving customer at table " + tablesAssigned);
    }
}
