package edu.wctc.jsadi.Test;

import edu.wctc.jsadi.BasicCharacter;
import edu.wctc.jsadi.Character;
import edu.wctc.jsadi.Starving;
import org.junit.*;

public class StarvingTest extends junit.framework.TestCase {
    public StarvingTest() {}

    private Character testChar;

    @Before
    public void setUp() throws Exception {
        testChar = new Starving(new BasicCharacter("Jordan"));
    }

    @After
    public void tearDown() throws Exception {}

    @Test
    public void testGetName() {
        assertEquals(testChar.getName(), "Jordan The Hungry");
        assertNotSame(testChar.getName(), "Jordan");
    }

    @Test
    public void testGetHealth() {
        assertEquals(testChar.getHealth(), -10.0);
        assertNotSame(testChar.getHealth(), 0);
    }
}