import java.util.Scanner;
public class CourseWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Your age is " + age);

        System.out.println("Please enter your name: ");
        String name = scanner.next();
        System.out.println("Your name is " + name);
        scanner.nextLine();

        System.out.println("Please enter your full name: ");
        String fullName = scanner.nextLine();
        System.out.println("Your full name is " + fullName);
        scanner.close();
    }
}
