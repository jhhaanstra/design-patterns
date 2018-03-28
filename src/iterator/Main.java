package iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Iterator pattern lets you iterate over an array without a for loop.
 * This can be done in different ways
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Tomato");

        // Standard iterator which is more flexible
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // For loop shortened
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Foreach lambda, more modern an preferred imo.
        fruits.forEach(e -> {System.out.println(e);});
    }
}
