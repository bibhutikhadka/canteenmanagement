package models;

public class Chef extends Employees {
    private String specialtyDish;

    public Chef(String employeeName, String employeePost, String employeeAddress, String employeeEmail, int employeeNumber, String specialtyDish) {
        super(employeeName, employeePost, employeeAddress, employeeEmail, employeeNumber);
        this.specialtyDish = specialtyDish;
    }

    public void cookDish() {
        System.out.println("Cooking " + specialtyDish);
    }
}
