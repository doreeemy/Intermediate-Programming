// Christopher Kiel B. San Miguel
// Paquito Alingog Jr.
// COM251

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.io.File;
import java.util.Scanner;

public class filereading {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String FileRead = "/mnt/sda/Documents/java/2ndsem/Intermediate-Programming/LabAct1.java";
    File file = new File(FileRead);
    Path path = Paths.get(FileRead);

    // Use try catch while reading the file to ensure no errors
    System.out.println("\n----Contents of LabAct1.java----\n");

    try {
      List<String> lines = Files.readAllLines(path);
      for (String l : lines) {
        System.out.println(l);
      }
    } catch (IOException e) {
      System.err.println("Error reading file: " + e.getMessage());
    } catch (SecurityException se) {
      System.err.println("Permission denied when reading: " + se.getMessage());
    }

    sc.close();
  }
}
