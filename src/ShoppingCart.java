//IMPLEMENTATION OF ARRAY LIST
// PROPERTIES focussed: fast access,memory efficient , dynamic resizing
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<String> cart = new ArrayList<>();

    // Add item at end (automatic resizing)
    public void addItem(String item) {
        cart.add(item);
        System.out.println("Added: " + item);
    }

    // Remove by index (shifts elements)
    public void removeItem(int index) {
        if (index >= 0 && index < cart.size()) {
            String removed = cart.remove(index);
            System.out.println("Removed: " + removed);
        } else {
            System.out.println("Invalid index!");
        }
    }

    // Apply discount to every 3rd item (random access)
    public void applyDiscount() {
        for (int i = 2; i < cart.size(); i += 3) {
            String item = cart.get(i);
            System.out.println("Discount applied to: " + item);
        }
    }

    // Display cart (uses ArrayList.toString())
    public void showCart() {
        System.out.println("Your cart: " + cart);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Laptop");
        cart.addItem("Headphones");
        cart.addItem("Mouse");
        cart.addItem("Keyboard");

        cart.showCart();
        cart.removeItem(1); // Removes "Headphones"
        cart.applyDiscount();
        cart.showCart();
    }
}