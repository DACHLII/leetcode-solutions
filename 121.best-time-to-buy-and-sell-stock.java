/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
import java.util.HashMap;
class Solution {
    public int maxProfit(int[] prices) {
        // I must select the min num FIRST 
        // always compare the indices via a map :
        // if the  min i < max i then I'm safe
        // only select max value after a min value is kept; if its changed
        // go ahead and reset the max value and continue changing min
        int max = 0;
        int min = prices[0];
        int result = 0;
        //boolean min_chosen = false;
        //HashMap<Integer,Integer> price_comp = new HashMap<>();
        //price_comp.put(min,0);
        
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

