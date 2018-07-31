package app.menuhelpers;

public class PhoneChecker {
    public boolean isValid(String phone) {
        if (phone.matches("[0-9]{9}"))
            return true;
        else{
            System.out.println("This isn't valid phone number. Try again!");
            return false;
        }
    }
}
