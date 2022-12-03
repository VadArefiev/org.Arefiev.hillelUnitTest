package ariphmeticTest;

import ariphmetic.ArithmetMean;
import org.junit.Assert;
import org.junit.Test;

public class ArithmetMeanTest {
    @Test
    public void arithmeticalMean() {
        ArithmetMean arithmetMean = new ArithmetMean();
        double[] arr = {3, 7, 8, 13};
        double expected = 7.75;
        double output = arithmetMean.arithmeticalMean(arr);
        Assert.assertEquals(expected, output, 1);
    }

    @Test
    public void arithmeticalMeanNull() {
        ArithmetMean arithmetMean = new ArithmetMean();
        double[] arr = {};
        double expected = 0;
        double output = arithmetMean.arithmeticalMean(arr);
        Assert.assertEquals(expected, output, 0);
    }

    @Test
    public void arithmeticalMeanNegative() {
        ArithmetMean arithmetMean = new ArithmetMean();
        double[] arr = {-2, 5, -8, 9};
        double expected = 1;
        double output = arithmetMean.arithmeticalMean(arr);
        Assert.assertEquals(expected, output, 0);
    }
}

