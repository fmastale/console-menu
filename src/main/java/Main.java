import fmutils.*;
import fmutils.menus.AfterLoginMenu;
import fmutils.menus.RegisterMenu;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("jankowalski", "jan123", "jankowalski@com.pl", "111222333"));

        String login = "jankowalski";

        new RegisterMenu().showContent(users);
        //new AfterLoginMenu().showContent(users, login);

    }
}
