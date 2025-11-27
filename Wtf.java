import java.util.Scanner;
public class Wtf {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Variables
    int i, j, size1, size2;

    // Loop for however many inputs of array 1 the user wants
    System.out.println("-----Welcome-----");
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
    System.out.println("\n-----------------------------------------------------------------");
    System.out.println("\n\tArray 1\tArray 2\tSum\tDiff\tProd\tQuot\tMod_Div");

    for (i = 0; i < maxsize; i++) {
      // Have to get value of array Array1
      long val1;
      if (i < size1) {
        val1 = Array1[i];
      } else {
        val1 = 0;   // in order to get a proper table, there has to be a validation for if user inputs uneven array sizes
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
      System.out.println("\t" + val1 + "\t" + val2 + "\t" + sum[i] + "\t" + diff[i] + "\t" + prod[i] + "\t" + quot[i] + "\t" + mod[i]);
    }
      System.out.println("\n-----------------------------------------------------------------");
      System.out.print("Highest\t");
      System.out.println(Highest(Array1) + "\t" + Highest(Array2) + "\t" + Highest(sum) + "\t" + 
                 Highest(diff) + "\t" + Highest(prod) + "\t" + Highest(quot) + "\t" + Highest(mod));

      System.out.print("Lowest\t");
      System.out.println(Lowest(Array1) + "\t" + Lowest(Array2) + "\t" + Lowest(sum) + "\t" + 
                 Lowest(diff) + "\t" + Lowest(prod) + "\t" + Lowest(quot) + "\t" + Lowest(mod));

      sc.close();
  }
     public static long Highest(long[] array) {
      if (array.length == 0) return 0;
      long max = array[0];
      for (int i = 1; i < array.length; i++) {
          if (array[i] > max) max = array[i];
      }
      return max;
    }

     public static long Lowest(long[] array) {
      if (array.length == 0) return 0;
      long min = array[0];
      for (int i = 1; i < array.length; i++) {
          if (array[i] < min) min = array[i];
      }
      return min; 
    }
}
