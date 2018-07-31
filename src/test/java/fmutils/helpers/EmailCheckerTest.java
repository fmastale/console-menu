package fmutils.helpers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class EmailCheckerTest {
    @Test
    public void isValid() {
        String email = "sample@mail.com";
        
        assertEquals("Should be proper email address",true, new EmailChecker().isValid(email));
    }
    
    @Test
    public void isNotValid() {
        String email = "someBad@Mail@Example.com";
        assertFalse("Should say that email is wrong!", new EmailChecker().isValid(email));
    }

}