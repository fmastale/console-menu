package app.menuitems;

import app.User;
import app.menuhelpers.EmailChecker;
import app.menuhelpers.PhoneChecker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AfterLoginMenu implements MenuItem {
    private List<User> users = new ArrayList<>();
    private String login;

    public AfterLoginMenu(List<User> users, String login) {
        this.users = users;
        this.login = login;
    }

    public Integer showContent() {

        Boolean wantToExit;

        Scanner in = new Scanner(System.in);
        String option;
        do {
            System.out.println("You can:\n(1) Change email address\n(2) Change phone number\n(e) Exit");
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
                System.out.println("you want to exit");
                wantToExit = true;
            }
        } while (!wantToExit);

        // todo: change this hardcoded value
        return 1;
    }
}
