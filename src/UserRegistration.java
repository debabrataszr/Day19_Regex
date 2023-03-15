import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
        UserRegistration ug = new UserRegistration();
        ug.firstName();

    }

    public void firstName() {
        Pattern pattern = Pattern.compile("[A-Z][a-z]{2,}");
        Matcher matcher = pattern.matcher("Debabrata");
        boolean value = matcher.matches();
        System.out.println("Result : "+value);
    }
}