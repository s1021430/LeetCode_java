package SearchInsertPosition;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if(target > nums[nums.length-1])
            return nums.length;
        if(target < nums[0])
            return 0;

        var right = nums.length;
        var left = 0;
        while(left < right){
            var mid = left + (right - left) / 2;
            if(nums[mid] == target)
                return mid;
            if(nums[mid] < target && nums[mid + 1] > target)
                return mid + 1;
            else if(nums[mid] < target)
                left = mid;
            else if(nums[mid] > target)
                right  = mid;
        }
        return 0;
    }
}
