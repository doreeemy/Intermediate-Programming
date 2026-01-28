// LAB ACTIVITY 2 
// November 28, 2025
// Programmed by: Kiel San Miguel

import java.util.Scanner;
public class LabAct2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Variable Naming
    int i, j, size1, size2, attempts;
    String Username = "KIEL";
    String Password = "SANMIGUEL";

    // 3 attempts loop for wrong inputs (capitalize user input always)
    do {
      System.out.println("\n---Enter Login Credentials---\n");
      System.out.print("Enter your Username: ");
      String UserInput = sc.nextLine.toUpperCase();

      System.out.print("Enter your Password: ");
      String PassInput = sc.nextLine.toUpperCase();

      if (UserInput.equals(Username) || UserPass.equals(PassInput)) {
        // If correct
        System.out.println("\nCredentials entered are correct!\n");
      } else { // If wrong
        attempts++
      }

    }  while (attempts < 4) 

     if (attempts == 4) {
       System.out.println("Too much failed attempts");        
     }

    // Loop for however many inputs of array 1 the user wants
    System.out.print("\nEnter the size of Array 1: ");
    size1 = sc.nextInt();

    long[] AvgArray1 = new long[size1];

    System.out.println("\n---Enter " + size1 + " numbers for Array 1---\n");

    for (i = 0; i < size1; i++) {
      System.out.print("Enter number " + (i + 1) + ": ");
      AvgArray1[i] = sc.nextLong();
    }

    // Same loop for array 2
    System.out.print("\nEnter the size of Array 2: ");
    size2 = sc.nextInt();

    long[] AvgArray2 = new long[size2];

    System.out.println("\n---Enter " + size2 + " numbers for Array 2---\n");

    for (i = 0; i < size2; i++) {
      System.out.print("Enter number " + (i + 1) + ": ");
      AvgArray2[i] = sc.nextLong();
    }

    // initialize sums and compute for average 
    long sum1 = 0;
    long sum2 = 0;

    // Array 1 sum up
    for (i = 0; i < size1; i++) {
      sum1 += AvgArray1[i];
    }

    // Array 2 sum up
    for (i = 0; i < size2; i++) {
      sum2 += AvgArray2[i];
    }

    // For numbers like averages, double is the most precise 
    double avg1 = (double) sum1 / size1;
    double avg2 = (double) sum2 / size2;

    // Average of both arrays
    long totalsum = sum1 + sum2;
    long totalsize = size1 + size2;
    double avgcombined = (double) totalsum / totalsize;

    // Display output
    System.out.println("\n---RESULTS---\n");
    System.out.printf("Average of Array 1: %.2f\n", avg1);
    System.out.printf("Average of Array 2: %.2f\n", avg2);
    System.out.printf("Average of both Arrays: %.2f\n", avgcombined);

    sc.close();
  }
}

