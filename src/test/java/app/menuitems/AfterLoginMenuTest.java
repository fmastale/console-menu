package app.menuitems;

import app.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;

public class AfterLoginMenuTest {
    @Test
    public void notNull() {
        List<User> users = new ArrayList<>();
        String login = "JanekKowalsky";

        AfterLoginMenu afterLoginMenu = new AfterLoginMenu(users, login);

        assertNotNull(afterLoginMenu);
    }

}