/*
 * @lc app=leetcode id=76 lang=java
 *
 * [76] Minimum Window Substring
 */
import java.util.HashMap;
// @lc code=start
class Solution {
    public String minWindow(String s, String t) {
        String result = "";
        HashMap<Character, Integer> seenChars = new HashMap<>();
        int missingChars = t.length();
        HashMap<Character,Integer> requiredChars = new HashMap<>();

        // figure out what characters must be searched for first 
        for(int i = 0; i < t.length(); i ++)
        {
            char c = t.charAt(i);
            requiredChars.put(c, requiredChars.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int right = 0;
        for(; right < s.length(); right++)
        {
            
            char c = s.charAt(right);
            // collect chars that I need from s to make up t
            if(requiredChars.containsKey(c))
            {
                seenChars.put(c, seenChars.getOrDefault(c, 0) + 1);
                //do I still need more chars of this duplicate value?
                if(seenChars.get(c) <= requiredChars.get(c))
                {
                    missingChars--;
                }
                
            }
            
            // found all the required chars, now shrink window as much as possible
            while(missingChars == 0)
            {
                if(result.equals("") ||(right-left) + 1 < result.length())
                {
                    result = s.substring(left,right+1);
                    
                }
                
                // skip over unnecessary values whenever I can
                char d = s.charAt(left);
                if (!requiredChars.containsKey(d)) 
                {
                    left++;
                    continue; 
                }

                // remove current char from the window
                seenChars.put(d, seenChars.getOrDefault(d, 0) - 1);
                if(requiredChars.containsKey(d) && seenChars.get(d) < requiredChars.get(d))
                {
                    missingChars++;
                }
                
                left++;
            }
            

        }
        return result;
    }
}
// @lc code=end

