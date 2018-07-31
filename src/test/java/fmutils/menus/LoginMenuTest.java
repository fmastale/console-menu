package fmutils.menus;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoginMenuTest {
    @Test
    public void notNull() {
        LoginMenu loginMenu = new LoginMenu();

        assertNotNull(loginMenu);
    }
}