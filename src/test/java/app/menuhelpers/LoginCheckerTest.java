package app.menuhelpers;

import app.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LoginCheckerTest {

    @Test
    public void loginAlreadyExists() {
        User johnsmith = new User("johnsmith", "Johnsmith1$","johnsmith@mail.com", "333666999");

        List<User> users = new ArrayList<>();
        users.add(johnsmith);

        String anotherJohnSmithLogin = "johnsmith";

        assertFalse(new LoginChecker().isValid(users, anotherJohnSmithLogin));
    }

    @Test
    public void loginDoesntExists() {
        User johnsmith = new User("johnsmith", "Johnsmith1$","johnsmith@mail.com", "333666999");

        List<User> users = new ArrayList<>();
        users.add(johnsmith);

        String newLogin = "jankowalski";

        assertTrue(new LoginChecker().isValid(users, newLogin));
    }

    @Test
    public void loginIsTooShort() {
        List<User> users = new ArrayList<>();

        assertFalse("Should contain at least 3 characters", new LoginChecker().isValid(users, "Ja"));
    }

    @Test
    public void loginIsThreeCharsLong() {
        List<User> users = new ArrayList<>();

        assertTrue(new LoginChecker().isValid(users, "Jan"));
    }
}