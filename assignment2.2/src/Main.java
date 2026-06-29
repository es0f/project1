//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GroceryListManager list = new GroceryListManager();
        list.addItem("Apple", 2.50, "Fruits", 10);
        list.addItem("Banana", 1.20, "Fruits", 5);
        list.addItem("Milk", 3.00, "Dairy", 5);
        list.addItem("Bread", 1.75, "Bakery", 0);
        System.out.println("Total Cost: $" +
                list.calculateTotalCost());
        System.out.println("\nItems in Fruits category:");
        list.displayByCategory("Fruits");
        System.out.println("\nAvailable Items:");
        list.displayAvailableItems();
        System.out.println("\nUpdating Milk quantity to 2...\n");
        list.updateQuantity("Milk", 2);
        list.displayAvailableItems();
    }
}