/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start
import java.util.Arrays;
import java.util.HashMap;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        // could probably more efficient with hashset, but it's good enough >;(
        HashMap<Integer,Integer> storage = new HashMap<>();
        storage.put(nums[0],0);
        Integer val = null;
        for(int i = 1; i < nums.length; i++)
        {
            val = storage.get(nums[i]);
            if(val != null)
            {
                // success
                return true;
            }
            else
            {
                storage.put(nums[i],i);
            }
        }
        return false;
    }
}
// @lc code=end

