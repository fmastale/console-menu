package app.menuitems;

import app.User;

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

        //todo: add exit option
        do {
            System.out.println("Enter login and password!");

            isValidLogAndPass = false;

            System.out.println("enter login: ");
            login = in.nextLine();

            System.out.println("enter password: ");
            password = in.nextLine();

            // todo: re-write this loop - each time it finds login && pass incorect it will print incorrect message
            for (User u : users) {
                if (u.getLogin().equals(login) && u.getPassword().equals(password)){
                    System.out.println("Login and password correct!");
                    isValidLogAndPass = true;
                }
                else
                    System.out.println("Login and password incorrect!");
            }

        } while (!isValidLogAndPass);

        return 4;
    }
}
