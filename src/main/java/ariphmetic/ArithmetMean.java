package ariphmetic;

/**
 * 1.add a method that will calculate the arithmetic mean of the array elements
 */

public class ArithmetMean {

    public double arithmeticalMean(double[] array) {
        if (array.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (sum / array.length);
    }
}

