import java.util.regex.*;

public class EmailValidator {
    private static final String EMAIL_REGEX = "^[\\w.%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    public static boolean isValidEmail(String email) {
        return EMAIL_PATTERN.matcher(email).matches();
    }

    public static void main(String[] args) {
        String[] tests = {
            "sample@example.com",
            "it.support+help@my-domain.co.au",
            "sanmiguelcb@NU-dasma.edu.ph",
            "user@domain..m"
        };
        for (String e : tests) {
            System.out.printf("%-30s -> %s%n", e, isValidEmail(e));
        }
    }
}
