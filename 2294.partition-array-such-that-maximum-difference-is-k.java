/*
 * @lc app=leetcode id=2294 lang=java
 *
 * [2294] Partition Array Such That Maximum Difference Is K
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums); 
        int groups = 1;
        int start = nums[0]; 

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - start > k) {
                groups++; 
                start = nums[i]; 
            }
        }

        return groups;
    }
}
// @lc code=end

