import java.util.Scanner;
public class Ascending {
  public static void main(String args[]) {
   Scanner sc = new Scanner(System.in);

   int num, i, j;

   System.out.print("Enter a number here: ");
   num = sc.nextInt();

   for (i = 1; i <= num; i++) {
      for (j = 1; j <= i; j++) {
       System.out.print("*");
     }
     System.out.println("");
    }
   sc.close();
  }
}
