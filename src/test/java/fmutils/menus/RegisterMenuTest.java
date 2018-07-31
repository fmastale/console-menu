package fmutils.menus;

import org.junit.Test;

import static org.junit.Assert.*;

public class RegisterMenuTest {
    @Test
    public void notNull() {
        RegisterMenu registerMenu = new RegisterMenu();

        assertNotNull(registerMenu);
    }
}