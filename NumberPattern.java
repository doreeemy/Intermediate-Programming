import java.util.Scanner;
public class NumberPattern {
  public static void main(String args[]) {
   Scanner sc = new Scanner(System.in);

   int num, i, j;

   System.out.print("Enter a number here: ");
   num = sc.nextInt();
   
   // i is the amount of loops equating to the number inputted, j is writing the number
   for (i = 1; i <= num; i++) {
      for (j = 1; j <= i; j++) {
       System.out.print(j);
     }
     System.out.println("");
    }
   sc.close();
  }
}
