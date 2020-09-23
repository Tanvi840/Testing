import org.junit.Assert;
import org.junit.Test;

public class TestDiv {
    @Test
    public void testDivWorking(){
        System.out.println("Method associated with testDiv");
        Calculate calc = new Calculate();
        int a = 20;
        int b= 5;
        int expected = 4;
        //act
        int actual = calc.div(a,b);
        //assert
        Assert.assertEquals(expected,actual);
    }

    @Test(expected=ArithmeticException.class)
    public void testDivException(){
        System.out.println("Method associated with testDiv");
        Calculate calc = new Calculate();
        int a = 20;
        int b= 0;

        calc.div(a,b);
    }
}
