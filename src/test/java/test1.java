import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 {
    @Test
    public void test_equals(){
        String str1 = "ha";
        String str2 = "ha";
        Assert.assertEquals(str1,str2);
    }
}
