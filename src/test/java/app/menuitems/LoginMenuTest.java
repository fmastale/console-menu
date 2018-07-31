package app.menuitems;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class LoginMenuTest {
    @Test
    public void notNull() {
        LoginMenu loginMenu = new LoginMenu();

        assertNotNull(loginMenu);
    }
}