import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = scanner.nextInt();
        scanner.close();

        String grade;
        switch (score / 10) {
            case 10:
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            case 5:
                grade = "E";
                break;
            default:
                grade = "F";
                break;
        }

        System.out.println("Grade = " + grade);
    }
}
























// import java.util.Scanner;
// public class Switched {
//     public static void main(String[] args) {
//         System.out.println("Please enter marks: ");
//         Scanner sc = new Scanner(System.in);
//         int num1;
//         num1 = sc.nextInt();
//         switch (num1/ 100) {
//             case 100:
//             case 90:
//             System.out.println("A");
//             break;

//             case 80:
//             System.out.println("B");
//             break;

//             case 70:
//             System.out.println("C");   
//                 break;

//             case 60:
//             System.out.println("D");
//             break;

//             case 50:
//             System.out.println("E");
//             break;

//             default:
//             System.out.println("F");
//                 break;
//         }
//     }
// }