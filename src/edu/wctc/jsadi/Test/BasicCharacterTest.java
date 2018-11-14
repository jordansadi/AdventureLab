package edu.wctc.jsadi.Test;

import edu.wctc.jsadi.BasicCharacter;
import edu.wctc.jsadi.Character;
import org.junit.*;

public class BasicCharacterTest extends junit.framework.TestCase {
    public BasicCharacterTest() {}

    private Character testChar;

    @Before
    public void setUp() throws Exception {
        testChar = new BasicCharacter("Jordan");
    }

    @After
    public void tearDown() throws Exception {}

    @Test
    public void testGetName() {
        assertEquals(testChar.getName(), "Jordan");
        assertNotSame(testChar.getName(), "Jordan The Hungry");
    }

    @Test
    public void testGetHealth() {
        assertEquals(testChar.getHealth(), 0.0);
        assertNotSame(testChar.getHealth(), 0);
    }
}