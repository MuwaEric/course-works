import java.util.ArrayList;

public class ArrayAccess {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Eric");
        names.add("Elisha");
        names.add("Elvis");
        System.out.println("Names after adding elements: " + names);

        String firstName = names.get(0);
        System.out.println("First name: " + firstName);

        names.remove("Eric");
        System.out.println("names after removing Eric: " + names);

    }
}
