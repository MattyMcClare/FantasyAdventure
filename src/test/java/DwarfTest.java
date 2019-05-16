import Characters.Dwarf;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;

    @Before
    public void setUp() {
        dwarf = new Dwarf("Stefan", 100);
    }

    @Test
    public void hasName() {
        assertEquals("Stefan", dwarf.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(100, dwarf.getHealth());
    }

    @Test
    public void hasNoInventory() {
        assertEquals(0, dwarf.countIWeapon());
    }

    @Test
    public void canDealDamage() {
        dw
        assertEquals(96, dwarf.getHealth());
    }
}
