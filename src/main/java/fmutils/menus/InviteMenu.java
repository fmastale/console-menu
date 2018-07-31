package fmutils.menus;

import java.util.Scanner;

public class InviteMenu {

    public void showContent() {
        System.out.println("Welcome!\nIf you want to register press (1)\nAlready a user? Press (2) to login!" +
        "None of those? Type (e) to exit");

        Scanner in = new Scanner(System.in);

        String option;

        Boolean isInvalidOption;

        do {
            option = in.nextLine();
            isInvalidOption = false;
            if (option.equals("1")) {
                System.out.println("You choose to register!");
            }
            if (option.equals("2")) {
                System.out.println("You choose to login!");
            }
            if (option.equals("e"))
                System.exit(0);
            if (!option.equals("1") && !option.equals("2") && !option.equals("exit")){
                System.out.println("Wrong key!\nChoose between:\n(1)- Register\n(2)- Login\n(e)- Exit");
                isInvalidOption = true;
            }
        } while (isInvalidOption);
    }
}
