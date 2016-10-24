import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MainTest {

    private static Main main;

    @BeforeClass
    public static void setUp() throws Exception {
        main = new Main();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAllUniqueExceptionOnNullString() {
        main.allUnique(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAllUniqueWithoutDsExceptionOnNullString() {
        main.allUniqueWithoutDS(null);
    }

    @Test
    public void testPositive() throws Exception {

        String str = "\uFFFFabcd\uDBFF\uDC00 efgA12\uDBFF\uDFFF";
        Assert.assertTrue(main.allUnique(str));
        Assert.assertTrue(main.allUniqueWithoutDS(str));
    }

    @Test
    public void testNegative() throws Exception {
        String str = "\uDBFF\uDFFFabcd \u0000uioaA";
        Assert.assertFalse(main.allUnique(str));
        Assert.assertFalse(main.allUniqueWithoutDS(str));
    }

    @Test
    public void testEmptyString() throws Exception {
        Assert.assertTrue(main.allUnique(""));
        Assert.assertTrue(main.allUniqueWithoutDS(""));
    }
}
