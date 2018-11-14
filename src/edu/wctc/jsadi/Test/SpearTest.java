package edu.wctc.jsadi.Test;

import edu.wctc.jsadi.BasicCharacter;
import edu.wctc.jsadi.Character;
import edu.wctc.jsadi.Spear;
import org.junit.*;

public class SpearTest extends junit.framework.TestCase {
    public SpearTest() {}

    private Character testChar;

    @Before
    public void setUp() throws Exception {
        testChar = new Spear(new BasicCharacter("Jordan"));
    }

    @After
    public void tearDown() throws Exception {}

    @Test
    public void testGetName() {
        assertEquals(testChar.getName(), "Jordan The Spear Thrower");
        assertNotSame(testChar.getName(), "Jordan");
    }

    @Test
    public void testGetHealth() {
        assertEquals(testChar.getHealth(), 5.0);
        assertNotSame(testChar.getHealth(), 0);
    }
}