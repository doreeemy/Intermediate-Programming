// LAB ACTIVITY 1
// November 21, 2025
// Programmed by: Christopher Kiel B. San Miguel

import java.util.Scanner;
public class LabAct1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Variable Naming 
    int i, j, num; 
    long sum;

    // Decision Promt 
    System.out.println("\n---What would you like displayed?---\n");
    System.out.println("1 - ASTERISK");
    System.out.println("2 - TRIANGLE");
    System.out.println("3 - REVERSE");
    System.out.println("4 - COMBINED");
    System.out.println("5 - SUM OF ARRAY (Given)");
    System.out.println("6 - SUM OF ARRAY (Input)");
    System.out.println("7 - Array Operators");
    System.out.println("8 - Two-Dimensional Array");
    System.out.print("\nEnter your choice: ");
    int choice = sc.nextInt();
    System.out.println();

    switch (choice) {
      case 1: // Single line Asterisk

        // Ask for a number
        System.out.print("\nEnter a Number: ");
        num = sc.nextInt();

        // link i to asterisk(num)
        for (i = 1; i <= num; i++) {
          System.out.print("*");
        }

        break;

      case 2: // Ascending (Triangle)

       // Ask for a number
       System.out.print("\nEnter a Number: ");
       num = sc.nextInt();

       // link i to asterisk(num) and j to row
       for (i = 1; i <= num; i++) {
          for (j = 1; j <= i; j++) {
           System.out.print("*");
         }
         System.out.println("");
       }

        break;

      case 3: // Reverse (Descending)
 
       // Ask for a number
       System.out.print("\nEnter a Number: ");
       num = sc.nextInt();

       // link i to asterisk(num) and j to row but reverse syntax
       for (i = num; i >= 1; i--) {
          for (j = 1; j <= i; j++) {
            System.out.print("*");
         }
         System.out.println(""); 
        } 

        break;

      case 4: // Combined

       // Ask for a number
       System.out.print("\nEnter a Number: ");
       num = sc.nextInt();

       // Combine syntax of case 2 and 3
       for (i = 1; i <= num; i++) {
          for (j = 1; j <= i; j++) {
           System.out.print("*");
         }
         System.out.println("");
        }

       for (i = num - 1; i >= 1; i--) {
          for (j = 1; j <= i; j++) {
           System.out.print("*");
        }
        System.out.println("");
       }
 
       break;

      case 5: // Sum of Array (given)
      
       // Variables for this case
       int[] array1 = {6,9,6,9,6,9,6,9,6,9};
       int[] array2 = {7,2,7,2,7,2,7,2,7,2};

       for (i = 0; i < 10; i++) {
         sum = array1[i] + array2[i];
         System.out.println(sum);
       }

       break;

      case 6: // Sum of Array (input)
       
       // Initialize the 2 arrays here 
       int[] array3 = new int[10];
       int[] array4 = new int[10];
       int[] arraysum = new int[10];

       // Ask for the first array of number
       System.out.println("\n---Enter 10 numbers for array 1---\n");

       for (i = 0; i <= 9; i++) {
         System.out.print("Enter number " + (i + 1) + ": ");
         array3[i] = sc.nextInt();
       }
       
       System.out.println("\n---Enter 10 numbers for array 2---\n");

       for (i = 0; i <= 9; i++) {
         System.out.print("Enter number " + (i + 1) + ": ");
         array4[i] = sc.nextInt();
       }
       
       // Add and show output
       System.out.println("\n---The sum of array 1 and 2---\n");
       
       for (i = 0; i <= 9; i++) {
         // Add the two numbers at the same Array 
         arraysum[i] = array3[i] + array4[i];

         System.out.println(arraysum[i]);
       }

       break;

      case 7: // Array Operators
              
       // Initialize the 2 arrays here 
       int[] array5 = new int[10];
       int[] array6 = new int[10];
       int[] arraysum7 = new int[10];

       // Ask for the first array of numbers
       System.out.println("\n---Enter 10 numbers for array 1---\n");

       for (i = 0; i <= 9; i++) {
         System.out.print("Enter number " + (i + 1) + ": ");
         array5[i] = sc.nextInt();
       }
       
       System.out.println("\n---Enter 10 numbers for array 2---\n");

       for (i = 0; i <= 9; i++) {
         System.out.print("Enter number " + (i + 1) + ": ");
         array6[i] = sc.nextInt();
       }

       // Syntax it through +, -, *, /, %
       System.out.println("\nSum\tDiff\tProd\tQuot\tMod");

       for (i = 0; i <= 9; i++) {
         long a = array5[i];
         long b = array6[i];

         long sum2 = a + b;
         long diff = a - b;
         long prod = a * b;

         // Inititalize strings for the case of dividing by zero
         String quot;
         String mod;

         if (b != 0) {
           quot = String.valueOf(a / b);
           mod = String.valueOf(a % b);
         } else {
           quot = "N/A";
           mod = "N/A";
         }
         System.out.println(sum2 + "\t" + diff + "\t" + prod + "\t" + quot + "\t" + mod + "\t");
       }

        break;
  
      case 8: // Two dimensional array

       // Declare two 2-dimensional arrays
       int[][] twodarray1 = {{2,4},{6,8},{10,12},{14,16},{18,20}};
       int[][] twodarray2 = {{3,6},{9,12},{15,18},{21,24},{27,30}};

       // Loop for the 5 rows
       for (i = 0; i < 5; i++) {

         // Another loop for 2 columns
         for (j = 0; j < 2; j++) {

          // Add the numbers
          sum = twodarray1[i][j] + twodarray2[i][j];

          // output
          System.out.print(sum + "\t");
         
         }

         // New line after each row
         System.out.println();
       }
        
        break;

      default:
        break;
    }
   sc.close();
  }
}
