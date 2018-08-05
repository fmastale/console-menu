package app.menuhelpers;

import app.menuitems.MenuItem;

import java.util.Map;

public class MenusRunner {
    private Map<Integer, MenuItem> appMenus;

    public MenusRunner(Map<Integer, MenuItem> appMenus) {
        this.appMenus = appMenus;
    }

    public MenuItem wantedMenu(Integer runMenu) {
        MenuItem returnedMenuItem = appMenus.get(runMenu);
        return returnedMenuItem;
    }

    public Integer runMenu(MenuItem returnedMenuItem) {
        return returnedMenuItem.showContent();
    }
}
