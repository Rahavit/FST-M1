package activities;
import java.util.ArrayList;
public class Activity9 {

        public static void main(String[] args) {
            ArrayList<String> myList = new ArrayList<>();

            // Add 5 names to the ArrayList using add() method
            myList.add("John");
            myList.add("Emma");
            myList.add("Michael");
            myList.add("Sophia");
            myList.add("William");

            // Print all the names using a for loop
            System.out.println("Names in the ArrayList:");
            for (String name : myList) {
                System.out.println(name);
            }

            // Retrieve the 3rd name in the ArrayList using get() method
            String thirdName = myList.get(2);
            System.out.println("\nThird name in the ArrayList: " + thirdName);

            // Use contains() method to check if a name exists in the ArrayList
            String nameToCheck = "Sophia";
            boolean nameExists = myList.contains(nameToCheck);
            System.out.println("\nDoes the ArrayList contain the name " + nameToCheck + "? " + nameExists);

            // Use size() method to print the number of names in the ArrayList
            int size = myList.size();
            System.out.println("\nNumber of names in the ArrayList: " + size);

            // Use remove() method to remove a name from the list
            String nameToRemove = "Emma";
            myList.remove(nameToRemove);

            // Print the size() of the list again after removing a name
            int newSize = myList.size();
            System.out.println("\nNumber of names in the ArrayList after removing " + nameToRemove + ": " + newSize);
        }
    }

