/*
 * @lc app=leetcode id=2016 lang=java
 *
 * [2016] Maximum Difference Between Increasing Elements
 */

// @lc code=start
class Solution {
    public int maximumDifference(int[] nums) {
        
        // by default, -1 in case no successful pair is found
        int max_diff = -1;
        int min_so_far = nums[0];
        for(int i = 0; i < nums.length; i++)
        {
            if(min_so_far > nums[i])
            {
                min_so_far = nums[i];
            }
            // compare pairs?
            if(min_so_far < nums[i])
            {
                max_diff = (nums[i] - min_so_far) > max_diff ? (nums[i] - min_so_far) : max_diff;
            }
        }
    
        return max_diff;
    }
}
// @lc code=end

