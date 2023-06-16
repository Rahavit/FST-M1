package activities;
import java.util.HashSet;
public class Activity10 {
        public static void main(String[] args) {
            HashSet<String> hs = new HashSet<>();

            // Add 6 objects to the HashSet using add() method
            hs.add("Apple");
            hs.add("Banana");
            hs.add("Cherry");
            hs.add("Pineapple");
            hs.add("Strawberry");
            hs.add("Fig");

            // Print the size of the HashSet using the size() method
            int size = hs.size();
            System.out.println("Size of the HashSet: " + size);

            // Remove an element using the remove() method
            boolean removed = hs.remove("Cherry");
            System.out.println("\nElement 'Cherry' removed: " + removed);

            // Try to remove an element that is not present in the Set
            removed = hs.remove("Grapes");
            System.out.println("Element 'Grapes' removed: " + removed);

            // Use contains() method to check if an item is in the Set or not
            String itemToCheck = "Banana";
            boolean contains = hs.contains(itemToCheck);
            System.out.println("\nDoes the HashSet contain the item '" + itemToCheck + "'? " + contains);

            itemToCheck = "Cherry";
            contains = hs.contains(itemToCheck);
            System.out.println("\nDoes the HashSet contain the item '" + itemToCheck + "'? " + contains);

            // Print the updated set
            System.out.println("\nUpdated HashSet:");
            for (String item : hs) {
                System.out.println(item);
            }
        }
}
