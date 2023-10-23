import org.junit.*;

public class MainTest{
    @Test
    public void testIsPalindrome(){
        Assert.assertEquals(Main.isPalindrome("tacocat"), true);
        Assert.assertEquals(Main.isPalindrome("Austin High"), false);
    }

    @Test
    public void testPower(){
        Assert.assertEquals(Main.power(1.00, 1), 1.00,0.99);
        Assert.assertEquals(Main.power(2.00, 3), 8.00, 0.99);
    }
}
