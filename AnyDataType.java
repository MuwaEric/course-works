public class AnyDataType {
    // Generic method to print array elements
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // different type arrays
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Eric", "Muwanika"};
        Double[] doubleArray = {1.1, 2.2, 3.3};

        // Calling the generic method with different types of arrays
        System.out.print("Integer Array: ");
        printArray(intArray);

        System.out.print("String Array: ");
        printArray(stringArray);

        System.out.print("Double Array: ");
        printArray(doubleArray);
    }
}
