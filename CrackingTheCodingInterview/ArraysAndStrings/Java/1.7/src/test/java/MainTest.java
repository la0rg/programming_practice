import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void testEmpty() throws Exception {
        int[][] matrix = new int[0][0];
        Assert.assertArrayEquals(matrix, Main.findZeros(matrix));
    }

    @Test
    public void test4x6() throws Exception {
        int[][] matrix = new int[][]{
                {1, 2, 3, 4, 5, 6},
                {1, 0, 1, 0, 0, 6},
                {1, 2, 3, 7, 6, 5},
                {0, 9, 8, 7, 6, 4}
        };
        int[][] expect = new int[][]{
                {0, 0, 3, 0, 0, 6},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 3, 0, 0, 5},
                {0, 0, 0, 0, 0, 0}
        };
        Assert.assertArrayEquals(expect, Main.findZeros(matrix));
    }

    @Test
    public void test5x5() throws Exception {
        int[][] matrix = new int[][]{
                {1, 2, 3, 4, 5},
                {1, 0, 1, 0, 0},
                {1, 2, 3, 7, 6},
                {0, 9, 8, 7, 6},
                {1, 1, 1, 0, 1}
        };
        int[][] expect = new int[][]{
                {0, 0, 3, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 3, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        };
        Assert.assertArrayEquals(expect, Main.findZeros(matrix));
    }
}
