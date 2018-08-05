package app.menuitems;

import java.util.Scanner;

public class GreetingMenu implements MenuItem{

    public Integer showContent() {
        System.out.println("***************************************");
        System.out.println("\nWelcome!" +
                           "\nIf you want to register press (1)" +
                           "\nAlready a user? Press (2) to login!" +
                           "\nNone of those? Type (e) to exit");

        Scanner in = new Scanner(System.in);
        String option;
        Boolean isInvalidOption;
        Integer menuToGoTo = 1;

        do {
            option = in.nextLine();
            isInvalidOption = false;
            // go to register menu
            if (option.equals("1")) {
                menuToGoTo = 2;
            }
            // go to login menu
            if (option.equals("2")) {
                menuToGoTo = 3;
            }
            // exit
            if (option.equals("e")){
                System.exit(0);
            }
            // show info
            if (!option.equals("1") && !option.equals("2") && !option.equals("exit")){
                System.out.println("Wrong key!" +
                                 "\nChoose between:" +
                                 "\n(1)- Register" +
                                 "\n(2)- Login" +
                                 "\n(e)- Exit");

                isInvalidOption = true;
            }
        } while (isInvalidOption);

        return menuToGoTo;
    }
}
