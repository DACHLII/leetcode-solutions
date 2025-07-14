/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String,ArrayList<String>> anagramList = new HashMap<>();

        // sort each word in order to cmp to strs later
        String[] sortedStrs = Arrays.copyOf(strs, strs.length);
        for(int i = 0; i < sortedStrs.length; i++)
        {
            char temp[] = sortedStrs[i].toCharArray();
            Arrays.sort(temp);
            sortedStrs[i] = new String(temp);
        }
        // begin hashmap

        for(int i = 0 ; i < strs.length; i++)
        {
            System.out.println(sortedStrs[i]);
            if(anagramList.get(sortedStrs[i]) == null)
            {
                anagramList.put(sortedStrs[i],new ArrayList<>());
                anagramList.get(sortedStrs[i]).add(strs[i]);
                
            }
            else
            {
                anagramList.get(sortedStrs[i]).add(strs[i]);
            }
        }
        result = new ArrayList<>(anagramList.values());
        return result;

            
        
    }
}
// @lc code=end

