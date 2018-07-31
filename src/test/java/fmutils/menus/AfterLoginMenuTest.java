package fmutils.menus;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class AfterLoginMenuTest {
    @Test
    public void notNull() {
        AfterLoginMenu afterLoginMenu = new AfterLoginMenu();

        assertNotNull(afterLoginMenu);
    }

}