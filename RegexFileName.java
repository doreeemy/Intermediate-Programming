import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexFileName {
    public static void main(String[] args) {
        String pattern = "^[a-zA-Z0-9_-]+\\.(jpg|png|gif)$";
        
        String filename = "file123.jpg";
        
        Pattern compiledPattern = Pattern.compile(pattern);
        
        Matcher matcher = compiledPattern.matcher(filename);

        if (matcher.matches()) {
            System.out.println("Valid image filename");
        } else {
            System.out.println("Invalid filename");
        }
    }
}
