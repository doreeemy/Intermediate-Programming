import java.util.Scanner;
public class MultiTable {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // Variable naming
    int start, end, i, j, sum;

    // Ask for two numbers, label them start and end to easily read syntax
    System.out.print("Enter first number: ");
    start = sc.nextInt();

    System.out.print("Enter second number: ");
    end = sc.nextInt();

    // For conciseness, loop through the possible range of numbers inputted
    for (i = start; i <= end; i++) {
      for (j = 1; j <= 10; j++) {
        sum = i * j;
        System.out.println(i + " X " + j + " = " + sum);
      }
      System.out.println(""); // Lines between tables
    }
   sc.close();
  }
}
