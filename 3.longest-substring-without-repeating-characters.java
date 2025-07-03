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
        //int len = 1;
        Hashtable<Character,Integer> ht = new Hashtable<>();
        //ht.put(s.charAt(0),0);
        int start = 0;
        // for length of s ( start at 1 to have smth in the table)
        // go through the string and store each letter
        // if I see a dup, reset len but inc maxLen if applicable
        for(int i = 0; i < s.length(); i++)
        {
            char c =s.charAt(i);
            //reset case ( cooked )
            
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

