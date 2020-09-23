import org.junit.Assert;
import org.junit.Test;


public class TestCalculate {

    @Test
    public void testSum(){
        Calculate calc = new Calculate();
        int a = 4;
        int b= 5;
        int expected = 9;
        int actual = calc.sum(a,b);
        Assert.assertEquals(expected,actual);
    }
}
