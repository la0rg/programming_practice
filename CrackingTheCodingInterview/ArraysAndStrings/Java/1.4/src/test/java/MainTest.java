import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MainTest {

    private static final Main main = new Main();

    @Test
    public void testEmpty() throws Exception {
        char[] result = main.replaceSpaces("".toCharArray(), 0);
        Assert.assertTrue(Arrays.equals(result, new char[]{}));
    }

    @Test
    public void testOneSpace() throws Exception {
        char[] result = main.replaceSpaces("first second third    ".toCharArray(), 18);
        System.out.println(result);
        char[] expected = "first%20second%20third".toCharArray();
        Assert.assertTrue(Arrays.equals(result, expected));
    }

    @Test
    public void testManySpaces() throws Exception {
        char[] result = main.replaceSpaces("  first    second   third                     ".toCharArray(), 26);
        System.out.println(result);
        char[] expected = "%20%20first%20%20%20%20second%20%20%20third%20".toCharArray();
        Assert.assertTrue(Arrays.equals(result, expected));
    }
}
