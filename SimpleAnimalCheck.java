import java.util.Scanner;
public class SimpleAnimalCheck {
    public static boolean isCatOrDog(String animal) {
        if (animal.equals("cat")) {
            return true;
        } else if (animal.equals("dog")) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an animal: ");
        String input = sc.nextLine();

        if (isCatOrDog(input)) {
            System.out.println(input + " is either a cat or a dog.");
        } else {
            System.out.println(input + " is NOT cat or dog.");
        }
        sc.close();
    }
}
