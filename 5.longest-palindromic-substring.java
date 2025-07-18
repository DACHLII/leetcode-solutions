/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
class Solution {
    // I'll work on this when Im NOT half asleep :/
    public String longestPalindrome(String s) {
        // babad
        int mid = 0;
        String bestSubstring = s.substring(0, 1);
        // boolean isEven = s.length() %2 == 0 ? true : false;

        for (; mid < s.length() - 1; mid++) {
            int left = mid;
            int right = mid;
            String currSubstring = "";
            while (left >= 0 && right < s.length() && s.charAt(right) == s.charAt(left)) {
                currSubstring = s.substring(left, right + 1);
                left--;
                right++;

            }
            if (bestSubstring.length() < currSubstring.length()) {
                bestSubstring = currSubstring;
            }

            left = mid;
            right = mid + 1;
            currSubstring = "";
            
            while (left >= 0 && right < s.length() && s.charAt(right) == s.charAt(left)) {
                currSubstring = s.substring(left, right + 1);
                left--;
                right++;

            }

            if (bestSubstring.length() < currSubstring.length()) {
                bestSubstring = currSubstring;
            }

            left = mid;
            right = mid;

            //mid++;

        }
        return bestSubstring;
    }

    
}
// @lc code=end
