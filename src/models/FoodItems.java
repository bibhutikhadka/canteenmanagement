package models;

    public class FoodItems {
        private String foodName;
        private double foodPrice;
        private String foodInfo;

        public FoodItems(String foodName, double foodPrice, String foodInfo) {
            this.foodName = foodName;
            this.foodPrice = foodPrice;
            this.foodInfo = foodInfo;
        }

        public String displayInfo() {
            return "Item: " + foodName + " | Price: Rs. " + foodPrice + " | Info: " + foodInfo;
        }

    }

