package app.menuhelpers;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EmailCheckerTest {
    @Test
    public void validEmail() {
        String email = "valid@mail.com";
        
        assertTrue(new EmailChecker().isValid(email));
    }
    
    @Test
    public void invalidEmail() {
        String email = "invalid@email@example.com";
        assertFalse("Should say that email address is wrong!", new EmailChecker().isValid(email));
    }
}