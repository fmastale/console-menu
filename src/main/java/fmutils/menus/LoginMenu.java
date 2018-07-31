package fmutils.menus;

import fmutils.User;

import java.util.List;
import java.util.Scanner;

public class LoginMenu {
    public void showContent(List<User> users) {
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

            for (User u : users) {
                if (u.getLogin().equals(login) && u.getPassword().equals(password)){
                    System.out.println("Login and password correct!");
                    isValidLogAndPass = true;
                }
                else
                    System.out.println("Login and password incorrect!");
            }

        } while (!isValidLogAndPass);
    }
}
