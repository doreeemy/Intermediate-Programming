// Lab Activity 3
// December 9, 2025
// Christopher Kiel B. San Miguel
 
import java.util.Scanner;
public class LabAct3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
 
        // Display Menu and get user choice
        System.out.println();
        System.out.println("--- Java Lab Activities ---");
        System.out.println("1. String Manipulation");
        System.out.println("2. DIVISION");
        System.out.println("3. DIVISIONMISTAKE");
        System.out.println("4. Exit");
        System.out.println("---------------------------");
        System.out.print("Enter your choice: ");
        if (sc.hasNextInt()) {
            choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character
        } else {
            System.out.println("Invalid input. Please enter a number.");
            sc.close();
            return;
        }
 
        System.out.println();
 
        // Switch statement to handle the choice user makes
        switch (choice) {
            case 1:
                // Variables
                String str1;
                String str2;
                String str3;
 
                // Introduction and input
                System.out.println();
                System.out.println("1. String Manipulation");
                System.out.println("\n------------------------\n");
 
                System.out.print("Input String 1: ");
                str1 = sc.nextLine();
 
                System.out.print("Input String 2: ");
                str2 = sc.nextLine();
 
                System.out.print("Input String 3: ");
                str3 = sc.nextLine();
 
                // Output
                System.out.println("\n------------------------\n");
                System.out.printf("a.          " + str1.length() + ", " + str2.length() + ", " + str3.length());
                System.out.println();
                System.out.printf("\nb.          " + str1.replace(' ', '*') + ", " + str2.replace(' ', '*') + ", " + str3.replace(' ', '*'));
                System.out.printf("\nc.          Concatenate: ");
                System.out.printf("\n            " + str1.concat(str2));
                System.out.printf("\n            " + str2.concat(str3));
                System.out.printf("\n            " + str1.concat(str2.concat(str3)));
                System.out.printf("\nd.          Compare: ");
                System.out.printf("\n            " + str1.compareTo(str2));
                System.out.printf("\n            " + str2.compareTo(str3));
                System.out.printf("\n            " + str2.compareTo(str1));
 
                break;
 
            case 2:
                // Variables
                int numerator, denominator, result;
 
                // Input and Computation
                System.out.print("Enter numerator >> ");
                numerator = sc.nextInt();
 
                System.out.print("Enter denominator >> ");
                denominator = sc.nextInt();
 
                result = numerator / denominator;
 
                System.out.println("\n" + numerator + " / " + denominator + " = " + result);
 
                break;
 
            case 3:
                // Input and Computation
                System.out.print("Enter numerator >> ");
                numerator = sc.nextInt();
 
                System.out.print("Enter denominator >> ");
                denominator = sc.nextInt();
 
                try {
                  result = numerator / denominator;
                  System.out.println("\n" + numerator + " / " + denominator + " = " + result);
                }
 
                catch (ArithmeticException mistake) {
                  System.out.println("Arithmetic exception was thrown and caught");
                  System.out.println("\nEnd of program");
                }
                break;
 
            case 4:
                System.out.println("End of program. Goodbye!");
                break;
 
            default:
                System.out.println("Invalid choice. Please select an option from the menu (1-4).");
        }
 
        sc.close();
    }
}
