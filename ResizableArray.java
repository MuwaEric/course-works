import java.util.ArrayList;

public class ResizableArray {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        // Adding names to the ArrayList
        names.add("Edrine");
        names.add("Adrian");
        names.add("Akampa");
        names.add("Anita");
        System.out.println("ArrayList after adding names: " + names);

        // Accessing and displaying names from the ArrayList
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Name at index " + i + ": " + names.get(i));
        }

        // Remove an element from the ArrayList
        names.remove("Adrian");
        System.out.println("ArrayList after removing Adrian: " + names);

        // Display elements using a for-each loop
        System.out.println("All names in the ArrayList:");
        for (String element : names) {
            System.out.println(names);
        }
    }
}
