import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class MatcherExample {
  public static void main(String[] args) {
    Pattern p = Pattern.compile("geeks");
    Matcher m = p.matcher("geeksforgeeks.org");
    
    while (m.find()) {
      System.out.println("Pattern found from " + m.start() + " to " + (m.end() - 1));
    }
  }
}
