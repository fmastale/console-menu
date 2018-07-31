package app.menuhelpers;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PhoneCheckerTest {
    @Test
    public void validPhoneNumber() {
        String phone = "123456789";

        assertTrue(new PhoneChecker().isValid(phone));
    }

    @Test
    public void containsInvalidChars() {
        String phone = "a@1-22-nU";

        assertFalse(new PhoneChecker().isValid(phone));
    }

    @Test
    public void tooShortNumber() {
        String phone = "12345678";

        assertFalse(new PhoneChecker().isValid(phone));
    }

    @Test
    public void tooLongNumber() {
        String phone = "1234567890";

        assertFalse(new PhoneChecker().isValid(phone));
    }

}