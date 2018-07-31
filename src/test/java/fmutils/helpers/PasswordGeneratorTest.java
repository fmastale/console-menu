package fmutils.helpers;

import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordGeneratorTest {
    @Test
    public void generate() {

        PasswordGenerator passwordGenerator = new PasswordGenerator.PasswordGeneratorBuilder()
                .useDigits(true)
                .useLower(true)
                .useUpper(true)
                .useSpecial(true)
                .build();

        String password = passwordGenerator.generate(8);

        assertNotNull("Should not be null", password);
    }

    @Test
    public void notSamePasswords() {

        PasswordGenerator passwordGenerator = new PasswordGenerator.PasswordGeneratorBuilder()
                .useDigits(true)
                .useLower(true)
                .useUpper(true)
                .useSpecial(true)
                .build();

        String password = passwordGenerator.generate(8);
        String password2 = passwordGenerator.generate(8);

        assertNotEquals("Should not be equals", password, password2);
    }
}