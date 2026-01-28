import java.util.Scanner;

public class Animal {
  private String name; // Encapsulation
  
  public Animal(String name) {
    this.name = name;
  }

  public String getName() { return name; }
  public void setName(String name) { this.name = name; }

  // Method to be overridden
  public void makeSound() {
    System.out.println("The animal makes a sound.");
  }
}
