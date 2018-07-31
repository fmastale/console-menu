package app.menuitems;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class RegisterMenuTest {
    @Test
    public void notNull() {
        RegisterMenu registerMenu = new RegisterMenu();

        assertNotNull(registerMenu);
    }
}