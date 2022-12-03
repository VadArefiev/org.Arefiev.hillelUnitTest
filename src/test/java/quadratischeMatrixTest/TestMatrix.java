package quadratischeMatrixTest;

/**
 * 2.make a method that will take a two-dimensional matrix (two-dimensional array) as input and check if it is square
 * 3.in the test class, create a test matrix and pass it to the method of the class under test
 */

import org.junit.Assert;
import org.junit.Test;

public class TestMatrix {
    @Test
    public void checkArrayTest() {
        Matrix matrix = new Matrix();
        int[][] arr = {{2, 4}, {5, 8}};
        boolean expected = true;
        boolean output = matrix.checkArray(arr);
        Assert.assertEquals(expected, output);

    }

    @Test
    public void checkAkeineQuadratische() {
        Matrix matrix = new Matrix();
        int[][] arr = {{2}, {5, 8}};
        boolean expected = false;
        boolean output = matrix.checkArray(arr);
        Assert.assertEquals(expected, output);
    }

    @Test
    public void checkArrayOneNull() {
        Matrix matrix = new Matrix();
        int[][] arr = {{5, 8}};
        boolean expected = false;
        boolean output = matrix.checkArray(arr);
        Assert.assertEquals(expected, output);
    }

    @Test
    public void checkArrayNull() {
        Matrix matrix = new Matrix();
        int[][] arr = {{}};
        boolean expected = false;
        boolean output = matrix.checkArray(arr);
        Assert.assertEquals(expected, output);
    }
}

