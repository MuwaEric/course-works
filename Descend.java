import java.util.Arrays;
import java.util.Collections;

public class Descend {
    public static void main(String[] args) {
        Integer[] numbers = {5, 3, 8, 1, 2};

        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println(Arrays.toString(numbers));
    }
}
