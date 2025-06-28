/*
 * @lc app=leetcode id=33 lang=java
 *
 * [33] Search in Rotated Sorted Array
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int finish = nums.length-1;
        int mid = 0;
        while(start <= finish)
        {
            mid = (start+finish)/2;

            if(nums[mid] == target)
            {
                return mid;
            }
            
            if(nums[start] <= nums[mid])
            {
                if(nums[start] <= target && target <= nums[mid])
                {
                    finish = mid-1;
                }
                else
                {
                    start = mid+1;
                }
                
            }
            else
            {
                if(nums[mid] <= target && target <= nums[finish])
                {
                    start = mid+1;
                }
                else
                {
                    finish = mid-1;
                }
                
            }
                
            
       
            
        }
        return -1;
    }
}
// @lc code=end

