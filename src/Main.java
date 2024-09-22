import java.util.Scanner;
import models.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Chef chef1 = new Chef("John", "Head Chef", "123 Street", "john@canteen.com", 101, "Pasta");
        Waiter waiter1 = new Waiter("Alice", "Waiter", "456 Street", "alice@canteen.com", 102, 5);
        Manager manager1 = new Manager("Bob", "Manager", "789 Street", "bob@canteen.com", 103, 10);

        FoodItems item1 = new FoodItems("Burger", 150, "Delicious beef burger");
        FoodItems item2 = new FoodItems("Pizza", 250, "Cheesy pizza with toppings");
        FoodItems item3 = new FoodItems("Pasta", 200, "Creamy white sauce pasta");

        Menu canteenMenu = new Menu("Canteen");
        canteenMenu.addFoodItems(item1);
        canteenMenu.addFoodItems(item2);
        canteenMenu.addFoodItems(item3);

        System.out.println("Welcome to the Canteen Management System!");
        System.out.println("1: View Employee Info | 2: View Menu | 3: Order Food | 4: Exit");
        int choice = sc.nextInt();

        while (choice != 4) {
            if (choice == 1) {
                System.out.println("Choose employee: 1: Chef | 2: Waiter | 3: Manager");
                int empChoice = sc.nextInt();
                if (empChoice == 1) {
                    chef1.displayInfo();
                    chef1.cookDish();
                } else if (empChoice == 2) {
                    waiter1.displayInfo();
                    waiter1.serveCustomer();
                } else if (empChoice == 3) {
                    manager1.displayInfo();
                    manager1.scheduleEmployees();
                } else {
                    System.out.println("Invalid choice.");
                }

            } else if (choice == 2) {
                canteenMenu.displayMenu();

            } else if (choice == 3) {
                // Ordering food
                System.out.println("Choose food to order: 1: Burger | 2: Pizza | 3: Pasta");
                int foodChoice = sc.nextInt();
                if (foodChoice == 1) {
                    System.out.println("Ordered " );
                } else if (foodChoice == 2) {
                    System.out.println("Ordered " );
                } else if (foodChoice == 3) {
                    System.out.println("Ordered " );
                } else {
                    System.out.println("Invalid food choice.");
                }

            } else {
                System.out.println("Invalid option.");
            }

            System.out.println("1: View Employee Info | 2: View Menu | 3: Order Food | 4: Exit");
            choice = sc.nextInt();
        }

        System.out.println("Thank you for using the Canteen Management System!");
    }
}
