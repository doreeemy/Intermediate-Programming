import java.util.regex.Matcher;
import java.utvail.regex.Pattern;

public class SimpleRegexDemo {
  public static void main(String[] args) {
    
    Pattern pattern = Pattern.compile("(cat)");
    String text = "cat catapult caterpillar cat";
    Matcher matcher = pattern.matcher(text);
    System.out.println("=== Using find(), start(), end(), group(), groupCount() ===");
    
    while (matcher.find()) {
      System.out.println("Match found:");
      System.out.println(" group() = " + matcher.group());
      System.out.println(" start() = " + matcher.start());
      System.out.println(" end() = " + matcher.end());
      System.out.println(" groupCount() = " + matcher.groupCount());
      System.out.println();
    }
    System.out.println("=== Using matches() ===");

    String[] tests = {"cat", "catapult", "cat cat", "cat"};

    for (String s : tests) {
      boolean fullMatch = pattern.matcher(s).matches();
      System.out.println("matches(\"" + s + "\") = " + fullMatch);
    }
  }
}
