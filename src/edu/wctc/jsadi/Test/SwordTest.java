package edu.wctc.jsadi.Test;

import edu.wctc.jsadi.BasicCharacter;
import edu.wctc.jsadi.Character;
import edu.wctc.jsadi.Sword;
import org.junit.*;

public class SwordTest extends junit.framework.TestCase {
    public SwordTest() {}

    private Character testChar;

    @Before
    public void setUp() throws Exception {
        testChar = new Sword(new BasicCharacter("Jordan"));
    }

    @After
    public void tearDown() throws Exception {}

    @Test
    public void testGetName() {
        assertEquals(testChar.getName(), "Jordan The Sword Handler");
        assertNotSame(testChar.getName(), "Jordan");
    }

    @Test
    public void testGetHealth() {
        assertEquals(testChar.getHealth(), 10.0);
        assertNotSame(testChar.getHealth(), 0);
    }
}