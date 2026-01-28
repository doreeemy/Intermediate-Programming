import java.util.Scanner;

public class Rectangle2_Main {
  public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  // Ask input of rectangles

  System.out.print("Length and Width of Rectangle 1: ");
  double length1 = sc.nextDouble();
  double width1 = sc.nextDouble();
  Rectangle r1 = new Rectangle(length1, width1);

  System.out.println();

  System.out.print("Length and Width of Rectangle 2: ");
  double length2 = sc.nextDouble();
  double width2 = sc.nextDouble();
  Rectangle r2 = new Rectangle(length2, width2);

  System.out.println("Rectangle 1: ");
  r1.displayInfo();

  System.out.println();

  System.out.println("Rectangle 2: ");
  r2.displayInfo();
  }
}
