/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
import java.util.Hashtable;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        Hashtable<Character,Integer> ht = new Hashtable<>();
        int start = 0;

        for(int i = 0; i < s.length(); i++)
        {
            char c =s.charAt(i);
            //reset case ( cooked )
            // duplicate check + ensuring that we hit a newer dup
            if(ht.containsKey(c) && ht.get(c) >= start){
                
                start = ht.get(s.charAt(i))+1;
                
                //System.out.println("curr index:" + i);
            }
            ht.put(s.charAt(i),i);
            int len = i-start+1;
            if(maxLen < len){
                maxLen = len;
            }
        }






        return maxLen;
    }
}
// @lc code=end

