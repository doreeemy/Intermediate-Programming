// LAB ACTIVITY 2 
// November 28, 2025
// Programmed by: Kiel San Miguel

import java.util.Scanner;

public class LabAct2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variable Naming
        int i, j, size1 = 0, size2 = 0;
        int attempts = 1;
        String Username = "KIEL";
        String Password = "SANMIGUEL";
        boolean LoginStatus = false;
        boolean key = false;

        // 3 attempts loop for wrong inputs (capitalize user input always)
        while (attempts < 4) {
            System.out.println("\n---Enter Login Credentials---\n");
            System.out.print("Enter your Username: ");
            String UserInput = sc.nextLine().toUpperCase();

            System.out.print("Enter your Password: ");
            String PassInput = sc.nextLine().toUpperCase();

            if (UserInput.equals(Username) && PassInput.equals(Password)) {
                // If correct
                System.out.println("\nCredentials entered are correct!\n");
                LoginStatus = true;
                key = true;
                break;
            } else {
                System.out.println("\nCredentials entered are incorrect.");
                attempts++;
                key = false;
            }
        }

        if (LoginStatus) {
            while (key) {
                // Decision Promt 
                System.out.println("\n---What would you like displayed?---\n");
                System.out.println("1 - Array SUM & Average");
                System.out.println("2 - Array Operators_HI_LO");
                System.out.println("3 - String Methods");
                System.out.println("4 - Exit");
                System.out.print("\nEnter your choice: ");
                int choice = sc.nextInt();
                System.out.println();

                switch (choice) {
                    case 1: // Array Sum and Average

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

                        break;

                    case 2: //Array Operators-Hi-LO

                        // Loop for however many inputs of array 1 the user wants
                        System.out.print("\nEnter the size of Array 1: ");
                        size1 = sc.nextInt();

                        long[] Array1 = new long[size1];

                        System.out.println("\n---Enter " + size1 + " numbers for Array 1---\n");

                        for (i = 0; i < size1; i++) {
                            System.out.print("Enter number " + (i + 1) + ": ");
                            Array1[i] = sc.nextLong();
                        }

                        // Same loop for array 2
                        System.out.print("\nEnter the size of Array 2: ");
                        size2 = sc.nextInt();

                        long[] Array2 = new long[size2];

                        System.out.println("\n---Enter " + size2 + " numbers for Array 2---\n");

                        for (i = 0; i < size2; i++) {
                            System.out.print("Enter number " + (i + 1) + ": ");
                            Array2[i] = sc.nextLong();
                        }

                        // Determine a maximum size to make sure result tables will be right
                        int maxsize = Math.max(size1, size2);

                        // Results arrays (scale to max size for tabling later)
                        long[] sum = new long[maxsize];
                        long[] diff = new long[maxsize];
                        long[] prod = new long[maxsize];
                        long[] quot = new long[maxsize];
                        long[] mod = new long[maxsize];

                        // Computing process
                        System.out.println("\n-----------------------------------------------------------------------------------------");
                        // Using printf to align columns perfectly
                        System.out.printf("%10s %10s %12s %12s %15s %10s %10s\n", 
                                          "Array 1", "Array 2", "Sum", "Diff", "Prod", "Quot", "Mod_Div");
                        System.out.println("-----------------------------------------------------------------------------------------");

                        for (i = 0; i < maxsize; i++) {
                            // Have to get value of array Array1
                            long val1;
                            if (i < size1) {
                                val1 = Array1[i];
                            } else {
                                val1 = 0; // in order to get a proper table, there has to be a validation for if user inputs uneven array sizes
                            }

                            // Same for Array2
                            long val2;
                            if (i < size2) {
                                val2 = Array2[i];
                            } else {
                                val2 = 0;
                            }

                            // Now calculate
                            sum[i] = val1 + val2;
                            diff[i] = val1 - val2;
                            prod[i] = val1 * val2;

                            // quot and mod are slightly different as they require a 0 validation
                            if (val2 != 0) {
                                quot[i] = val1 / val2;
                                mod[i] = val1 % val2;
                            } else {
                                quot[i] = 0;
                                mod[i] = 0;
                            }

                            // Print table
                            System.out.printf("%10d %10d %12d %12d %15d %10d %10d\n", 
                                              val1, val2, sum[i], diff[i], prod[i], quot[i], mod[i]);

                        }

                        System.out.println("-----------------------------------------------------------------------------------------\n");
                        
                        // Using printf for HI/LO to match table alignment
                        System.out.printf("HI %7d %10d %12d %12d %15d %10d %10d\n", 
                            Highest(Array1), Highest(Array2), Highest(sum), 
                            Highest(diff), Highest(prod), Highest(quot), Highest(mod));

                        System.out.printf("LO %7d %10d %12d %12d %15d %10d %10d\n", 
                            Lowest(Array1), Lowest(Array2), Lowest(sum), 
                            Lowest(diff), Lowest(prod), Lowest(quot), Lowest(mod));
                        System.out.println();

                        break;


                    case 3: // String Methods

                        // Ask for two Strings
                        sc.nextLine(); // Fixed: Added to consume newline leftover
                        System.out.print("Enter the first string: ");
                        String str1 = sc.nextLine();

                        System.out.println();

                        System.out.print("Enter the second string: ");
                        String str2 = sc.nextLine();

                        boolean result1;
                        int result2;
                        System.out.println();

                        // Output the string Methods
                        System.out.println("---String Methods---\n");
                        System.out.println("Length of String 1: " + str1.length());
                        System.out.println("Length of String 2: " + str2.length());

                        result1 = str1.equals(str2);
                        System.out.println("String 1 equals String 2: " + result1);

                        System.out.println("String 1 concatenated to String 2: " + str1.concat(str2));

                        result2 = str1.compareTo(str2);
                        System.out.println("Compare String 1 to String 2: " + result2);

                        System.out.println("String 1 replaced: " + str1.replace(" ", "*"));
                        System.out.println("String 2 replaced: " + str2.replace(" ", "*"));

                        break;

                    case 4: // Exit
                        key = false;

                        break;

                    default:
                        break;
                }
            }
        }
    }

    public static long Highest(long[] array) {
        if (array.length == 0) return 0;
        long max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }

    // Added the missing Lowest function so the code runs
    public static long Lowest(long[] array) {
        if (array.length == 0) return 0;
        long min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }
}
