import java.util.Scanner;

public class Rectangle3_Main {
  public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  
  System.out.print("Enter the amount of Rectangles you want: ");
  int Rectangleamnt = sc.nextInt();

  Rectangle[] rectangles = new Rectangle[Rectangleamnt];

  for (int i = 0; i < Rectangleamnt; i++) {
    System.out.print("Enter the Length and Width of Rectangle " + (i + 1) + ": ");
    double length = sc.nextDouble();
    double width = sc.nextDouble();

    // store it in array
    rectangles[i] = new Rectangle(length, width);
  }

  System.out.println();

  // Another loop for displayInfo
  for (int i = 0; i < Rectangleamnt; i++) {
    System.out.println("Rectangle " + (i + 1) + ": ");
    rectangles[i].displayInfo();
    System.out.println();
  }
  }
}
