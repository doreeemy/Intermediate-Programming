import java.util.regex.*;

public class MobileNoValidator {
    private static final String MOBILE_REGEX = "^09\\d{9}$";
    private static final Pattern MOBILE_PATTERN = Pattern.compile(MOBILE_REGEX);

    public static boolean isValidMobile(String mobile) {
        return MOBILE_PATTERN.matcher(mobile).matches();
    }

    public static void main(String[] args) {
        String[] tests = {
            "09171234567",
            "0912345",
            "12345678901",
            "Not a Number"
        };
        for (String m : tests) {
            System.out.printf("%-30s -> %s%n", m, isValidMobile(m));
        }
    }
}

