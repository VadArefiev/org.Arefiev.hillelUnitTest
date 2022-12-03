package quadratischeMatrixTest;

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

