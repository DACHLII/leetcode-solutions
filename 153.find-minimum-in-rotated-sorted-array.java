/*
 * @lc app=leetcode id=153 lang=java
 *
 * [153] Find Minimum in Rotated Sorted Array
 */

// @lc code=start
class Solution {
    public int findMin(int[] nums) {
    //[4, 5, 6, 7, 0, 1 2]
    int mid = nums.length/2;
    int start = 0;
    int finish = nums.length-1;
    while (start != finish)
    {
        if(nums[mid] > nums[finish])
        {
            // go to bigger chunk of arr
            start = mid+1;
        }
        else if(nums[mid] <= nums[finish])
        {
            finish = mid;
        }
        mid = (start+finish)/2;
    }
    return nums[finish];
    }
}
// @lc code=end

