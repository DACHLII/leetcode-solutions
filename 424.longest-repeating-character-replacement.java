/*
 * @lc app=leetcode id=424 lang=java
 *
 * [424] Longest Repeating Character Replacement
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int characterReplacement(String s, int k) {
        //int left = 0;
        int maxFreq = 0;
        int left = 0;
        HashMap<Character,Integer> freqCount = new HashMap<>();
        int windowSize = 0;
        for(int right = 0; right < s.length(); right++)
        {
            char c = s.charAt(right);
            //System.out.println(right);
            freqCount.put(c, freqCount.getOrDefault(c, 0) + 1);
            if(maxFreq < freqCount.get(s.charAt(right)))
            {
                maxFreq = freqCount.get(s.charAt(right));
            }
            while(((right-left) +1 ) - maxFreq > k )
            {
                char d = s.charAt(left);
                freqCount.put(d, freqCount.getOrDefault(d, 0) - 1);
                left++;
                
            }
            windowSize = right-left + 1;

        }
        




        return windowSize;
    }
}
// @lc code=end

