import java.util.ArrayList;
public class GroceryListManager {
    private ArrayList<Item> groceryList = new ArrayList<>();
    public void addItem(String item, double cost, String category, int quantity) {
        groceryList.add(new Item(item, cost, category, quantity));
    }
    public void updateQuantity(String item, int newQuantity) {
        for (Item i : groceryList) {
            if (i.name.equals(item)) {
                i.quantity = newQuantity;
            }
        }
    }
    public void displayAvailableItems() {
        for (Item i : groceryList) {
            if (i.quantity > 0) {
                System.out.println(i.name + " (" + i.quantity + ")");
            }
        }
    }
    public void displayByCategory(String category) {
        System.out.println(category + ":");
        for (Item i : groceryList) {
            if (i.category.equals(category)) {
                System.out.println(i.name + " (" + i.quantity + ")");
            }
        }
    }
    public double calculateTotalCost() {
        double total = 0;
        for (Item i : groceryList) {
            total += i.cost * i.quantity;
        }
        return total;
    }
}