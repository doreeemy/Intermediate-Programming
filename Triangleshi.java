ort java.util.Scanner;
public class Triangleshi {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int i, j, num;

    System.out.print("Enter a number here: ");
    num = sc.nextInt();
    
    // pataas part
    for (i = 1; i <= num; i++) {
       for (j = 1; j <= i; j++) {
         System.out.print("*");
       }
       System.out.println("");
    }

    // pababa naman
    for (i = num - 1; i >= 1; i--) {
        for (j = 1; j <= i; j++) {
          System.out.print("*");
        }
     System.out.println("");
    }
  sc.close();
  }
}
