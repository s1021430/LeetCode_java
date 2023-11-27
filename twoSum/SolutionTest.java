package twoSum;

import static org.junit.Assert.*;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void Test(){
        var nums = new int[]{3,2,4};
        var target = 6;
        var actual = solution.twoSum(nums, target);
        var expected = new int[]{1,2};
        assertArrayEquals( expected, actual);
    }
}
