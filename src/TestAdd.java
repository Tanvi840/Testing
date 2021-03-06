import org.junit.*;


public class TestAdd {

    @Test
    public void testSum(){
        System.out.println("Method associated with testSum");
        //arrange
        Calculate calc = new Calculate();
        int a = 4;
        int b= 5;
        int expected = 9;
        //act
        int actual = calc.sum(a,b);
        //assert
        Assert.assertEquals(expected,actual);
    }

    @Before
    public void runBeforeEveryTest(){
        System.out.println("Method associated with @before annotation");
    }

    @After
    public void runAfterEveryTest(){
        System.out.println("Method associated with @after annotation");
    }

    @BeforeClass
    public static void runBeforeClass(){
        System.out.println("Method associated with @beforeclass annotation");
    }

    @AfterClass
    public static void runAfterClass(){
        System.out.println("Method associated with @afterclass annotation");
    }

}
