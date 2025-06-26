/*
 * @lc app=leetcode id=152 lang=java
 *
 * [152] Maximum Product Subarray
 */

// @lc code=start
class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int finalProduct = nums[0];
        for(int i = 1; i < nums.length; i++)
        {
            int tempMax = maxProduct;
            int tempMin = minProduct;
            maxProduct = Math.max(Math.max(nums[i],tempMax * nums[i]),tempMin * nums[i]);
            minProduct = Math.min(Math.min(nums[i],tempMax * nums[i]),tempMin * nums[i]);
            finalProduct = Math.max(maxProduct,finalProduct);
        }
        return finalProduct;
    }
}
// @lc code=end

