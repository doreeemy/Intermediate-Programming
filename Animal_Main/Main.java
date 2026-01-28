import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Animal a1 = new Dog("Buddy");
    Animal a2 = new Cat("Kitty");

    a1.makeSound(); // For dogs
    a2.makeSound(); // For cats
                  
    a1.setName("Max"); // Encapsulatipon demo via setter

    System.out.println("Updated dog name: " + a1.getName());
  }
}
