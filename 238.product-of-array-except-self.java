/*
 * @lc app=leetcode id=238 lang=java
 *
 * [238] Product of Array Except Self
 */

// @lc code=start

import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {
    public int[] productExceptSelf(int[] nums) {
       // prefix and suffix passes
       int[] result = new int[nums.length];

        int product = 1;
       for(int i = 0; i < nums.length; i++)
       {
        result[i] = product;
        product *= nums[i];

       } 
       product = 1;
        for(int i = nums.length-1; i >= 0; i--)
       {
        result[i] *= product;
        product *= nums[i];

       } 
       return result;
    }
}
// @lc code=end

