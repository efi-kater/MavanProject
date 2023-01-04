import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class MyTest {
    @Test
    public void firstTest(){
        int x =16;
        Assert.assertNotEquals(x,15);
    }

    @Test
    public void secondTest(){
        int x =16;
        Assert.assertNotEquals(x,15);
    }


    @BeforeMethod
    public void getInfo(){
        System.out.println("aaa");
    }
}
