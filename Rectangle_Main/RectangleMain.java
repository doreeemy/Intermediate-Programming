import java.util.Scanner;

public class RectangleMain {
  public static void main(String[] args) {
    // Create Rectangle objects
    Rectangle r1 = new Rectangle(5,3);
    Rectangle r2 = new Rectangle(10, 4);

    System.out.println("Rectangle 1: ");
    r1.displayInfo();

    System.out.println();

    System.out.println("Rectangle 2: ");
    r2.displayInfo();
  }
}
