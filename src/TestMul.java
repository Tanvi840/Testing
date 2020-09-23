import org.junit.Assert;
import org.junit.Test;

public class TestMul {
    @Test
    public void testMul(){
        System.out.println("Method associated with testMul");
        //arrange
        Calculate calc = new Calculate();
        int a = 4;
        int b= 5;
        int expected = 20;
        //act
        int actual = calc.mul(a,b);
        //assert
        Assert.assertEquals(expected,actual);
    }
}
