package quadratischeMatrixTest;

public class Matrix {

    public boolean checkArray(int[][] array) {
        if (array.length == array[0].length) {
            return true;
        } else {
            return false;
        }
    }
}
