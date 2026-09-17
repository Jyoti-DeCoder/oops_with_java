import java.util.*;

public class ArrayListDemo2 {

    public static void addProduct(List<String> cart, String product) {
        // Write your code
        cart.add(product);
    }

    public static void removeProduct(List<String> cart, String product) {
        // Write your code
        cart.remove(product);
    }

    public static int countProduct(List<String> cart, String product) {
        // Write your code
        int count = 0;
        Iterator<String> i = cart.iterator();
        while (i.hasNext()) {
            if (i.next().equals(product))
                count++;
        }
        return count;
    }

    public static void displayCart(List<String> cart) {
        // Write your code
        Iterator<String> i = cart.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

    public static void main(String[] args) {

        List<String> cart = new ArrayList<>();

        addProduct(cart, "Laptop");
        addProduct(cart, "Mouse");
        addProduct(cart, "Keyboard");
        addProduct(cart, "Mouse");
        addProduct(cart, "Mouse");

        System.out.println("Cart:");
        displayCart(cart);

        System.out.println("Mouse quantity: "
                + countProduct(cart, "Mouse"));

        removeProduct(cart, "Mouse");

        System.out.println("After removing one Mouse:");
        displayCart(cart);
    }
}
