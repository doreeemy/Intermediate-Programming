import java.util.Scanner;
public class Descending {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num, j, i;

    System.out.print("Enter a number here: ");
    num = sc.nextInt();
 
    for (i = num; i >= 1; i--) {
       for (j = 1; j <= i; j++) {
        System.out.print("*");
      }
     System.out.println(""); 
    }
  sc.close();
  }
}
