import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    private static final Main main = new Main();

    @Test
    public void testEmpty() throws Exception {
        Assert.assertEquals("", main.compress(""));
    }

    @Test
    public void testNotCompressible() throws Exception {
        Assert.assertEquals("abcdefg", main.compress("abcdefg"));
    }

    @Test
    public void testCompressible() throws Exception {
        Assert.assertEquals("a2b1c5a3", main.compress("aabcccccaaa"));
        Assert.assertEquals("a8b3a7b2a5b1", main.compress("aaaaaaaabbbaaaaaaabbaaaaab"));
        Assert.assertEquals("132334", main.compress("1112223333"));
    }

    @Test
    public void testCompressNotWorth() throws Exception {
        Assert.assertEquals("aabbcc", main.compress("aabbcc"));
    }
}
