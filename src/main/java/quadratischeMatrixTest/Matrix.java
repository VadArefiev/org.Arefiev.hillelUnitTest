package quadratischeMatrixTest;

/**
 * 2.make a method that will take a two-dimensional matrix (two-dimensional array) as input and check if it is square
 * 3.in the test class, create a test matrix and pass it to the method of the class under test
 */

public class Matrix {

    public boolean checkArray(int[][] array) {
        if (array.length == array[0].length) {
            return true;
        } else {
            return false;
        }
    }
}


