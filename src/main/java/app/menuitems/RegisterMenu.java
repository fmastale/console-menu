package app.menuitems;

import app.User;
import app.menuhelpers.EmailChecker;
import app.menuhelpers.LoginChecker;
import app.menuhelpers.PasswordManager;
import app.menuhelpers.PhoneChecker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegisterMenu implements MenuItem {

    private List<User> users = new ArrayList<>();

    public RegisterMenu(List<User> users) {
        this.users = users;
    }

    public Integer showContent() {
        Scanner in = new Scanner(System.in);

        //REGISTER FORM:
        //- LOGIN

        System.out.println("***************************************" +
                           "\nREGISTER");
        System.out.println("\nChoose login:" +
                         "\n- Note that it should be at least 3 characters long!");

        String login;
        boolean isLoginCorrect;

        do {
            System.out.println("Login: ");
            login = in.nextLine();
            isLoginCorrect = new LoginChecker().isValid(users, login);
        } while (!isLoginCorrect);

        //- PASSWORD
        System.out.println("\nSelect password:" +
                         "\n- It should contain one uppercase letter (e.g. 'A')" +
                         "\n- One digit (e.g. '1')" +
                         "\n- One special character ('%')." +
                           "\nPress:" +
                           "\n(1) To set password on your own" +
                           "\n(2) To generate random password");

        String password = null;
        boolean isValidOption;
        String option;

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
        System.out.println("Choose email:" +
                       "\n- Remember that valid email address should contain '@' e.g. johnsmith@mail.com");
        do {
            System.out.println("\nEmail: ");
            email = in.nextLine();
            isValidEmail = new EmailChecker().isValid(email);
        } while (!isValidEmail);


        //- PHONE
        // I assumed that we check if the number is valid  in Polish standard, which means that it should be 9 digits long
        String phone;
        boolean isValidPhone;
        System.out.println("\nChoose phone number:" +
                         "\n- Valid phone number should contain 9 digits and can't be separate with special characters or empty spaces");
        do {
            System.out.println("Phone: ");
            phone = in.nextLine();
            isValidPhone = new PhoneChecker().isValid(phone);
        } while(!isValidPhone);

        users.add(new User(login, password, email, phone));

        return 3;
    }
}
