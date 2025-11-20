import java.util.Scanner;
public class FullCase {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Variable Naming
    int i, j, num;

    // Making decision prompt
    System.out.println("Choose the order you like");
	  System.out.println("A. Ascending");
    System.out.println("B. Descending");
    System.out.println("C. Triangle");
    System.out.print("Enter your choice here: ");
    String choice = sc.nextLine().toLowerCase();

    // Switch case 
    switch (choice) {
      case "a":
        System.out.print("Enter a number here: ");
        num = sc.nextInt();

        for (i = 1; i <= num; i++) {
          for (j = 1; j <= i; j++) {
            System.out.print("*");
          }
          System.out.println("");
        }
        break;

      case "b":
        System.out.print("Enter a number here: ");
        num = sc.nextInt();

        for (i = num; i >= 1; i--) {
          for (j = 1; j <= i; j++) {
            System.out.print("*");
          }
          System.out.println("");
        }
        break;

      case "c":
        System.out.print("Enter a number here: ");
        num = sc.nextInt();

        // Ascending the Triangle
        for (i = 1; i <= num; i++) {
          for (j = 1; j <= i; j++) {
            System.out.print("*");
          }
          System.out.println("");
        }

        // Descending the Triangle
        for (i = num - 1; i >= 1; i--) {
          for (j = 1; j <= i; j++) {
            System.out.print("*");
          }
          System.out.println("");
        }
        break;
    
      default:
        break;
    }
   sc.close();
  }
}
