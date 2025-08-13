class FoodOrder {
    String foodItem;
    int quantity;
    double price;

    // Method to place an order
    void placeOrder(String item, int qty, double unitPrice) {
        foodItem = item;
        quantity = qty;
        price = unitPrice;
    }

    // Method to display the bill
    void generateBill() {
        double total = quantity * price;
        System.out.println(" Food Item   : " + foodItem);
        System.out.println(" Quantity    : " + quantity);
        System.out.println(" Price/item  : ₹" + price);
        System.out.println(" Total Amount: ₹" + total);
    }
}

public class OnlineFoodOrder {
    public static void main(String[] args) {
        FoodOrder order1 = new FoodOrder();

        // Placing an order
        order1.placeOrder("Veg Burger", 3, 90.0);

        // Generating bill
        order1.generateBill();
    }
}
