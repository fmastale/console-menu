package app.menuitems;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class GreetingMenuTest {
    @Test
    public void notNull() {
        GreetingMenu greetingMenu = new GreetingMenu();

        assertNotNull(greetingMenu);
    }

}