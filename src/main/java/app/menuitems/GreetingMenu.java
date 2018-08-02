package app.menuitems;

import java.util.Scanner;

public class GreetingMenu implements MenuItem{

    public Integer showContent() {
        System.out.println("***************************************\n");
        System.out.println("Welcome!" +
                         "\nIf you want to register press (1)" +
                         "\nAlready a user? Press (2) to login!" +
                         "\nNone of those? Type (e) to exit\n");

        Scanner in = new Scanner(System.in);

        String option;

        Boolean isInvalidOption;

        Integer menuToGoTo = 1;

        do {
            option = in.nextLine();
            isInvalidOption = false;
            if (option.equals("1")) {
                menuToGoTo = 2;
                System.out.println("You choose to register!");
            }
            if (option.equals("2")) {
                menuToGoTo = 3;
                System.out.println("You choose to login!");
            }
            if (option.equals("e")){
                System.exit(0);
            }
            if (!option.equals("1") && !option.equals("2") && !option.equals("exit")){
                System.out.println("Wrong key!\nChoose between:\n(1)- Register\n(2)- Login\n(e)- Exit");
                isInvalidOption = true;
            }
        } while (isInvalidOption);


        return menuToGoTo;
    }
}