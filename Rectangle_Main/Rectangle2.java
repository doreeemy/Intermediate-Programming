import java.util.Scanner;

public class Rectangle2_Main {
  public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  Rectangle r1 = new Rectangle();
  Rectangle r2 = new Rectangle();

  // Ask input of rectangles

  System.out.println("Length and Width of Rectangle 1: ");
  r1 = sc.NextInt();

  System.out.println("Length and Width of Rectangle 2: ");
  r2 = sc.NextInt();

  System.out.println("Rectangle 1: ");
  r1.displayInfo();

  System.out.println("Rectangle 2: ");
  r2.displayInfo();
  }
}
