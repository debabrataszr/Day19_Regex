import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
        UserRegistration ug = new UserRegistration();
        ug.firstName();
        ug.lastName();
    }

    public void firstName() {
        Pattern pattern1 = Pattern.compile("[A-Z][a-z]{2,}");
        Matcher matcher1 = pattern1.matcher("Debabrata");
        boolean value1 = matcher1.matches();
        System.out.println("Result for First Name : " + value1);
    }

    public void lastName() {
        Pattern pattern2 = Pattern.compile("[A-z][A-za-z]{2,}");
        Matcher matcher2 = pattern2.matcher("Sahoo");
        boolean value2 = matcher2.matches();
        System.out.println("Result for Last Name : " + value2);
    }
}