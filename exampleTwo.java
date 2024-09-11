import java.util.Scanner;
public class exampleTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //asking for user name
        System.out.println("Please enter your name: ");
        String name = sc.nextLine();

        //asking for user age
        System.out.println("Please enter your age: ");
        int age = sc.nextInt();

        //asking for user favorite food
        System.out.println("What is the favorite food: ");
        String food = sc.next();

        //outputting the information
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("food: " + food);
        System.out.println("your name is " + name + "and you are " + age + " years old and your favorite food is "+ food);

        sc.close();

    }
    
}
