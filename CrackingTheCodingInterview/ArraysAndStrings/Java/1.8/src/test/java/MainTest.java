import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void testEmpty() throws Exception {
        Assert.assertFalse(Main.isRotation("", ""));
    }

    @Test
    public void testDifferentLength() throws Exception {
        Assert.assertFalse(Main.isRotation("123", "3312"));
    }

    @Test
    public void testTrue() throws Exception {
        Assert.assertTrue(Main.isRotation("waterbottle", "erbottlewat"));
        Assert.assertTrue(Main.isRotation("1234567890", "6789012345"));
    }

    @Test
    public void testFalse() throws Exception {
        Assert.assertFalse(Main.isRotation("waterbottle", "botltewater"));
    }
}
