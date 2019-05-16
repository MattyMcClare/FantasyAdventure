import Characters.Dwarf;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeroTest {

    Dwarf dwarf;

    @Before
    public void setUp() {
        dwarf = new Dwarf("Stefan", 100, null);
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
    public void hasInventory() {
        assertEquals(null, dwarf.getInventory());
    }
}
