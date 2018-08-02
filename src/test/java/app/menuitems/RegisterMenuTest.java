package app.menuitems;

import app.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;

public class RegisterMenuTest {
    @Test
    public void notNull() {
        List<User> users = new ArrayList<>();

        RegisterMenu registerMenu = new RegisterMenu(users);

        assertNotNull(registerMenu);
    }
}