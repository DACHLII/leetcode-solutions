/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++)
        {   
            // to skip duplicates 
            if (i > 0 && nums[i] == nums[i - 1]) 
            {
                continue;
            }

            int left = i+1;
            int right = nums.length-1;

            while(left != nums.length && left < right)
            {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum > 0)
                {
                    right--;
                }
                else if (sum < 0)
                {
                    left++;
                }
                else
                {
                    // found a successful sum
                    ArrayList<Integer> currList = new ArrayList<>();
                    currList.add(nums[i]);
                    currList.add(nums[left]);
                    currList.add(nums[right]);
                    result.add(currList);
                    //currList.clear();
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
             
                    
                }
            }
        }
        return result;
            
        
    }
}
// @lc code=end

