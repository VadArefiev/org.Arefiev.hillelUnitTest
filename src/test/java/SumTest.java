
import org.junit.Assert;
import org.junit.Test;


public class SumTest {
    @Test
    public void sumTest() {
        Sum sum = new Sum();
        int c = 0;
        int d = -8;
        int expected = 11;
        int output = Sum.sum(c, d);
        Assert.assertEquals(expected,output);
    }
}
