package fmutils.helpers;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordManager {
    public String validPasswordFactory() {
        boolean isValidPassword;
        String password;
        Scanner in = new Scanner(System.in);

        do {
            isValidPassword = true;

            password = in.nextLine();

            if (password.length() < 8){
                System.out.println("Password too short!");
                isValidPassword = false;
            }
            if (!hasProperChars(password)){
                System.out.println("Password should contain one uppercase letter, one digit and one special character");
                isValidPassword = false;
            }

        } while (!isValidPassword);


        return password;
    }

    public boolean hasProperChars(String password) {
        char ch;
        boolean hasDigit = false;
        boolean hasUppercase = false;
        boolean hasSpecialChar = false;

        for (int i = 0; i < password.length(); i++ ) {
            ch = password.charAt(i);
            if (Character.isDigit(ch))
                hasDigit = true;
            if (Character.isUpperCase(ch))
                hasUppercase = true;
            if (isSpecialChar(password))
                hasSpecialChar = true;
            if (hasDigit && hasUppercase && hasSpecialChar)
                return true;
        }
        return false;
    }

    private boolean isSpecialChar(String password) {
        Pattern pattern = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(password);
        boolean isValid = matcher.find();

        if (isValid)
            return true;
        else
            return false;

    }

    public String generateRandomPassword() {
        PasswordGenerator passwordGenerator = new PasswordGenerator.PasswordGeneratorBuilder()
                .useDigits(true)
                .useLower(true)
                .useUpper(true)
                .useSpecial(true)
                .build();

        String password;

        do {
            password = passwordGenerator.generate(8);
        } while (!hasProperChars(password));

        return password;
    }
}
