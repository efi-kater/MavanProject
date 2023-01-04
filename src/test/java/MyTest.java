import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Scanner;

public class MyTest {
    @Test
    public void firstTest(){
        int x =16;
        Assert.assertNotEquals(x,15);
    }

    public void secondTest(){
        int x =16;
        Assert.assertNotEquals(x,15);
    }


    @BeforeTest
    public void getInfo(){
        System.out.println("aaa");
    }
}
