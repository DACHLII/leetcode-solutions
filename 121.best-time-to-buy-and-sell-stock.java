/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
import java.util.HashMap;
class Solution {
    public int maxProfit(int[] prices) {

        int max = 0;
        int min = prices[0];
        int result = 0;
        
        for(int i = 1; i < prices.length; i++)
        {

            if(min > prices[i])
            {
                min = prices[i];
                max = 0;
            }
            else if(max < prices[i])
            {
                max = prices[i];
            }

            if(max > min && max-min > result)
            {
                result = max - min;
            }
        }

        return result;
    }
}
// @lc code=end

