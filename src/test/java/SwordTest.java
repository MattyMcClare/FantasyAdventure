import Interfaces.IWeapon;
import Sets.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwordTest {

    Sword sword;

    @Before
    public void setUp() {
        sword = new Sword( "Sword");
    }

    @Test
    public void hasDamage() {
        assertEquals(4, sword.getDamage(4));
    }

    @Test
    public void hasName() {
        assertEquals("Sword", sword.getName());
    }
}
