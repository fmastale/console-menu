package app.menuhelpers;

import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordManagerTest {
    @Test
    public void hasProperChars() {
        String password = "SomeValidPassword#1";

        assertTrue(new PasswordManager().hasProperChars(password));
    }

    @Test
    public void noDigitIn() {
        String password = "SomeInvalidPassword#";

        assertFalse(new PasswordManager().hasProperChars(password));
    }

    @Test
    public void noUppercaseIn() {
        String password = "someinvalidpassword#1";

        assertFalse(new PasswordManager().hasProperChars(password));
    }

    @Test
    public void noSpecialCharsIn() {
        String password = "SomeInvalidPassword1";

        assertFalse(new PasswordManager().hasProperChars(password));
    }

    @Test
    public void isTooShort() {
        String password = "SomeP1#";

        assertFalse(new PasswordManager().hasProperLength(password));
    }

    @Test
    public void hasProperLength() {
        String password = "Password@1";

        assertTrue(new PasswordManager().hasProperLength(password));
    }

    @Test
    public void randomPassHasProperChars() {
        String password = new PasswordManager().generateRandomPassword();

        assertTrue(new PasswordManager().hasProperChars(password));
    }

    @Test
    public void randomPassHasProperLength() {
        String password = new PasswordManager().generateRandomPassword();

        assertTrue(new PasswordManager().hasProperLength(password));
    }

    @Test
    public void twoRandomPassAreNotSame() {
        String password = new PasswordManager().generateRandomPassword();
        String password2 = new PasswordManager().generateRandomPassword();

        assertNotEquals(password, password2);
    }

}