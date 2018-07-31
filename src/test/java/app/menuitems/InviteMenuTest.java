package app.menuitems;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class InviteMenuTest {
    @Test
    public void notNull() {
        InviteMenu inviteMenu = new InviteMenu();

        assertNotNull(inviteMenu);
    }

}