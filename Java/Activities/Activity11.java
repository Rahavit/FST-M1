package activities;
import java.util.HashMap;
import java.util.Map;
public class Activity11 {

        public static void main(String[] args) {
            Map<Integer, String> colours = new HashMap<>();

            // Add 5 random colours to the Map
            colours.put(1, "Red");
            colours.put(2, "Blue");
            colours.put(3, "Green");
            colours.put(4, "Yellow");
            colours.put(5, "Orange");

            // Print the Map to the console
            System.out.println("Map contents:");
            System.out.println(colours);

            // Remove one colour using the remove() method
            String removedColour = colours.remove(3);
            System.out.println("\nRemoved colour: " + removedColour);

            // Check if the colour "Green" exists in the Map using containsValue() method
            boolean containsGreen = colours.containsValue("Green");
            System.out.println("\nDoes the Map contain the colour 'Green'? " + containsGreen);

            // Print the size of the Map using the size() method
            int size = colours.size();
            System.out.println("\nSize of the Map: " + size);
        }
    }
