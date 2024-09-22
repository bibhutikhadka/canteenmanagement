package models;

public class Manager extends Employees {
    private int managedEmployees;

    public Manager(String employeeName, String employeePost, String employeeAddress, String employeeEmail, int employeeNumber, int managedEmployees) {
        super(employeeName, employeePost, employeeAddress, employeeEmail, employeeNumber);
        this.managedEmployees = managedEmployees;
    }

    public void scheduleEmployees() {
        System.out.println("Scheduling employees for the week.");
    }
}
