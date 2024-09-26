import java.util.Scanner;
public class negPos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int num = scanner.nextInt();
        scanner.close();
        if (num > 0)
            System.out.println(num + " is positive");
            
        else if (num < 0) {
            System.out.println(num + " is negative");
        }

        else System.out.println(num + " is zero");
    }
    
}
