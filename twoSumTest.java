import static org.junit.Assert.*;
import org.junit.Test;

public class twoSumTest {
    @Test
    public void Test(){
        var nums = new int[]{3,2,4};
        var target = 6;
        var actuals = twoSum.twoSum(nums, target);
        var expecteds = new int[]{1,2};
        assertArrayEquals( expecteds, actuals);
    }
}
