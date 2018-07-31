package fmutils.menus;

import fmutils.User;
import fmutils.helpers.EmailChecker;
import fmutils.helpers.LoginChecker;
import fmutils.helpers.PasswordManager;
import fmutils.helpers.PhoneChecker;

import java.util.List;
import java.util.Scanner;

public class RegisterMenu {

    public void showContent(List<User> users) {
        Scanner in = new Scanner(System.in);

        //todo: pozbyć się lincznika i zmienic petle
        int i = 0;

        while (i < 2){

            //REGISTER FORM:
            //- LOGIN
            String login;
            boolean isLoginCorrect;
            System.out.println("Choose login. Note that it should be at least 3 characters long!");

            do {
                System.out.println("Login: ");
                login = in.nextLine();
                isLoginCorrect = new LoginChecker().isValid(users, login);
            } while (!isLoginCorrect);

            //- PASSWORD
            String password = null;
            boolean isValidOption;
            String option;

            System.out.println("Select password:\n- It should contain one uppercase letter (e.g. 'A')\n" +
                    "- One digit (e.g. '1')\n- One special character ('%').\n" +
                    "Press:\n(1) To set password on your own\n(2) To generate random password");

            do {
                isValidOption = false;

                option = in.nextLine();

                if (option.equals("1")){
                    System.out.println("Write password: ");
                    password = new PasswordManager().validPasswordFactory();
                    isValidOption = true;
                }
                else if (option.equals("2")){
                    password = new PasswordManager().generateRandomPassword();
                    System.out.println("Your password is: " + password);
                    isValidOption = true;
                }
                else if (!option.equals("1") && !option.equals("2")){
                    System.out.println("Wrong value! Choose between (1) and (2)");
                }
            } while (!isValidOption);


            //- EMAIL
            // Note that this is 'naive' way of validating email.
            // In 'normal' way you want to send back registration email to address given in form.
            String email;
            boolean isValidEmail;
            System.out.println("Valid email address should contain '@' e.g. one@inthe.zoo");
            do {
                System.out.println("Email: ");
                email = in.nextLine();
                isValidEmail = new EmailChecker().isValid(email);
            } while (!isValidEmail);


            //- PHONE
            // I assumed that we check if the number is valid  in Polish standard, which means that it should be 9 digits long
            String phone;
            boolean isValidPhone;
            System.out.println("Valid phone number should contain 9 digits and can't be separate with special characters like or empty spaces");
            do {
                System.out.println("Phone: ");
                phone = in.nextLine();
                isValidPhone = new PhoneChecker().isValid(phone);
            } while(!isValidPhone);


            System.out.println();

            users.add(new User(login, password, email, phone));

            i++;
        }

        for (User u: users) {
            System.out.println(u.toString());
        }
    }
}
