package models;

    public class Employees {
        private String employeeName;
        private String employeePost;
        private String employeeAddress;
        private String employeeEmail;
        private int employeeNumber;

        public Employees(String employeeName, String employeePost, String employeeAddress, String employeeEmail, int employeeNumber) {
            this.employeeName = employeeName;
            this.employeePost = employeePost;
            this.employeeAddress = employeeAddress;
            this.employeeEmail = employeeEmail;
            this.employeeNumber = employeeNumber;
        }

        public void displayInfo() {
            System.out.println("Name: " + employeeName);
            System.out.println("Post: " + employeePost);
            System.out.println("Address: " + employeeAddress);
            System.out.println("Email: " + employeeEmail);
            System.out.println("Employee Number: " + employeeNumber);
        }
    }

