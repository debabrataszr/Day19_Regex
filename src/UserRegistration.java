import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
        UserRegistration ug = new UserRegistration();
        ug.firstName();
        ug.lastName();
        ug.emailId();
        ug.mobileNumber();
        ug.password();
        ug.upperCasePassword();
        ug.numericPassword();
        ug.specialCharPassword();
        ug.verifyEmailSamples();
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

    public void emailId() {
        System.out.println("Result for EmailId : " + Pattern.compile("[a-z]+[.]?[a-z]{0,}[@][a-z]+[.][a-z]{2,4}[.]?[a-z]{0,2}")
                .matcher("abc@yahoo.com").matches());
    }

    public void mobileNumber() {
        System.out.println("Result for Mobile No. : " + Pattern.matches("^[0-9]{2}[ ][0-9]{10}$", "91 7978058968"));
    }

    public void password() {
        Pattern pattern = Pattern.compile("[A-Za-z]{8,}");
        Matcher matcher = pattern.matcher("Debabrat");
        System.out.println("Result for minimum 8 Character : " + matcher.matches());
    }

    public void upperCasePassword() {
        Pattern pattern2 = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z]).+${8,}");
        Matcher matcher2 = pattern2.matcher("Debabrat");
        if (matcher2.matches() == true) {
            System.out.println("Correct Password");
        } else {
            System.out.println("Incorrect Password");
        }
    }

    public void numericPassword() {
        Pattern pattern2 = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).+${8,}");
        Matcher matcher2 = pattern2.matcher("Debabrata23");
        if (matcher2.matches() == true) {
            System.out.println("Correct Password");
        } else {
            System.out.println("Incorrect Password");
        }
    }

    public void specialCharPassword() {
        Pattern patternThree = Pattern.compile("^(?=.+[a-z])(?=.+[A-Z])(?=.+[0-9])(?=.+[-+_!@#$%^&*., ?]).+${8,}");
        Matcher matcherThree = patternThree.matcher("Debabrat4S@hoo");
        if (matcherThree.matches() == true) {
            System.out.println("Correct Password");
        } else {
            System.out.println("Incorrect Password");
        }
    }

    private void verifyEmailSamples() {
        String[] validEmails = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com",
                "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au",
                "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"};

        String[] inValidEmails = {"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com",
                ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com",
                "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"};

        for (int i = 0; i < validEmails.length; i++) {
            System.out.println("Result for emails = " + (i + 1) + " "
                    + Pattern.matches("[a-z-+0-9]+[.]?[a-z0-9]+[@][a-z0-9]+[.][a-z]{2,4}[.]?[a-z]{0,3}", validEmails[i]));
        }
        System.out.println("\nFor Invalid Emails ");
        for (int i = 0; i < inValidEmails.length; i++) {
            System.out.println("Result for emails = " + (i + 1) + " "
                    + Pattern.matches("[a-z-+0-9]+[.]?[a-z0-9]+[@][a-z0-9]+[.][a-z]{2,4}[.]?[a-z]{0,3}", inValidEmails[i]));
        }
    }
}