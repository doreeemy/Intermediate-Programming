public class Rectangle {
  private double length;
  private double width;
  // Constructor
  public Rectangle(double length, double width){
    this.length=length;
    this.width=width;
  }
  public double getArea() {
    return length*width;
  }
  public double getPerimeter() {
    return 2*(length+width);
  }
  public void displayInfo() {
    System.out.println("Length: " + length);
    System.out.println("Width: " + width);
    System.out.println("Area: " + getArea());
    System.out.println("Perimeter: " + getPerimeter());
  }
}
