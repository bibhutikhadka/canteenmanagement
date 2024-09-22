package models;

import java.util.ArrayList;

public class Menu {
    private String menuName;
    private ArrayList<FoodItems> menuItems;

    public Menu(String menuName) {
        this.menuName = menuName;
        this.menuItems = new ArrayList<>();
    }

    public void addFoodItems(FoodItems item) {
        this.menuItems.add(item);
    }

    public void displayMenu() {
        System.out.println(menuName + " Menu:");
        for (FoodItems item : menuItems) {
            System.out.println(item.displayInfo());
        }
    }
}

