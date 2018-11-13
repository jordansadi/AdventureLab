package edu.wctc.jsadi.Test;

import edu.wctc.jsadi.BasicCharacter;
import edu.wctc.jsadi.Character;
import edu.wctc.jsadi.Shield;
import org.junit.*;

public class CharacterDecoratorTest extends junit.framework.TestCase {
    public CharacterDecoratorTest() {}

    private Character testChar;

    @Before
    public void setUp() throws Exception {
        testChar = new Shield(new BasicCharacter("Jordan"));
    }

    @After
    public void tearDown() throws Exception {}

    @Test
    public void testGetName() {
        assertEquals(testChar.getName(), "Jordan The Shielder");
        assertNotSame(testChar.getName(), "Jordan");
    }

    @Test
    public void testGetHealth() {
        assertEquals(testChar.getHealth(), 20.0);
        assertNotSame(testChar.getHealth(), 0);
    }
}