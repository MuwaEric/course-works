//java program to ask for password and allow user only three attempts using a while loop

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int attempt = 3;
        String password = "wegoggo";
        
        while (attempt > 0) {
            System.out.println("Please enter password: ");
            String newPassword = sc.nextLine();
            
            if (newPassword == password) {
                System.out.println("Access granted");
                break;
            } else {
                System.out.println("try again");
                attempt--;
            }
        }
        
        if (attempt == 0) {
            System.out.println("No attempts left.");
        }
        
        sc.close();
    }
}










































// import java.util.Scanner;

// public class whileLoop {
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int attempt = 3;
//     String password = "wegoggo";
//     System.out.println("Please enter password: ");
//     String newPassword = sc.nextLine();
//     while (attempt > 0 ) {
//         System.out.println("Acces granted");
//         attempt--;
    
//     if (attempt == 0) {
//         System.out.println("Access denied");
//     }
//     }
// }

    
// }