import java.util.HashSet;

public class HashSet {
    public static void main(String[] args) {
        // Creating the HashSet to store unique elements
        HashSet<String> uniqueElements = new HashSet<>();

        uniqueElements.add("Apple");
        uniqueElements.add("Banana");
        uniqueElements.add("Mango");
        uniqueElements.add("Apple"); // Duplicate element

        // Display the HashSet
        System.out.println("HashSet elements: " + uniqueElements);

        // Check if a specific element exists
        if (uniqueElements.contains("Banana")) {
            System.out.println("Banana is in the HashSet.");
        } else {
            System.out.println("Banana is not in the HashSet.");
        }

        // Remove an element from the HashSet
        uniqueElements.remove("Mango");
        System.out.println("HashSet after removing Mango: " + uniqueElements);

        // Display all elements using a for-each loop
        System.out.println("All elements in the HashSet:");
        for (String element : uniqueElements) {
            System.out.println(element);
        }
    }
}
