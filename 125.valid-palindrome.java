/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        //System.out.println(s);
        StringBuilder convertedS = new StringBuilder();
        for(int i = 0; i < s.length(); i++)
        {
            char val = s.charAt(i);
            if(Character.isLetterOrDigit(val))
            {
                convertedS.append(val);
            }
            
        }
        //System.out.println(convertedS);
        String filteredS = convertedS.toString();
        int mid = filteredS.length() / 2;
        //System.out.println(mid);
        int j = filteredS.length()-1;
        for(int i = 0; i < mid; i++)
        {
            
            //System.out.println(i+1 + " i : " + convertedS.charAt(i)+ " j : " + convertedS.charAt(j));
            if(filteredS.charAt(i) != filteredS.charAt(j))
            {
                return false;
            }
            j--;
        }
        //System.out.println(convertedS);

        return true;
    }
}
// @lc code=end

