/*
 * @lc app=leetcode id=371 lang=java
 *
 * [371] Sum of Two Integers
 */

// @lc code=start
class Solution {
    public int getSum(int a, int b) {
        int sum = 0;
        int xor_sum = 0;
        if(a > 0 && b > 0)
        {
            while((sum & xor_sum) != 0)
            {
                xor_sum = (a ^ b);
            }
        }

        return sum;
    }
}
// @lc code=end

