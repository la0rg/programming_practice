import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

    private final static Main main = new Main();

    @Test
    public void testNull() throws Exception {
        Assert.assertEquals(main.checkStringOrigin(null, null), true);
    }

    @Test
    public void testDifferentSize() throws Exception {
        Assert.assertFalse(main.checkStringOrigin("123", "12"));
    }

    @Test
    public void testPositive() throws Exception {
        Assert.assertTrue(main.checkStringOrigin("123", "231"));
    }

    @Test
    public void testNegative() throws Exception {
        Assert.assertFalse(main.checkStringOrigin("1235", "1234"));
    }

    @Test
    public void testPermutations() throws Exception {
        String origin = "Crack ing";
        List<String> perm = new MainTest().permutations(origin);
        boolean allChecks = perm.stream()
                                .map(s -> main.checkStringOrigin(origin, s))
                                .allMatch(b -> b);
        Assert.assertTrue(allChecks);
    }

    List<String> permutations(String str) {
        return permutations(str, str.length());
    }

    List<String> permutations(String str, int n) {
        ArrayList<String> list = new ArrayList<>();
        if (n == 1) {
            list.add(str);
        }
        for (int i = 0; i < n; i++) {
            List<String> res = permutations(swap(str, i, n - 1), n - 1);
            list.addAll(res);
        }
        return list;
    }

    String swap(String str, int i, int j) {
        char[] arr = str.toCharArray();
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
        return new String(arr);
    }
}
