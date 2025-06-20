/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
import java.util.ArrayList;
import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] resultArr = new int[2];
        HashMap<Integer,Integer> seenNums = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            int match = target - nums[i];
            Integer result = seenNums.get(match);
            if(result == null)
            {
                // not in seen, store
                seenNums.put(nums[i],i);
            }
            else
            {
                //success, add to list
                
                resultArr[0] = result;
                resultArr[1] = i;
                break;
                
            }

        }
        return resultArr;
    }
}
// @lc code=end

