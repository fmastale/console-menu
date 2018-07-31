package fmutils.helpers;

import org.hazlewood.connor.bottema.emailaddress.EmailAddressValidator;

public class EmailChecker {
    public boolean isValid(String email) {
        if (EmailAddressValidator.isValid(email))
            return true;
        else{
            System.out.println("Wrong email! Try again!");
            return false;
        }

    }
}
