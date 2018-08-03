package app.menuitems;

import app.User;
import app.menuhelpers.EmailChecker;
import app.menuhelpers.PhoneChecker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoginMenu implements MenuItem {

    private List<User> users = new ArrayList<>();

    public LoginMenu(List<User> users) {
        this.users = users;
    }

    public Integer showContent() {
        Scanner in = new Scanner(System.in);

        Boolean isValidLogAndPass;

        String login;
        String password;

        do {
            System.out.println("***************************************" +
                             "\nLOGIN\n" +
                             "\nEnter login and password!");

            isValidLogAndPass = false;

            System.out.println("- Enter login: ");
            login = in.nextLine();

            System.out.println("- Enter password: ");
            password = in.nextLine();

            for (User u : users) {
                if (u.getLogin().equals(login) && u.getPassword().equals(password)){
                    System.out.println("Login and password correct!\n");
                    isValidLogAndPass = true;
                }
            }
            if (isValidLogAndPass == false){
                System.out.println("Login and password incorrect!" +
                                 "\nWant to exit? Press (e) !" +
                                 "\nWant to try again? Press any other key!");
                String exit = in.nextLine();
                if (exit.equals("e")){
                    System.exit(0);
                }
            }

        } while (!isValidLogAndPass);

        showAfterLoginMenu(login);

        return 1;
    }

    private void showAfterLoginMenu(String login) {
        boolean wantToExit;

        Scanner in = new Scanner(System.in);
        String option;
        do {
            System.out.println("***************************************\n");
            System.out.println("You can:" +
                    "\n(1) Change email address" +
                    "\n(2) Change phone number" +
                    "\n(e) Logout");

            wantToExit = false;
            option = in.nextLine();

            if (option.equals("1")) {
                System.out.println("Change your email: ");
                String email = in.nextLine();
                if (new EmailChecker().isValid(email)){
                    users.stream().filter(user -> user.getLogin().equals(login))
                            .forEach(user -> user.setEmail(email));
                    System.out.println("Email changed!");
                }
            }
            else if (option.equals("2")) {
                System.out.println("Change your phone: ");
                String phone = in.nextLine();
                if (new PhoneChecker().isValid(phone)){
                    users.stream().filter(user -> user.getLogin().equals(login))
                            .forEach(user -> user.setPhone(phone));
                    System.out.println("Phone number changed!");
                }
            }
            else if (option.equals("e")) {
                System.out.println("you want to logout");
                wantToExit = true;
            }

            for (User user: users) {
                user.toString();
            }
        } while (!wantToExit);
    }
}
