import app.User;
import app.menuhelpers.MenusRunner;
import app.menuitems.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<User>();

        //todo: remove this
        users.add(new User("jankowalski", "jan@K123", "jankowalski@com.pl", "111222333"));

        Map<Integer, MenuItem> appMenus = new TreeMap<Integer, MenuItem>();

        String login = "jankowalski";

        appMenus.put(1, new GreetingMenu());
        appMenus.put(2, new RegisterMenu(users));
        appMenus.put(3, new LoginMenu(users));
        // todo: remove login from constructor
        appMenus.put(4, new AfterLoginMenu(users, login));

        MenusRunner menusRunner = new MenusRunner(appMenus);
        MenuItem consoleMenuItem;

        Integer runMenu = 1;

        do {
            consoleMenuItem = menusRunner.wantedMenu(runMenu);
            runMenu = menusRunner.runMenu(consoleMenuItem);
        } while (true);

    }
}
