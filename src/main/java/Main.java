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

        Map<Integer, MenuItem> appMenus = new TreeMap<Integer, MenuItem>();

        appMenus.put(1, new GreetingMenu());
        appMenus.put(2, new RegisterMenu(users));
        appMenus.put(3, new LoginMenu(users));

        MenusRunner menusRunner = new MenusRunner(appMenus);
        MenuItem consoleMenuItem;

        Integer runMenu = 1;

        do {
            consoleMenuItem = menusRunner.wantedMenu(runMenu);
            runMenu = menusRunner.runMenu(consoleMenuItem);
        } while (true);

    }
}
