import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void testEmpty() throws Exception {
        int[][] matrix = new int[0][0];
        Assert.assertArrayEquals(matrix, Main.rotate(matrix));
    }

    @Test
    public void test1x1() throws Exception {
        int[][] matrix = new int[][]{{1}};
        Assert.assertArrayEquals(matrix, Main.rotate(matrix));
    }

    @Test
    public void test2x2() throws Exception {
        int[][] matrix = new int[][]{
                {1, 2},
                {3, 4}
        };
        int[][] expect = new int[][]{
                {3, 1},
                {4, 2}
        };
        Assert.assertArrayEquals(expect, Main.rotate(matrix));
    }

    @Test
    public void test5x5() throws Exception {
        int[][] matrix = new int[][]{
                { 1, 2, 3, 4, 5},
                {-1,-2,-3,-4,-5},
                { 5, 4, 3, 2, 1},
                { 6, 7, 8, 9, 0},
                { 0, 9, 8, 7, 6}
        };
        int[][] expect = new int[][]{
                { 0, 6, 5,-1, 1},
                { 9, 7, 4,-2, 2},
                { 8, 8, 3,-3, 3},
                { 7, 9, 2,-4, 4},
                { 6, 0, 1,-5, 5}
        };
        Assert.assertArrayEquals(expect, Main.rotate(matrix));
    }

    @Test
    public void test6x6() throws Exception {
        int[][] matrix = new int[][]{
                { 1, 2, 3, 4, 5,91},
                { 6, 7, 8, 9,10,92},
                {11,12,13,14,15,93},
                {16,17,18,19,20,94},
                {21,22,23,24,25,95},
                {26,27,28,29,30,96}
        };
        int[][] expect = new int[][]{
                {26,21,16,11, 6, 1},
                {27,22,17,12, 7, 2},
                {28,23,18,13, 8, 3},
                {29,24,19,14, 9, 4},
                {30,25,20,15,10, 5},
                {96,95,94,93,92,91}
        };
        Assert.assertArrayEquals(expect, Main.rotate(matrix));
    }
}
