import org.junit.Assert;
import org.junit.Test;

public class TestDiff {
    @Test
    public void testDiff(){
        System.out.println("Method associated with testDiff");
        Calculate calc = new Calculate();
        int a = 4;
        int b= 5;
        int expected = -1;
        //act
        int actual = calc.diff(a,b);
        //assert
        Assert.assertEquals(expected,actual);
    }
}
