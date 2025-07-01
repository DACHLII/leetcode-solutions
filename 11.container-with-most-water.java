/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        // loop thru and figure out 
        int maxVolume = 0;
        int left = 0;
        int right = height.length-1;
        while(left < right)
        {
            int volume = (right-left) * (Math.min(height[left],height[right]));
            if(maxVolume < volume)
            {
                maxVolume = volume;
            }
            if(height[left] < height[right])
            {
                left++;
            }
            else
            {
                right--;
                
            }
            
        }
        return maxVolume;
    }
}
// @lc code=end

