/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    // notes : I initially started out with a hashmap, then moved to 
    // two arrays, and finally decided to go with just one array to maximize
    // space and time. 
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
        {
            return false;
        }

        int[] requiredLetters = new int[26];

        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            int val = (int)c;
            requiredLetters[val - 'a']++;
        }

        for(int i = 0; i < t.length(); i++)
        {
            char c = t.charAt(i);
            int val = (int)c;
            requiredLetters[val - 'a']--;
        }

        for(int i = 0; i < requiredLetters.length; i++)
        {
            if(requiredLetters[i] != 0)
            {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

