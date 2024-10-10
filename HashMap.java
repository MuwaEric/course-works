import java.util.HashMap;

public class HashMap {
    public static void main(String[] args) {
        // Creating the HashMap to store key value pairs
        HashMap<String, Integer> map = new HashMap<>();

        //key value pairs to the HashMap
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Oranges", 3);

        // Display the HashMap
        System.out.println("HashMap: " + map);

        // Access a value using its key
        int value = map.get("Banana");
        System.out.println("Value for key 'Banana': " + value);

        // Check if a key exists in the HashMap
        if (map.containsKey("Apple")) {
            System.out.println("Key 'Apple' exists in the HashMap.");
        }

        // Remove a key-value pair from the HashMap
        map.remove("Oranges");
        System.out.println("HashMap after removing 'Oranges': " + map);

        // Display all key-value pairs using a for-each loop
        System.out.println("All key-value pairs in the HashMap:");
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}
