package Week3_2;

import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringManipulatorPeetuTest {
    private StringManipulatorPeetu manipulator;

    @BeforeClass
    public static void initAll() {
        // Initialize shared resources
    }

    @AfterClass
    public static void tearDownAll() {
        // Clean up shared resources after all tests
    }

    @Before
    public void setUp() {
        manipulator = new StringManipulatorPeetu();
    }

    @After
    public void tearDown() {
        // Clean up resources after each test
    }

    @Test
    public void testReverse() {
        assertEquals("uteeP", manipulator.reverse("Peetu"));
        assertEquals("avaJ", manipulator.reverse("Java"));
        assertEquals("", manipulator.reverse(""));
        assertEquals(null, manipulator.reverse(null));
    }

    @Test
    public void testCapitalize() {
        assertEquals("Peetu", manipulator.capitalize("peetu"));
        assertEquals("Java", manipulator.capitalize("java"));
        assertEquals("Java", manipulator.capitalize("JAVA"));
        assertEquals("", manipulator.capitalize(""));
        assertEquals(null, manipulator.capitalize(null));
    }
}