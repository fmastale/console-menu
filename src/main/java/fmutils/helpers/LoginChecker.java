package fmutils.helpers;

import fmutils.User;

import java.util.List;

public class LoginChecker {
    public boolean isValid(List<User> users, String login) {
        for (User user : users) {
            if (user.getLogin().equals(login)){
                System.out.println("User with given login is already registered! Please, select different login!");
                return false;
            }
        }
        if (login.length() < 3){
            System.out.println("Login should be at least 3 characters long!");
            return false;
        }

        return true;
    }
}
